<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@include file="includes/header.jsp"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<div class="card text-white bg-info mb-3">
	<h3 class="card-header">Please fill up the Sign up form</h3>
	<div class="card-body">
<form method="post">
<div class="form-group">
    <label for="exampleInputName1">Full Name</label>
    <input name="name" type="text" class="form-control" id="exampleInputName1" aria-describedby="nameHelp">
    <small id="nameHelp" class="form-text text-muted">Please Enter your name</small>
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input name="email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input name="password1" type="password" class="form-control" id="exampleInputPassword1">
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</div>
</div>
<%@include file="includes/footer.jsp"%>
