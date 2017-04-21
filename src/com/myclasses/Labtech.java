package com.myclasses;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import java.util.Scanner;

/**
 * The Labtech have some characters that have been inherited from either the employee class and the person class
 * for instance the fileds such as name, national id, age, email, phone number can still be inherited from the person clss
 * from the employee class doctor is able to inherit salary and qualifications traits.
 * Therefore this helps in code reuse.
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "labtech")
public class Labtech extends Employee {
    /* Once the labtech have received the lab results of a particular
    patient he can be able to update the patient details by including the test
    results into the patient record which will help the doctor during diagnosis and prescription
     */
    public void produceTestReport()
    {
        Connect con=new Connect();
        con.getCon();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter patient id");
        int patient_id=input.nextInt();
        System.out.println("Enter name");
        String name=input.next();
        System.out.println("Enter Height");
        float height=input.nextFloat();
        System.out.println("Enter weight");
        float weight=input.nextFloat();
        Patient patient =new Patient();
        patient.setWeight(weight);
        patient.setHeight(height);
        Labtech labtech=new Labtech();
        labtech.setName(name);
        String insertTestReport="UPDATE patient_records SET Weight='"+patient.getWeight()+"',height='"+patient.getHeight()+"',labtech='"+labtech.getName()+"' WHERE idNo='"+patient_id+"'";

        if(con.updateDatabase(insertTestReport)==true)
        {
            System.out.println("Data successfully inserted");
        }
        else

        {
            System.out.println("Error occured in inserting");
        }
                   }
}
//abstract class can be implemeted by creating a sub class of the abstract class
