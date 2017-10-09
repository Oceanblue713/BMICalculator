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

      <h3>Your Height is</h3>
        <h2><%= person.getHeight() %></h2>
      <br>
      <h3>Your Weight is</h3>
        <h2><%= person.getWeight() %></h2>
      <br>
      <h3>Your BMI is</h3>
        <h2><%= person.getBmi() %></h2>
      <br>
      <h3>Your Body type is</h3>
        <h2><%= person.getBodyType() %></h2>
     <br>
     <br>
      <a class="btn btn-info" href=/BMICal/BMICal role="button">Back to BMICalculator</a>

</body>
</html>