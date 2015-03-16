$(document).ready(DocReady);

function DocReady() {
    $.ajax({
        url: getCtx_url()+"/image/homeSlider",
        type: "GET",
        async:false,
        dataType:"json",
        success: function (data, textStatus, jqXHR) {
            if (data) {
                $("#home-slider").html("");
                var html ="";
                for(var index in data){
                    html += "<div>";
                    html += " <img src='"+data[index].url+"' alt='' />";
                    html +="<h2><a href='#'>"+data[index].title+"</a></h2>";
                    html+="</div>";
                }
                $("#home-slider").html(html);
            }
        },
        error: function (jqXHR, textStatus, errorThrown) {
        }
    });
    homeSlider();
}


function homeSlider() {
    var homeSlider = $('#home-slider');
    if (homeSlider.length != 0) {
        homeSlider.bxSlider({
            'auto': true,
            'nextText': '',
            'prevText': ''
        });
    }
}

function getCtx_url(){
    var ctx_url =$("#ctx_url").val();
    return ctx_url;
}