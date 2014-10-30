"use strict";

jQuery(document).ready(function($){
    loadImages();

	/************** Menu Content Opening *********************/
	$(".main_menu a, .responsive_menu a").click(function(){
		var id =  $(this).attr('class');
		id = id.split('-');
		$("#menu-container .content").hide();
		$("#menu-container #menu-"+id[1]).addClass("animated fadeInDown").show();
		$("#menu-container .homepage").hide();
		$(".support").hide();
		$(".testimonials").hide();
		return false;
	});

	$( window ).load(function() {
	  $("#menu-container .products").hide();
	});

	$(".main_menu a.templatemo_home").addClass('active');

	$(".main_menu a.templatemo_home, .responsive_menu a.templatemo_home").click(function(){
		$("#menu-container .homepage").addClass("animated fadeInDown").show();
		$(this).addClass('active');
		$(".main_menu a.templatemo_page2, .responsive_menu a.templatemo_page2").removeClass('active');
		$(".main_menu a.templatemo_page3, .responsive_menu a.templatemo_page3").removeClass('active');
		$(".main_menu a.templatemo_page5, .responsive_menu a.templatemo_page5").removeClass('active');
		return false;
	});

	$(".main_menu a.templatemo_page2, .responsive_menu a.templatemo_page2").click(function(){
		$("#menu-container .team").addClass("animated fadeInDown").show();
		$(this).addClass('active');
		$(".main_menu a.templatemo_home, .responsive_menu a.templatemo_home").removeClass('active');
		$(".main_menu a.templatemo_page3, .responsive_menu a.templatemo_page3").removeClass('active');
		$(".main_menu a.templatemo_page5, .responsive_menu a.templatemo_page5").removeClass('active');
		return false;
	});

	$(".main_menu a.templatemo_page3, .responsive_menu a.templatemo_page3").click(function(){
		$("#menu-container .services").addClass("animated fadeInDown").show();
		$(".our-services").show();
		$(this).addClass('active');
		$(".main_menu a.templatemo_page2, .responsive_menu a.templatemo_page2").removeClass('active');
		$(".main_menu a.templatemo_home, .responsive_menu a.templatemo_home").removeClass('active');
		$(".main_menu a.templatemo_page5, .responsive_menu a.templatemo_page5").removeClass('active');
		return false;
	});

	$(".main_menu a.templatemo_page5, .responsive_menu a.templatemo_page5").click(function(){
		$("#menu-container .contact").addClass("animated fadeInDown").show();
		$(this).addClass('active');
		$(".main_menu a.templatemo_page2, .responsive_menu a.templatemo_page2").removeClass('active');
		$(".main_menu a.templatemo_page3, .responsive_menu a.templatemo_page3").removeClass('active');
		$(".main_menu a.templatemo_home, .responsive_menu a.templatemo_home").removeClass('active');
		
		loadScript();
		return false;
	});

	/************** Gallery Hover Effect *********************/
	$(".overlay").hide();

	$('.gallery-item').hover(
	  function() {
	    $(this).find('.overlay').addClass('animated fadeIn').show();
	  },
	  function() {
	    $(this).find('.overlay').removeClass('animated fadeIn').hide();
	  }
	);

	/************** LightBox *********************/
	/*$(function(){
        $('[data-rel="lightbox"]').lightbox();
    });*/

	$("a.menu-toggle-btn").click(function() {
	  $(".responsive_menu").stop(true,true).slideToggle();
	  return false;
	});
 
    $(".responsive_menu a").click(function(){
		$('.responsive_menu').hide();
	});

});

function loadScript() {
  var script = document.createElement('script');
  script.type = 'text/javascript';
  script.src = 'https://maps.googleapis.com/maps/api/js?v=3.exp&sensor=false&' +
      'callback=initialize';
  document.body.appendChild(script);
}

function initialize() {
    var mapOptions = {
      zoom: 12,
      center: new google.maps.LatLng(40.7823234,-73.9654161)
    };
    var map = new google.maps.Map(document.getElementById('templatemo_map'),  mapOptions);
}
var indexPage=0;
function loadImages(){
    $.ajax({
        url: "/architect/index?page="+indexPage,
        type: "GET",
        async:false,
        dataType:"json",
        success: function (data, textStatus, jqXHR) {
            if (data) {
                indexPage ++;
                var html ='';
                if(indexPage == 0){
                    html +='<div  class="container"><div class="row templatemorow">';
                }else{
                    html +='<div class="container answer_list templatemo_gallerytop"><div class="row templatemorow">';
                }

                for(var index in data){
                    var architectDto=data[index];
                    var imagePath =architectDto.imagePath;
                    var cssClass ="";
                    if(parseInt(index)<9){
                        cssClass=getDivCss(parseInt(index))
                    }else{
                        cssClass=getDivCss(parseInt(index)%9)
                    }
                    html +='<div class="'+cssClass+'">\
                        <div>\
                        <div class="hexagon hexagon2 gallery-item">\
                            <div class="hexagon-in1">\
                                <div class="hexagon-in2" style="background-image: url('+imagePath+');">\
                                    <div class="overlay">\
                                        <a href="'+imagePath+'" data-rel="lightbox" class="fa fa-expand"></a>\
                                    </div>\
                                </div>\
                            </div>\
                        </div>\
                        </div>\
                    </div>';

                }
                html +='</div></div>';
                $("#loadMoreDiv").before(html);
            }

            $('[data-rel="lightbox"]').lightbox();
        },
        error: function (jqXHR, textStatus, errorThrown) {
            alert(jqXHR);
        }
    });
}

function getDivCss(index){
    var cssClass="";
    if(index == 0){
        cssClass="hex col-sm-6";
    }else if(index == 1 ){
        cssClass="hex col-sm-6";
    }else if(index == 2 ){
        cssClass="hex col-sm-6  templatemo-hex-top2";
    }else if(index == 3 ){
        cssClass="hex col-sm-6  templatemo-hex-top3";
    }else if(index == 4){
        cssClass="hex col-sm-6  templatemo-hex-top3";
    }else if(index == 5){
        cssClass="hex col-sm-6 hex-offset templatemo-hex-top1 templatemo-hex-top2";
    }else if(index == 6){
        cssClass="hex col-sm-6 templatemo-hex-top1 templatemo-hex-top3";
    }else if(index == 7){
        cssClass="hex col-sm-6 templatemo-hex-top1  templatemo-hex-top3";
    }else if(index == 8){
        cssClass="hex col-sm-6 templatemo-hex-top1  templatemo-hex-top2";
    }
    return cssClass;
}