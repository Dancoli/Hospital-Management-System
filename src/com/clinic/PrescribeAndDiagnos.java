package com.clinic;

import com.ClinicInterfaces.DoctorI;
import com.myclasses.Doctor;
import com.myclasses.Patient;

import javax.ejb.EJB;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class PrescribeAndDiagnos extends HttpServlet {
	@EJB
	DoctorI u;
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		PrintWriter out=response.getWriter();
		Patient patient=new Patient();
		Doctor doctor=new Doctor();
		int idNo=Integer.parseInt(request.getParameter("idno"));
		String diagnos=request.getParameter("diagnos");
		String prescribe=request.getParameter("prescribe");
		patient.setIdNo(idNo);
		patient.setDiagnosis(diagnos);
		patient.setPrescription(prescribe);
		HttpSession session=request.getSession();
		String name=(String) session.getAttribute("username");
		doctor.setName(name);
		u.updatePatient(patient);


	}
}
