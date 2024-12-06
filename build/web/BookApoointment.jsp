<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>*
        {
            padding: 0px;
            text-align: center;
        }
        .container {
            padding: 16px;
           
        }
        h2{
            margin-top: 4px;
            font-family: -apple-ystem, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
            text-align: center;
            
        
        }
        .logo
        {
            width:250px;
            height:220px;
            vertical-align: middle;
        
        }
        .Registration
        {
            margin: auto;
            width: 550px;
            margin-top: 25px;
            margin-bottom: 30px;
            box-sizing: border-box;
            border: 1px solid rgba(0,0,0.1);
            box-shadow: 0 5px 10px rgba(0,0,0.2);
        }
        input[type=text],input[type=tel],input[type=email], input[type=password], input[type=date],select{
            width:400px;
            border: none;
            padding:12px 20px  ;
            text-align: left;
            margin:5px 0px;
            display: inline-block;
            border:1px solid blue;
            border-radius: 5px;
            
        }
        input[type=Submit]
        {
            width: 300px;
            padding: 14px 20px; 
            background-color:#4CAF50;
            border: none;
            cursor: pointer;
            margin-top: 20px;
            color:#000;
            font-weight: bold;
            font-variant: small-caps;
            border-radius: 1em;
        }
        input[type=Submit]:hover{
            opacity: 0.8;
        }
        
        div  label{    
            font-weight: bolder;
            padding: 3px;
            margin: 0px ;
            text-align: left;
        
        }
        select:focus,input[type=tel]:focus,input[type=text]:focus,input[type=email]:focus, input[type=password]:focus, input[type=date]:focus{
            border: 2px solid blue;
        }
        input[type=radio]
        {
            margin-left:10px ;
            display: inline-table;
        }
        
        </style>
        </style>
</head>
<body>
    
<body>
    <div class="Registration">
      <h2> Book Appointment HERE..</h2>
      <div class="container">
          <form action="uploadAppointment.jsp" method="post">
          <img class="logo" src="Hospital LOGO.png" alt="Logo">
          <br>
          <br>
          <label style="text-align: left;">First Name:</label><br>
          <input type="text" name="f_name" placeholder="First Name.." required>
          <br>
          
          <label style="text-align: left;">Last Name:</label><br>
          <input type="text" name="l_name" placeholder="Last Name.." required>
          <br>
          
          <label>Age:</label><br>
          <input type="text" name="age" id="age" required><br>
          <br>
          
          <label>Contact Number:</label><br>
          <input type="tel" name="contact" placeholder="Enter Contact Number..">
          <br>
          
          <label>Patient history: </label> <br>
          <input type="text" name="pat_history" placeholder="Describe Patient History.." required>
          <br>
          
          <label>City: </label> <br>
          <input type="text" name="city" placeholder="Enter your city.." required>
          <br>
          
          <label>Date: </label> <br>
          <input type="date" name="date" placeholder="Enter date.." required>
          <br>
          
          <label>Time Slot: </label> <br>
          <select placeholder="Select preferred time slot.." name="time_slot" required>
              <option>Select preferred time slot..</option>
              <option>Morning (10:00 - 12:00)</option>
              <option>Afternoon (12:00 - 15:00)</option>
              <option>Evening (17:00 - 20:00)</option>
          </select>
          <br>
          
          
          <input type="checkbox" required> I agree to Terms & Conditions<br>
          <input type="Submit" value="Book">
  
      </div>
      </form>
  
    </div>
</body>
</html>