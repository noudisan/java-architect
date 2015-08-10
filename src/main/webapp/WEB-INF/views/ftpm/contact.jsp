<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
  <title>禾意建筑设计</title>
  <meta name="keywords" content="北京禾意建筑设计咨询有限公司,建筑设计,景观设计,文化建筑设计,旅游规划设计,商业办公设计,居住建筑设计,住宅设计,方案设计,学校设计,幼儿园设计,中小学设计" />
  <meta name="description" content="多元文化交流的时代，让来自西方文化的入侵，给我们本土文化的保留和传承带来挑战，失去我们传统建筑的灵魂，
    我们希望通过在国内的建筑实践，通过对我们本土文化的挖掘，并且将建筑与城市空间、景观环境、室内空间与现代科技文化结合到一起综合研究和设计，重新找回本该属于我们的建筑灵魂，绽放光辉，得到传承。" />
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">

  <!-- Style -->
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/ftpm/style.css" />
  <!-- javascript -->
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/common/jquery/jquery.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/common/jquery.easing.js"></script>
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
<input type="hidden" id="ctx_url" value="${pageContext.request.contextPath}">
<!-- Dead simple image preloading without javascript ;-) -->
<div id="preload">
  <img src="${pageContext.request.contextPath}/images/ftpm/service_hover.png" alt="" />
</div>

<div id="header">
  <div class="logotype">
    <a href="index.html">
      <img src="${pageContext.request.contextPath}/images/templatemo_logo.png" alt="" />
    </a>
  </div>
  <ul>
    <li><a href="/home">首页</a> -</li>
    <li><a href="/project">项目</a> -</li>
    <li><a href="/idea">服务理念</a> -</li>
    <li><a href="/company">公司简介</a> -</li>
    <li class="selected"><a href="/contact">联系方式</a></li>
  </ul>
</div><!-- #header end -->

<div id="head-text" class="container">
  <h1><strong>工业风</strong>催生下的中国地产形态即将过去,在<strong>互联网</strong>浪潮滋润下的中国建筑将会是怎样？</h1>
  <h2>我们一直坚信，需求是设计进化和演变的基础条件，情感是建筑存在的发展因素</h2>
</div>
<div class="dark-dots"></div>


<div id="content" class="container">
  <div class="blog-content">

    <div class="blog-post blog-post-inner single-page">

      <h2 class="title">关于我们</h2>
      <p style="  font-size: 12px;line-height: 18px;">
        北京禾意建筑设计咨询有限公司在北京成立，是一个以建筑、规划、景观的研究和设计为内容的工作室。禾意与同类事务所相比，
        我们具备全面的设计能力，不仅有建筑专业， 同时具备结构、电气、给排水、暖通专业设计能力，能更好的服务于项目。<br>
        目前，禾意已参与北京、山东、河北、河南、四川、江苏等多个城市的建设，为中国城市建设贡献微薄之力。
      </p>

      <div class="contact-form">
        <form class="form" action="/contact/save" method="post">
          <label>姓名/公司 (<span>*</span>)</label>
          <input id="contact-name" name="fullName" class="text" type="text" value="" />

          <label>邮箱/电话 (<span>*</span>)</label>
          <input id="contact-email" name="phoneOrEmail" class="text" type="text" value="" />

          <label>联系内容 (<span>*</span>)</label>
          <textarea id="contact-message" name="message" rows="4" cols="3"></textarea>

          <input class="submit" type="submit" value="提交" />
          <div class="clear"></div>
        </form>
      </div><!-- .contact-form end -->

      <h2 class="title"></h2>

     <%-- <div class="gmap">
        <!-- Google Maps Element Code -->
        <img src="images/map/map.png" alt="contact map">
      </div>--%>

      <div class="clear"></div>
    </div><!-- .blog-post -->

  </div><!-- .blog-content end -->


  <div class="sidebar">
    <div class="widget">
      <h2>联系方式</h2>
      <p></p>
      <p>
        <b>地址</b>:北京市丰台区六里桥甲一号奈伦大厦15层<br />
        <b>手机</b>:18611516653<br />
        <b>电话</b>:(86 10) 53312615<br />
        <b>传真</b>:(86 10) 53312615<br />
        <b>邮编</b>:100048<br />
        <b>邮箱</b>:heyi_studio@163.com<br />
        <b>QQ</b>:2514163590<br />
      </p>
      <img src="${pageContext.request.contextPath}/images/ftpm/contact/us.png" width="420px" alt="" />
    </div>

  </div><!-- .sidebar end -->

  <div class="clear"></div>
</div><!-- #content end -->


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
