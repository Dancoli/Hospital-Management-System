<%@ include file="header.jsp" %>
<div class="row">
<div class="col-sm-4">
<%@ include file="admin_sidebar.jsp" %>
</div>
<div class="col-sm-8">
<div class="panel">
<div class="panel-heading"style="background-color: #FF00FF;color: white;">
<h3 style="text-align:center;font-family:lucida bright;">Add Employee</h3>
</div><!-- end of panel heading -->
<div class="panel-body">
<form action="RegisterEmployee"method="post"class="form-horizontal">
<div class="form-group"> 
<label class="control-label col-sm-3">Type</label>
<div class="col-sm-9">
<select name="role"class="form-control">
<option value="Admin">Admin</option>
<option value="Receptionist">Receptionist</option>
<option value="Doctor">Doctor</option>
<option value="Nurse">Nurse</option>
<option value="LabTech">Lab Technician</option>
</select>
</div><!-- End of col-sm-9 -->
</div><!-- End of form group -->
<div class="form-group"> 
<label class="control-label col-sm-3">ID Number</label>
<div class="col-sm-9">
<input type="text"name="idno"class="form-control"/>
</div><!-- End of col-sm-9 -->
</div><!-- End of form group -->
<div class="form-group"> 
<label class="control-label col-sm-3">Name</label>
<div class="col-sm-9">
<input type="text"name="name"class="form-control"/>
</div><!-- End of col-sm-9 -->
</div><!-- End of form group -->
<div class="form-group"> 
<label class="control-label col-sm-3">Age</label>
<div class="col-sm-9">
<input type="text"name="age"class="form-control"/>
</div><!-- End of col-sm-9 -->
</div><!-- End of form group -->
<div class="form-group"> 
<label class="control-label col-sm-3">DOB</label>
<div class="col-sm-9">
<input type="text"name="dob"class="form-control"/>
</div><!-- End of col-sm-9 -->
</div><!-- End of form group -->
<div class="form-group"> 
<label class="control-label col-sm-3">Phone</label>
<div class="col-sm-9">
<input type="text"name="phone"class="form-control"/>
</div><!-- End of col-sm-9 -->
</div><!-- End of form group -->
<div class="form-group"> 
<label class="control-label col-sm-3">Email</label>
<div class="col-sm-9">
<input type="email"name="email"class="form-control"/>
</div><!-- End of col-sm-9 -->
</div><!-- End of form group -->
<div class="form-group"> 
<label class="control-label col-sm-3">Gender</label>
<div class="col-sm-9">
<input type="radio"name="gender"value="Male">Male
<input type="radio"name="gender"value="Female">Female
</div><!-- End of col-sm-9 -->
</div><!-- End of form group -->
<div class="form-group"> 
<label class="control-label col-sm-3">Username</label>
<div class="col-sm-9">
<input type="text"name="username"class="form-control">
</div><!-- End of col-sm-9 -->
</div><!-- End of form group -->
<div class="form-group"> 
<label class="control-label col-sm-3">Password</label>
<div class="col-sm-9">
<input type="password"name="password"class="form-control">
</div><!-- End of col-sm-9 -->
</div><!-- End of form group -->
<div class="form-group"> 
<label class="control-label col-sm-3"></label>
<div class="col-sm-9">
<input type="submit"value="Submit"class="btn pull-right"style="background-color: #FF00FF;color: white;"/>
</div><!-- End of col-sm-9 -->
</div><!-- End of form group -->
</form>
</div><!-- End of panel body -->
</div><!-- End of panel -->
</div><!-- End of col-sm-8 -->
</div><!-- End of row -->
<%@ include file="footer.jsp" %>