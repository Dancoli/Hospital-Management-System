package com.clinic;

import com.ClinicInterfaces.LabtechI;
import com.myclasses.Patient;

import javax.ejb.EJB;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class LabTechServlet extends HttpServlet {
	@EJB
	LabtechI a;
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		Patient patient=new Patient();
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		String name=(String) session.getAttribute("username");
		response.setContentType("text/html");
		try {
			int idNo = Integer.parseInt(request.getParameter("idno"));
			float Weight = Float.parseFloat(request.getParameter("Weight"));
			float height = Float.parseFloat(request.getParameter("height"));
			patient.setName(name);
			patient.setIdNo(idNo);
			patient.setWeight(Weight);
			patient.setHeight(height);
			a.updateDetails(patient, patient.getIdNo());
		}
		catch (NumberFormatException n){
			n.printStackTrace();
		}

	}
}
