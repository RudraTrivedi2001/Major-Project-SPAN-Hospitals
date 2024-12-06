<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
              integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

        <style>
            .follow {

                color: #fff !important;
                font-size: 14px;
                line-height: 20px;
                font-family: 'Times New Roman', Times, serif;
                font-weight: bolder;
                margin-right: 4px;
            }

            .fa {

                font-size: 14px;

                text-align: center;
                text-decoration: none;
                border-radius: 50%;
                margin: 5px;
                margin-left: 8px;

            }

            .Privacypolicy {
                color: #fff !important;
                font-size: 14px;
                line-height: 20px;
                font-family: 'Times New Roman', Times, serif;
                font-weight: bolder;
                margin-right: 0px;
                margin-left: 75px;
            }

            .Askspan {
                color: #fff !important;
                font-size: 14px;
                line-height: 20px;
                font-family: 'Times New Roman', Times, serif;
                font-weight: bolder;
                margin-left: -19px;
            }

            .Disclamer {
                color: #fff !important;
                font-size: 14px;
                line-height: 20px;
                font-family: 'Times New Roman', Times, serif;
                font-weight: bolder;
                margin-left: -19px;
            }

            /* Add a hover effect if you want */
            /* .fa:hover {
            opacity: ;
            } */

            /* Set a specific color for each brand */

            /* Facebook */
            .fa-facebook {
                background: #007C9D;
                color: #fff;
            }

            /* Twitter */
            .fa-twitter {
                background: #007C9D;
                color: #fff;
            }

            .fa-instagram {
                background: #007C9D;
                color: #fff;
            }

            .fa-linkedin {
                background: #007C9D;
                color: #fff;
            }

            .fa-youtube {
                background: #007C9D;
                color: #fff;
            }

            .btnlogin {
                border-color: #007C9D;
                color: #ffffff;
                font-size: 14px;
                width: 120px;
                /* padding: 3% 2% 3% 2%; */
                border-radius: 9px;
                /* margin-left: 61%; */
                margin-left: -1.2%;
                line-height: 20px;
                font-family: 'Times New Roman', Times, serif;
                background: linear-gradient(to bottom right, #007291, #07394a);
            }

            .btnlogin:hover {

                border-color: goldenrod;
            }

            .navbar navbar-expand-lg navbar-light bg-light {
                position: sticky;
                top: 10px;
            }

            .nav-item {
                font-size: large;

            }

            .navbar-brand {
                background-color: white;
            }

            .carousel-inner {
                height: 500px;
            }

            .cardnearslider img {

                width: 42px;
                padding-top: 25px;

            }

            .cardnearslider {
                text-align: center;
                background: #fff;
                box-shadow: 6px 6px 70px rgb(16 40 81 / 23%);
                padding: 16px 12px;
                height: 156px;
                width: 180px;
                border-radius: 15px;
                margin-top: 2%;
                margin-left: 16%;
                text-decoration: none;
                flex-direction: column;
                align-content: center;
                justify-content: center;
                align-items: center;
                float: left;
            }

            .cardnearslider h5 {
                font-size: 15px;
                font-weight: 600;
                line-height: 1.6;
                padding-top: 16px;
                margin: 0px;
                color: #161616;
                text-decoration: none;
            }

            .cardnearslider:hover {
                cursor: pointer;
                border-color: #01C9C9 !important;
                background: transparent linear-gradient(281deg, #007C9D 0%, #01C9C9 100%) 0% 0% no-repeat;
                text-decoration: none;
            }

            a h5:hover {
                color: whitesmoke;
                text-decoration: none;
            }

            .bar {
                width: 80%;
                height: 60px;
                background-color: #ECFBFE;
                margin-left: 10%;
                margin-bottom: 10%;
            }

            .bar h5 {
                font-size: 30px;
                font-weight: 600;
                line-height: 1.6;
                padding-top: 16px;
                padding-left: 43%;
                padding-top: 10px;
                color: #007C9D;
            }

            .bar h5:hover {

                cursor: pointer;
                color: #FFD700;

            }

            .excellenceheading {

                color: #161616;
                font-weight: 800;
                margin-top: 2%;
                margin-left: 24%;
            }

            .excellencesub {
                padding-left: 32%;
                font-size: 19px;
                font-weight: 500
            }

            .spimage img {
                border-radius: 2%;
                margin-left: 6%;
                height: 700px;
                margin-top: -4%;
                float: left;

            }

            .specialityinHosp {
                text-align: center;
                background: #fff;
                padding: 16px 12px;
                height: 100px;
                width: 120px;
                border-radius: 12px;
                margin-top: -4%;
                margin-left: 2%;
                margin-bottom: 5.7%;
                display: flex;
                flex-direction: column;
                align-content: center;
                justify-content: center;
                align-items: center;
                float: left;
                box-shadow: 6px 6px 70px rgb(16 40 81 / 10%);
                border: 1px solid #fff;
                background: #fff;


            }

            .specialityinHosp img {
                font-size: 8px;
                width: 38px;
                padding-top: 15px;

            }

            .specialityinHosp h5 {
                font-size: 14px;
                font-weight: 500;
                line-height: 1.6;
                padding-top: 8px;
                margin: 0px;
                color: #161616;
            }

            .specialityinHosp:hover {
                border: 1px solid #ffb500;
                text-decoration: none;

            }

            .specialityinHosp h5:hover {

                color: black;
                text-decoration: none;
            }


            .chooseHeading h2 {
                color: #161616;
                font-weight: bolder;
                font-family: Franklin Gothic Demi Cond;
                text-decoration: none;

            }


            .whyimg img {
                border-radius: 2%;
                margin-top: 4%;
                margin-left: 75%;
                height: 500px;
                float: left;
            }

            .jumbotron {

                margin-top: 44%;
                background-color: #ECFBFE;


            }

            .whyheading h2 {
                font-weight: 800;
                margin-left: -10%;

            }

            .whyheading p {
                word-break: break-all;
                font-size: 16px;
                line-height: 32px;
                margin-left: -10%;
                padding-top: 12px;
                padding-right: 35%;
                color: #464b4c;
                word-break: break-all;
            }

            .whyimage img {

                height: 610px;
                border-radius: 16px;
                margin-top: -55%;
                margin-left: 72%;
                float: left;
            }

            .whysmall img {

                margin-top: -40%;
                margin-left: -6%;
                margin-right: 102%;
                width: 88px;
                height: 85px;
                padding: 12px;
                background-color: #fff;
                box-shadow: 0px 0px 30px #bed9e0;
                border-radius: 9px;
                align-items: center;
                vertical-align: middle;
                float: right;
            }

            .value {

                color: #007C9D;
                font-weight: 900;
                font-size: 29px;

            }

            .textnearby h4 {

                margin-left: 15%;
                margin-bottom: 40%;
            }

            .whylist {
                word-break: break-all;
                font-size: 16px;
                line-height: 32px;
                margin-left: -10%;
                padding-top: 12px;
                padding-right: 35%;
                color: #464b4c;
                word-break: break-all;
            }

            .bar1 {
                width: 100%;
                height: 60px;
                background-color: #ECFBFE;
                margin-left: 0%;
                margin-bottom: 0%;
            }

            .bar1 h1 {
                font-size: 38px;
                font-weight: 600;
                line-height: 1.8;
                padding-top: 2px;
                /* padding-left: %; */
                /* padding-top: 10px; */
                color: #007C9D;
            }

            .clinicalservices {
                margin-top: -2%;
            }

            .headclinic {
                margin-left: 5%;
                display: inline;

            }

            .paraclinic {
                word-break: break-all;
                margin-left: 5%;

            }

            ul {
                margin: 0px;
                padding: 0px;
            }

            .footer-section {
                background: #0a2351;
                position: relative;
            }

            .footer-cta {
                border-bottom: 1px solid #373636;
            }

            .single-cta i {
                color: #ff5e14;
                font-size: 30px;
                float: left;
                margin-top: 8px;
            }

            .cta-text {
                padding-left: 15px;
                display: inline-block;
            }

            .cta-text h4 {
                color: #fff;
                font-size: 20px;
                font-weight: 600;
                margin-bottom: 2px;
            }

            .cta-text span {
                color: #757575;
                font-size: 15px;
            }

            .footer-content {
                position: relative;
                z-index: 2;
            }

            .footer-pattern img {
                position: absolute;
                top: 0;
                left: 0;
                height: 330px;
                background-size: cover;
                background-position: 100% 100%;
            }

            .footer-logo {
                margin-bottom: 30px;
            }

            .footer-logo img {
                max-width: 200px;
            }

            .footer-text p {
                margin-bottom: 14px;
                font-size: 14px;
                color: #7e7e7e;
                line-height: 28px;
            }

            /* .footer-social-icon span {
            color: #fff;
            display: block;
            font-size: 20px;
            font-weight: 700;
            font-family: 'Poppins', sans-serif;
            margin-bottom: 20px;
            } */

            /* .footer-social-icon a {
            color: #fff;
            font-size: 16px;
            margin-right: 15px;
            }
            
            .footer-social-icon i {
            height: 40px;
            width: 40px;
            text-align: center;
            line-height: 38px;
            border-radius: 50%;
            } */

            .facebook-bg {
                background: #3B5998;
            }

            .twitter-bg {
                background: #55ACEE;
            }

            .google-bg {
                background: #DD4B39;
            }

            .footer-widget-heading h3 {
                color: #fff;
                font-size: 20px;
                font-weight: 600;
                margin-bottom: 40px;
                position: relative;
            }

            .footer-widget-heading h3::before {
                content: "";
                position: absolute;
                left: 0;
                bottom: -15px;
                height: 2px;
                width: 50px;
                background: #ff5e14;
            }

            .footer-widget ul li {
                display: inline-block;
                float: left;
                width: 50%;
                margin-bottom: 12px;
            }

            .footer-widget ul li a:hover {
                color: #ff5e14;
            }

            .footer-widget ul li a {
                color: #878787;
                text-transform: capitalize;
            }

            .subscribe-form {
                position: relative;
                overflow: hidden;
            }

            .subscribe-form input {
                width: 100%;
                padding: 14px 28px;
                background: white;
                border: 1px solid #2E2E2E;
                color: black;
            }

            .subscribe-form button {
                position: absolute;
                right: 0;
                background: #ff5e14;
                padding: 13px 20px;
                border: 1px solid #ff5e14;
                top: 0;
            }

            .subscribe-form button i {
                color: #fff;
                font-size: 22px;
                transform: rotate(-6deg);
            }

            .copyright-area {
                background: #202020;
                padding: 25px 0;
            }

            .copyright-text p {
                margin: 0;
                font-size: 14px;
                color: #878787;
            }

            .copyright-text p a {
                color: #ff5e14;
            }

            .footer-menu li {
                display: inline-block;
                margin-left: 20px;
            }

            .footer-menu li:hover a {
                color: #ff5e14;
            }

            .footer-menu li a {
                font-size: 14px;
                color: #878787;
            }

            .accordion {
                background-color: #eee;
                color: #444;
                cursor: pointer;
                padding: 18px;
                width: 100%;
                border: none;
                text-align: left;
                outline: none;
                font-size: 15px;
                transition: 0.4s;
            }

            .active,
            .accordion:hover {
                background-color: #ccc;
            }

            .panel {
                padding: 0 18px;
                display: none;
                background-color: white;
                overflow: hidden;
            }
        </style>
    </head>
    <body>
        <!-- Top header -->
        <div id="header" style="background-color:#007C9D;">
            <hr>


            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <span class="follow">Follow us on social media</span>
            <span class="socialmediaicon">
                <a href="#" class="fa fa-facebook"></a>
                <a href="#" class="fa fa-twitter"></a>
                <a href="#" class="fa fa-linkedin"></a>
                <a href="#" class="fa fa-youtube"></a>
                <a href="#" class="fa fa-instagram"></a>
            </span>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;


            <a class="Privacypolicy" href="">
                <span style="color: white;">
                    Privacy Policy&nbsp;&nbsp;&nbsp;&nbsp;|
                </span>
            </a>
            &nbsp;&nbsp;
            &nbsp;&nbsp;
            <a class="Disclamer">
                <span style="color: white"> Disclamer &nbsp;&nbsp;&nbsp;&nbsp;| </span>
            </a>

            &nbsp;&nbsp;
            &nbsp;&nbsp;

            &nbsp;&nbsp;
            &nbsp;&nbsp;


            <br><br>
        </div>

    </div>
    <br>
    <!-- Top header -->
    <!-- Second header -->

    <div id="header02">
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <span style="color: #666;"> &#10003</span>
        <span style="color: #4b4141">Medical Emergency</span>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <span style="color: #666;">&#128666;</span>
        <span style="color: #666;">ICU on Wheels</span>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <span style="color: #666;"> &#x1FA78;
        </span>
        <span style="color: #5a5a5a;">Blood Bank</span>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>
            &#128222; </span>
        <span style="color: #5a5a5a;"> &nbsp;Pharmacy</span> <br>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <span style="color: #5a5a5a;">0731-4733251</span>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
        <span style="color: #666;">0731-4733260</span>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;


        <span style="color: #666;">0731-4733252</span>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <span style="color: #666;">0731-4733269</span>
        <hr style="color: #6e222e;">

        <!-- Second header end -->

    </div>

    <!-- navbar start-->
    <!-- Just an image -->

    <div>
        <!-- <nav class="navbar navbar-light bg-light">
        
      </nav> -->
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="index.htm">
                <img src="Hospital LOGO1crop.png" height="80px" alt=""> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            </a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown"
                    aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavDropdown">
                <ul class="navbar-nav">
                    <li class="nav-item ">
                        <a class="nav-link" href="index.htm" style="background-color: #fff;">Home <span class="sr-only">(current)</span></a>
                    </li>

                    &nbsp;&nbsp;&nbsp;&nbsp;
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown"
                           aria-haspopup="true" aria-expanded="false">
                            About Us
                        </a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                            <a class="dropdown-item" href="Vision.html">Vision</a>
                            <a class="dropdown-item" href="#">Founders</a>

                        </div>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown"
                           aria-haspopup="true" aria-expanded="false">
                            Hospital Information
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                            <a class="dropdown-item" href="#scope">Our Scope Of Services</a>
                            <a class="dropdown-item" href="#speciality">Departments</a>
                            <a class="dropdown-item" href="Mediclaims.html">Empanelments</a>
                            <a class="dropdown-item" href="Mediclaims.html">Cashless Mediclam Facility</a>
                        </div>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown"
                           aria-haspopup="true" aria-expanded="false">
                            Patient Care
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                            <a class="dropdown-item" href="#speciality">Find a Doctor </a>
                            <a class="dropdown-item" href="#">SPAN Surgery-Assured Price </a>
                            <a class="dropdown-item" href="serviceexcellence.html"> Service Excellence </a>
                            <a class="dropdown-item" href="#">Patient Testimonials </a>




                        </div>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown"
                           aria-haspopup="true" aria-expanded="false">
                            Centres of Excellence
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                            <a class="dropdown-item" href="Cardiology.html">Cardiology</a>
                            <a class="dropdown-item" href="Oncology.html">Oncology</a>
                            <a class="dropdown-item" href="orthopedics.html">orthopaedic</a>
                            <a class="dropdown-item" href="Gynecologist.html">Gynecology</a>
                            <a class="dropdown-item" href="dentist.html">Dentistry</a>
                            <a class="dropdown-item" href="ENT.html">ENT</a>
                            <a class="dropdown-item" href="gasteroentrologist.html">Gasteroentrologist</a>
                            <a class="dropdown-item" href="Endocrinologist.html">Endocrinology</a>
                            <a class="dropdown-item" href="Rheumatology.html">Rheumatology</a>
                            <a class="dropdown-item" href="Neurology.html">Neurology</a>
                            <a class="dropdown-item" href="Neurosurgery.html">Neurosurgery</a>
                            <a class="dropdown-item" href="Nephrology.html">Nephrology</a>
                            <a class="dropdown-item" href="neonatology.html">Neonatology</a>
                            <a class="dropdown-item" href="Opthalmology.html">Opthalmology</a>
                            <a class="dropdown-item" href="Pediatrics.html">Pediatrics</a>
                            <a class="dropdown-item" href="plasticsurgery.html">Plastic Surgery</a>
                            <a class="dropdown-item" href="Pulmonology.html">Pulmonology</a>
                            <a class="dropdown-item" href="Psychiatry.html">Psychiatry</a>
                            <a class="dropdown-item" href="Radiology.html">Radiology</a>
                            <a class="dropdown-item" href="urology.html">Urology</a>
                            <a class="dropdown-item" href="Vascularsurgery.html">Vascularsurgery</a>





                        </div>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown"
                           aria-haspopup="true" aria-expanded="false">
                            Health Information
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                            <a class="dropdown-item" href="MedicalGlossaryDecoded.html">Medical Glossary</a>
                            <!-- <a class="dropdown-item" href="#">Understanding Investigation</a> -->

                        </div>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" href="#">Patients Rights</a>
                    </li>
                    </li>
                </ul>
            </div>
        </nav>

    </div>
    <!-- navbar  end-->



    <div class="Table">

        <br>
        <center><h1>Table for Admin</h1></center>
        <hr color="red">
        <center>
            <br><br>
            <%

                Class.forName("com.mysql.jdbc.Driver");
                String a = "jdbc:mysql://localhost:3306/major_project?characterEncoding=utf8";
                Connection conn = DriverManager.getConnection(a, "root", "root18");

                Statement p = null;
                ResultSet rs = null;
                String sql = null;
                sql = "SELECT * FROM appointment";

                p = conn.createStatement();
                rs = p.executeQuery(sql);


            %>
            <table border="5px" cellpadding="2px" cellspacing="2px">

                <tr>

                    <th colspan="10"><center>Show Appointments</center></th>
                </tr>

                <tr>
                    <th><center>Appointment Id</center></th>
                    <th><center>First Name</center></th>
                    <th><center>Last Name</center></th>
                    <th><center>Age</center></th>
                    <th><center>Patient History</center></th>
                    <th><center>City</center></th>
                    <th><center>Time Slot</center></th>
                    <th><center>Contact</center></th>
                    <th><center>Date</center></th>
                    <th><center>Others</center></th>
                </tr>
                <%                    
                    int cnt = 1;
                    while (rs.next()) {
                %>
                <tr>
                    <td><center><%=rs.getString("appointment_id")%></center></td>
                    <td><center><%=rs.getString("f_name")%></center></td>
                    <td><center><%=rs.getString("l_name")%></center></td>
                    <td><center><%=rs.getString("age")%></center></td>
                    <td><center><%=rs.getString("pat_history")%></center></td>
                    <td><center><%=rs.getString("city")%></center></td>
                    <td><center><%=rs.getString("time_slot")%></center></td>
                    <td><center><%=rs.getString("contact")%></center></td>
                    <td><center><%=rs.getString("date")%></center></td>
                    <td><center><a href="DeleteAppointment.jsp?id=<%=rs.getString("appointment_id")%>">Delete &nbsp;</a></center></td>
                </tr>
                <%
                    }
                %>


            </table>

        </center>

    </div>







    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
            integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
    crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
            integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
    crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
            integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
    crossorigin="anonymous"></script>

</body>
</html>