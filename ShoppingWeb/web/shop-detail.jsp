<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<!--[if IE 8 ]><html class="ie" xmlns="http://www.w3.org/1999/xhtml" xml:lang="en-US" lang="en-US"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en-US" lang="en-US"><!--<![endif]-->
<head>
    <!-- Basic Page Needs -->
    <meta charset="utf-8">
    <!--[if IE]><meta http-equiv='X-UA-Compatible' content='IE=edge,chrome=1'><![endif]-->
    <title></title>

    <!-- Mobile Specific Metas -->
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

    <!-- Bootstrap  -->
    <link rel="stylesheet" type="text/css" href="stylesheets/bootstrap.css" >

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
<body class="header_sticky header-style-2 has-menu-extra">
<!-- Preloader -->
<div id="loading-overlay">
    <div class="loader"></div>
</div>

<!-- Boxed -->
<div class="boxed">
    <div id="site-header-wrap">
        <!-- Header -->
        <header id="header" class="header clearfix">
            <div class="container-fluid clearfix container-width-93" id="site-header-inner">
                <div id="logo" class="logo float-left">
                    <a href="index.html" title="logo">
                        <img src="images/logo.png" alt="image" width="107" height="24" data-retina="images/logo@2x.png" data-width="107" data-height="24">
                    </a>
                </div><!-- /.logo -->
                <div class="mobile-button"><span></span></div>
                <ul class="menu-extra">
                    <li class="box-search">
                        <a class="icon_search header-search-icon" href="#"></a>
                        <form role="search" method="get" class="header-search-form" action="#">
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
                            <li><a href="index.html">Home</a></li>
                            <li><a href="shop.html">Shop</a>
                            <li><a href="shop-detail.html">Shop Detail</a></li>
                        </ul>
                    </nav><!-- /.mainnav -->
                </div><!-- /.nav-wrap -->
            </div><!-- /.container-fluid -->
        </header><!-- /header -->
    </div><!-- /.site-header-wrap -->

    <!-- Page title -->
    <div class="page-title parallax parallax1">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="page-title-heading">
                        <h1 class="title">Woolen T-Shirt</h1>
                    </div><!-- /.page-title-heading -->
                    <div class="breadcrumbs">
                        <ul>
                            <li><a href="index.jsp">Home</a></li>
                            <li><a href="register.jsp">register</a>
                            <li><a href="User/CarList.jsp">CarList</a></li>
                            <li><a href="login.jsp">login</a>
                            <li><a href="User/ModifyPass.jsp">ModifyPass</a></li>
                        </ul>
                    </div><!-- /.breadcrumbs -->
                </div><!-- /.col-md-12 -->
            </div><!-- /.row -->
        </div><!-- /.container -->
    </div><!-- /.page-title -->

    <section class="flat-row main-shop shop-detail">
        <div class="container">
            <div class="row">
                <div class="col-md-6">
                    <div class="wrap-flexslider">
                        <div class="inner">
                            <div class="flexslider style-1 has-re   lative" id="imgs-im">
                                <img src="images/shop/sh-detail/detail-01.jpg"/>
                            </div><!-- /.flexslider -->
                        </div>
                    </div>
                </div><!-- /.col-md-6 -->

                <div class="col-md-6">
                    <div class="product-detail">
                        <div class="inner">
                            <div class="content-detail" >
                                <h2 class="product-title" id="content-detail"></h2>
                                <div class="flat-star style-1">
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star-half-o"></i>
                                    <i class="fa fa-star-half-o"></i>
                                    <span>(1)</span>
                                </div>
                                <p id="details"> </p>
                                <div class="price">
                                    <ins><span class="amount" id="price"></span></ins>
                                </div>

                                <ul class="product-infor style-1">
                                    <li><span>100% cotton</span></li>
                                    <li><span>6 months warranty</span></li>
                                    <li><span>High Quality</span></li>
                                </ul>
                                <div class="product-quantity">
                                    <div class="quantity">
                                        <input type="text" value="1" name="quantity-number" class="quantity-number">
                                        <span class="inc quantity-button">+</span>
                                        <span class="dec quantity-button">-</span>
                                    </div>
                                    <div class="add-to-cart" id="addcart">

                                    </div>
                                    <div class="box-like">
                                        <a href="#" class="like"><i class="fa fa-heart-o"></i></a>
                                    </div>
                                </div>
                                <div class="product-tags">
                                    <span>Tags: </span><a href="#">Dress,</a> <a href="#">Fashion,</a> <a href="#">Furniture,</a> <a href="#">Lookbok</a>
                                </div>
                                <ul class="flat-socials">
                                    <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                                    <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                                    <li><a href="#"><i class="fa fa-pinterest"></i></a></li>
                                    <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
                                    <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
                                </ul>
                            </div>
                        </div>
                    </div><!-- /.product-detail -->
                </div>
            </div><!-- /.row -->
        </div><!-- /.container -->
    </section><!-- /.flat-row -->




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
                        <form action="#" method="post" accept-charset="utf-8" id="subscribe-form">
                            <div class="subscribe-content">
                                <div class="input">
                                    <input type="email" name="subscribe-email" placeholder="Your Email">
                                </div>
                                <div class="button">
                                    <button type="button">SUBCRIBE</button>
                                </div>
                            </div>
                        </form>
                        <ul class="flat-social">
                            <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                            <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                            <li><a href="#"><i class="fa fa-google"></i></a></li>
                            <li><a href="#"><i class="fa fa-behance"></i></a></li>
                            <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
                        </ul><!-- /.flat-social -->
                    </div><!-- /.subscribe -->
                </div>
            </div>
        </div>
    </section><!-- /.mail-chimp -->

    <!-- Footer -->
    <footer class="footer">
        <div class="container">
            <div class="row">
                <div class="col-md-3">
                    <div class="widget widget-link">
                        <ul>
                            <li><a href="#">About Us</a></li>
                            <li><a href="#">Online Store</a></li>
                            <li><a href="#">Blog</a></li>
                            <li><a href="#">Contact Us</a></li>
                        </ul>
                    </div><!-- /.widget -->
                </div><!-- /.col-md-3 -->
                <div class="col-md-3">
                    <div class="widget widget-link link-login">
                        <ul>
                            <li><a href="#">Login/ Register</a></li>
                            <li><a href="#">Your Cart</a></li>
                            <li><a href="#">Wishlist items</a></li>
                            <li><a href="#">Your checkout</a></li>
                        </ul>
                    </div><!-- /.widget -->
                </div><!-- /.col-md-3 -->
                <div class="col-md-3">
                    <div class="widget widget-link link-faq">
                        <ul>
                            <li><a href="#">FAQs</a></li>
                            <li><a href="#">Term of service</a></li>
                            <li><a href="#">Privacy Policy</a></li>
                            <li><a href="#">Returns</a></li>
                        </ul>
                        <input type="hidden" value="${param.id}" id="goodid"/>
                    </div><!-- /.widget -->
                </div><!-- /.col-md-3 -->
                <div class="col-md-3">
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

    <div class="footer-bottom">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <p class="copyright text-center">Copyright &copy; 2018.Company name All rights reserved.<a target="_blank" href="http://sc.chinaz.com/moban/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a></p>
                </div>
            </div>
        </div>
    </div>

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
<script src="javascript/private/GoodDetail.js"></script>
<script src="javascript/private/AddCarts.js"></script>
</body>
</html>                               
