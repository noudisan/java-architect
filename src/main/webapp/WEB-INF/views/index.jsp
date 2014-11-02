<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
    <title>建筑学</title>
    <meta name="keywords" content="" />
    <meta name="description" content="" />
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Bootstrap -->
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" type="text/css"  rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/css/font-awesome.min.css" type="text/css"  rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/css/templatemo_misc.css" type="text/css"  rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/css/templatemo_style.css" type="text/css"  rel="stylesheet"/>

    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.lightbox.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/templatemo_custom.js"></script>

</head>
<body>
<input type="hidden" id="imageHead" value="${imageHead}">
<div class="site-header">
    <div class="main-navigation">
        <div class="responsive_menu">
            <ul>
                <li><a class="show-1 templatemo_home" href="#">项目</a></li>
                <li><a class="show-2 templatemo_page2" href="#">服务</a></li>
                <li><a class="show-3 templatemo_page3" href="#">信念</a></li>
                <li><a class="show-4 templatemo_page4" href="#">团队</a></li>
                <li><a class="show-5 templatemo_page5" href="#">联络</a></li>
            </ul>
        </div>
        <div class="container">
            <div class="row templatemo_gallerygap">
                <div class="col-md-12 responsive-menu">
                    <a href="#" class="menu-toggle-btn"><i class="fa fa-bars"></i></a>
                </div> <!-- /.col-md-12 -->
                <div class="col-md-3 col-sm-12">
                    <a href="#"><img src="images/templatemo_logo.jpg" alt="Polygon Template"></a>
                </div>
                <div class="col-md-9 main_menu">
                    <ul>
                        <li><a class="show-1 templatemo_home" href="#"><span class="fa fa-camera"></span>项目</a></li>
                        <li><a class="show-2 templatemo_page2" href="#"><span class="fa fa-users"></span>服务</a></li>
                        <li><a class="show-3 templatemo_page3" href="#"><span class="fa fa-cogs"></span>信念</a></li>
                        <li><a class="show-4 templatemo_page4" href="#"><span class="fa fa-cogs"></span>团队</a></li>
                        <li><a class="show-5 templatemo_page5" href="#"><span class="fa fa-envelope"></span>联络</a></li>
                    </ul>
                </div> <!-- /.col-md-12 -->
            </div> <!-- /.row -->
        </div> <!-- /.container -->
    </div> <!-- /.main-navigation -->
</div> <!-- /.site-header -->

<div id="menu-container">
    <!-- gallery start -->
    <div class="content homepage" id="menu-1">

        <div class="container"  id="loadMoreDiv" >
            <div class="row">
                <div class="templatemo_loadmore">
                    <button class="gallery_more" id="button" onClick="loadImages()">加载更多</button>
                </div>
            </div>
        </div>
    </div>
    <!-- gallery end -->

    <jsp:include page="content/service.jsp"></jsp:include>
    <div class="clear"></div>

    <jsp:include page="content/belief.jsp"></jsp:include>
    <%--<div class="clear"></div>--%>

    <jsp:include page="content/team.jsp"></jsp:include>
    <%--<div class="clear"></div>--%>

    <jsp:include page="content/contact.jsp"></jsp:include>
    <%--<div class="clear"></div>--%>
</div>

<!-- footer start -->
<div class="templatemo_footer">
    <div class="container">
        <div class="row">
            <div class="col-md-9 col-sm-12">Copyright &copy; 2084 Company Name |
                <a href="http://www.cssmoban.com/">HTML5 Template</a> Collect from
                <a  href="http://www.cssmoban.com/">网站模板</a> |
                <a rel="nofollow" href="#">Photos</a> by Unsplash</div>
            <div class="col-md-3 col-sm-12 templatemo_rfooter">
                <a href="#">
                    <div class="hex_footer"><span class="fa fa-facebook"></span></div>
                </a>
                <a href="#">
                    <div class="hex_footer"><span class="fa fa-twitter"></span></div>
                </a>
                <a href="#">
                    <div class="hex_footer"><span class="fa fa-linkedin"></span></div>
                </a>
                <a href="#">
                    <div class="hex_footer"><span class="fa fa-rss"></span></div>
                </a>
            </div>
        </div>
    </div>
</div>

</body>

</html>