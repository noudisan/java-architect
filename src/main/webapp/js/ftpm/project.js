$(document).ready(DocReady);

var project_data;
function DocReady() {
    initProject();

    slider();

    topFooterSlider();

    portfolioFilters();

    var selectProject =$("#selectProject").val();
    if(selectProject){
        $("#filters").find("li.selected").removeClass("selected");
        $("#filters li").find("a[data-filter='."+selectProject+"']").parent("li").addClass("selected")
        $("#filters li").find("a[data-filter='."+selectProject+"']").trigger("click");
    }

}

function initProject(){
    var image_url =$("#image_url").val();
    $.ajax({
        url: getCtx_url()+"/architect/withoutPage",
        type: "GET",
        async:false,
        dataType:"json",
        success: function (data, textStatus, jqXHR) {
            if (data && data.length !=0 ) {
                project_data =data;
                $("#portfolio-items").html("");
                $("#portfolio-items-slider").html("");

                var html =""
                var detailHtml ="";
                for(var index in data){
                    var dto = data[index];
                    html +='<li class="'+dto.status+'">';
                    html +='<a class="item-'+(parseInt(index)+1)+'">';
                    html +='<img src="'+image_url+dto.imagePath+'" width="230" height="150" alt="" />';
                    html +='<span class="title">'+dto.title+'</span>'
                    html +='<span class="cat"></span> ';
                    html +='</a>';
                    html +='</li>';


                    detailHtml += '<div class="item-'+(parseInt(index)+1)+' portfolio-item">';
                    detailHtml += '<div class="portfolio-slider-containter"><div class="portfolio-slides">';
                    var detailList =dto.architectDetailDtoList;
                    for(var detailIndex in detailList){
                        detailHtml += '<img src="'+image_url+detailList[detailIndex].imagePath+'" />';
                    }
                    detailHtml += '</div></div>';
                    detailHtml += '<div class="portfolio-item-right">'
                    detailHtml += '<div class="portfolio-controls"><a class="button-close"></a><div class="clear"></div></div>';
                    detailHtml += '<h2>'+dto.title+'</h2>';
                    detailHtml += '<span>'+dto.title+'</span>';
                    if(dto.architectInfoDto && dto.architectInfoDto.desc1){
                        detailHtml += '<p>'+dto.architectInfoDto.desc1+'</p>';
                    }else{
                        detailHtml += '<p></p>';
                    }
                    if(dto.architectInfoDto && dto.architectInfoDto.desc2){
                        detailHtml += '<p>'+dto.architectInfoDto.desc2+'</p>';
                    }else{
                        detailHtml += '<p></p>';
                    }
                    if(dto.architectInfoDto && dto.architectInfoDto.desc3){
                        detailHtml += '<p>'+dto.architectInfoDto.desc3+'</p>';
                    }else{
                        detailHtml += '<p></p>';
                    }
                    detailHtml += '';
                    detailHtml += '</div><div class="clear"></div></div>';

                }
                $("#portfolio-items").html(html);
                $("#portfolio-items-slider").html(detailHtml);
            }

        },
        error: function (jqXHR, textStatus, errorThrown) {

        }
    });
}


function slider() {
    var ie7 = (document.all && !window.opera && window.XMLHttpRequest) ? true : false;

    var slider = $('#slider-container');
    var currentClass = false;
    var instanced = false;

    $('.button-close').click(function () {
        if (ie7)
            $('.portfolio-item').hide();

        slider.slideUp('normal');
    });

    $('.left-arrow').click(function () {
        var self = $(this);

        var parent = self.parent().parent().parent();
        var prevItem = parent.prev();
        var lastChild = $('#portfolio-items-slider > div').last();

        $('#portfolio-items-slider .portfolio-item').hide();

        slider.slideUp('normal', function () {
            slider.slideDown('normal', function () {
                if (prevItem.length) {
                    prevItem.show();
                }
                else {
                    lastChild.show();
                }
            });
        });

        if (!instanced) {
            instanced = true;
            setUpSlider()
        }

        goToPorfolio();
    });

    $('.right-arrow').click(function () {
        var self = $(this);

        var parent = self.parent().parent().parent();
        var nextItem = parent.next();
        var firstChild = $('#portfolio-items-slider > div').first();

        $('#portfolio-items-slider .portfolio-item').hide();

        slider.slideUp('normal', function () {
            slider.slideDown('normal', function () {
                if (nextItem.length) {
                    nextItem.show();
                }
                else {
                    firstChild.show();
                }
            });
        });

        if (!instanced) {
            instanced = true;
            setUpSlider()
        }

        goToPorfolio();
    });

    $('ul#portfolio-items li a').click(function () {
        var slider = $('#slider-container');
        var clickedClass = $(this).attr('class');

        $('#portfolio-items-slider .portfolio-item').hide();

        if (slider.is(':hidden')) {
            slider.slideDown('normal', function () {
                $('#portfolio-items-slider .' + clickedClass).fadeIn();
                goToPorfolio();
            });
        } else {
            slider.slideUp('normal', function () {
                slider.slideDown('normal', function () {
                    $('#portfolio-items-slider .' + clickedClass).fadeIn();
                });
            });
            goToPorfolio();
        }

        if (!instanced) {
            instanced = true;
            setUpSlider()
        }

        currentClass = clickedClass;
    });
}

function setUpSlider() {
    $('.portfolio-slider-containter').slides({
        container: 'portfolio-slides',
        paginationClass: 'portfolio-item-pagination',
        autoHeight: false,
        preload: false,
        generatePagination: true,
        effect: 'slide',
        slideSpeed: 650,
        play: 3000,
        pause: 3000,
        hoverPause: true
    });
}

function portfolioFilters() {
    var container = $('#portfolio-items');
    container.isotope({
        animationEngine: 'jquery',
        animationOptions: {
            duration: 600,
            easing: 'linear',
            queue: false
        }
    });

    // filter items when filter link is clicked
    $('ul#filters a').click(function () {
        var self = $(this);
        var selectClass = 'selected';

        $('ul#filters .' + selectClass).removeClass(selectClass);
        self.parent().addClass(selectClass);

        var filterVal = self.attr('data-filter');
        container.isotope({filter: filterVal});

        return false;
    });
}



function topFooterSlider() {
    var footerContainer = $('#top-footer');
    var arrowUp = $('.top-footer-up');
    var arrowDown = $('.top-footer-down');

    arrowDown.click(function () {
        $(this).slideUp('normal', function () {
            footerContainer.slideDown('normal');
        });
    });
    arrowUp.click(function () {
        footerContainer.slideUp('normal', function () {
            arrowDown.slideDown('normal');
        });
    });
}

function goToPorfolio() {
    $('html,body').animate({scrollTop: ($("#slider-container").offset().top)}, 'slow');
}

function getCtx_url(){
    var ctx_url =$("#ctx_url").val();
    return ctx_url;
}