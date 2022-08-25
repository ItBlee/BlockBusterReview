<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 8/25/2022
  Time: 5:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- BEGIN | Header -->
<header class="ht-header full-width-hd">
    <div class="row">
        <nav id="mainNav" class="navbar navbar-default navbar-custom">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header logo">
                <div class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <div id="nav-icon1">
                        <span></span>
                        <span></span>
                        <span></span>
                    </div>
                </div>
                <a href="<c:url value='/home'/>"><img class="logo" src="<c:url value='/template/web/images/logo1.png' />" alt="" width="119" height="58"></a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse flex-parent" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav flex-child-menu menu-left">
                    <li class="hidden">
                        <a href="#page-top"></a>
                    </li>
                    <li class="dropdown first">
                        <a class="btn btn-default dropdown-toggle lv1" data-toggle="dropdown" data-hover="dropdown">
                            Home <i class="fa fa-angle-down" aria-hidden="true"></i>
                        </a>
                        <ul class="dropdown-menu level1">
                            <li><a href="#">Home 01</a></li>
                            <li><a href="#">Home 02</a></li>
                            <li><a href="#">Home 03</a></li>
                        </ul>
                    </li>
                    <li class="dropdown first">
                        <a class="btn btn-default dropdown-toggle lv1" data-toggle="dropdown" data-hover="dropdown">
                            movies<i class="fa fa-angle-down" aria-hidden="true"></i>
                        </a>
                        <ul class="dropdown-menu level1">
                            <!-- <li class="dropdown">
                                <a href="#">about us <i class="fa fa-caret-right" aria-hidden="true"></i></a>
                                <ul class="dropdown-menu level2">
                                    <li><a href="aboutv1.html">About Us 01</a></li>
                                    <li><a href="aboutv2.html">About Us 02</a></li>
                                </ul>
                            </li> -->
                            <li><a href="<c:url value='/views/web/moviegrid.html' />">Movie grid</a></li>
                            <li><a href="<c:url value='/views/web/movielist.html' />">Movie list</a></li>
                            <li class="it-last"><a href="<c:url value='/views/web/moviesingle.html' />">Movie single</a></li>
                        </ul>
                    </li>
                    <li class="dropdown first">
                        <a class="btn btn-default dropdown-toggle lv1" data-toggle="dropdown" data-hover="dropdown">
                            celebrities <i class="fa fa-angle-down" aria-hidden="true"></i>
                        </a>
                        <ul class="dropdown-menu level1">
                            <li><a href="<c:url value='/views/web/celebritygrid01.html' />">celebrity grid 01</a></li>
                            <li><a href="<c:url value='/views/web/celebritylist.html'>">celebrity list</a></li>
                            <li class="it-last"><a href="<c:url value='/views/web/celebritysingle.html'>">celebrity single</a></li>
                        </ul>
                    </li>
                    <li class="dropdown first">
                        <a class="btn btn-default dropdown-toggle lv1" data-toggle="dropdown" data-hover="dropdown">
                            news <i class="fa fa-angle-down" aria-hidden="true"></i>
                        </a>
                        <ul class="dropdown-menu level1">
                            <li><a href="<c:url value='/views/web/bloglist.html' />">blog List</a></li>
                            <li><a href="<c:url value='/views/web/bloggrid.html' />">blog Grid</a></li>
                            <li class="it-last"><a href="<c:url value='/views/web/blogdetail.html' />">blog Detail</a></li>
                        </ul>
                    </li>
                    <li class="dropdown first">
                        <a class="btn btn-default dropdown-toggle lv1" data-toggle="dropdown" data-hover="dropdown">
                            community <i class="fa fa-angle-down" aria-hidden="true"></i>
                        </a>
                        <ul class="dropdown-menu level1">
                            <li><a href="<c:url value='/views/web/userfavoritegrid.html' />">user favorite grid</a></li>
                            <li><a href="<c:url value='/views/web/userfavoritelist.html' />">user favorite list</a></li>
                            <li><a href="<c:url value='/views/web/userprofile.html' />">user profile</a></li>
                            <li class="it-last"><a href="<c:url value='/views/web/userrate.html' />">user rate</a></li>
                        </ul>
                    </li>
                </ul>
                <ul class="nav navbar-nav flex-child-menu menu-right">
                    <li class="dropdown first">
                        <a class="btn btn-default dropdown-toggle lv1" data-toggle="dropdown" data-hover="dropdown">
                            pages <i class="fa fa-angle-down" aria-hidden="true"></i>
                        </a>
                        <ul class="dropdown-menu level1">
                            <li><a href="<c:url value='/views/web/landing.html' />">Landing</a></li>
                            <li><a href="<c:url value='/views/web/404.html' />">404 Page</a></li>
                            <li class="it-last"><a href="<c:url value='/views/web/comingsoon.html' />">Coming soon</a></li>
                        </ul>
                    </li>
                    <li><a href="#">Help</a></li>
                    <li class="loginLink"><a href="#">LOG In</a></li>
                    <li class="btn signupLink"><a href="#">sign up</a></li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </nav>
        <!-- search form -->
    </div>

</header>
<!-- END | Header -->