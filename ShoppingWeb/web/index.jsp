<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2018/7/3
  Time: 下午7:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
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
    <div class="rev_slider_wrapper fullwidthbanner-container">
        <div id="rev-slider1" class="rev_slider fullwidthabanner">
            <ul>
                <!-- Slide 1 -->
                <li data-transition="random">
                    <!-- Main Image -->
                    <img src="images/slider/slider-bg-5.jpg" alt="" data-bgposition="center center" data-no-retina>

                    <!-- Layers -->
                    <div class="tp-caption tp-resizeme text-white font-weight-300"
                         data-x="['left','left','left','center']" data-hoffset="['0','0','0','0']"
                         data-y="['middle','middle','middle','middle']" data-voffset="['-93','-93','-93','-93']"
                         data-fontsize="['24','24','24','18']"
                         data-lineheight="['72','72','72','36']"
                         data-width="full"
                         data-height="none"
                         data-whitespace="normal"
                         data-transform_idle="o:1;"
                         data-transform_in="y:[100%];z:0;rX:0deg;rY:0;rZ:0;sX:1;sY:1;skX:0;skY:0;opacity:0;s:2000;e:Power4.easeInOut;"
                         data-transform_out="y:[100%];s:1000;e:Power2.easeInOut;s:1000;e:Power2.easeInOut;"
                         data-mask_in="x:0px;y:[100%];"
                         data-mask_out="x:inherit;y:inherit;"
                         data-start="700"
                         data-splitin="none"
                         data-splitout="none"
                         data-responsive_offset="on">
                        NEW TREND 2018
                    </div>

                    <div class="tp-caption tp-resizeme text-white font-weight-500"
                         data-x="['left','left','left','center']" data-hoffset="['0','0','0','0']"
                         data-y="['middle','middle','middle','middle']" data-voffset="['-42','-42','-42','-42']"
                         data-fontsize="['52','52','52','40']"
                         data-lineheight="['60','60','60','40']"
                         data-width="full"
                         data-height="none"
                         data-whitespace="normal"
                         data-transform_idle="o:1;"
                         data-transform_in="y:[100%];z:0;rX:0deg;rY:0;rZ:0;sX:1;sY:1;skX:0;skY:0;opacity:0;s:2000;e:Power4.easeInOut;"
                         data-transform_out="y:[100%];s:1000;e:Power2.easeInOut;s:1000;e:Power2.easeInOut;"
                         data-mask_in="x:0px;y:[100%];"
                         data-mask_out="x:inherit;y:inherit;"
                         data-start="1000"
                         data-splitin="none"
                         data-splitout="none"
                         data-responsive_offset="on">
                        New Collection
                    </div>

                    <div class="tp-caption tp-resizeme text-white font-weight-400 "
                         data-x="['left','left','left','center']" data-hoffset="['0','0','0','0']"
                         data-y="['middle','middle','middle','middle']" data-voffset="['12','12','12','12']"
                         data-fontsize="['18','18','18','16']"
                         data-lineheight="['72','72','72','38']"
                         data-width="full"
                         data-height="none"
                         data-whitespace="normal"
                         data-transform_idle="o:1;"
                         data-transform_in="y:[100%];z:0;rX:0deg;rY:0;rZ:0;sX:1;sY:1;skX:0;skY:0;opacity:0;s:2000;e:Power4.easeInOut;"
                         data-transform_out="y:[100%];s:1000;e:Power2.easeInOut;s:1000;e:Power2.easeInOut;"
                         data-mask_in="x:0px;y:[100%];"
                         data-mask_out="x:inherit;y:inherit;"
                         data-start="1000"
                         data-splitin="none"
                         data-splitout="none"
                         data-responsive_offset="on">
                        BIG SALE OF THIS WEEK UP TO 30%
                    </div>

                    <div class="tp-caption"
                         data-x="['left','left','left','center']" data-hoffset="['0','0','0','0']"
                         data-y="['middle','middle','middle','middle']" data-voffset="['80','80','80','80']"
                         data-width="full"
                         data-height="none"
                         data-whitespace="normal"
                         data-transform_idle="o:1;"
                         data-transform_in="y:[100%];z:0;rX:0deg;rY:0;rZ:0;sX:1;sY:1;skX:0;skY:0;opacity:0;s:2000;e:Power4.easeInOut;"
                         data-transform_out="y:[100%];s:1000;e:Power2.easeInOut;s:1000;e:Power2.easeInOut;"
                         data-mask_in="x:0px;y:[100%];"
                         data-mask_out="x:inherit;y:inherit;"
                         data-start="1000"
                         data-splitin="none"
                         data-splitout="none"
                         data-responsive_offset="on">
                        <a href="#" class="themesflat-button has-padding-36 bg-accent has-shadow"><span>SHOP NOW</span></a>
                    </div>
                </li>
                <!-- /End Slide 1 -->

                <!-- Slide 2 -->
                <li data-transition="random">
                    <!-- Main Image -->
                    <img src="images/slider/slider-bg-1.jpg" alt="" data-bgposition="center center" data-no-retina>

                    <!-- Layers -->
                    <div class="tp-caption tp-resizeme text-333 font-weight-400 text-right"
                         data-x="['right','right','right','center']" data-hoffset="['33','33','33','0']"
                         data-y="['middle','middle','middle','middle']" data-voffset="['-115','-115','-115','-115']"
                         data-fontsize="['22','22','22','22']"
                         data-lineheight="['60','60','60','60']"
                         data-width="full"
                         data-height="none"
                         data-whitespace="normal"
                         data-transform_idle="o:1;"
                         data-transform_in="y:[100%];z:0;rX:0deg;rY:0;rZ:0;sX:1;sY:1;skX:0;skY:0;opacity:0;s:2000;e:Power4.easeInOut;"
                         data-transform_out="y:[100%];s:1000;e:Power2.easeInOut;s:1000;e:Power2.easeInOut;"
                         data-mask_in="x:0px;y:[100%];"
                         data-mask_out="x:inherit;y:inherit;"
                         data-start="700"
                         data-splitin="none"
                         data-splitout="none"
                         data-responsive_offset="on">
                        <span class="text-line left"></span>Summer Fashion<span class="text-line right"></span>
                    </div>

                    <div class="tp-caption tp-resizeme text-333 font-weight-500 letter-spacing-10 text-right"
                         data-x="['right','right','right','center']" data-hoffset="['13','13','13','0']"
                         data-y="['middle','middle','middle','middle']" data-voffset="['-39','-39','-39','-59']"
                         data-fontsize="['130','130','130','60']"
                         data-lineheight="['130','130','130','60']"
                         data-width="full"
                         data-height="none"
                         data-whitespace="normal"
                         data-transform_idle="o:1;"
                         data-transform_in="y:[100%];z:0;rX:0deg;rY:0;rZ:0;sX:1;sY:1;skX:0;skY:0;opacity:0;s:2000;e:Power4.easeInOut;"
                         data-transform_out="y:[100%];s:1000;e:Power2.easeInOut;s:1000;e:Power2.easeInOut;"
                         data-mask_in="x:0px;y:[100%];"
                         data-mask_out="x:inherit;y:inherit;"
                         data-start="1000"
                         data-splitin="none"
                         data-splitout="none"
                         data-responsive_offset="on">
                        SALE
                    </div>

                    <div class="tp-caption tp-resizeme text-333 font-weight-400 text-right"
                         data-x="['right','right','right','center']" data-hoffset="['13','13','13','0']"
                         data-y="['middle','middle','middle','middle']" data-voffset="['50','50','50','5']"
                         data-fontsize="['48','48','48','28']"
                         data-lineheight="['60','60','60','40']"
                         data-width="full"
                         data-height="none"
                         data-whitespace="normal"
                         data-transform_idle="o:1;"
                         data-transform_in="y:[100%];z:0;rX:0deg;rY:0;rZ:0;sX:1;sY:1;skX:0;skY:0;opacity:0;s:2000;e:Power4.easeInOut;"
                         data-transform_out="y:[100%];s:1000;e:Power2.easeInOut;s:1000;e:Power2.easeInOut;"
                         data-mask_in="x:0px;y:[100%];"
                         data-mask_out="x:inherit;y:inherit;"
                         data-start="1000"
                         data-splitin="none"
                         data-splitout="none"
                         data-responsive_offset="on">
                        UP TO <span class="text-accent">30%</span> OFF
                    </div>

                    <div class="tp-caption text-right"
                         data-x="['right','right','right','center']" data-hoffset="['105','105','105','0']"
                         data-y="['middle','middle','middle','middle']" data-voffset="['138','138','138','80']"
                         data-width="full"
                         data-height="none"
                         data-whitespace="normal"
                         data-transform_idle="o:1;"
                         data-transform_in="y:[100%];z:0;rX:0deg;rY:0;rZ:0;sX:1;sY:1;skX:0;skY:0;opacity:0;s:2000;e:Power4.easeInOut;"
                         data-transform_out="y:[100%];s:1000;e:Power2.easeInOut;s:1000;e:Power2.easeInOut;"
                         data-mask_in="x:0px;y:[100%];"
                         data-mask_out="x:inherit;y:inherit;"
                         data-start="1000"
                         data-splitin="none"
                         data-splitout="none"
                         data-responsive_offset="on">
                        <a href="#" class="themesflat-button bg-accent has-shadow"><span>BY NOW</span></a>
                    </div>
                </li>
                <!-- /End Slide 2 -->
            </ul>
        </div>
    </div>
    <!-- END SLIDER -->

    <!-- IMAGE BOX -->

    <!-- END IMAGE BOX -->

    <!-- PRODUCT NEW -->

    <!-- END PRODUCT NEW -->

    <!-- ANIMATION BOX -->
    <section class="flat-row row-animation-box bg-section row-1">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="flat-animation-block">
                        <div class="title-section width-before-17 bg-before-white margin-bottom-14">
                            <div class="sup-title"><span>NEW TREND 2018</span></div>
                            <h2 class="title font-size-52 line-height-76">Women‘s Collection</h2>
                            <div class="sub-title"><span>Big Sale of this Week</span></div>
                        </div>
                        <div class="elm-btn text-center">
                            <a href="#" class="themesflat-button bg-accent has-padding-36">Shop Now</a>
                        </div>
                    </div><!-- /.flat-animation-block -->
                </div>
            </div><!-- /.row -->
        </div><!-- /.container -->
    </section>
    <!-- END ANIMATION BOX -->

    <!-- PRODUCT -->
    <section class="flat-row row-product-project style-1">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="title-section margin-bottom-41">
                        <h2 class="title">Best Sale</h2>
                    </div>
                    <ul class="flat-filter style-1 text-center max-width-682 clearfix">
                        <li class="active"><a href="#" data-filter="*">All Product</a></li>
                        <li><a href="#" data-filter=".kid">For Kid’s</a></li>
                        <li><a href="#" data-filter=".man">For Man’s</a></li>
                        <li><a href="#" data-filter=".woman">For Woman’s</a></li>
                        <li><a href="#" data-filter=".accessories">Accessories</a></li>
                    </ul>
                    <div class="divider h54"></div>
                    <div class="product-content product-fourcolumn clearfix">
                        <ul class="product style2 isotope-product clearfix" id="goodscontent">
                        </ul>
                        <div class="product-content-page" style="text-align: center">
                        <ul class="flat-color-list width-14">
                            <li>
                                <a href="javascript:;" onclick="startPage()" class="blue"></a>
                            </li>
                            <li>
                                <a href="javascript:;" class="red" onclick="lastPage()"></a>
                            </li>
                            <span id="currentpage">1</span>
                            /<span id="totalpage">0</span>

                            <li>
                                <a href="javascript:;" class="black" onclick="nextPage()"></a>
                            </li>
                            <li>
                                <a href="javascript:;" onclick="endPage()" class="blue"></a>
                            </li>
                        </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- END PRODUCT -->

    <!-- ICON BOX -->
    <section class="flat-row row-icon-box bg-section bg-color-f5f">
        <div class="container">
            <div class="row">
                <div class="col-md-3">
                    <div class="flat-icon-box icon-top style-1 clearfix text-center">
                        <div class="inner no-margin">
                            <div class="icon-wrap">
                                <i class="fa fa-truck"></i>
                            </div>
                            <div class="text-wrap">
                                <h5 class="heading"><a href="#">Free Shipping</a></h5>
                                <p class="desc">Free Shipping on order over $99</p>
                            </div>
                        </div>
                    </div>
                </div><!-- /.col-md-3 -->
                <div class="col-md-3">
                    <div class="flat-icon-box icon-top style-1 clearfix text-center">
                        <div class="inner">
                            <div class="icon-wrap">
                                <i class="fa fa-money"></i>
                            </div>
                            <div class="text-wrap">
                                <h5 class="heading"><a href="#">Cash On Delivery</a></h5>
                                <p class="desc">The Internet Trend To Repeat</p>
                            </div>
                        </div>
                    </div>
                </div><!-- /.col-md-3 -->
                <div class="col-md-3">
                    <div class="flat-icon-box icon-top style-1 clearfix text-center">
                        <div class="inner">
                            <div class="icon-wrap">
                                <i class="fa fa-gift"></i>
                            </div>
                            <div class="text-wrap">
                                <h5 class="heading"><a href="#">Gift For All</a></h5>
                                <p class="desc">Receive Gift When Subscribe</p>
                            </div>
                        </div>
                    </div>
                </div><!-- /.col-md-3 -->
                <div class="col-md-3">
                    <div class="flat-icon-box icon-top style-1 clearfix text-center">
                        <div class="inner">
                            <div class="icon-wrap">
                                <i class="fa fa-clock-o"></i>
                            </div>
                            <div class="text-wrap">
                                <h5 class="heading"><a href="#">Opening All Week</a></h5>
                                <p class="desc">6.00 am - 17.00pm</p>
                            </div>
                        </div>
                    </div>
                </div><!-- /.col-md-3 -->
            </div>
        </div>
    </section>
    <!-- END ICON BOX -->

    <!-- NEW LATEST -->

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

    <div class="footer-bottom">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <p class="copyright text-center">Copyright &copy; 2018.Company name All rights reserved.<a
                            target="_blank" href="http://sc.chinaz.com/moban/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a></p>
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
<script src="javascript/private/Goods.js"></script>
<script src="javascript/private/AddCarts.js"></script>
</body>
</html>
