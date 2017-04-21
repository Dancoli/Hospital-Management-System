<div class="thumbnail"style="background-color: #FF00FF;color: white;text-align:center;margin-top: -10px;">
<img src="img/images.jpg"class="img-circle"/>
		<p style="font-size: 24px;"><%=session.getAttribute("username") %></p>
		<p style="text-align: center;">Receptionist <span><a href="logout.jsp">Logout</a></span></p>
	</div>
		<ul class="list-group nav nav-tabs-stacked"style="margin-top: -20px;"id="quick_licks">
			<li class="list-group-item"><a href="AddPatient.jsp">Add Patient</a></li>
			<li class="list-group-item"><a href="AddEmployee.jsp">Add Employee</a></li>
			<li class="list-group-item"><a href="#">Change Password</a></li>
			<li class="list-group-item"><a href="logout.jsp">Logout</a></li>
		</ul>