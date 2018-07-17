<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--[if IE 8 ]><html class="ie" xmlns="http://www.w3.org/1999/xhtml" xml:lang="en-US" lang="en-US"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en-US" lang="en-US"><!--<![endif]-->
<head>
    <!-- Basic Page Needs -->
    <meta charset="utf-8">
    <!--[if IE]>
    <meta http-equiv='X-UA-Compatible' content='IE=edge,chrome=1'><![endif]-->
    <title></title>

    <!-- Mobile Specific Metas -->
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

    <!-- Bootstrap  -->
    <link rel="stylesheet" type="text/css" href="stylesheets/bootstrap.css">

    <!-- Theme Style -->
    <link rel="stylesheet" type="text/css" href="stylesheets/style.css">
    <link rel="stylesheet" type="text/css" href="stylesheets/responsive.css">

    <!-- Colors -->
    <link rel="stylesheet" type="text/css" href="stylesheets/colors/color1.css" id="colors">

    <!-- Animation Style -->
    <link rel="stylesheet" type="text/css" href="stylesheets/animate.css">

    <!--[if lt IE 9]>
    <script src="javascript/html5shiv.js"></script>
    <script src="javascript/respond.min.js"></script>
    <![endif]-->
</head>
<body class="header_sticky header-style-1 has-menu-extra">
<!-- Preloader -->
<div id="loading-overlay">
    <div class="loader"></div>
</div>

<!-- Boxed -->
<div class="boxed">
    <div id="site-header-wrap">
        <!-- Header -->
        <header id="header" class="header header-container clearfix">
            <div class="container clearfix" id="site-header-inner">
                <div id="logo" class="logo float-left">
                    <a href="index.html" title="logo">
                        <img src="images/logo.png" alt="image" width="107" height="24" data-retina="images/logo@2x.png"
                             data-width="107" data-height="24">
                    </a>
                </div><!-- /.logo -->
                <div class="mobile-button"><span></span></div>
                <ul class="menu-extra">
                    <li class="box-search">
                        <a class="icon_search header-search-icon" href="#"></a>
                        <form role="search" method="get" class="header-search-form" action="">
                            <input type="text" value="" name="s" class="header-search-field" placeholder="Search...">
                            <button type="submit" class="header-search-submit" title="Search">Search</button>
                        </form>
                    </li>
                    <li class="box-login">
                        <a class="icon_login" href="#"></a>
                    </li>
                    <li class="box-cart nav-top-cart-wrapper">
                        <a class="icon_cart nav-cart-trigger active" href="#"><span>3</span></a>
                        <div class="nav-shop-cart">
                            <div class="widget_shopping_cart_content">
                                <div class="woocommerce-min-cart-wrap">
                                    <ul class="woocommerce-mini-cart cart_list product_list_widget ">
                                        <li class="woocommerce-mini-cart-item mini_cart_item">
                                            <span>No Items in Shopping Cart</span>
                                        </li>
                                    </ul>
                                </div><!-- /.widget_shopping_cart_content -->
                            </div>
                        </div><!-- /.nav-shop-cart -->
                    </li>
                </ul><!-- /.menu-extra -->
                <div class="nav-wrap">
                    <nav id="mainnav" class="mainnav">
                        <ul class="menu">
                            <li><a href="index.jsp">Home</a></li>
                            <li><a href="register.jsp">register</a>
                            <li><a href="User/CarList.jsp">CarList</a></li>
                            <li><a href="login.jsp">login</a>
                            <li><a href="User/ModifyPass.jsp">ModifyPass</a></li>
                        </ul>
                    </nav><!-- /.mainnav -->
                </div><!-- /.nav-wrap -->
            </div><!-- /.container-fluid -->
        </header><!-- /header -->
    </div><!-- /#site-header-wrap -->

    <!-- SLIDER -->

    <!-- END NEW LATEST -->

    <section class="flat-row mail-chimp">
        <div class="container">
            <div class="row">
                <div class="col-md-4">
                    <div class="text">
                        <h3>Sign up for Send Newsletter</h3>
                    </div>
                </div>
                <div class="col-md-8">
                    <div class="subscribe clearfix">
                        <form action="login()" method="post" accept-charset="utf-8" id="subscribe-form">
                            <div class="subscribe-content">
                                <div class="input">
                                    <input type="tel" id="account"name="account" placeholder="Your account">
                                </div>
                                <div class="input">
                                    <input type="password" id="pass" name="pass" placeholder="Your password">
                                </div>
                                <div class="default">
                                    <input id="code" type="text" placeholder="请输入验证码" style="width: 100px"/>
                                    <img src="#" id="codeimg" onclick="getCode()"/>
                                </div>

                                <div class="button">
                                    <button type="button" onclick="login()">SUBCRIBE</button>
                                </div>
                                <font color="red" size="2"><div id="mes" style="text-align: center"></div></font>
                            </div>
                        </form>

                    </div><!-- /.subscribe -->
                </div>
            </div>
        </div>
    </section><!-- /.mail-chimp -->

    <!-- Footer -->
    <footer class="footer">
        <div class="container">
            <div class="row">
                <div class="col-sm-6 col-md-3">
                    <div class="widget widget-link">
                        <ul>
                            <li><a href="#">About Us</a></li>
                            <li><a href="#">Online Store</a></li>
                            <li><a href="#">Blog</a></li>
                            <li><a href="#">Contact Us</a></li>
                        </ul>
                    </div><!-- /.widget -->
                </div><!-- /.col-md-3 -->
                <div class="col-sm-6 col-md-3">
                    <div class="widget widget-link link-login">
                        <ul>
                            <li><a href="#">Login/ Register</a></li>
                            <li><a href="#">Your Cart</a></li>
                            <li><a href="#">Wishlist items</a></li>
                            <li><a href="#">Your checkout</a></li>
                        </ul>
                    </div><!-- /.widget -->
                </div><!-- /.col-md-3 -->
                <div class="col-sm-6 col-md-3">
                    <div class="widget widget-link link-faq">
                        <ul>
                            <li><a href="#">FAQs</a></li>
                            <li><a href="#">Term of service</a></li>
                            <li><a href="#">Privacy Policy</a></li>
                            <li><a href="#">Returns</a></li>
                        </ul>
                    </div><!-- /.widget -->
                </div><!-- /.col-md-3 -->
                <div class="col-sm-6 col-md-3">
                    <div class="widget widget-brand">
                        <div class="logo logo-footer">
                            <a href="index.html"><img src="images/logo@2x.png" alt="image" width="107" height="24"></a>
                        </div>
                        <ul class="flat-contact">
                            <li class="address">112 Kingdom, NA 12, New York</li>
                            <li class="phone">+12 345 678 910</li>
                            <li class="email">infor.deercreative@gmail.com</li>
                        </ul><!-- /.flat-contact -->
                    </div><!-- /.widget -->
                </div><!-- /.col-md-3 -->
            </div><!-- /.row -->
        </div><!-- /.container -->
    </footer><!-- /.footer -->


    <!-- Go Top -->
    <a class="go-top">
        <i class="fa fa-chevron-up"></i>
    </a>

</div>

<!-- Javascript -->
<script src="javascript/jquery.min.js"></script>
<script src="javascript/tether.min.js"></script>
<script src="javascript/bootstrap.min.js"></script>
<script src="javascript/jquery.easing.js"></script>
<script src="javascript/parallax.js"></script>
<script src="javascript/jquery-waypoints.js"></script>
<script src="javascript/jquery-countTo.js"></script>
<script src="javascript/jquery.countdown.js"></script>
<script src="javascript/jquery.flexslider-min.js"></script>
<script src="javascript/images-loaded.js"></script>
<script src="javascript/jquery.isotope.min.js"></script>
<script src="javascript/magnific.popup.min.js"></script>
<script src="javascript/jquery.hoverdir.js"></script>
<script src="javascript/owl.carousel.min.js"></script>
<script src="javascript/equalize.min.js"></script>
<script src="javascript/gmap3.min.js"></script>
<script src="javascript/jquery-ui.js"></script>
<script src="javascript/switcher.js"></script>
<script src="javascript/jquery.cookie.js"></script>
<script src="javascript/main.js"></script>

<!-- Revolution Slider -->
<script src="rev-slider/js/jquery.themepunch.tools.min.js"></script>
<script src="rev-slider/js/jquery.themepunch.revolution.min.js"></script>
<script src="javascript/rev-slider.js"></script>
<!-- Load Extensions only on Local File Systems ! The following part can be removed on Server for On Demand Loading -->
<script src="rev-slider/js/extensions/revolution.extension.actions.min.js"></script>
<script src="rev-slider/js/extensions/revolution.extension.carousel.min.js"></script>
<script src="rev-slider/js/extensions/revolution.extension.kenburn.min.js"></script>
<script src="rev-slider/js/extensions/revolution.extension.layeranimation.min.js"></script>
<script src="rev-slider/js/extensions/revolution.extension.migration.min.js"></script>
<script src="rev-slider/js/extensions/revolution.extension.navigation.min.js"></script>
<script src="rev-slider/js/extensions/revolution.extension.parallax.min.js"></script>
<script src="rev-slider/js/extensions/revolution.extension.slideanims.min.js"></script>
<script src="rev-slider/js/extensions/revolution.extension.video.min.js"></script>
<script type="text/javascript">
    function getCode() {
        document.getElementById("codeimg").src = "PictureCheckCodeServlet?a=" + Math.random();
    }

    getCode();
</script>
<script src="javascript/login.js"></script>
</body>
</html>                               
