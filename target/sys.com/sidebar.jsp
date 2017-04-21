<div class="thumbnail"style="background-color: #FF00FF;color: white;text-align:center;margin-top: -10px;">
<img src="img/user.png"class="img-circle"/>
		<p style="font-size: 24px;"><%=session.getAttribute("username") %></p>
		<p style="text-align: center;">Employee <span><a href="logout.jsp">Logout</a></span></p>
	</div>
		<ul class="list-group nav nav-tabs-stacked"style="margin-top: -20px;"id="quick_licks">
			<li class="list-group-item"><a href="Receptionist.jsp">Register Patient</a></li>
			<li class="list-group-item"><a href="ViewIndividualPatient.jsp">View Patient Details</a></li>
			<li class="list-group-item"><a href="CheckoutPatient.jsp">Checkout Patient</a></li>
			<li class="list-group-item"><a href="logout.jsp">Logout</a></li>
		</ul>