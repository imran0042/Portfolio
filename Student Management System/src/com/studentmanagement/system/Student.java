package com.studentmanagement.system;

public class Student {
    private String name, date, gender, address, mail, nationality, course, section, batch, sfield, pname, prelation;
    private long contact, id, pcontact;

    public Student(){

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", mail='" + mail + '\'' +
                ", nationality='" + nationality + '\'' +
                ", course='" + course + '\'' +
                ", section='" + section + '\'' +
                ", batch='" + batch + '\'' +
                ", sfield='" + sfield + '\'' +
                ", pname='" + pname + '\'' +
                ", prelation='" + prelation + '\'' +
                ", contact=" + contact +
                ", id=" + id +
                ", pcontact=" + pcontact +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getSfield() {
        return sfield;
    }

    public void setSfield(String sfield) {
        this.sfield = sfield;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPrelation() {
        return prelation;
    }

    public void setPrelation(String prelation) {
        this.prelation = prelation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public long getPcontact() {
        return pcontact;
    }

    public void setPcontact(long pcontact) {
        this.pcontact = pcontact;
    }
}
