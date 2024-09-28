package com.studentmanagement.system;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SearchStudentBasedOnName extends JFrame{

    SearchStudentBasedOnName(){
        UIManager.put("OptionPane.messageFont", new Font("Verdana", Font.BOLD, 14));
        setTitle("Student Management System - Search Student Based On Name");
        setSize(600,800);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.lightGray);
        panel.setBounds(0,600,600,200);

        JLabel name = new JLabel("Enter Name:");
        name.setBounds(100,20,150,40);
        name.setFont(new Font("Verdana",Font.BOLD,20));
        panel.add(name);

        JTextField fname = new JTextField();
        fname.setBounds(325,20,150,40);
        fname.setFont(new Font("Verdana",Font.PLAIN,18));
        panel.add(fname);

        JButton search = new JButton("Search");
        search.setBounds(100,100,150,40);
        search.setFont(new Font("Verdana",Font.BOLD,18));
        search.setBackground(Color.MAGENTA);
        panel.add(search);

        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    JTable table = new JTable();
                    DefaultTableModel model = new DefaultTableModel();
                    table.setModel(model);

                    try{
                        StudentDaoImpl dao = new StudentDaoImpl();
                        ResultSet rs = dao.SearchStudentBasedOnName(fname.getText());

                        int cols = 15;
                        String[] colName = {"Name", "Date of Birth", "Gender", "Address", "Contact Number", "E-Mail", "ID Number", "Nationality", "Course Name", "Section", "Batch", "Field of Study", "Parent Name", "Contact Number", "Relationship"};
                        model.setColumnIdentifiers(colName);

                        while (rs.next()) {
                            String[] row = new String[cols];
                            for (int i = 0; i < cols; i++) {
                                row[i] = rs.getString(i + 1);
                            }
                            model.addRow(row);
                        }
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
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

                    JScrollPane scrollpane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
                    scrollpane.setBounds(0,0,590,600);
                    scrollpane.getVerticalScrollBar().setUnitIncrement(15);
                    scrollpane.getHorizontalScrollBar().setUnitIncrement(15);
                    getContentPane().add(scrollpane);
            }
        });

        JButton menu = new JButton("Main Menu");
        menu.setBounds(325,100,150,40);
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

        add(panel);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
