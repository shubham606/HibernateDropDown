<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>E-Library</title>
<style type="text/css">
    body{        
        padding-top: 60px;
        padding-bottom: 40px;
        background: yellow;
    }
    .fixed-header, .fixed-footer{
        width: 100%;
        position: fixed;        
        background: brown;
        padding: 10px 0;
        color: white;
    }
    .fixed-header{
        top: 0;
    }
    .fixed-footer{
        bottom: 0;
    }
    .container{
        width: 80%;
        margin: 0 auto; /* Center the DIV horizontally */
    }
    nav a{
        color: white;
        text-decoration: none;
        padding: 7px 25px;
        display: inline-block;
    }
</style>
</head>
<body>
    <div class="fixed-header">
        <div class="container">
          <center>  <nav>
                <a href="bookissue.jsp">Home</a>
                <a href="view">Book Issue</a>
            
            </nav></center>
        </div>
    </div>  
    <div class="fixed-footer">
        <center><div class="container">Copyright &copy; 2020 E-Library</div></center>        
    </div>
</body>
</html>
     

