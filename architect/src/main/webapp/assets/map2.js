function test(){
    var map = new BMap.Map("container");          // 创建地图实例
    var point = new BMap.Point(116.404, 39.915);  // 创建点坐标
    map.centerAndZoom(point, 15);                 // 初始化地图，设置中心点坐标和地图级别
}
/*var map = new BMap.Map("container");
map.centerAndZoom(new BMap.Point(116.404, 39.915), 11);
map.addEventListener("click", function(){
    alert("您点击了地图。");
});*/
/*
var map = new BMap.Map("container");
map.centerAndZoom(new BMap.Point(116.404, 39.915), 11);
map.addEventListener("dragend", function(){
    var center = map.getCenter();
    alert("地图中心点变更为：" + center.lng + ", " + center.lat);
});*/
/*

var map = new BMap.Map("container");         // 创建地图实例
var point = new BMap.Point(116.404, 39.915);  // 创建点坐标
map.centerAndZoom(point, 15);                 // 初始化地图，设置中心点坐标和地图级别
var traffic = new BMap.TrafficLayer();        // 创建交通流量图层实例
map.addTileLayer(traffic);                    // 将图层添加到地图上*/


/*var map = new BMap.Map("container");         // 创建地图实例
 var point = new BMap.Point(116.404, 39.915);  // 创建点坐标
 map.centerAndZoom(point, 15);                 // 初始化地图，设置中心点坐标和地图级别
 var traffic = new BMap.TrafficLayer();        // 创建交通流量图层实例
 map.addTileLayer(traffic);                    // 将图层添加到地图上
 //map.removeTileLayer(traffic);                // 将图层移除*/

/*var map = new BMap.Map("container");
 map.centerAndZoom(new BMap.Point(116.404, 39.915), 15);
 var myPushpin = new BMap.PushpinTool(map);         // 创建标注工具实例
 myPushpin.addEventListener("markend", function(e){  // 监听事件，提示标注点坐标信息
 alert("您标注的位置：" +
 e.marker.getPoint().lng + ", " +
 e.marker.getPoint().lat);
 });
 myPushpin.open();                                  // 开启标注工具*/
/*

 // 百度地图API功能
 var map = new BMap.Map('map');
 var poi = new BMap.Point(116.307852,40.057031);
 map.centerAndZoom(poi, 16);
 map.enableScrollWheelZoom();
 var overlays = [];
 var overlaycomplete = function(e){
 overlays.push(e.overlay);
 };
 var styleOptions = {
 strokeColor:"red",    //边线颜色。
 fillColor:"red",      //填充颜色。当参数为空时，圆形将没有填充效果。
 strokeWeight: 3,       //边线的宽度，以像素为单位。
 strokeOpacity: 0.8,	   //边线透明度，取值范围0 - 1。
 fillOpacity: 0.6,      //填充的透明度，取值范围0 - 1。
 strokeStyle: 'solid' //边线的样式，solid或dashed。
 }
 //实例化鼠标绘制工具
 var drawingManager = new BMapLib.DrawingManager(map, {
 isOpen: false, //是否开启绘制模式
 enableDrawingTool: true, //是否显示工具栏
 drawingToolOptions: {
 anchor: BMAP_ANCHOR_TOP_RIGHT, //位置
 offset: new BMap.Size(5, 5), //偏离值
 scale: 0.8 //工具栏缩放比例
 },
 circleOptions: styleOptions, //圆的样式
 polylineOptions: styleOptions, //线的样式
 polygonOptions: styleOptions, //多边形的样式
 rectangleOptions: styleOptions //矩形的样式
 });
 //添加鼠标绘制工具监听事件，用于获取绘制结果
 drawingManager.addEventListener('overlaycomplete', overlaycomplete);
 function clearAll() {
 for(var i = 0; i < overlays.length; i++){
 map.removeOverlay(overlays[i]);
 }
 overlays.length = 0
 }

 */
/*    var map = new BMap.Map("container");          // 创建地图实例
 var point = new BMap.Point(116.404, 39.915);  // 创建点坐标
 map.centerAndZoom(point, 15);                 // 初始化地图，设置中心点坐标和地图级别*/