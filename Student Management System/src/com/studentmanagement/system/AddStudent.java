package com.studentmanagement.system;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddStudent extends JFrame{

    AddStudent(){
        UIManager.put("OptionPane.messageFont", new Font("Verdana", Font.BOLD, 14));
        setTitle("Student Management System - Add Student");
        setSize(600,800);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(600,1100));
        panel.setBackground(Color.lightGray);

        JLabel label = new JLabel("Add New Student");
        label.setBounds(140,10,300,40);
        label.setFont(new Font("Verdana",Font.BOLD,30));
        label.setForeground(Color.black);
        panel.add(label);

        JLabel studentInfo = new JLabel("------------------- Student Information ------------------");
        studentInfo.setBounds(10,80,580,25);
        studentInfo.setFont(new Font("Verdana",Font.BOLD,18));
        panel.add(studentInfo);

        JLabel name = new JLabel("Full Name                     :");
        name.setBounds(50,120,250,30);
        name.setFont(new Font("Verdana",Font.PLAIN,18));
        panel.add(name);

        JLabel dob = new JLabel("Date of Birth                 :");
        dob.setBounds(50,170,250,30);
        dob.setFont(new Font("Verdana",Font.PLAIN,18));
        panel.add(dob);

        JLabel gender = new JLabel("Gender                         :");
        gender.setBounds(50,220,250,30);
        gender.setFont(new Font("Verdana",Font.PLAIN,18));
        panel.add(gender);

        JLabel address = new JLabel("Address                        :");
        address.setBounds(50,270,250,30);
        address.setFont(new Font("Verdana",Font.PLAIN,18));
        panel.add(address);

        JLabel contact = new JLabel("Contact Number            :");
        contact.setBounds(50,320,250,30);
        contact.setFont(new Font("Verdana",Font.PLAIN,18));
        panel.add(contact);

        JLabel email = new JLabel("E-Mail                           :");
        email.setBounds(50,370,250,30);
        email.setFont(new Font("Verdana",Font.PLAIN,18));
        panel.add(email);

        JLabel id = new JLabel("ID Number                    :");
        id.setBounds(50,420,250,30);
        id.setFont(new Font("Verdana",Font.PLAIN,18));
        panel.add(id);

        JLabel nationality = new JLabel("Nationality                    :");
        nationality.setBounds(50,470,250,30);
        nationality.setFont(new Font("Verdana",Font.PLAIN,18));
        panel.add(nationality);

        JLabel academic = new JLabel("-------------------- Academic Record ---------------------");
        academic.setBounds(10,520,580,25);
        academic.setFont(new Font("Verdana",Font.BOLD,18));
        panel.add(academic);

        JLabel course = new JLabel("Course Name                :");
        course.setBounds(50,560,250,30);
        course.setFont(new Font("Verdana",Font.PLAIN,18));
        panel.add(course);

        JLabel section = new JLabel("Section                         :");
        section.setBounds(50,610,250,30);
        section.setFont(new Font("Verdana",Font.PLAIN,18));
        panel.add(section);

        JLabel batch = new JLabel("Batch                            :");
        batch.setBounds(50,660,250,30);
        batch.setFont(new Font("Verdana",Font.PLAIN,18));
        panel.add(batch);

        JLabel field = new JLabel("Field of Study                :");
        field.setBounds(50,710,250,30);
        field.setFont(new Font("Verdana",Font.PLAIN,18));
        panel.add(field);

        JLabel parentalInfo = new JLabel("------------------ Parental Information ------------------");
        parentalInfo.setBounds(10,760,580,25);
        parentalInfo.setFont(new Font("Verdana",Font.BOLD,18));
        panel.add(parentalInfo);

        JLabel pname = new JLabel("Parent Name                 :");
        pname.setBounds(50,800,250,30);
        pname.setFont(new Font("Verdana",Font.PLAIN,18));
        panel.add(pname);

        JLabel pcontact = new JLabel("Contact Number            :");
        pcontact.setBounds(50,850,250,30);
        pcontact.setFont(new Font("Verdana",Font.PLAIN,18));
        panel.add(pcontact);

        JLabel relation = new JLabel("Relationship                  :");
        relation.setBounds(50,900,250,30);
        relation.setFont(new Font("Verdana",Font.PLAIN,18));
        panel.add(relation);



        JTextField fname = new JTextField();
        fname.setBounds(350,120,160,30);
        fname.setFont(new Font("Verdana",Font.PLAIN,18));
        panel.add(fname);

        JDateChooser date = new JDateChooser();
        date.setBounds(350,170,160,30);
        date.setFont(new Font("Verdana",Font.PLAIN,13));
        panel.add(date);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(350,220,80,30);
        male.setFont(new Font("Verdana",Font.PLAIN,15));
        panel.add(male);

        JRadioButton female = new JRadioButton("Female");
        female.setBounds(430,220,80,30);
        female.setFont(new Font("Verdana",Font.PLAIN,15));
        panel.add(female);

        JTextField faddress = new JTextField();
        faddress.setBounds(350,270,160,30);
        faddress.setFont(new Font("Verdana",Font.PLAIN,18));
        panel.add(faddress);

        JTextField fcontact = new JTextField();
        fcontact.setBounds(350,320,160,30);
        fcontact.setFont(new Font("Verdana",Font.PLAIN,18));
        panel.add(fcontact);

        JTextField f_email = new JTextField();
        f_email.setBounds(350,370,160,30);
        f_email.setFont(new Font("Verdana",Font.PLAIN,18));
        panel.add(f_email);

        JTextField fid = new JTextField();
        fid.setBounds(350,420,160,30);
        fid.setFont(new Font("Verdana",Font.PLAIN,18));
        panel.add(fid);

        JTextField fnationality = new JTextField();
        fnationality.setBounds(350,470,160,30);
        fnationality.setFont(new Font("Verdana",Font.PLAIN,18));
        panel.add(fnationality);

        String[] fcourse = {"Select","BCA","BBA","MBA","MCA","B.TECH","M.TECH","B.ED","BSC","BCOM","BA"};
        JComboBox box1 = new JComboBox(fcourse);
        box1.setBounds(350,560,160,30);
        box1.setFont(new Font("Verdana",Font.PLAIN,18));
        panel.add(box1);

        String[] fsection = {"Select","A1","A2","B1","B2","C1","C2"};
        JComboBox box2 = new JComboBox(fsection);
        box2.setBounds(350,610,160,30);
        box2.setFont(new Font("Verdana",Font.PLAIN,18));
        panel.add(box2);

        String[] fbatch = {"Select","2019-2022","2020-2023","2021-2024","2022-2025","2023-2026","2024-2027"};
        JComboBox box3 = new JComboBox(fbatch);
        box3.setBounds(350,660,160,30);
        box3.setFont(new Font("Verdana",Font.PLAIN,18));
        panel.add(box3);

        String[] ffield = {"Select","Science","Technology","Computer App.","Arts","Commerce","Education","Business Adm."};
        JComboBox box4 = new JComboBox(ffield);
        box4.setBounds(350,710,160,30);
        box4.setFont(new Font("Verdana",Font.PLAIN,18));
        panel.add(box4);

        JTextField fpname = new JTextField();
        fpname.setBounds(350,800,160,30);
        fpname.setFont(new Font("Verdana",Font.PLAIN,18));
        panel.add(fpname);

        JTextField fpcontact = new JTextField();
        fpcontact.setBounds(350,850,160,30);
        fpcontact.setFont(new Font("Verdana",Font.PLAIN,18));
        panel.add(fpcontact);

        String[] frelation = {"Select","Father","Mother","Other"};
        JComboBox box5 = new JComboBox(frelation);
        box5.setBounds(350,900,160,30);
        box5.setFont(new Font("Verdana",Font.PLAIN,18));
        panel.add(box5);

        JButton submit = new JButton("Submit");
        submit.setBounds(110, 1000, 150, 40);
        submit.setFont(new Font("Verdana", Font.BOLD, 18));
        submit.setBackground(Color.green);
        panel.add(submit);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentDaoImpl dao = new StudentDaoImpl();
                Student st = new Student();

                if (fname.getText().isEmpty())
                    JOptionPane.showMessageDialog(null, "Enter Name");
                else if (((JTextField) date.getDateEditor().getUiComponent()).getText().isEmpty())
                    JOptionPane.showMessageDialog(null, "Select Date Of Birth");
                else if (!male.isSelected() && !female.isSelected())
                    JOptionPane.showMessageDialog(null, "Select Gender");
                else if (male.isSelected() && female.isSelected())
                    JOptionPane.showMessageDialog(null, "Select Any One Gender");
                else if (faddress.getText().isEmpty())
                    JOptionPane.showMessageDialog(null, "Enter Address");
                else if (fcontact.getText().isEmpty())
                    JOptionPane.showMessageDialog(null, "Enter Contact Number");
                else if (f_email.getText().isEmpty())
                    JOptionPane.showMessageDialog(null, "Enter E-Mail");
                else if (fid.getText().isEmpty())
                    JOptionPane.showMessageDialog(null, "Enter ID Number");
                else if (fnationality.getText().isEmpty())
                    JOptionPane.showMessageDialog(null, "Enter Nationality");
                else if (box1.getSelectedItem().equals("Select"))
                    JOptionPane.showMessageDialog(null, "Select Course");
                else if (box2.getSelectedItem().equals("Select"))
                    JOptionPane.showMessageDialog(null, "Select Section");
                else if (box3.getSelectedItem().equals("Select"))
                    JOptionPane.showMessageDialog(null, "Select Batch");
                else if (box4.getSelectedItem().equals("Select"))
                    JOptionPane.showMessageDialog(null, "Select Study Field");
                else if (fpname.getText().isEmpty())
                    JOptionPane.showMessageDialog(null, "Enter Parent Name");
                else if (fpcontact.getText().isEmpty())
                    JOptionPane.showMessageDialog(null, "Enter Parent Contact Number");
                else if (box5.getSelectedItem().equals("Select"))
                    JOptionPane.showMessageDialog(null, "Select Relationship");

                st.setName(fname.getText());
                st.setDate(((JTextField) date.getDateEditor().getUiComponent()).getText());

                if (male.isSelected())
                    st.setGender("Male");
                else if (female.isSelected())
                    st.setGender("Female");

                st.setAddress(faddress.getText());

                long d = Long.parseLong(fcontact.getText());
                st.setContact(d);
                st.setMail(f_email.getText());

                long b = Long.parseLong(fid.getText());
                st.setId(b);
                st.setNationality(fnationality.getText());
                st.setPname(fpname.getText());
                long a = Long.parseLong(fpcontact.getText());
                st.setPcontact(a);

                if (!box1.getSelectedItem().equals("Select"))
                    st.setCourse((String) box1.getSelectedItem());
                if (!box2.getSelectedItem().equals("Select"))
                    st.setSection((String) box2.getSelectedItem());
                if (!box3.getSelectedItem().equals("Select"))
                    st.setBatch((String) box3.getSelectedItem());
                if (!box4.getSelectedItem().equals("Select"))
                    st.setSfield((String) box4.getSelectedItem());
                if (!box5.getSelectedItem().equals("Select"))
                    st.setPrelation((String) box5.getSelectedItem());


                if (!fname.getText().isEmpty() && !((JTextField) date.getDateEditor().getUiComponent()).getText().isEmpty() && (((male.isSelected() && !female.isSelected()) || (!male.isSelected() && female.isSelected())) && !faddress.getText().isEmpty() && !fcontact.getText().isEmpty() && !f_email.getText().isEmpty() && !fid.getText().isEmpty() && !fnationality.getText().isEmpty() && !box1.getSelectedItem().equals("Select") && !box2.getSelectedItem().equals("Select") && !box3.getSelectedItem().equals("Select") && !box4.getSelectedItem().equals("Select") && !fpcontact.getText().isEmpty() && !box5.getSelectedItem().equals("Select")))
                    dao.createStudent(st);

                if(dao.getcount() != 0) {
                    JOptionPane.showMessageDialog(null, "Student Added Successfully");
                    fname.setText("");
                    date.setDate(null);
                    male.setSelected(false);
                    female.setSelected(false);
                    faddress.setText("");
                    fcontact.setText("");
                    f_email.setText("");
                    fid.setText("");
                    fnationality.setText("");
                    box1.setSelectedItem("Select");
                    box2.setSelectedItem("Select");
                    box3.setSelectedItem("Select");
                    box4.setSelectedItem("Select");
                    fpname.setText("");
                    fpcontact.setText("");
                    box5.setSelectedItem("Select");
                }
            }
        });

        JButton menu = new JButton("Main Menu");
        menu.setBounds(315,1000,150,40);
        menu.setFont(new Font("Verdana",Font.BOLD,18));
        menu.setBackground(Color.cyan);
        panel.add(menu);

        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Menu();
            }
        });

        JScrollPane scrollpane = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollpane.getVerticalScrollBar().setUnitIncrement(15);
        getContentPane().add(scrollpane);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
