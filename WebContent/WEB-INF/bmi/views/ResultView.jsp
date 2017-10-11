<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import= "bmi.models.ResultModel"%>
<% ResultModel person = (ResultModel) request.getAttribute("personBmi");%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <title>BMICal</title>
  <link rel="stylesheet" href="BMIView.css">
</head>
<body>
  <div class="box1Wrap">
    <div class="box1">
      <h3>Your Height is</h3>
    </div>
  </div>
  <div class="box1Wrap">
    <div class="box1">
      <h2><%= person.getHeight() %>cm</h2>
    </div>
  </div>
  <div class="box1Wrap">
    <div class="box1">
      <h3>Your Weight is</h3>
    </div>
  </div>
  <div class="box1Wrap">
    <div class="box1">
      <h2><%= person.getWeight() %>kg</h2>
    </div>
  </div>
  <div class="box1Wrap">
    <div class="box1">
      <h3>Your BMI is</h3>
    </div>
  </div>
  <div class="box1Wrap">
    <div class="box1">
      <h2 class="bodytype"><%= person.getBmi() %></h2>
    </div>
  </div>
  <div class="box1Wrap">
    <div class="box1">
      <h3>Your Body type is</h3>
    </div>
  </div>
  <div class="box1Wrap">
    <div class="box1">
      <h2 class="bodytype"><%= person.getBodyType() %></h2>
    </div>
  </div>
     <br>
     <br>
  <div class="box1Wrap">
    <div class="box1">
      <a class="btn btn-info" href=/BMICal/BMICal role="button">Back to BMICalculator</a>
    </div>
  </div>
</body>
</html>