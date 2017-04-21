package com.myclasses;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import java.util.Scanner;

/**
 * The Nurse have some characters that have been inherited from either the employee class and the person class
 * for instance the fileds such as name, national id, age, email, phone number can still be inherited from the person clss
 * from the employee class doctor is able to inherit salary and qualifications traits.
 * Therefore this helps in code reuse.
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "nurse")
public class Nurse extends Employee {
    public String getDrugs() {
        return drugs;
    }

    public void setDrugs(String drugs) {
        this.drugs = drugs;
    }

    private String drugs;
    /*Nurse can view the patient details and be able
    to see the doctor prescription to a specific patient thereby giving drugs
    to the patient according to the doctors's prescription*/
    public void giveDrugs(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter ID Number");
        int id=input.nextInt();
        System.out.println("Enter name");
        String name=input.next();
        System.out.println("Enter drugs");
        String drugs=input.next();
        Nurse nurse=new Nurse();
        nurse.setName(name);
        nurse.setDrugs(drugs);
        Connect connect=new Connect();
        connect.getCon();
        String giveDrugs="UPDATE patient_records SET nurse='"+nurse.getName()+"',drugs_given='"+nurse.getDrugs()+"' WHERE idNo='"+id+"'";
        connect.updateDatabase(giveDrugs);
    }

}

