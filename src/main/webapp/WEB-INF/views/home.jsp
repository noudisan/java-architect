<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
    <meta name="baidu-site-verification" content="jFEuDQubfV" />
    <title>禾意建筑设计</title>
    <meta name="keywords" content="北京禾意建筑设计咨询有限公司，建筑设计,景观设计,文化建筑设计,旅游规划设计,商业办公设计,居住建筑设计,住宅设计,方案设计,学校设计,幼儿园设计,中小学设计" />
    <meta name="description" content="多元文化交流的时代，让来自西方文化的入侵，给我们本土文化的保留和传承带来挑战，失去我们传统建筑的灵魂，
    我们希望通过在国内的建筑实践，通过对我们本土文化的挖掘，并且将建筑与城市空间、景观环境、室内空间与现代科技文化结合到一起综合研究和设计，重新找回本该属于我们的建筑灵魂，绽放光辉，得到传承。" />
    <meta charset="UTF-8">
    <meta name="viewport"content="width=980, initial-scale=1.0"/>
    <meta name="format-detection"content="telephone=no">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/ftpm/style.css?v=1" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/common/jquery/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/common/jquery.bxSlider.js"></script>

    <script type="text/javascript" src="${pageContext.request.contextPath}/js/ftpm/home.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/common/less.js"></script>

    <script>
        var _hmt = _hmt || [];
        (function() {
            var hm = document.createElement("script");
            hm.src = "//hm.baidu.com/hm.js?${baiduCode}";
            var s = document.getElementsByTagName("script")[0];
            s.parentNode.insertBefore(hm, s);
        })();
    </script>

</head>
<body>

<div id="top-footer">
    <div id="top-footer-inner" class="container clearfix">
        <a class="top-footer-up"></a>
    </div>
</div>


<input type="hidden" id="ctx_url" value="${pageContext.request.contextPath}">
<div id="header">
    <div class="logotype">
        <a href="index.html">
            <img src="${pageContext.request.contextPath}/images/templatemo_logo.png" alt="" />
        </a>
    </div>
    <ul>
        <li class="selected"><a href="/home">首页</a> -</li>
        <li><a href="/project">项目</a> -</li>
        <li><a href="/idea">服务支持</a> -</li>
        <li><a href="/company">公司简介</a> -</li>
        <li class="last"><a href="/contact">联系方式</a></li>
    </ul>
</div><!-- #header end -->

<div id="head-text" class="container">
    <h1><strong>工业风</strong>催生下的中国地产形态即将过去,在<strong>互联网</strong>浪潮滋润下的中国建筑将会是怎样？</h1>
    <h2>我们一直坚信，需求是设计进化和演变的基础条件，情感是建筑存在的发展因素</h2>
</div>

<div id="home-slider-container" class="container">
    <div id="home-slider">
      <%--  <div>
            <img src="${pageContext.request.contextPath}/images/ftpm/slides/slide1.jpg" alt="" />
            <h2><a href="#">Lorem ipsum dolor sit hamed</a></h2>
        </div>
        <div>
            <img src="${pageContext.request.contextPath}/images/ftpm/slides/slide2.jpg" alt="" />
            <h2>Sed ut perspiciatis unde omnis iste natus</h2>
        </div>
        <div>
            <img src="${pageContext.request.contextPath}/images/ftpm/slides/slide3.jpg" alt="" />
            <h2>But I must explain to you how all</h2>
        </div>--%>
    </div>
</div><!-- #home-slider -->

<ul id="services" class="container clearfix">
    <li>
        <a href="${pageContext.request.contextPath}/project?projectType=sybg" style="background: url(${pageContext.request.contextPath}/images/ftpm/services/01swbg.png)">
            商业办公
        </a>
        <span>商业办公</span>
    </li>
    <li>
        <a href="${pageContext.request.contextPath}/project?projectType=jzgh" style="background: url(${pageContext.request.contextPath}/images/ftpm/services/02jzgh.png)">

        </a>
        <span>居住规划</span>
    </li>
    <li>
        <a href="${pageContext.request.contextPath}/project?projectType=jgsj" style="background: url(${pageContext.request.contextPath}/images/ftpm/services/03jgsj.png)">
            景观设计
        </a>
        <span>景观设计</span>
    </li>
    <li>
        <a href="${pageContext.request.contextPath}/project?projectType=whjy" style="background: url(${pageContext.request.contextPath}/images/ftpm/services/04whjy.png)">
            文化教育
        </a>
        <span>文化教育</span>
    </li>
    <li>
        <a href="${pageContext.request.contextPath}/project?projectType=zydc" style="background: url(${pageContext.request.contextPath}/images/ftpm/services/05zydc.png)">
            资源地产
        </a>
        <span>资源地产</span>
    </li>
</ul><!-- #services end -->

<!--
<div id="footer" class="foot_width" style="line-height:19px;">
    <div id="footer-inner" class="container clearfix">
        <div class="clear"></div>
        <div id="footer-heading">
            <h1>关于我们</h1><a name="contact_us"></a>
            <h2>请联系我们获得更多信息</h2>
        </div>

        <div id="recent-works" style="height: 190px;">
            <div style="float: left;width: 412px;color:white;margin-right: 100px;padding-left: 50px;" >
                北京禾意建筑设计咨询有限公司在北京成立，是一个以建筑、规划、景观的研究和设计为内容的工作室。禾意与同类事务所相比，
                我们具备全面的设计能力，不仅有建筑专业， 同时具备结构、电气、给排水、暖通专业设计能力，能更好的服务于项目。<br>
                目前，禾意已参与北京、山东、河北、河南、四川、江苏等多个城市的建设，为中国城市建设贡献微薄之力。
            </div>
            <div style="float: right;width:400px;color:white;">
                <form class="form" action="/contact/save" method="post">
                    <div >
                        <label>姓名/公司 (<span>*</span>)</label>
                        <input id="contact-name" name="fullName"  type="text" style="border:1px solid white;color: white;width: 260px;" />
                    </div>
                    <div >
                        <label>邮箱/电话 (<span>*</span>)</label>
                        <input id="contact-email" name="phoneOrEmail" type="text"  style="border:1px solid white;color: white;width: 260px;"/>
                    </div>
                    <div >
                        <label>联系&nbsp;内容 (<span>*</span>)</label>
                        <textarea id="contact-message" name="message" style="border:1px solid white;width: 260px;height: 60px;color: white"></textarea>
                    </div>
                    <div >
                        <input class="submit" type="submit" value="发送" style="width:50px;height:24px;background:#5bc0de;" />
                    </div>
                    <div class="clear"></div>
                </form>
            </div>
        </div>

        <div id="our-clients" class="clearfix" style="padding-left: 50px;color:white;">
            <div style="margin-top: 40px;">
                地址：北京市海淀区车公庄西路甲19号华通大厦A座626室<br>
                电话：(86 10)&nbsp;53312615&nbsp;&nbsp;18611516653&nbsp;<br>
                传真：(86 10) 53312615<br>
                邮编：100048<br>
                邮箱：heyi_studio@163.com<br>
                &nbsp;QQ：2514163590&nbsp;<br>
            </div>
        </div>

        <div id="footer-text">
            <div class="footer-copyright">
                <p class="top">
                    <a href="http://www.miitbeian.gov.cn/" target="_blank">京ICP备15009279号</a>| Copyright © 2014 - 2015 | 北京禾意建筑设计咨询有限公司 |
                </p>
            </div>
        </div>

    </div>
</div>
-->

<div id="footer">
    <div id="footer-inner" class="clearfix container">
        <div class="clear"></div>

        <div id="footer-text">
            <div class="footer-copyright">
                <p class="top">
                    <a href="http://www.miitbeian.gov.cn/" target="_blank">京ICP备15009279号</a>| Copyright © 2014 - 2015 | 北京禾意建筑设计咨询有限公司 |
                </p>
            </div>
        </div><!-- #footer-text -->
    </div><!-- #footer-inner end -->
</div><!-- #footer end -->

</body>

