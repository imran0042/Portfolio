package com.studentmanagement.system;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ShowAllStudent extends JFrame{

    ShowAllStudent(){
        setTitle("Student Management System - Show All Student");
        setSize(600,800);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.lightGray);
        panel.setBounds(0,700,600,100);

        JButton menu = new JButton("Main Menu");
        menu.setBounds(225,10,150,40);
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

        JTable table = new JTable();
        DefaultTableModel model = new DefaultTableModel();
        table.setModel(model);

        try {
            StudentDaoImpl dao = new StudentDaoImpl();
            ResultSet rs = dao.showAllStudents();

            int cols = 15;
            String[] colName = {"Name", "Date of Birth", "Gender", "Address", "Contact Number", "E-Mail", "ID Number", "Nationality", "Course Name", "Section", "Batch", "Field of Study", "Parent Name", "Contact Number", "Relationship"};
            model.setColumnIdentifiers(colName);

//            String name, date, gender, address, mail, nationality, course, section, batch, sfield, pname, prelation, contact, id, pcontact;
//            while (rs.next()){
//                name = rs.getString(1);
//                date = rs.getString(2);
//                gender = rs.getString(3);
//                address = rs.getString(4);
//                mail = rs.getString(5);
//                nationality = rs.getString(6);
//                course = rs.getString(7);
//                section = rs.getString(8);
//                batch = rs.getString(9);
//                sfield = rs.getString(10);
//                pname = rs.getString(11);
//                prelation = rs.getString(12);
//                contact = rs.getString(13);
//                id = rs.getString(14);
//                pcontact = rs.getString(15);
//
//                String[] row = {name, date, gender, address, mail, nationality, course, section, batch, sfield, pname, prelation, contact, id, pcontact};
//                model.addRow(row);
//                panel.add(table);
//            }
            while (rs.next()) {
                String[] row = new String[cols];
                for (int i = 0; i < cols; i++) {
                    row[i] = rs.getString(i + 1);
                }
                model.addRow(row);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        table.setFont(new Font("Verdana", Font.PLAIN, 16));
        table.getTableHeader().setFont(new Font("Verdana", Font.BOLD, 16));
        table.setRowHeight(25);

        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(180);
        table.getColumnModel().getColumn(1).setPreferredWidth(150);
        table.getColumnModel().getColumn(2).setPreferredWidth(100);
        table.getColumnModel().getColumn(3).setPreferredWidth(330);
        table.getColumnModel().getColumn(4).setPreferredWidth(170);
        table.getColumnModel().getColumn(5).setPreferredWidth(200);
        table.getColumnModel().getColumn(6).setPreferredWidth(150);
        table.getColumnModel().getColumn(7).setPreferredWidth(150);
        table.getColumnModel().getColumn(8).setPreferredWidth(150);
        table.getColumnModel().getColumn(9).setPreferredWidth(100);
        table.getColumnModel().getColumn(10).setPreferredWidth(120);
        table.getColumnModel().getColumn(11).setPreferredWidth(150);
        table.getColumnModel().getColumn(12).setPreferredWidth(150);
        table.getColumnModel().getColumn(13).setPreferredWidth(160);
        table.getColumnModel().getColumn(14).setPreferredWidth(170);

        JScrollPane scrollpane = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollpane.setBounds(0,0,590,700);
        scrollpane.setBackground(Color.lightGray);
        scrollpane.getVerticalScrollBar().setUnitIncrement(15);
        scrollpane.getHorizontalScrollBar().setUnitIncrement(15);
        getContentPane().add(scrollpane);

        add(panel);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
