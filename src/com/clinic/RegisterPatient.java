package com.clinic;

import com.ClinicInterfaces.ReceptionistInterface;
import com.myclasses.Patient;

import javax.ejb.EJB;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RegisterPatient extends HttpServlet{
    @EJB
//	@Named(value = "MYSQL")
//	DatabaseOperationsInterface n;
            ReceptionistInterface re;
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
    {
        PrintWriter out=response.getWriter();
        Patient patient=new Patient();
        try{
            patient.setIdNo(Integer.parseInt(request.getParameter("idno")));
        }catch(NumberFormatException e){e.printStackTrace();}
        patient.setName(request.getParameter("name"));
        try{
            patient.setAge(Integer.parseInt(request.getParameter("age")));
        }catch(NumberFormatException e){e.printStackTrace();}
        patient.setDob(request.getParameter("dob"));
        patient.setPhone(request.getParameter("phone"));
        patient.setEmail(request.getParameter("email"));
        patient.setGender(request.getParameter("gender"));
        re.insertData(patient);

//	n.connect();
//	 String getPerson="SELECT * FROM person WHERE idNo='"+patient.getIdNo()+"'";
//     int count=0;
//     try {
//         ResultSet rs= n.Read(getPerson);
//         while(rs.next())
//         {
//             count++;
//
//         }
//     } catch (SQLException e) {
//         e.printStackTrace();
//     }
//     if(count==0) {
//         String insert = "INSERT INTO Person(idNo,name,age,dob,phone,email,gender)VALUES('" + patient.getIdNo() + "','" + patient.getName() + "','" + patient.getAge() + "','" + patient.getDob() + "','" + patient.getPhone() + "','" + patient.getEmail() + "','" + patient.getGender() + "')";
//         if (n.write(insert) == true) {
//             out.println("Data successfully inserted");
//         } else
//
//         {
//             out.println("Error occured in inserting data");
//         }
//     }
//     else
//
//     {
//         out.println("The person with idNo "+patient.getIdNo()+" Already exists But checkin details have been captured");
//     }
//     Date dNow = new Date( );
//     SimpleDateFormat time = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
//
//     String currentTime=time.format(dNow);
//     patient.setTimeIn(currentTime);
//String recordDetails="INSERT INTO patient_records(idNo,timeIn)VALUES('"+patient.getIdNo()+"','"+patient.getTimeIn()+"')";
//n.write(recordDetails);
//
    }
}
