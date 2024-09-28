import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentGradeCalculator {
    JFrame frame;
    JTextField one,two,three,four,five;
    JTextArea output;
    StudentGradeCalculator(){
        frame = new JFrame("Student Grade Calculator");
        frame.setLayout(null);
        frame.setSize(500,800);

//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("download_21.jpg"));
//        Image i2 = i1.getImage().getScaledInstance(500,800,Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel pic = new JLabel(i3);
//        pic.setBounds(0,0,500,800);

        frame.getContentPane().setBackground(Color.CYAN);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Student Grade Calculator",JLabel.CENTER);
        label.setBounds(25,30,440,30);
        label.setForeground(Color.black);
        label.setFont(new Font("Verdana",Font.BOLD,30));
        frame.add(label);

        JLabel titleOne = new JLabel("Subjects");
        titleOne.setBounds(70,100,160,50);
        titleOne.setForeground(Color.black);
        titleOne.setFont(new Font("Verdana",Font.BOLD,20));
        frame.add(titleOne);

        JLabel titleTwo = new JLabel("Marks");
        titleTwo.setBounds(319,100,160,50);
        titleTwo.setForeground(Color.black);
        titleTwo.setFont(new Font("Verdana",Font.BOLD,20));
        frame.add(titleTwo);

        JLabel hindi = new JLabel("Hindi              :");
        hindi.setBounds(70,140,160,50);
        hindi.setForeground(Color.black);
        hindi.setFont(new Font("Verdana",Font.PLAIN,20));
        frame.add(hindi);

        JLabel english = new JLabel("English           :");
        english.setBounds(70,190,160,50);
        english.setForeground(Color.black);
        english.setFont(new Font("Verdana",Font.PLAIN,20));
        frame.add(english);

        JLabel math = new JLabel("Mathematics   :");
        math.setBounds(70,240,160,50);
        math.setForeground(Color.black);
        math.setFont(new Font("Verdana",Font.PLAIN,20));
        frame.add(math);

        JLabel science = new JLabel("Science          :");
        science.setBounds(70,290,160,50);
        science.setForeground(Color.black);
        science.setFont(new Font("Verdana",Font.PLAIN,20));
        frame.add(science);

        JLabel sst = new JLabel("Social Science :");
        sst.setBounds(70,340,160,50);
        sst.setForeground(Color.black);
        sst.setFont(new Font("Verdana",Font.PLAIN,20));
        frame.add(sst);

        one = new JTextField();
        one.setBounds(300,150,110,30);
        one.setFont(new Font("Verdana",Font.PLAIN,18));
        frame.add(one);

        two = new JTextField();
        two.setBounds(300,200,110,30);
        two.setFont(new Font("Verdana",Font.PLAIN,18));
        frame.add(two);

        three = new JTextField();
        three.setBounds(300,250,110,30);
        three.setFont(new Font("Verdana",Font.PLAIN,18));
        frame.add(three);

        four = new JTextField();
        four.setBounds(300,300,110,30);
        four.setFont(new Font("Verdana",Font.PLAIN,18));
        frame.add(four);

        five = new JTextField();
        five.setBounds(300,350,110,30);
        five.setFont(new Font("Verdana",Font.PLAIN,18));
        frame.add(five);

        JButton calculate = new JButton("Calculate");
        calculate.setBounds(35,450,100,40);
        calculate.setFont(new Font("Verdana",Font.BOLD,13));
        calculate.setBackground(Color.green);
        frame.add(calculate);

        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result();
            }
        });

        JButton again = new JButton("Again");
        again.setBounds(190,450,100,40);
        again.setFont(new Font("Verdana",Font.BOLD,13));
        again.setBackground(Color.yellow);
        frame.add(again);

        again.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                one.setText("");
                two.setText("");
                three.setText("");
                four.setText("");
                five.setText("");
                output.setText("");
            }
        });

        JButton exit = new JButton("Exit");
        exit.setBounds(350,450,100,40);
        exit.setFont(new Font("Verdana",Font.BOLD,13));
        exit.setBackground(Color.red);
        frame.add(exit);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        output = new JTextArea();
        output.setBounds(10,530,467,224);
        output.setFont(new Font("Verdana",Font.PLAIN,18));
        output.setBackground(Color.lightGray);
        output.setEditable(false);
        frame.add(output);

//        frame.add(pic);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void result(){
        try{
            String s1 = one.getText();
            String s2 = two.getText();
            String s3 = three.getText();
            String s4 = four.getText();
            String s5 = five.getText();

            float average;
            int total;
            String grade;

            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);
            int c = Integer.parseInt(s3);
            int d = Integer.parseInt(s4);
            int f = Integer.parseInt(s5);
            if(a<0 || a>100 || b<0 || b>100 || c<0 || c>100 || d<0 || d>100 || f<0 || f>100){
                JOptionPane.showMessageDialog(frame,"Marks should be out of 100");
                return;
            }

            total = a+b+c+d+f;
            average = (float)total/5;
            grade = null;
            if (average >= 95 && average <= 100)
                grade = "A";
            else if (average >= 90 && average <= 94)
                grade = "A-";
            else if (average >= 87 && average <= 89)
                grade = "B+";
            else if (average >= 85 && average <= 86)
                grade = "B";
            else if (average >= 80 && average <= 84)
                grade = "B-";
            else if (average >= 77 && average <= 79)
                grade = "C+";
            else if (average >= 75 && average <= 76)
                grade = "C";
            else if (average >= 70 && average <= 74)
                grade = "C-";
            else if (average >= 67 && average <= 69)
                grade = "D+";
            else if (average >= 65 && average <= 66)
                grade = "D";
            else if (average >= 60 && average <= 64)
                grade = "D-";
            else if (average < 60)
                grade = "F";

            String result = "Displaying the data..........................................\n"+
                    "\nTotal Marks: "+total+
                    "\nAverage Percentage: "+average+"%"+
                    "\nGrade: "+grade;
            output.setText(result);
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(frame,"Enter valid numeric value");
        }
    }

    public static void main(String[] args){
        new StudentGradeCalculator();
    }
}