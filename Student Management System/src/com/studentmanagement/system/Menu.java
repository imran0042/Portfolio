package com.studentmanagement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame{
    Menu(){

        setTitle("Student Management System - Main Menu");
        setSize(600,400);

        JLabel label = new JLabel("Student Management System");
        label.setBounds(25,20,550,40);
        label.setFont(new Font("Verdana",Font.BOLD,32));
        label.setForeground(Color.black);
        add(label);

        JLabel label1 = new JLabel("• You can select appropriate button to perform various task on");
        label1.setBounds(10,100,580,20);
        label1.setFont(new Font("Verdana",Font.BOLD,15));
        label1.setForeground(Color.BLACK);
        add(label1);

        JLabel label2 = new JLabel("Student Management");
        label2.setBounds(25,125,580,20);
        label2.setFont(new Font("Verdana",Font.BOLD,15));
        label2.setForeground(Color.BLACK);
        add(label2);

        JButton add = new JButton("Add");
        add.setBounds(45,190,140,40);
        add.setFont(new Font("Verdana",Font.BOLD,18));
        add.setBackground(Color.green);
        add(add);

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new AddStudent();
            }
        });

        JButton remove = new JButton("Remove");
        remove.setBounds(225,190,140,40);
        remove.setFont(new Font("Verdana",Font.BOLD,18));
        remove.setBackground(Color.orange);
        add(remove);

        remove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new RemoveStudent();
            }
        });

        JButton edit = new JButton("Edit");
        edit.setBounds(405,190,140,40);
        edit.setFont(new Font("Verdana",Font.BOLD,18));
        edit.setBackground(Color.yellow);
        add(edit);

        edit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new StudentEdit();
            }
        });

        JButton show = new JButton("Show All");
        show.setBounds(45,280,140,40);
        show.setFont(new Font("Verdana",Font.BOLD,18));
        show.setBackground(Color.PINK);
        add(show);

        show.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new ShowAllStudent();
            }
        });

        JButton search = new JButton("Search");
        search.setBounds(225,280,140,40);
        search.setFont(new Font("Verdana",Font.BOLD,18));
        search.setBackground(Color.cyan);
        add(search);

        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new SearchStudentBasedOnName();
            }
        });

        JButton exit = new JButton("Exit");
        exit.setBounds(405,280,140,40);
        exit.setFont(new Font("Verdana",Font.BOLD,18));
        exit.setBackground(Color.red);
        add(exit);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        setLayout(null);
        getContentPane().setBackground(Color.lightGray);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args){
        new Menu();
    }
}
