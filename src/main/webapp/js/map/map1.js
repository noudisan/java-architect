/* var map = new BMap.Map("container");          // 创建地图实例
 var point = new BMap.Point(116.404, 39.915);  // 创建点坐标
 map.centerAndZoom(point, 15);                 // 初始化地图，设置中心点坐标和地图级别

 var point2 = new BMap.Point(116.406, 39.916);  // 创建点坐标


 map.enableScrollWheelZoom();//启用滚轮放大缩小，默认禁用
 map.enableContinuousZoom();//启用地图惯性拖拽，默认禁用
 map.addControl(new BMap.NavigationControl());//添加默认缩放平移控件

 var marker2 = new BMap.Marker(point2);        // 创建标注
 map.addOverlay(marker2);                     // 将标注添加到地图中

 var marker = new BMap.Marker(point);        // 创建标注
 map.addOverlay(marker);                     // 将标注添加到地图中
 marker.addEventListener("click", function () {
 alert("您点击了标注");
 });
 marker.enableDragging();
 marker.addEventListener("dragend", function (e) {
 alert("当前位置：" + e.point.lng + ", " + e.point.lat);
 })

 var polyline = new BMap.Polyline([
 new BMap.Point(116.399, 39.910),
 new BMap.Point(116.411, 39.910),
 new BMap.Point(116.402, 39.900),
 new BMap.Point(116.405, 39.920),
 new BMap.Point(116.408, 39.900),
 new BMap.Point(116.399, 39.910)
 ],
 {strokeColor:"red", strokeWeight:6, strokeOpacity:0.5}
 );
 map.addOverlay(polyline);*/
/*
 // 定义自定义覆盖物的构造函数
 function SquareOverlay(center, length, color) {
 this._center = center;
 this._length = length;
 this._color = color;
 }
 // 继承API的BMap.Overlay
 SquareOverlay.prototype = new BMap.Overlay();
 // 实现初始化方法
 SquareOverlay.prototype.initialize = function (map) {
 // 保存map对象实例
 this._map = map;
 // 创建div元素，作为自定义覆盖物的容器
 var div = document.createElement("div");
 div.style.position = "absolute";
 // 可以根据参数设置元素外观
 div.style.width = this._length + "px";
 div.style.height = this._length + "px";
 div.style.background = this._color;
 // 将div添加到覆盖物容器中
 map.getPanes().markerPane.appendChild(div);
 // 保存div实例
 this._div = div;
 // 需要将div元素作为方法的返回值，当调用该覆盖物的show、
 // hide方法，或者对覆盖物进行移除时，API都将操作此元素。
 return div;
 }
 // 实现绘制方法
 SquareOverlay.prototype.draw = function(){
 // 根据地理坐标转换为像素坐标，并设置给容器
 var position = this._map.pointToOverlayPixel(this._center);
 this._div.style.left = position.x - this._length / 2 + "px";
 this._div.style.top = position.y - this._length / 2 + "px";
 }
 // 实现显示方法
 SquareOverlay.prototype.show = function(){
 if (this._div){
 this._div.style.display = "";
 }
 }
 // 实现隐藏方法
 SquareOverlay.prototype.hide = function(){
 if (this._div){
 this._div.style.display = "none";
 }
 }
 // 添加自定义方法
 SquareOverlay.prototype.toggle = function(){
 if (this._div){
 if (this._div.style.display == ""){
 this.hide();
 }
 else {
 this.show();
 }
 }
 }
 // 初始化地图
 var map = new BMap.Map("container");
 var point = new BMap.Point(116.404, 39.915);
 map.centerAndZoom(point, 15);
 // 添加自定义覆盖物
 var mySquare = new SquareOverlay(map.getCenter(), 100, "red");
 map.addOverlay(mySquare);*/
