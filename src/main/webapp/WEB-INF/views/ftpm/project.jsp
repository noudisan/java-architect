<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
  <title>北京禾意建筑设计咨询有限公司</title>
  <meta name="keywords" content="建筑设计,景观设计,文化建筑设计,旅游规划设计,商业办公设计,居住建筑设计,住宅设计,方案设计,学校设计,幼儿园设计,中小学设计" />
  <meta name="description" content="多元文化交流的时代，让来自西方文化的入侵，给我们本土文化的保留和传承带来挑战，失去我们传统建筑的灵魂，
    我们希望通过在国内的建筑实践，通过对我们本土文化的挖掘，并且将建筑与城市空间、景观环境、室内空间与现代科技文化结合到一起综合研究和设计，重新找回本该属于我们的建筑灵魂，绽放光辉，得到传承。" />
  <meta charset="UTF-8">
  <!-- Style -->
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/ftpm/reset.css" />
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/ftpm/style.css" />
  <!-- javascript -->
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/ftpm/jquery.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/ftpm/jquery.easing.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/ftpm/jquery.bxSlider.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/ftpm/jquery.slides.js"></script>

  <script type="text/javascript" src="${pageContext.request.contextPath}/js/ftpm/jquery.blackAndWhite.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/ftpm/jquery.isotope.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/ftpm/project.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/ftpm/less.js"></script>

</head>
<body>
<input type="hidden" id="image_url" value="${imageHead}">


<div id="header">
  <div class="logotype">
    <a href="index.html">
      <img src="${pageContext.request.contextPath}/images/templatemo_logo.png" alt="" />
    </a>
  </div>
  <ul>
    <li class="selected"><a href="/home">首页</a> -</li>
    <li><a href="/project">项目</a> -</li>
    <li><a href="/idea">服务理念</a> -</li>
    <li class="last"><a href="/contact">联系方式</a></li>
  </ul>
</div><!-- #header end -->

<div id="head-text" class="container">
  <h1><strong>工业风</strong>催生下的中国地产形态即将过去,在<strong>互联网</strong>浪潮滋润下的中国建筑将会是怎样？</h1>
  <h2>我们一直坚信，需求是设计进化和演变的基础条件，情感是建筑存在的发展因素</h2>
</div>
<div class="dark-dots"></div>


<div id="slider-container">
  <div id="portfolio-items-slider">
    <%--<div class="item-1 portfolio-item">
      <div class="portfolio-slider-containter">
        <div class="portfolio-slides">
          <img src="${pageContext.request.contextPath}/images/ftpm/portfolio_slides/portfoliobig1.jpg" />
          <img src="${pageContext.request.contextPath}/images/ftpm/portfolio_slides/portfoliobig2.jpg" />
          <img src="${pageContext.request.contextPath}/images/ftpm/portfolio_slides/portfoliobig3.jpg" />
          <img src="${pageContext.request.contextPath}/images/ftpm/portfolio_slides/portfoliobig4.jpg" />
        </div>
      </div>

      <div class="portfolio-item-right">
        <div class="portfolio-controls">
          <a class="left-arrow"></a>
          <a class="right-arrow"></a>
          <a class="button-close"></a>
          <div class="clear"></div>
        </div>
        <h2>Project Cove v1</h2>
        <span>All works / Print works</span>
        <p>
        text1
        </p>
        <p>
          text2
        </p>
        <p>
       tex3
        </p>
        <a href="#" class="portfolio-link">Launch project</a>
      </div>

      <div class="clear"></div>
    </div>--%>
  </div>

</div>
<!-- #slider end -->

<div id="portfolio-inner" class="container">
  <h1 class="title"><span>项目介绍</span></h1>
  <ul id="filters">
    <li class="selected">
      <a data-filter="*">所有项目</a> /
    </li>
    <li>
      <a data-filter=".sybg">商业办公</a> /
    </li>
    <li>
      <a data-filter=".jzgh">居住规划</a> /
    </li>
    <li>
      <a data-filter=".jgsj">景观设计</a> /
    </li>
    <li>
      <a data-filter=".whjy">文化教育</a> /
    </li>
    <li class="last">
      <a data-filter=".zydc">资源地产</a>
    </li>
  </ul>
  <div class="clear"></div>

  <ul id="portfolio-items" class="clearfix">
   <%-- <li class="web-design">
      <a class="item-1">
        <img src="${pageContext.request.contextPath}/images/ftpm/portfolio_thumbs/work1.jpg" width="230" height="150" alt="" />
        <span class="title">Lorem ipsum dolor sit hamet</span>
        <span class="cat">print works / logotype</span>
      </a>
    </li>--%>

  </ul><!-- #portfolio-items end -->
</div><!-- #portfolio-inner end -->


<div id="footer">
  <div id="footer-inner" class="clearfix container">
    <div class="clear"></div>

    <div id="footer-text">
      <div class="footer-copyright">
        <p class="top">
          &copy; <a href="http://www.miitbeian.gov.cn/" target="_blank">京ICP备15009279号</a>  &copy; | Copyright © 2014 - 2015 | 北京禾意建筑设计咨询有限公司 |
        </p>
        <p class="bottom">
          北京禾意建筑设计咨询有限公司
        </p>
      </div>
    </div><!-- #footer-text -->
  </div><!-- #footer-inner end -->
</div><!-- #footer end -->

</body>
