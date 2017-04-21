package com.myclasses;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "receptionist")
public class Receptionist extends Employee {
    // Require data method is used to receive data from the scanner for registering new patients
    public static  void requiredData() throws IOException {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter id Number");
            int id = input.nextInt();
            System.out.println("Enter name");
            String name = input.next();
            System.out.println("Enter age");
            int age = input.nextInt();
            System.out.println("Enter date of birth");
            String dob = input.next();
            System.out.println("Enter Email");
            String email = input.next();
            System.out.println("Enter Gender");
            String gender = input.next();
            System.out.println("Enter Phone Number");
            String phone = input.next();
            Patient patient = new Patient();
            patient.setIdNo(id);
            patient.setName(name);
            patient.setAge(age);
            patient.setDob(dob);
            patient.setEmail(email);
            patient.setGender(gender);
            patient.setPhone(phone);
            Connect connect=new Connect();
        connect.getCon();
        String getPerson="SELECT * FROM person WHERE idNo='"+patient.getIdNo()+"'";
        int count=0;
        try {
            ResultSet rs=connect.queryDatabase(getPerson);
            while(rs.next())
            {
                count++;

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(count==0) {
            String insert = "INSERT INTO Person(idNo,name,age,dob,phone,email,gender)VALUES('" + patient.getIdNo() + "','" + patient.getName() + "','" + patient.getAge() + "','" + patient.getDob() + "','" + patient.getPhone() + "','" + patient.getEmail() + "','" + patient.getGender() + "')";
            if (connect.writeToDabase(insert) == true) {
                System.out.println("Data successfully inserted");
            } else

            {
                System.out.println("Error occured in inserting data");
            }
        }
        else

        {
            System.out.println("The person with idNo "+patient.getIdNo()+" Already exists But checkin details have been captured");
        }
        Date dNow = new Date( );
        SimpleDateFormat time = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

        String currentTime=time.format(dNow);
        patient.setTimeIn(currentTime);
String recordDetails="INSERT INTO patient_records(idNo,timeIn)VALUES('"+patient.getIdNo()+"','"+patient.getTimeIn()+"')";
        connect.writeToDabase(recordDetails);


        }
}
