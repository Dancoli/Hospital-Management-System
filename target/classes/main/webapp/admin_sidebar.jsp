<div class="thumbnail"style="background-color: #81bc00;color: white;text-align:center;margin-top: -10px;">
<img src="img/images.jpg"class="img-circle"/>
		<p style="font-size: 24px;"><%=session.getAttribute("username") %></p>
		<p style="text-align: center;">Administrator <span><a href="logout.jsp">Logout</a></span></p>
	</div>
		<ul class="list-group nav nav-tabs-stacked"style="margin-top: -20px;"id="quick_licks">
			<li class="list-group-item"><a href="#">Dashboard</a></li>
			<li class="list-group-item"><a href="AddEmployee.jsp">Add Employee</a></li>
			<li class="list-group-item"><a href="ViewEmployees.jsp">View Employees</a></li>
			<li class="list-group-item"><a href="ViewDoctor.jsp">View Doctor</a></li>
			<li class="list-group-item"><a href="ViewNurse.jsp">View Nurse</a></li>
			<li class="list-group-item"><a href="ViewLabTech.jsp">ViewLabtech</a></li>
			<li class="list-group-item"><a href="ViewPatient.jsp">View Patient</a></li>
			<li class="list-group-item"><a href="ViewReceptionist.jsp">View Receptionist</a></li>
			<li class="list-group-item"><a href="#">Change Password</a></li>
			<li class="list-group-item"><a href="logout.jsp">Logout</a></li>
		</ul>