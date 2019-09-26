$(document).ready(DocReady);

function DocReady() {
    $.ajax({
        url: "/contact/list",
        type: "GET",
        async:false,
        dataType:"json",
        success: function (data, textStatus, jqXHR) {
            if (data) {
                // <td>名称</td><td>邮箱</td><td>手机</td><td>主题</td><td>内容</td>
                var html ="";
                for(var index in data){
                    var dto = data[index];
                    var name ="";
                    if(dto.fullName) name =dto.fullName
                    var email="";
                    if(dto.email) email =dto.email;
                    var phone="";
                    if(dto.phone)phone=dto.phone;
                    var subject ="";
                    if(dto.subject)subject=dto.subject;
                    var message="";
                    if(dto.message)message=dto.message;

                    html +="<tr><td>"+name+"</td><td>"+email+"</td><td>"+phone+"</td><td>"+subject+"</td><td>"+message+"</td></tr>";
                }
                $("#table_body").html(html);
            }
        },
        error: function (jqXHR, textStatus, errorThrown) {
        }
    });
}
