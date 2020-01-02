<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
    
<!-- Mirrored from coderthemes.com/velonic_3.0/admin_3/login.jsp by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 29 May 2016 14:53:39 GMT -->
<head>
        <meta charset="utf-8">
        <meta name="author" content="order by dede58.com"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <link rel="shortcut icon" href="img/favicon_1.ico">

        <title>A公司销售管理系统</title>

        


        <!-- Bootstrap core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/bootstrap-reset.css" rel="stylesheet">

        <!--Animation css-->
        <link href="css/animate.css" rel="stylesheet">

        <!--Icon-fonts css-->
        <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
        <link href="assets/ionicon/css/ionicons.min.css" rel="stylesheet" />

        <!--Morris Chart CSS -->
        <link rel="stylesheet" href="assets/morris/morris.css">


        <!-- Custom styles for this template -->
        <link href="css/style.css" rel="stylesheet">
        <link href="css/helper.css" rel="stylesheet">
        

        <!-- HTML5 shim and Respond.js IE8 support of HTML5 tooltipss and media queries -->
        <!--[if lt IE 9]>
          <script src="js/html5shiv.js"></script>
          <script src="js/respond.min.js"></script>
        <![endif]-->

    </head>


    <body>
    <%
        //获取在LoginServlet.java中保存在session对象中的数据
        String  m1=(String)session.getAttribute("msg");
        if(m1!=null){
            out.println("<script language='javascript'> alert(\"用户名或密码错误，请重新登录，即将跳转至登录页面\");</script>");
            session.removeAttribute("msg");
        }
    %>
        <div class="wrapper-page animated fadeInDown">
            <div class="panel panel-color panel-primary">
                <div class="panel-heading">
                   <h3 class="text-center m-t-10"> 登录  </h3>
                </div> 

                <form class="form-horizontal m-t-40" action="/user/checkLogin">
                                            
                    <div class="form-group ">
                        <div class="col-xs-12">
                            <input class="form-control" name="name" type="text" placeholder="用户名">
                        </div>
                    </div>
                    <div class="form-group ">
                        
                        <div class="col-xs-12">
                            <input class="form-control" name="password" type="password" placeholder="密码">
                        </div>
                    </div>

                    <div class="form-group ">
                        <div class="col-xs-12">
                            <label class="cr-styled">
                                <input type="checkbox" checked>
                                <i class="fa"></i> 
                                记住我
                            </label>
                        </div>
                    </div>
                    
                    <div class="form-group text-right">
                        <div class="col-xs-12">
                            <button class="btn btn-purple w-md" type="submit">登录</button>
                        </div>
                    </div>
                    <div class="form-group m-t-30">
                        <div class="col-sm-7">
                            <a href="recoverpw.html"><i class="fa fa-lock m-r-5"></i> 忘记密码？</a>
                        </div>
                        <div class="col-sm-5 text-right">
                            <a href="register.jsp">创建账户</a>
                        </div>
                    </div>
                </form>

            </div>
        </div>

    


        <!-- js placed at the end of the document so the pages load faster -->
        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/pace.min.js"></script>
        <script src="js/wow.min.js"></script>
        <script src="js/jquery.nicescroll.js" type="text/javascript"></script>
        <!--common script for all pages-->
        <script src="js/jquery.app.js"></script>

    
    </body>

<!-- Mirrored from coderthemes.com/velonic_3.0/admin_3/login.jsp by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 29 May 2016 14:53:39 GMT -->
</html>
