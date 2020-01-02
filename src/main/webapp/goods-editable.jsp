<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"  %>
<!DOCTYPE html>
<html lang="en">

<!-- Mirrored from coderthemes.com/velonic_3.0/admin_3/tables-editable.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 29 May 2016 14:53:07 GMT -->
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

    <!-- Plugin Css-->
    <link rel="stylesheet" href="assets/magnific-popup/magnific-popup.css" />
    <link rel="stylesheet" href="assets/jquery-datatables-editable/datatables.css" />

    <!-- Custom styles for this template -->
    <link href="css/style.css" rel="stylesheet">
    <link href="css/helper.css" rel="stylesheet">



    <script src="js/jquery.js"></script>

    <script language="JavaScript">
        $(document).ready(function () {
            if (location.href.indexOf("#") === -1) {
                location.href = location.href + "#";
                location.reload();
            }
            $.ajax({
                url: "http://localhost:8080/goods/findAll",
                type: "POST",
                async: false
            });

        })
    </script>
</head>

<body>

<!-- Aside Start-->
<aside class="left-panel">

    <!-- brand -->
    <div class="logo">
        <a href="index.jsp" class="logo-expanded">
            <i class="ion-social-buffer"></i>
            <span class="nav-label">A公司销售管理系统</span>
        </a>
    </div>
    <!-- / brand -->

    <!-- Navbar Start -->
    <nav class="navigation">
        <ul class="list-unstyled">
            <li class="active"><a href="index.jsp"><i class="ion-home"></i> <span class="nav-label">首页</span></a></li>
            <li class="has-submenu"><a href="#"><i class="ion-flask"></i> <span class="nav-label">合同管理</span></a>
                <ul class="list-unstyled">
                    <li><a href="order-editable.jsp">查看合同</a></li>
                </ul>
            </li>
            <li class="has-submenu"><a href="#"><i class="ion-settings"></i> <span class="nav-label">客户管理</span><span class="badge bg-success">New</span></a>
                <ul class="list-unstyled">
                    <li><a href="client-editable.jsp">查看客户</a></li>
                </ul>
            </li>
            <li class="has-submenu"><a href="#"><i class="ion-compose"></i> <span class="nav-label">采购清单管理</span></a>
                <ul class="list-unstyled">
                    <li><a href="caigoulistID.jsp">新增采购清单</a></li>
                    <li><a href="order-confirm.jsp">确认发货</a></li>
                </ul>
            </li>
            <li class="has-submenu"><a href="#"><i class="ion-grid"></i> <span class="nav-label">统计销售额</span></a>
                <ul class="list-unstyled">
                    <li><a href="xiaoshoue.jsp">查看销售额</a></li>
                </ul>
            </li>
            <li class="has-submenu"><a href="#"><i class="ion-grid"></i> <span class="nav-label">销售人员管理</span></a>
                <ul class="list-unstyled">
                    <li><a href="user-editable.jsp">查看销售人员</a></li>
                </ul>
            </li>
        </ul>
    </nav>

</aside>
<!-- Aside Ends-->


<!--Main Content Start -->
<section class="content">

    <!-- Header -->
    <header class="top-head container-fluid">
        <button type="button" class="navbar-toggle pull-left">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>

        <!-- Search -->
        <form role="search" class="navbar-left app-search pull-left hidden-xs">
            <input type="text" placeholder="Search..." class="form-control">
            <a href="#"><i class="fa fa-search"></i></a>
        </form>

        <!-- Left navbar -->
        <nav class=" navbar-default" role="navigation">
            <ul class="nav navbar-nav hidden-xs">

                <li><a href="#">Files</a></li>
            </ul>

            <!-- Right navbar -->
            <ul class="nav navbar-nav navbar-right top-menu top-right-menu">
                <!-- mesages -->
                <li class="dropdown">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                        <i class="fa fa-envelope-o "></i>
                        <span class="badge badge-sm up bg-purple count">4</span>
                    </a>
                    <ul class="dropdown-menu extended fadeInUp animated nicescroll" tabindex="5001">
                        <li>
                            <p>Messages</p>
                        </li>
                        <li>
                            <a href="#">
                                <span class="pull-left"><img src="img/avatar-2.jpg" class="img-circle thumb-sm m-r-15" alt="img"></span>
                                <span class="block"><strong>John smith</strong></span>
                                <span class="media-body block">New tasks needs to be done<br><small class="text-muted">10 seconds ago</small></span>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <span class="pull-left"><img src="img/avatar-3.jpg" class="img-circle thumb-sm m-r-15" alt="img"></span>
                                <span class="block"><strong>John smith</strong></span>
                                <span class="media-body block">New tasks needs to be done<br><small class="text-muted">3 minutes ago</small></span>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <span class="pull-left"><img src="img/avatar-4.jpg" class="img-circle thumb-sm m-r-15" alt="img"></span>
                                <span class="block"><strong>John smith</strong></span>
                                <span class="media-body block">New tasks needs to be done<br><small class="text-muted">10 minutes ago</small></span>
                            </a>
                        </li>
                        <li>
                            <p><a href="inbox.html" class="text-right">See all Messages</a></p>
                        </li>
                    </ul>
                </li>
                <!-- /messages -->
                <!-- Notification -->
                <li class="dropdown">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                        <i class="fa fa-bell-o"></i>
                        <span class="badge badge-sm up bg-pink count">3</span>
                    </a>
                    <ul class="dropdown-menu extended fadeInUp animated nicescroll" tabindex="5002">
                        <li class="noti-header">
                            <p>Notifications</p>
                        </li>
                        <li>
                            <a href="#">
                                <span class="pull-left"><i class="fa fa-user-plus fa-2x text-info"></i></span>
                                <span>New user registered<br><small class="text-muted">5 minutes ago</small></span>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <span class="pull-left"><i class="fa fa-diamond fa-2x text-primary"></i></span>
                                <span>Use animate.css<br><small class="text-muted">5 minutes ago</small></span>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <span class="pull-left"><i class="fa fa-bell-o fa-2x text-danger"></i></span>
                                <span>Send project demo files to client<br><small class="text-muted">1 hour ago</small></span>
                            </a>
                        </li>

                        <li>
                            <p><a href="#" class="text-right">See all notifications</a></p>
                        </li>
                    </ul>
                </li>
                <!-- /Notification -->

                <!-- user login dropdown start-->
                <li class="dropdown text-center">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                        <img alt="" src="img/avatar-2.jpg" class="img-circle profile-img thumb-sm">
                        <span class="username">lhc</span> <span class="caret"></span>
                    </a>
                    <ul class="dropdown-menu pro-menu fadeInUp animated" tabindex="5003" style="overflow: hidden; outline: none;">
                        <li><a href="profile.html"><i class="fa fa-briefcase"></i>Profile</a></li>
                        <li><a href="#"><i class="fa fa-cog"></i> Settings</a></li>
                        <li><a href="#"><i class="fa fa-bell"></i> Friends <span class="label label-info pull-right mail-info">5</span></a></li>
                        <li><a href="/user/outLogin"><i class="fa fa-sign-out"></i> Log Out</a></li>
                    </ul>
                </li>
                <!-- user login dropdown end -->
            </ul>
            <!-- End right navbar -->
        </nav>

    </header>
    <!-- Header Ends -->



    <!-- Page Content Start -->
    <!-- ================== -->

    <div class="wraper container-fluid">
        <div class="page-title">
            <h3 class="title">合同管理</h3>
        </div>


        <div class="panel">

            <div class="panel-body">
                <div class="row">
                    <div class="col-sm-6">
                        <div class="m-b-30">
                            <button  class="btn btn-primary waves-effect waves-light" onclick="window.location.href='goods-add.jsp'">Add <i class="fa fa-plus"></i></button>
                        </div>
                    </div>
                </div>
                <table class="table table-bordered table-striped" id="datatable-editable">
                    <thead>
                    <tr>
                        <th>货物id</th>
                        <th>货物名字</th>
                        <th>当前货物数量</th>
                        <th>货物最小数量</th>
                        <th>单价</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${sessionScope.allGoods}" var="aOrder">
                        <tr>
                            <td>${aOrder.goods_id}</td>
                            <td>${aOrder.goods_name}</td>
                            <td>${aOrder.inventory}</td>
                            <td>${aOrder.min_inventory}</td>
                            <td>${aOrder.price}</td>
                            <td class="actions">
                                <a href="#" class="hidden on-editing save-row"><i class="fa fa-save"></i></a>
                                <a href="#" class="hidden on-editing cancel-row"><i class="fa fa-times"></i></a>
                                <a href="#" class="on-default edit-row"><i class="fa fa-pencil"></i></a>
                                <a href="#" class="on-default remove-row"><i class="fa fa-trash-o"></i></a>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
            <!-- end: page -->

        </div> <!-- end Panel -->


    </div>
    <!-- Page Content Ends -->
    <!-- ================== -->

    <!-- Footer Start -->
    <footer class="footer">
        A公司销售管理系统
    </footer>
    <!-- Footer Ends -->



</section>
<!-- Main Content Ends -->


<!-- MODAL -->
<div id="dialog" class="modal-block mfp-hide">
    <section class="panel panel-info panel-color">
        <header class="panel-heading">
            <h2 class="panel-title">Are you sure?</h2>
        </header>
        <div class="panel-body">
            <div class="modal-wrapper">
                <div class="modal-text">
                    <p>Are you sure that you want to delete this row?</p>
                </div>
            </div>

            <div class="row m-t-20">
                <div class="col-md-12 text-right">
                    <button id="dialogConfirm" class="btn btn-primary">Confirm</button>
                    <button id="dialogCancel" class="btn btn-default">Cancel</button>
                </div>
            </div>
        </div>

    </section>
</div>





<!-- js placed at the end of the document so the pages load faster -->
<script src="js/jquery.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/pace.min.js"></script>
<script src="js/modernizr.min.js"></script>
<script src="js/wow.min.js"></script>
<script src="js/jquery.nicescroll.js" type="text/javascript"></script>


<script src="js/jquery.app.js"></script>

<!-- Examples -->
<script src="assets/magnific-popup/magnific-popup.js"></script>
<script src="assets/jquery-datatables-editable/jquery.dataTables.js"></script>
<script src="assets/datatables/dataTables.bootstrap.js"></script>
<script src="assets/jquery-datatables-editable/goodsorderdatatables.editable.init.js"></script>



</body>

<!-- Mirrored from coderthemes.com/velonic_3.0/admin_3/tables-editable.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 29 May 2016 14:53:11 GMT -->
</html>
