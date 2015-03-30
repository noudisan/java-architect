$(function () {
    var image_url =$("#image_url").val();

    $.ajax({
        url: getCtx_url() + "/architect/get/" + $("#detail_id").val(),
        type: "GET",
        async: false,
        dataType: "json",
        success: function (data, textStatus, jqXHR) {
            if (data) {
                $("#detail-slider").html("");
                var html = "";
                var detailList = data.architectDetailDtoList;
                /*for (var index in detailList) {
                    html += "<div>";
                    html += " <img src='" +image_url+ detailList[index].imagePath + "' style='width:500px;height:400px;' alt='' />";
                    html +="<h2><a href='#'></a></h2>";
                    html += "</div>";
                }*/

                html +='<img src="http://localhost/architect/product/01dtfd/logo-dongtianfudi.png" width="230" height="150" alt="">';
                $("#detail-slider").html(html);

                var info = data.architectInfoDto;
                $("#detail_title").html("");
                $("#detail_desc1").html("");
                $("#detail_desc2").html("");
                $("#detail_desc3").html("");

                $("#detail_title").html(data.title);
                $("#detail_desc1").html(info.desc1);
                $("#detail_desc2").html(info.desc2);
                $("#detail_desc3").html(info.desc3);

            }
        },
        error: function (jqXHR, textStatus, errorThrown) {
        }
    });
    //homeSlider();
});


function homeSlider() {
    var homeSlider = $('#detail-slider');
    if (homeSlider.length != 0) {
        homeSlider.bxSlider({
            'auto': true,
            'pause': 8000,
            'nextText': '',
            'prevText': ''
        });
        $("#detail-slider").css("width", "500px;");
    }
}

function getCtx_url() {
    var ctx_url = $("#ctx_url").val();
    return ctx_url;
}