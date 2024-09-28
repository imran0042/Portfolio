import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class AtmMachine {
    public JFrame frame;                                                    // Global Variables

    private BankAccount bankAccount;
    private Scanner sc;

    public AtmMachine() {                                                   // Constructor class
        this.bankAccount = new BankAccount(50000);
        this.sc = new Scanner(System.in);
    }

    public void withdraw() {                                                // Withdraw method
        String input = JOptionPane.showInputDialog(frame,"How much amount do you want to withdraw ?");
        double d = Double.parseDouble(input);                               // Typecact string to double
        if(bankAccount.getAmount() < d){
            JOptionPane.showMessageDialog(frame,"You don't have sufficient balance to withdraw");
            return;
        }
        else{
            JOptionPane.showMessageDialog(frame,"Collect Your Money");
        }
        bankAccount.setAmount(bankAccount.getAmount() - d);
    }

    public void deposit() {                                                   // Deposit method
        String input = JOptionPane.showInputDialog(frame,"How much amount do you want to deposit ?");
        double d = Double.parseDouble(input);                                 // Typecact string to double
        bankAccount.setAmount(bankAccount.getAmount() + d);
        JOptionPane.showMessageDialog(frame,"Your money has been deposited successfully");
    }

    public void checkBalance() {                                               // Check Balance Method
        JOptionPane.showMessageDialog(frame,"Your account balance is Rs. " + bankAccount.getAmount());
    }

    public void Interface(){                                                    // GUI Class
        frame = new JFrame("ATM Interface");
        JLabel label = new JLabel("ATM INTERFACE",JLabel.CENTER);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("download.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000,500,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel pic = new JLabel(i3);
        pic.setBounds(0,0,1000,500);

        JButton button1 = new JButton("Check Balance");
        JButton button2 = new JButton("Deposit Money");
        JButton button3 = new JButton("Withdraw Money");
        JButton button4 = new JButton("Exit");

        frame.setLayout(null);
        frame.setSize(1000,500);
//        frame.getContentPane().setBackground(Color.CYAN);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        label.setBounds(250,50,500,50);
        label.setForeground(Color.lightGray);
        label.setFont(new Font("Verdana",Font.BOLD,50));

        button1.setBounds(125,190,250,62);
        button1.setFont(new Font("Verdana",Font.PLAIN,20));
        button2.setBounds(625,190,250,62);
        button2.setFont(new Font("Verdana",Font.PLAIN,20));
        button3.setBounds(125,314,250,62);
        button3.setFont(new Font("Verdana",Font.PLAIN,20));
        button4.setBounds(625,314,250,62);
        button4.setFont(new Font("Verdana",Font.PLAIN,20));

        frame.add(label);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(pic);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkBalance();
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deposit();
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                withdraw();
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
    }

    public static void main(String[] args){                                       // Main Class
        AtmMachine m = new AtmMachine();
        m.Interface();
    }

    private class BankAccount {                                                   // Private Bank Account Class
        private double amount;

        public BankAccount(double initialAmount) {
            this.amount = initialAmount;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }
    }
}
