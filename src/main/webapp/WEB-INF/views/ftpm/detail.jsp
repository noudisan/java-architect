<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
  <title>禾意建筑设计</title>
  <meta name="keywords" content="北京禾意建筑设计咨询有限公司,建筑设计,景观设计,文化建筑设计,旅游规划设计,商业办公设计,居住建筑设计,住宅设计,方案设计,学校设计,幼儿园设计,中小学设计" />
  <meta name="description" content="多元文化交流的时代，让来自西方文化的入侵，给我们本土文化的保留和传承带来挑战，失去我们传统建筑的灵魂，
    我们希望通过在国内的建筑实践，通过对我们本土文化的挖掘，并且将建筑与城市空间、景观环境、室内空间与现代科技文化结合到一起综合研究和设计，重新找回本该属于我们的建筑灵魂，绽放光辉，得到传承。" />
  <meta charset="UTF-8">
  <%--<meta name="viewport" content="width=device-width, initial-scale=1.0">--%>
  <meta name="viewport"content="width=980, initial-scale=0.9"/>
  <!-- Style -->
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/ftpm/style.css" />
  <!-- javascript -->
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/common/jquery/jquery.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/common/jquery.bxSlider.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/common/less.js"></script>

  <script type="text/javascript" src="${pageContext.request.contextPath}/js/ftpm/detail.js"></script>
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
    <li ><a href="/home">首页</a> -</li>
    <li ><a href="/project">项目</a> -</li>
    <li class="selected" ><a href="/idea">服务理念</a> -</li>
    <li class="last"><a href="/home#contact_us">联系方式</a></li>
  </ul>
</div><!-- #header end -->
<input type="hidden" id="detail_id" value="${id}" >
<input type="hidden" id="image_url" value="${imageHead}">

<div class="container" >
    <div style="float: left;width: 400px;overflow: hidden;margin: 0 34px 26px 0;">
      <div  id="detail-slider" style="margin:0 auto 50px auto;position:relative;"></div>
    </div>
    <div style="float: left;padding: 9px 0 0 0;width: 360px;line-height:19px;">
      <h2 id="detail_title" style="font-size: 200%;font-weight:bold;margin-bottom: 30px;"></h2>
      <span></span>
      <p id="detail_desc1" ></p>
      <p id="detail_desc2" ></p>
      <p id="detail_desc3" ></p>
    </div>
    <div class="clear"></div>

</div>

<div style="margin-bottom: 250px;"></div>

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
