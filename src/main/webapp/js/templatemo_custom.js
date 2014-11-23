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


	$(".main_menu a.templatemo_home").addClass('active');

	$(".main_menu a.templatemo_home, .responsive_menu a.templatemo_home").click(function(){
		$("#menu-container .homepage").addClass("animated fadeInDown").show();
		$(this).addClass('active');
		$(".main_menu a.templatemo_page2, .responsive_menu a.templatemo_page2").removeClass('active');
		$(".main_menu a.templatemo_page3, .responsive_menu a.templatemo_page3").removeClass('active');
		$(".main_menu a.templatemo_page4, .responsive_menu a.templatemo_page4").removeClass('active');
		$(".main_menu a.templatemo_page5, .responsive_menu a.templatemo_page5").removeClass('active');
		return false;
	});

	$(".main_menu a.templatemo_page2, .responsive_menu a.templatemo_page2").click(function(){
		$("#menu-container .service").addClass("animated fadeInDown").show();
		$(this).addClass('active');
		$(".main_menu a.templatemo_home, .responsive_menu a.templatemo_home").removeClass('active');
		$(".main_menu a.templatemo_page3, .responsive_menu a.templatemo_page3").removeClass('active');
		$(".main_menu a.templatemo_page4, .responsive_menu a.templatemo_page4").removeClass('active');
		$(".main_menu a.templatemo_page5, .responsive_menu a.templatemo_page5").removeClass('active');
		return false;
	});

	$(".main_menu a.templatemo_page3, .responsive_menu a.templatemo_page3").click(function(){
        $("#menu-container .belief").addClass("animated fadeInDown").show();
        $(this).addClass('active');
        $(".main_menu a.templatemo_home, .responsive_menu a.templatemo_home").removeClass('active');
        $(".main_menu a.templatemo_page2, .responsive_menu a.templatemo_page2").removeClass('active');
        $(".main_menu a.templatemo_page4, .responsive_menu a.templatemo_page4").removeClass('active');
		$(".main_menu a.templatemo_page5, .responsive_menu a.templatemo_page5").removeClass('active');
		return false;
	});

    $(".main_menu a.templatemo_page4, .responsive_menu a.templatemo_page4").click(function(){
        $("#menu-container .team").addClass("animated fadeInDown").show();
        $(this).addClass('active');
        $(".main_menu a.templatemo_home, .responsive_menu a.templatemo_home").removeClass('active');
        $(".main_menu a.templatemo_page2, .responsive_menu a.templatemo_page2").removeClass('active');
        $(".main_menu a.templatemo_page3, .responsive_menu a.templatemo_page3").removeClass('active');
        $(".main_menu a.templatemo_page5, .responsive_menu a.templatemo_page5").removeClass('active');
        return false;
    });

	$(".main_menu a.templatemo_page5, .responsive_menu a.templatemo_page5").click(function(){
		$("#menu-container .contact").addClass("animated fadeInDown").show();
		$(this).addClass('active');
        $(".main_menu a.templatemo_home, .responsive_menu a.templatemo_home").removeClass('active');
        $(".main_menu a.templatemo_page2, .responsive_menu a.templatemo_page2").removeClass('active');
        $(".main_menu a.templatemo_page3, .responsive_menu a.templatemo_page3").removeClass('active');
        $(".main_menu a.templatemo_page4, .responsive_menu a.templatemo_page4").removeClass('active');

	    //loadScript();
		return false;
	});

	/************** Gallery Hover Effect *********************/
	/*$(".overlay").hide();*/

	/*$('.gallery-item').hover(
	  function() {
	    $(this).find('.overlay').addClass('animated fadeIn').show();
	  },
	  function() {
	    $(this).find('.overlay').removeClass('animated fadeIn').hide();
	  }
	);
*/
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



var indexPage=1;
function loadImages(){
    var image_url =$("#image_url").val();
    $.ajax({
        url: getCtx_url()+"/architect/index?page="+indexPage,
        type: "GET",
        async:false,
        dataType:"json",
        success: function (data, textStatus, jqXHR) {
            if (data && data.length !=0 ) {
               var html = "<div style='margin-bottom: 10px;margin-left: 10px;'>";
               for(var index in data){
                   var architectDto = data[index];
                   if(parseInt(index) == 5){
                       html += "</div><div style='margin-bottom: 10px;margin-left: 10px;'>";
                   }
                   var architectDetailArray = architectDto.architectDetailDtoList;
                   for(var detailIndex in architectDetailArray){
                       var architectDetail = architectDetailArray[detailIndex];
                       if(parseInt(detailIndex) == 0){
                           html +=' <a href="'+image_url+architectDetail.imagePath+'" data-lightbox="'+architectDto.name+'" data-title="'+index+'"><img src="'+image_url+architectDto.imagePath+'" alt=""/></a>';
                       }else{
                           html +=' <a href="'+image_url+architectDetail.imagePath+'" data-lightbox="'+architectDto.name+'" data-title="'+index+'">';
                       }
                   }
               }
                html +="</div>"
                $("#loadMoreDiv").before(html);
                indexPage ++;
            }else{
                $(".gallery_more").text('浏览完毕');
            }

            //$('[data-rel="lightbox"]').lightbox();
        },
        error: function (jqXHR, textStatus, errorThrown) {

        }
    });
}

function sendMessage(){
    $.ajax({
        url: getCtx_url()+"/contact/save",
        type: "POST",
        async:false,
        data:{
            fullName:$("#contact_fullName").val(),
            phoneOrEmail:$("#contact_email").val(),
            subject:$("#contact_subject").val(),
            message:$("#contact_message").val()
        },
        dataType:"json",
        success: function (data, textStatus, jqXHR) {
            if (data =='SUCCESS' ) {
              alert("信息发送成功，我们会尽快联系您！");
                $("#contact_fullName").prop("value","");
                $("#contact_email").prop("value","");
                $("#contact_subject").prop("value","");
                $("#contact_message").prop("value","");
            }else{
                alert("信息发送失败，请使用联系电话！");
            }
        },
        error: function (jqXHR, textStatus, errorThrown) {
        }
    });
}

function getCtx_url(){
    var ctx_url =$("#ctx_url").val();
    if(ctx_url.indexOf("architect")<0){
        ctx_url = ctx_url+"/architect"
    }
    return ctx_url;
}