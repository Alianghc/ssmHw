<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
    
<!-- Mirrored from coderthemes.com/velonic_3.0/admin_3/rickshaw-chart.jsp by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 29 May 2016 14:53:17 GMT -->
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


        <link rel="stylesheet" href="assets/rickshaw-chart/rickshaw.min.css">

        <link type="text/css" rel="stylesheet" href="../../../ajax.googleapis.com/ajax/libs/jqueryui/1.8/themes/base/jquery-ui.css">

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
                    <li><a href="index.jsp"><i class="ion-home"></i> <span class="nav-label">Dashboard</span></a></li>
                    <li class="has-submenu"><a href="#"><i class="ion-flask"></i> <span class="nav-label">UI Elements</span></a>
                        <ul class="list-unstyled">
                            <li><a href="typography.html">Typography</a></li>
                            <li><a href="buttons.html">Buttons</a></li>
                            <li><a href="icons.html">Icons</a></li>
                            <li><a href="panels.html">Panels</a></li>
                            <li><a href="tabs-accordions.html">Tabs &amp; Accordions</a></li>
                            <li><a href="modals.html">Modals</a></li>
                            <li><a href="bootstrap-ui.html">BS Elements</a></li>
                            <li><a href="progressbars.html">Progress Bars</a></li>
                            <li><a href="notification.html">Notification</a></li>
                            <li><a href="sweet-alert.sweet-alert.jsp">Sweet-Alert</a></li>
                        </ul>
                    </li>
                    <li class="has-submenu"><a href="#"><i class="ion-settings"></i> <span class="nav-label">Components</span><span class="badge bg-success">New</span></a>
                        <ul class="list-unstyled">
                            <li><a href="grid.html">Grid</a></li>
                            <li><a href="portlets.html">Portlets</a></li>
                            <li><a href="widgets.html">Widgets</a></li>
                            <li><a href="nestable-list.html">Nesteble</a></li>
                            <li><a href="calendar.html">Calendar</a></li>
                            <li><a href="ui-sliders.html">Range Slider</a></li>
                        </ul>
                    </li>
                    <li class="has-submenu"><a href="#"><i class="ion-compose"></i> <span class="nav-label">Forms</span></a>
                        <ul class="list-unstyled">
                            <li><a href="xiaoshoue.jsp">General Elements</a></li>
                            <li><a href="form-validation.html">Form Validation</a></li>
                            <li><a href="form-advanced.html">Advanced Form</a></li>
                            <li><a href="form-wizard.html">Form Wizard</a></li>
                            <li><a href="form-editor.html">WYSIWYG Editor</a></li>
                            <li><a href="code-editor.html">Code Editors</a></li>
                            <li><a href="form-uploads.html">Multiple File Upload</a></li>
                            <li><a href="image-crop.html">Image Crop</a></li>
                            <li><a href="form-xeditable.html">X-Editable</a></li>
                        </ul>
                    </li>
                    <li class="has-submenu"><a href="#"><i class="ion-grid"></i> <span class="nav-label">Data Tables</span></a>
                        <ul class="list-unstyled">
                            <li><a href="tables.html">Basic Tables</a></li>
                            <li><a href="table-datatable.jsp">Data Table</a></li>
                            <li><a href="saletables-editable.jsp">Editable Table</a></li>
                            <li><a href="responsive-table.html">Responsive Table</a></li>
                        </ul>
                    </li>
                    <li class="has-submenu active"><a href="#"><i class="ion-stats-bars"></i> <span class="nav-label">Charts</span><span class="badge bg-purple">1</span></a>
                        <ul class="list-unstyled">
                            <li><a href=" ">Morris Chart</a></li>

                              <li class="active"><a href="rickshaw-chart.rickshaw-chart.jsp">Rickshaw Chart</a></li>
                            <li><a href="peity-chart.html">Peity Chart</a></li>
                            <li><a href="c3-chart.html">C3 Chart</a></li>
                            <li><a href="other-chart.html">Other Chart</a></li>
                        </ul>
                    </li>

                    <li class="has-submenu"><a href="#"><i class="ion-email"></i> <span class="nav-label">Mail</span></a>
                        <ul class="list-unstyled">
                            <li><a href="inbox.html">Inbox</a></li>
                            <li><a href="email-compose.html">Compose Mail</a></li>
                            <li><a href="email-read.html">View Mail</a></li>
                            <li><a href="email-templates.html">Email Templates</a></li>
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
                    <h3 class="title">Ricksaw Charts</h3> 
                </div>

                <!-- BAR Chart -->
                <div class="row">
                    <div class="col-sm-12">
                        <div class="portlet"><!-- /primary heading -->
                            <div class="portlet-heading">
                                <h3 class="portlet-title text-dark">
                                    Line Chart
                                </h3>
                                <div class="portlet-widgets">
                                    <a href="javascript:;" data-toggle="reload"><i class="ion-refresh"></i></a>
                                    <span class="divider"></span>
                                    <a data-toggle="collapse" data-parent="#accordion1" href="#bg-default"><i class="ion-minus-round"></i></a>
                                    <span class="divider"></span>
                                    <a href="#" data-toggle="remove"><i class="ion-close-round"></i></a>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                            <div id="bg-default" class="panel-collapse collapse in">
                                <div class="portlet-body">
                                    <div id="linechart"></div> 
                                </div>
                            </div>
                        </div> <!-- /Portlet -->
                    </div> <!-- col -->
                </div> <!-- End row-->


                <div class="row">
                    <!--  Line Chart -->
                    <div class="col-lg-6">
                        <div class="portlet"><!-- /primary heading -->
                            <div class="portlet-heading">
                                <h3 class="portlet-title text-dark">
                                    Lines & Toggling Chart
                                </h3>
                                <div class="portlet-widgets">
                                    <a href="javascript:;" data-toggle="reload"><i class="ion-refresh"></i></a>
                                    <span class="divider"></span>
                                    <a data-toggle="collapse" data-parent="#accordion1" href="#portlet4"><i class="ion-minus-round"></i></a>
                                    <span class="divider"></span>
                                    <a href="#" data-toggle="remove"><i class="ion-close-round"></i></a>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                            <div id="portlet4" class="panel-collapse collapse in">
                                <div class="portlet-body">
                                    <div id="linetoggle"></div>
                                </div>
                            </div>
                        </div> <!-- /Portlet -->
                    </div>

                    <!--  Line Chart -->
                    <div class="col-lg-6">
                        <div class="portlet"><!-- /primary heading -->
                            <div class="portlet-heading">
                                <h3 class="portlet-title text-dark">
                                    Donut Chart
                                </h3>
                                <div class="portlet-widgets">
                                    <a href="javascript:;" data-toggle="reload"><i class="ion-refresh"></i></a>
                                    <span class="divider"></span>
                                    <a data-toggle="collapse" data-parent="#accordion1" href="#portlet5"><i class="ion-minus-round"></i></a>
                                    <span class="divider"></span>
                                    <a href="#" data-toggle="remove"><i class="ion-close-round"></i></a>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                            <div id="portlet5" class="panel-collapse collapse in">
                                <div class="portlet-body">
                                    <div id="lineplotchart"></div>
                                </div>
                            </div>
                        </div> <!-- /Portlet -->
                    </div>
                </div> <!-- End row-->

                <div class="row">
                    <!--  Line Chart -->
                    <div class="col-lg-12">
                        <div class="portlet"><!-- /primary heading -->
                            <div class="portlet-heading">
                                <h3 class="portlet-title text-dark">
                                    Multi Chart
                                </h3>
                                <div class="portlet-widgets">
                                    <a href="javascript:;" data-toggle="reload"><i class="ion-refresh"></i></a>
                                    <span class="divider"></span>
                                    <a data-toggle="collapse" data-parent="#accordion1" href="#portlet6"><i class="ion-minus-round"></i></a>
                                    <span class="divider"></span>
                                    <a href="#" data-toggle="remove"><i class="ion-close-round"></i></a>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                            <div id="portlet6" class="panel-collapse collapse in">
                                <div class="portlet-body">
                                    <div class="column">
                                        <div id="multichart"></div>
                                    </div>
                                    <div class="column" id="legend"></div>
                                </div>
                            </div>
                        </div> <!-- /Portlet -->
                    </div>

                </div> <!-- End row-->

                <div class="row">

                    <!-- Area Chart -->
                    <div class="col-lg-6">
                        <div class="portlet"><!-- /primary heading -->
                            <div class="portlet-heading">
                                <h3 class="portlet-title text-dark">
                                    Simple area Chart
                                </h3>
                                <div class="portlet-widgets">
                                    <a href="javascript:;" data-toggle="reload"><i class="ion-refresh"></i></a>
                                    <span class="divider"></span>
                                    <a data-toggle="collapse" data-parent="#accordion1" href="#portlet2"><i class="ion-minus-round"></i></a>
                                    <span class="divider"></span>
                                    <a href="#" data-toggle="remove"><i class="ion-close-round"></i></a>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                            <div id="portlet2" class="panel-collapse collapse in">
                                <div class="portlet-body">
                                    <div id="simplearea"></div> 
                                </div>
                            </div>
                        </div> <!-- /Portlet -->
                    </div>

                    <!-- Donut Chart -->
                    <div class="col-lg-6">
                        <div class="portlet"><!-- /primary heading -->
                            <div class="portlet-heading">
                                <h3 class="portlet-title text-dark">
                                    Multiple Area
                                </h3>
                                <div class="portlet-widgets">
                                    <a href="javascript:;" data-toggle="reload"><i class="ion-refresh"></i></a>
                                    <span class="divider"></span>
                                    <a data-toggle="collapse" data-parent="#accordion1" href="#portlet3"><i class="ion-minus-round"></i></a>
                                    <span class="divider"></span>
                                    <a href="#" data-toggle="remove"><i class="ion-close-round"></i></a>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                            <div id="portlet3" class="panel-collapse collapse in">
                                <div class="portlet-body">
                                    <div id="multiplearea"></div> 
                                </div>
                            </div>
                        </div> <!-- /Portlet -->
                    </div>
                </div> <!-- End row-->


                

            </div>

            <!-- Footer Start -->
            <footer class="footer">
                 A公司销售管理系统
            </footer>
            <!-- Footer Ends -->


        </section>
        



        <!-- js placed at the end of the document so the pages load faster -->
        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/pace.min.js"></script>
        <script src="js/modernizr.min.js"></script>
        <script src="js/wow.min.js"></script>
        <script src="js/jquery.nicescroll.js" type="text/javascript"></script>
        <script src="../../../ajax.googleapis.com/ajax/libs/jqueryui/1.8.15/jquery-ui.min.js"></script>


        <script src="js/jquery.app.js"></script>

        <!-- jQuery Flot Chart-->
        <script src="assets/rickshaw-chart/vendor/d3.min.js"></script>
        <script src="assets/rickshaw-chart/vendor/d3.layout.min.js"></script>
        <script src="assets/rickshaw-chart/rickshaw.min.js"></script>
        <script src="assets/rickshaw-chart/rickshaw.chart.init.js"></script>

        

    </body>

<!-- Mirrored from coderthemes.com/velonic_3.0/admin_3/rickshaw-chart.jsp by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 29 May 2016 14:53:20 GMT -->
</html>
