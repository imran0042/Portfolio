package com.studentmanagement.system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDaoImpl{

    Connection con;
    int count;
    public int getcount(){
        return count;
    }

    public void createStudent(Student st) {
        con = DBConnection.createDBConnection();
        String query = "insert into student values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setString(1,st.getName());
            pstm.setString(2,st.getDate());
            pstm.setString(3,st.getGender());
            pstm.setString(4,st.getAddress());
            pstm.setLong(5,st.getContact());
            pstm.setString(6,st.getMail());
            pstm.setLong(7,st.getId());
            pstm.setString(8,st.getNationality());
            pstm.setString(9,st.getCourse());
            pstm.setString(10,st.getSection());
            pstm.setString(11,st.getBatch());
            pstm.setString(12,st.getSfield());
            pstm.setString(13,st.getPname());
            pstm.setLong(14,st.getPcontact());
            pstm.setString(15,st.getPrelation());
            count = pstm.executeUpdate();

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void deleteStudent(String name) {
        con = DBConnection.createDBConnection();
        String query = "delete from student where name = ?";
        try{
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setString(1,name);
            count = pstm.executeUpdate();

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void EditStudent(String name, String date, String gender, String address, long contact, String mail, long id, String nationality, String course, String section, String batch, String sfield, String pname, long pcontact, String prelation) {
        con = DBConnection.createDBConnection();
        String query = "UPDATE student SET date = ?, gender = ?, address = ?, contact = ?, mail = ?, id = ?, nationality = ?, course = ?, section = ?,batch = ?, sfield = ?, pname = ?, pcontact = ?, prelation = ? WHERE name = ?;";

        try{
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setString(1,date);
            pstm.setString(2,gender);
            pstm.setString(3,address);
            pstm.setLong(4,contact);
            pstm.setString(5,mail);
            pstm.setLong(6,id);
            pstm.setString(7,nationality);
            pstm.setString(8,course);
            pstm.setString(9,section);
            pstm.setString(10,batch);
            pstm.setString(11,sfield);
            pstm.setString(12,pname);
            pstm.setLong(13,pcontact);
            pstm.setString(14,prelation);
            pstm.setString(15,name);
            count = pstm.executeUpdate();

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public ResultSet showAllStudents() {
        con = DBConnection.createDBConnection();
        String query = "select * from student";
        try{
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(query);
            return result;

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    public ResultSet SearchStudentBasedOnName(String name) {
        con = DBConnection.createDBConnection();
        String query = "select * from student where name = ?";
        try{
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setString(1,name);
            ResultSet result = pstm.executeQuery();
            return result;

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
