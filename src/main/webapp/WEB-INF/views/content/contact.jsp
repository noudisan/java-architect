<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!-- contact start -->
<div class="content contact" id="menu-5"  style="margin-top: 5%">
    <div class="container">
        <div class="row">
            <div class="col-md-4 col-sm-12">
                <div class="templatemo_contactmap">
                    <<div id="templatemo_map"></div>
                    <img src="images/templatemo_contactiframe.png" alt="contact map">
                </div>
            </div>
            <div class="col-md-4 col-sm-12 leftalign">
                <div class="templatemo_contacttitle">联系方式</div>
                <div class="clear"></div>
                <div class="templatemo_address">
                    <ul>
                        <li class="left fa fa-map-marker"></li>
                        <li class="right">北京市海淀区羊坊店东路北蜂窝103号院7号楼402 室</li>
                        <li class="clear"></li>
                        <li class="left fa fa-user"></li>
                        <li class="right">设计部：胡海明</li>
                        <li class="clear"></li>
                        <li class="left fa fa-phone"></li>
                        <li class="right">18611516653</li>
                        <li class="clear"></li>
                        <li class="left fa fa-envelope"></li>
                        <li class="right">hhmyx@163.com</li>
                        <li class="clear"></li>
                        <li class="left fa fa-user"></li>
                        <li class="right">业务部：董伟</li>
                        <li class="clear"></li>
                        <li class="left fa fa-phone"></li>
                        <li class="right">18311224468</li>
                        <li class="clear"></li>
                        <li class="left fa fa-envelope"></li>
                        <li class="right">age23@163.com</li>
                        <li class="clear"></li>
                        <li class="left fa fa-user"></li>
                        <li class="right">人事部：周珊珊</li>
                        <li class="clear"></li>
                        <li class="left fa fa-phone"></li>
                        <li class="right">18611146653</li>
                        <li class="clear"></li>
                        <li class="left fa fa-envelope"></li>
                        <li class="right">zero_1216@126.com</li>
                        <li class="clear"></li>
                    </ul>
                </div>
            </div>
            <div class="col-md-4 col-sm-12">
                <form id="contact_form" role="form" action="/contact/save" target="_blank" method="post">
                    <div class="templatemo_form">
                        <input name="fullName" type="text" class="form-control" id="fullname" placeholder="姓名" maxlength="40">
                    </div>
                    <div class="templatemo_form">
                        <input name="phoneOrEmail" type="text" class="form-control" id="email" placeholder="手机号或邮箱" maxlength="40">
                    </div>
                    <div class="templatemo_form">
                        <input name="subject" type="text" class="form-control" id="subject" placeholder="主题" maxlength="40">
                    </div>
                    <div class="templatemo_form">
                        <textarea name="message" rows="10" class="form-control" id="message" placeholder="内容"></textarea>
                    </div>
                    <div class="templatemo_form"><button type="button" class="btn btn-primary" onclick="sendMessage()">发送信息</button></div>
                </form>
            </div>
        </div>

    </div>
</div>
