<%@ include file="header.jsp" %>
<div class="row" style="padding:90px 0px;">
<div class="col-sm-3">
</div><!-- end of col-sm-3 -->
<div class="col-sm-6">
<div class="panel">
<div class="panel-heading"style="background-color: #FF00FF;color: white;">
<h3 style="text-align:center;font-family:lucida bright;">Login</h3>
</div><!-- end of panel heading -->
<div class="panel-body">
<form action="index"method="post"class="form-horizontal">
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
<label class="control-label col-sm-3">Type</label>
<div class="col-sm-9">
<select name="type"class="form-control">
<option value="Admin">Admin</option>
<option value="Receptionist">Receptionist</option>
<option value="Doctor">Doctor</option>
<option value="Nurse">Nurse</option>
<option value="LabTech">Lab Technician</option>
</select>
<br>
<% 
if(request.getAttribute("Error")!=null)
{
	out.println(request.getAttribute("Error"));
}
%>
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
</div><!-- end of col-sm-6 -->
</div><!-- End of row -->
<%@ include file="footer.jsp" %>