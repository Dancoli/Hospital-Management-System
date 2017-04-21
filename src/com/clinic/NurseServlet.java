package com.clinic;

import com.ClinicInterfaces.NurseI;
import com.myclasses.Nurse;
import com.myclasses.Patient;

import javax.ejb.EJB;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class NurseServlet extends HttpServlet {
	@EJB
	NurseI i;
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Nurse nurse = new Nurse();
		Patient patient = new Patient();
		HttpSession session = request.getSession();
		String name = (String) session.getAttribute("username");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String drugs = request.getParameter("drugs");
		int idno = Integer.parseInt(request.getParameter("idno"));
		nurse.setDrugs(drugs);
		nurse.setName(name);
		nurse.setIdNo(idno);
		i.viewPatientsData();

	}
}