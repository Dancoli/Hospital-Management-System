package com.myclasses;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "person")
public class Person {
    @Id
    protected int idNo;
    protected String name;
    protected int age;
    protected String dob;
    protected String phone;
    protected String email;
    protected String gender;

    public int getIdNo() {
        return idNo;
    }

    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setDetails(int idNo,String name,int age, String dob, String phone, String email,String gender)
    {
        setIdNo(idNo);
        setName(name);
        setAge(age);
        setDob(dob);
        setEmail(email);
        setGender(gender);
        setPhone(phone);
    }
    public String getData()
    {
        return String.format("%d,%s,%d,%s,%s,%s,%s", getIdNo(),getName(),getAge(),getDob(),getPhone(),getEmail(),getGender());
    }
}
