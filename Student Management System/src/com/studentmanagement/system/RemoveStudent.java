package com.studentmanagement.system;

import javax.swing.*;
import java.awt.*;

public class RemoveStudent {
    RemoveStudent(){

        UIManager.put("OptionPane.messageFont", new Font("Verdana", Font.BOLD, 14));
        StudentDaoImpl dao = new StudentDaoImpl();
        String input = JOptionPane.showInputDialog(null,"Enter Student Name to Remove from the Database");
        dao.deleteStudent(input);
        if(dao.getcount() != 0)
            JOptionPane.showMessageDialog(null,"Student Removed Successfully");
        new Menu();
    }
}
