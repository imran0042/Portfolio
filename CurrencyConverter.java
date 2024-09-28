import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URISyntaxException;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverter extends JFrame{
    CurrencyConverter(){
        new JFrame("Real Time Currency Converter");
        setSize(800,500);

        JLabel label = new JLabel("Real-Time Currency Converter",JLabel.CENTER);
        label.setBounds(150,30,500,50);
        label.setForeground(Color.black);
        label.setFont(new Font("Verdana",Font.BOLD,29));
        add(label);

        String[] baseCurrency = {"Select Base Currency", "Indian Rupee", "US Dollar", "Euro", "Japanese Yen", "Pound Sterling", "Australian Dollar", "Canadian Dollar", "Swiss Franc", "Chinese Renminbi", "Hong Kong Dollar", "New Zealand Dollar"};
        JComboBox box1 = new JComboBox(baseCurrency);
        box1.setBounds(100,130,220,30);
        box1.setFont(new Font("Verdana",Font.PLAIN,14));
        box1.setForeground(Color.BLACK);
        add(box1);

        String[] targetCurrency = {"Select Target Currency", "Indian Rupee", "US Dollar", "Euro", "Japanese Yen", "Pound Sterling", "Australian Dollar", "Canadian Dollar", "Swiss Franc", "Chinese Renminbi", "Hong Kong Dollar", "New Zealand Dollar"};
        JComboBox box2 = new JComboBox(targetCurrency);
        box2.setBounds(480,130,220,30);
        box2.setFont(new Font("Verdana",Font.PLAIN,14));
        box2.setForeground(Color.BLACK);
        add(box2);

        JLabel enteramount = new JLabel("Enter Amount :");
        enteramount.setBounds(100,200,220,23);
        enteramount.setFont(new Font("Verdana",Font.BOLD,17));
        add(enteramount);

        TextField amount = new TextField();
        amount.setBounds(480,200,220,23);
        amount.setFont(new Font("Verdana",Font.PLAIN,17));
        amount.setForeground(Color.black);
        add(amount);

        JTextArea output = new JTextArea("");
        output.setBounds(200,270,400,23);
        output.setFont(new Font("Verdana",Font.PLAIN,17));
        output.setForeground(Color.BLACK);
        Border blackline = BorderFactory.createLineBorder(Color.black);
        output.setBorder(blackline);
        output.setEditable(false);
        add(output);

        JButton calculate = new JButton("Calculate");
        calculate.setBounds(100,350,150,40);
        calculate.setBackground(Color.green);
        calculate.setFont(new Font("Verdana",Font.BOLD,17));
        add(calculate);

        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                if(box1.getSelectedItem().equals("Select Base Currency"))
                    JOptionPane.showMessageDialog(null,"Select the Base Currency");
                else if(box2.getSelectedItem().equals("Select Target Currency"))
                    JOptionPane.showMessageDialog(null, "Select the Target Currency");

                if(amount.getText().isEmpty())
                    JOptionPane.showMessageDialog(null,"Enter the amount");

                String base = "",target = "";
                if(box1.getSelectedItem().equals("US Dollar"))
                    base = "USD";
                else if(box1.getSelectedItem().equals("Indian Rupee"))
                    base = "INR";
                else if(box1.getSelectedItem().equals("Euro"))
                    base = "EUR";
                else if(box1.getSelectedItem().equals("Japanese Yen"))
                    base = "JPY";
                else if(box1.getSelectedItem().equals("Pound Sterling"))
                    base = "GBP";
                else if(box1.getSelectedItem().equals("Australian Dollar"))
                    base = "AUD";
                else if(box1.getSelectedItem().equals("Canadian Dollar"))
                    base = "CAD";
                else if(box1.getSelectedItem().equals("Swiss Franc"))
                    base = "CHF";
                else if(box1.getSelectedItem().equals("Chinese Renminbi"))
                    base = "CNH";
                else if(box1.getSelectedItem().equals("Hong Kong Dollar"))
                    base = "HKD";
                else if(box1.getSelectedItem().equals("New Zealand Dollar"))
                    base = "NZD";


                if(box2.getSelectedItem().equals("US Dollar"))
                    target = "USD";
                else if(box2.getSelectedItem().equals("Indian Rupee"))
                    target = "INR";
                else if(box2.getSelectedItem().equals("Euro"))
                    target = "EUR";
                else if(box2.getSelectedItem().equals("Japanese Yen"))
                    target = "JPY";
                else if(box2.getSelectedItem().equals("Pound Sterling"))
                    target = "GBP";
                else if(box2.getSelectedItem().equals("Australian Dollar"))
                    target = "AUD";
                else if(box2.getSelectedItem().equals("Canadian Dollar"))
                    target = "CAD";
                else if(box2.getSelectedItem().equals("Swiss Franc"))
                    target = "CHF";
                else if(box2.getSelectedItem().equals("Chinese Renminbi"))
                    target = "CNH";
                else if(box2.getSelectedItem().equals("Hong Kong Dollar"))
                    target = "HKD";
                else if(box2.getSelectedItem().equals("New Zealand Dollar"))
                    target = "NZD";

                String input = amount.getText();
                double inputvalue = Double.parseDouble(input);
                double finalresult = 0;
                String result,result2;


                String apiKey = "";
                String urlString = "https://api.currencyapi.com/v3/latest?apikey=" + apiKey + "&base_currency=" + base;

                HttpURLConnection connection = null;
                BufferedReader in = null;

                try {
                    URI uri = new URI(urlString);
                    URL url = uri.toURL();

                    connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("GET");
                    int responseCode = connection.getResponseCode();

                    if (responseCode == HttpURLConnection.HTTP_OK) {
                        in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                        StringBuilder response = new StringBuilder();
                        String line;

                        while ((line = in.readLine()) != null) {
                            response.append(line);
                        }

                        // Convert response to a JSON object
                        JSONObject jsonResponse = new JSONObject(response.toString());

                        // Extract the specific currency's exchange rate
                        JSONObject data = jsonResponse.getJSONObject("data");
                        if (data.has(target)) {
                            JSONObject targetCurrencyObject = data.getJSONObject(target);
                            double rate = targetCurrencyObject.getDouble("value");

                            if (f.getSource() == calculate) {
                                finalresult = inputvalue * rate;
                            }
                            result = base + " " + String.format("%.2f",inputvalue) + " = " +target+" "+ String.format("%.2f", finalresult);
                            if(box1.getSelectedItem().equals("Select Base Currency"))
                                return;       // if base currency is not selected it automatically assumes USD as base currency
                            else
                                output.setText(result);
                        } else {
                            result2 = "Response not found";
                            output.setText(result2);
                        }
                    } else {
                        System.err.println("Error: Received HTTP response code " + responseCode);
                    }
                } catch (URISyntaxException e) {
                    System.err.println("Invalid URL syntax: " + e.getMessage());
                } catch (Exception ex) {
                    ex.printStackTrace();
                } finally {
                    try {
                        if (in != null) {
                            in.close();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (connection != null) {
                        connection.disconnect();
                    }
                }
            }
        });

        JButton again = new JButton("Again");
        again.setBounds(320,350,150,40);
        again.setBackground(Color.yellow);
        again.setFont(new Font("Verdana",Font.BOLD,17));
        add(again);

        again.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                box1.setSelectedIndex(0);
                box2.setSelectedIndex(0);
                amount.setText("");
                output.setText("");
            }
        });

        JButton exit = new JButton("Exit");
        exit.setBounds(550,350,150,40);
        exit.setBackground(Color.red);
        exit.setFont(new Font("Verdana",Font.BOLD,17));
        add(exit);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        setLayout(null);
        getContentPane().setBackground(Color.CYAN);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args){
        new CurrencyConverter();
    }
}
