<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8"  %>
<html>

 <head>

  <meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!--   <script type="text/javascript"src="../weChatPb/static/js/jquery-3.4.0.min.js"></script> -->
<!--   <link rel="stylesheet" href="../weChatPb/static/css/weui.min.css"/> -->
<link rel="stylesheet" href="https://cdn.bootcss.com/weui/1.1.3/style/weui.min.css">
<link rel="stylesheet" href="https://cdn.bootcss.com/jquery-weui/1.2.1/css/jquery-weui.min.css">

<!-- body 最后 -->
<script src="https://cdn.bootcss.com/jquery/1.11.0/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/jquery-weui/1.2.1/js/jquery-weui.min.js"></script>

<!-- 如果使用了某些拓展插件还需要额外的JS -->
<script src="https://cdn.bootcss.com/jquery-weui/1.2.1/js/swiper.min.js"></script>
<script src="https://cdn.bootcss.com/jquery-weui/1.2.1/js/city-picker.min.js"></script>
  <title>注册个人信息</title>
<style type="text/css">


</style>
 </head>
 <body ontouchstart>
       <div class="weui-cells weui-cells_form" onsubmit="">
  <div class="weui-cell">
    <div class="weui-cell__hd"><label class="weui-label">姓名</label></div>
    <div class="weui-cell__bd">
      <input class="weui-input" type="text" id="name_id" height="30%" placeholder="请输入姓名">
    </div>
  </div>
  <div class="weui-cell weui-cell_vcode">
    <div class="weui-cell__hd">
      <label class="weui-label">手机号</label>
    </div>
    <div class="weui-cell__bd">
      <input class="weui-input" type="tel" id="phone_id" name="phone" height="50%" placeholder="请输入手机号">
    </div>
  </div>
  <div class="weui-cell">
    <div class="weui-cell__hd"><label for="" class="weui-label">出生日期</label></div>
    <div class="weui-cell__bd">
      <input class="weui-input" id="date-id" type="date" value="">
    </div>
  </div>
</div>
<div>
<a href="javascript:;" class="weui-btn weui-btn_primary" id="submit">提交</a>
</div>


    </body>
<script type="text/javascript">
	$(function () {
		$("#submit").click(function () {
			var name = $("#name_id").val();
			var phone = $("#phone_id").val();
			var time = $("#date-id").val();
			if (null == name || name == "") {
				$.alert({
					  title: '提示',
					  text: '请输入姓名',
					  onOK: function () {
					    //点击确认
					  }
					});
			}
			else if (null == phone || phone == "") {
				$.alert({
					  title: '提示',
					  text: '请输入电话',
					  onOK: function () {
					    //点击确认
					  }
					});
			}
			else if (null == time || time == "") {
				$.alert({
					  title: '提示',
					  text: '请输入出生日期',
					  onOK: function () {
					    //点击确认
					  }
					});
			}
			else {
				$.ajax({
					cache: true,
					type: "POST",
					url:'weixin/test',
					async: false,
					data:{
						name:name,
						phone:phone,
						time:time
						
					},
					error: function(request) {
					},
					success: function(data){
						
					}
		});
			}
			
		});
	});
</script>
</html>