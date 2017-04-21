<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<%@ include file="header.jsp" %>
<div class="row">
	<div class="col-sm-4">
		<%@ include file="admin_sidebar.jsp" %>
	</div>
	<div class="col-sm-8">
		<div class="panel">
			<div class="panel-heading"style="background-color: #FF00FF;color: white;">
				<h3 style="text-align:center;font-family:lucida bright;">View Doctor</h3>
			</div><!-- end of panel heading -->
			<div class="panel-body">
				<%@ page import="com.myclasses.Connect" %>
				<%@ page import="javax.inject.Inject" %>
				<%@ page import="javax.inject.Named" %>
				<%@ page import="com.myclasses.DatabaseOperationsInterface" %>
				<table class="table">
					<thead>
					<tr>
						<th>S/N</th>
						<th>Name</th>
						<th>ID Number</th>
						<th>Phone</th>
						<th>Email</th>
						<th>Gender</th>
						<th>Role</th>
						<th>Operation</th>
					</tr>
					</thead>
					<%! int counter=0;
						ResultSet rs=null;
						@Inject
						@Named("MySql")
						DatabaseOperationsInterface viewDoc;

					%>
					<%
						viewDoc.connect();
						String getEmployees="SELECT * FROM person WHERE role IN('Doctor')";
						rs=viewDoc.Read(getEmployees);
						while(rs.next())
						{
							int personId=rs.getInt("person_id");
							String name=rs.getString("name");
							int idNo=rs.getInt("idNo");
							String phone=rs.getString("phone");
							String email=rs.getString("email");
							String gender=rs.getString("gender");
							String role=rs.getString("role");
							counter++;

					%>
					<tr>
						<td><%=counter %></td>
						<td><%=name %></td>
						<td><%=idNo %></td>
						<td><%=phone %></td>
						<td><%=email %></td>
						<td><%=gender %></td>
						<td><%=role %></td>
						<td><a href="delete.jsp?deleteId=<%=personId %>"class="btn"style="background-color: #FF00FF;color: white;">Delete</a></td>
					</tr>
					<% } %>
				</table>
			</div><!-- End of panel body -->
		</div><!-- End of panel -->
	</div><!-- End of col-sm-8 -->
</div><!-- End of row -->
<%@ include file="footer.jsp" %>