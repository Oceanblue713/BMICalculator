<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
      <form action = "/BMICal/BMIResult" method="post">
        <h3>What is your height?</h3>
        <input name="height" class="box"><span>cm</span></input>

        <h3>What is your weight?</h3>
        <input name="weight" class="box"><span>kg</span></input>
        <br>
        <br>
        <br>
        <input type="submit" value="Start Checking" class="btn btn-danger"></a>
        <a class="btn btn-info" href=/BMICal/Main.html role="button">Back to MainPage</a>
      </form>
    </div>
  </div>
</body>
</html>
