<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>GCTS</title>
    <style>
        body {
            background: linear-gradient(to right, #9c27b0, #8ecdff);
            overflow: hidden;
        }
        h1 {
            text-align: center;
            font-family: 'Iron Bridge';
            font-size: 80px;
            color: white;
            width: 100%;
            position:relative;
        }
        .buttons {
            font-family: 'Microsoft YaHei UI';
            text-align: center;
        }
        #log {
            background-color: #4CAF50;
            border: none;
            color: white;
            padding: 15px 32px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin-bottom: 15px;
        }
        #sign {
            background-color: cornflowerblue;
            border: none;
            color: white;
            padding: 15px 32px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
        }
    </style>
</head>
<body>
<div class="main">
    <div class="logo" style="text-align: center">
        <img src="brokengadget.png" width="20%" height="30%">
    </div>
    <h1><%= "Gadget Complaint Tracking System" %>
    </h1>
    <br/>
    <div class="buttons">
        <a href="login" id="log">Login</a>
        <br/>
        <a href="create" id="sign">Create Account</a>
    </div>
</div>
</body>
</html>