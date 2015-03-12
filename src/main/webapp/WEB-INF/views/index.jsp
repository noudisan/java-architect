<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
    <title>北京禾意建筑设计咨询有限公司</title>
    <meta name="keywords" content="建筑设计,景观设计,文化建筑设计,旅游规划设计,商业办公设计,居住建筑设计,住宅设计,方案设计,学校设计,幼儿园设计,中小学设计" />
    <meta name="description" content="多元文化交流的时代，让来自西方文化的入侵，给我们本土文化的保留和传承带来挑战，失去我们传统建筑的灵魂，
    我们希望通过在国内的建筑实践，通过对我们本土文化的挖掘，并且将建筑与城市空间、景观环境、室内空间与现代科技文化结合到一起综合研究和设计，重新找回本该属于我们的建筑灵魂，绽放光辉，得到传承。" />
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Bootstrap -->
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" type="text/css"  rel="stylesheet"/>
    <%--<link href="${pageContext.request.contextPath}/css/font-awesome.min.css" type="text/css"  rel="stylesheet"/>--%>
    <%--<link href="${pageContext.request.contextPath}/css/templatemo_misc.css" type="text/css"  rel="stylesheet"/>--%>
    <link href="${pageContext.request.contextPath}/css/templatemo_style.css" type="text/css"  rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/css/lightbox.css" type="text/css"  rel="stylesheet"/>

    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/templatemo_custom.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/lightbox.js"></script>

</head>
<body>
<input type="hidden" id="image_url" value="${imageHead}">
<input type="hidden" id="ctx_url" value="${pageContext.request.contextPath}">
<div class="site-header">
    <div class="main-navigation">
        <div class="responsive_menu">
            <ul>
                <li><a class="show-1 templatemo_home" href="#">项目</a></li>
                <li><a class="show-2 templatemo_page2" href="#">服务</a></li>
                <li><a class="show-3 templatemo_page3" href="#">理念</a></li>
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
                    <a href="/"><img src="images/templatemo_logo.png" alt="Polygon Template"></a>
                </div>
                <div class="col-md-9 main_menu">
                    <ul>
                        <li><a class="show-1 templatemo_home" href="#"><span ></span>项目<br>Projects</a></li>
                        <li><a class="show-2 templatemo_page2" href="#"><span ></span>服务<br>Services</a></li>
                        <li><a class="show-3 templatemo_page3" href="#"><span ></span>理念<br>Ideas</a></li>
                        <li><a class="show-4 templatemo_page4" href="#"><span ></span>团队<br>Team</a></li>
                        <li><a class="show-5 templatemo_page5" href="#"><span ></span>联络<br>Contact</a></li>
                    </ul>
                </div> <!-- /.col-md-12 -->
            </div> <!-- /.row -->
        </div> <!-- /.container -->
    </div> <!-- /.main-navigation -->
</div> <!-- /.site-header -->

<div id="menu-container">
    <!-- gallery start -->
    <div class="content homepage" id="menu-1" style="text-align: center">

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

    <jsp:include page="content/idea.jsp"></jsp:include>
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
            <div class="col-md-9 col-sm-12">
                <a href="http://www.miitbeian.gov.cn/" target="_blank">京ICP备15009279号</a> |
                Copyright &copy; 2014 - 2015 |
                <a  href="#">北京禾意建筑设计咨询有限公司</a> |
            </div>
            <div class="col-md-3 col-sm-12 templatemo_rfooter" style="display: none">
                <a href="#">
                    <div class="hex_footer"></div>
                </a>
                <a href="#">
                    <div class="hex_footer"></div>
                </a>
                <a href="#">
                    <div class="hex_footer"></div>
                </a>
                <a href="#">
                    <div class="hex_footer"></div>
                </a>
            </div>
        </div>
    </div>
</div>

</body>

</html>