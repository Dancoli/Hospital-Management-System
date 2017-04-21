package com.myclasses;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Utility {
    //PerformRoleCheck is a method used to take action in regard to case selected for a particular role.
    public static int performRoleCheck() throws  IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome visitor. Which operation do you want to perform");
        System.out.println("........................................................");
        System.out.println("1.Doctor\n2.Receptionist\n3.Nurse\n4.Labtech\n5.Quit");
        System.out.println("Choose operation");
        int role = input.nextInt();
        return role;
    }
    //Perform task method is used as a control method to make decision on the case selected at the availlable tasks
    public static void performTask(int role) throws IOException {
        Scanner input = new Scanner(System.in);
        switch (role) {

            case 1:
                System.out.println("Welcome to Doctor\'s panel");
                System.out.println("...................................");
                System.out.println("1.View Patient Details\n2.Diagonize and Prescribe\n3.Quit");
                System.out.println("Choose operation");
                int task = input.nextInt();
                Utility utility=new Utility();
                Doctor doctor=new Doctor();
                switch (task) {
                    case 1:
                        System.out.println("Welcome to View Patient Details Panel");
                        utility.viewPatientDetails();
                        break;
                    case 2:
                        System.out.println("Welcome to Diagnosis and Prescribtion Panel ");
                        doctor.diagonizeAndPrescription();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("The operation out of range");
                        controlFlow();
                }
                break;
            case 2:
                System.out.println("Welcome to Receptionist panel");
                System.out.println("....................................");
                System.out.println("1.Patient Registration panel\n2.View details panel\n3.Checkout\n4. Quit");
                System.out.println("Choose task");
                int task2 = input.nextInt();
                switch (task2) {
                    case 1:
                        System.out.println("Welcome to Patient Registration panel");
                        Receptionist receptionist = new Receptionist();
                        Receptionist.requiredData();
                        break;
                    case 2:
                        System.out.println("Welcome to View details panel");
                        Utility utility3=new Utility();
                        utility3.viewPatientDetails();
                        break;
                    case 3:

                        System.out.println("Checkout");
                        Utility utility1=new Utility();
                        utility1.checkout();

                    case 4:
                        break;
                    default:
                        System.out.println("The task is out of range");
                        controlFlow();
                }
                break;
            case 3:
                System.out.println("Welcome to Nurse panel");
                System.out.println("1.View Patient Details \n2.Dispatch drugs");
                int task5=input.nextInt();
                switch (task5)
                {
                    case 1: System.out.println("1.View Patient Details ");
                        Utility utility2=new Utility();
                        utility2.viewPatientDetails();
                        break;
                    case 2: System.out.println("2.Dispatch drugs");
                        Nurse nurse=new Nurse();
                        nurse.giveDrugs();
                        break;
                    default: controlFlow();
                }
                break;
            case 4:
                System.out.println("Welcome to Labtech panel");
                System.out.println("1.View Patient Details\n2.Record test Details");
                int task3=input.nextInt();
                switch (task3)
                {
                    case 1: System.out.println("View Patient Ditails");
                        Utility utility2=new Utility();
                        utility2.viewPatientDetails();
                    case 2: System.out.println("Record test Details");
                        Labtech labtech=new Labtech();
                        labtech.produceTestReport();
                }
                break;
            case 5:
                break;
            default:
                System.out.println("The operation out of range");
                controlFlow();

        }
    }
    //Controlflow method is used to old the entire switch statement and therefore can be called to enhance the loop of the program
    public static void controlFlow() throws  IOException {
        int role = performRoleCheck();
        performTask(role);
    }
    public void checkout() //This method is used to update the patient records when the patient is checking out by inserting the checkout time
    {
        Scanner input=new Scanner(System.in);
        Connect connect=new Connect();
        connect.getCon();
        System.out.println("Enter patient id");
        int idNo=input.nextInt();
        Patient patient=new Patient();
        patient.setIdNo(idNo);
        Date dNow = new Date( );
        SimpleDateFormat time = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

        String currentTime=time.format(dNow);
        patient.setTimeOut(currentTime);
        String checkOut="UPDATE patient_records SET timeOut='"+patient.getTimeOut()+"'WHERE idNo='"+patient.getIdNo()+"' AND timeOut IS NULL";
        connect.updateDatabase(checkOut);
        System.out.println("Patient successfully checked out");

    }
    public void viewPatientDetails()//This method is used to retrieve patient records.
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Patient ID Number");
        int idNo=input.nextInt();
        Patient patient=new Patient();
        Connect connect=new Connect();
        connect.getCon();
        String searchPatient="SELECT record_id,name,age,timeIn,phone,email,gender,Weight,height,diagnosis,prescription,drugs_given,doctor,nurse,labtech FROM person JOIN patient_records ON person.idNo=patient_records.idNo WHERE patient_records.idNo='"+idNo+"'";
        try {
            ResultSet rs=connect.queryDatabase(searchPatient);
            while (rs.next())
            {
                int recordId=rs.getInt("record_id");
                String name= rs.getString("name");
                int age=rs.getInt("age");
                String timeIn=rs.getString("timeIn");
                String phone=rs.getString("phone");
                String email=rs.getString("email");
                String gender=rs.getString("gender");
                float Weight=rs.getFloat("Weight");
                float height=rs.getFloat("height");
                String diagnosis=rs.getString("diagnosis");
                String prescription=rs.getString("prescription");
                String drugsGiven=rs.getString("drugs_given");
                String labtech=rs.getString("labtech");
                String nurse=rs.getString("nurse");
                String doctor=rs.getString("doctor");
                String timeOut=rs.getString("timeOut");

                System.out.println(recordId+"\t"+name+"\t"+age+"\t"+timeIn+"\t"+phone+"\t"+email+"\t"+gender+"\t"+Weight+"\t"+height+"\t"+diagnosis+"\t"+prescription+"\t"+nurse+"\t"+drugsGiven+"\t"+labtech+"\t"+doctor+"\t"+timeOut);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
