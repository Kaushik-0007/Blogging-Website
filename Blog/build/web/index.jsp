<%-- 
    Document   : index
    Created on : 14 Apr 2024, 16:32:27
    Author     : family
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="com.blog.helper.ConnectionProvider" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Coding Blog Website</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="css/mystyle.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
            .banner-background{
             clip-path: polygon(30% 0%, 70% 0%, 100% 0, 100% 91%, 63% 100%, 22% 91%, 0 99%, 0 0);
            }
        </style>
    </head>
    <body>
        <%@include file="normal_navbar.jsp"%>
        
        <div class="container-fluid p-0 m-0">

            <div class="jumbotron primary-background text-white banner-background">
                <div class="container">
                    <h3 class="display-3">Welcome to Coding Blog </h3>
                    <p> <i> <b> By Kaushik, Karthik, Vardhan, and Vignesh.</p> </i> </b>

                    <p>Your gateway to the vibrant world of computer science!
                       <br>
                        Programming languages, as formal tools, orchestrate a symphony of instructions, shaping diverse outputs and powering the backbone of computational innovation. 
                    </p>
                    <p>
                        Within these digital realms, programmable machines execute precise instructions, bridging the gap between human creativity and technological prowess.
                        <br>
                        Join us as we unravel the intricacies of coding languages and explore the boundless possibilities they offer in our quest for digital mastery.
                    </p>

                    <a href="register_page.jsp" class="btn btn-outline-light btn-lg"><span class="fa fa fa-user-plus"></span>  Start ! its Free</a>
                    <a href="login_page.jsp" class="btn btn-outline-light btn-lg"> <span class="fa fa-user-circle fa-spin"></span>  Login</a>

                </div>
            </div>
            
            
        <div class="container">

            <div class="row mb-2">

                <div class="col-md-4">
                    <div class="card" >

                        <div class="card-body">
                            <h5 class="card-title"> C Programming</h5>
                            <p class="card-text">C, the foundation of modern computing, offers unparalleled control and efficiency in system-level programming.</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card" >

                        <div class="card-body">
                            <h5 class="card-title">C++ Programming</h5>
                            <p class="card-text">C++, a versatile language, empowers developers with its object-oriented paradigm and high-performance capabilities.</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card" >

                        <div class="card-body">
                            <h5 class="card-title">Java Programming</h5>
                            <p class="card-text">Java, renowned for its platform independence, fuels robust and scalable enterprise applications worldwide.</p>
                        </div>
                    </div>
                </div>


            </div>




            <div class="row">

                <div class="col-md-4">
                    <div class="card" >

                        <div class="card-body">
                            <h5 class="card-title">Python Programming</h5>
                            <p class="card-text"> Python, cherished for its simplicity and readability, facilitates rapid development across diverse domains.</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card" >

                        <div class="card-body">
                            <h5 class="card-title">Database Programming</h5>
                            <p class="card-text">SQL, the language of databases, enables efficient data manipulation and retrieval for informed decision-making.</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card" >

                        <div class="card-body">
                            <h5 class="card-title">JavaScript Programming</h5>
                            <p class="card-text">JavaScript, the backbone of web development, brings interactivity and dynamism to modern websites with its client-side scripting prowess.</p>
                        </div>
                    </div>
                </div>


            </div>

        </div>
        
        
        <script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script src="js/myjs.js" type="text/javascript"></script>
        </script>
    </body>
</html>
