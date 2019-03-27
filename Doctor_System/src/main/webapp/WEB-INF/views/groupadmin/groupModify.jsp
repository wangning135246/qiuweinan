<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- 页面meta -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>修改站点</title>
<meta name="description" content="修改站点">
<meta name="keywords" content="修改站点">

<!-- Tell the browser to be responsive to screen width -->
<meta
	content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no"
	name="viewport">


<link rel="stylesheet"
	href="../../resources/plugins/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"
	href="../../resources/plugins/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet"
	href="../../resources/plugins/ionicons/css/ionicons.min.css">
<link rel="stylesheet"
	href="../../resources/plugins/iCheck/square/blue.css">
<link rel="stylesheet"
	href="../../resources/plugins/morris/morris.css">
<link rel="stylesheet"
	href="../../resources/plugins/jvectormap/jquery-jvectormap-1.2.2.css">
<link rel="stylesheet"
	href="../../resources/plugins/datepicker/datepicker3.css">
<link rel="stylesheet"
	href="../../resources/plugins/daterangepicker/daterangepicker.css">
<link rel="stylesheet"
	href="../../resources/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
<link rel="stylesheet"
	href="../../resources/plugins/datatables/dataTables.bootstrap.css">
<link rel="stylesheet"
	href="../../resources/plugins/treeTable/jquery.treetable.css">
<link rel="stylesheet"
	href="../../resources/plugins/treeTable/jquery.treetable.theme.default.css">
<link rel="stylesheet"
	href="../../resources/plugins/select2/select2.css">
<link rel="stylesheet"
	href="../../resources/plugins/colorpicker/bootstrap-colorpicker.min.css">
<link rel="stylesheet"
	href="../../resources/plugins/bootstrap-markdown/css/bootstrap-markdown.min.css">
<link rel="stylesheet"
	href="../../resources/plugins/adminLTE/css/AdminLTE.css">
<link rel="stylesheet"
	href="../../resources/plugins/adminLTE/css/skins/_all-skins.min.css">
<link rel="stylesheet"
	href="../../resources/css/style.css">
<link rel="stylesheet"
	href="../../resources/plugins/ionslider/ion.rangeSlider.css">
<link rel="stylesheet"
	href="../../resources/plugins/ionslider/ion.rangeSlider.skinNice.css">
<link rel="stylesheet"
	href="../../resources/plugins/bootstrap-slider/slider.css">
<link rel="stylesheet"
	href="../../resources/plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.css">
</head>

<body class="hold-transition sidebar-mini">



		<!-- 内容区域 -->

			<!-- 内容头部 -->
			<div class="content-header">
			<h1>
				站点管理 <small>修改站点</small>
			</h1>
			<ol class="breadcrumb">
				<li><a href="${pageContext.request.contextPath}/index.jsp"><i
						class="fa fa-dashboard"></i> 首页</a></li>
				<li><a
					href="${pageContext.request.contextPath}/user/findAll">站点管理</a></li>
				<li class="active">修改站点</li>
			</ol>
			</div>
			<!-- 内容头部 /-->

				<!-- 正文区域 -->
				<div class="content"> <!--产品信息-->

				<div class="panel panel-default">
					<div class="panel-heading">站点信息</div>
					<div class="row data-type">

							<div class="col-md-2 title">站点名称</div>
							<div class="col-md-4 data">
								<input type="text" id = "siteName" class="form-control" name="siteName"
									    value=${name}>
							</div>


						<div class="col-md-2 title">站点管理员数量</div>
						<div class="col-md-4 data">
							<input readonly="readonly" type="text" id = "siteAdmin" class="form-control" name="siteAdmin"
								 value=${adminCount}>
						</div>

						<div class="col-md-2 title">该站点医生的数量</div>
						<div class="col-md-4 data">
							<input readonly="readonly" type="text" id = "siteNames" class="form-control" name="doctor"
								 value=${doctorCount}>
						</div>

						<div class="col-md-2 title">站点状态</div>
						<div class="col-md-4 data">
							<select id = "status" class="form-control select2" style="width: 100%"
								name="status">
								<option value="0" selected="selected">关闭</option>
								<option value="1">开启</option>
							</select>
						</div>

					</div>
				</div>
				<!--订单信息/--> <!--工具栏-->
				<div class="box-tools text-center">
					<button type="submit" class="btn bg-maroon" onclick="javascript:modifySite();">保存</button>
					<button type="button" class="btn bg-default"
						onclick="javascript:addSiteJump();">返回</button>
				</div>
				<!--工具栏/-->

				</div>
		<!-- 内容区域 /-->
		<input type="hidden" id = "id" class="form-control" name="siteName" value=${id}>


	<script
		src="../../resources/plugins/jQuery/jquery-2.2.3.min.js"></script>
	<script
		src="../../resources/plugins/jQueryUI/jquery-ui.min.js"></script>
	<script
		src="../../resources/plugins/bootstrap/js/bootstrap.min.js"></script>
	<script
		src="../../resources/plugins/raphael/raphael-min.js"></script>
	<script
		src="../../resources/plugins/morris/morris.min.js"></script>
	<script
		src="../../resources/plugins/sparkline/jquery.sparkline.min.js"></script>
	<script
		src="../../resources/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
	<script
		src="../../resources/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
	<script
		src="$../../resources/plugins/knob/jquery.knob.js"></script>
	<script
		src="../../resources/plugins/daterangepicker/moment.min.js"></script>
	<script
		src="../../resources/plugins/daterangepicker/daterangepicker.js"></script>
	<script
		src="../../resources/plugins/daterangepicker/daterangepicker.zh-CN.js"></script>
	<script
		src="../../resources/plugins/datepicker/bootstrap-datepicker.js"></script>
	<script
		src="../../resources/plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js"></script>
	<script
		src="../../resources/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
	<script
		src="../../resources/plugins/slimScroll/jquery.slimscroll.min.js"></script>
	<script
		src="../../resources/plugins/fastclick/fastclick.js"></script>
	<script
		src="../../resources/plugins/iCheck/icheck.min.js"></script>
	<script
		src="../../resources/plugins/adminLTE/js/app.min.js"></script>
	<script
		src="../../resources/plugins/treeTable/jquery.treetable.js"></script>
	<script
		src="../../resources/plugins/select2/select2.full.min.js"></script>
	<script
		src="../../resources/plugins/colorpicker/bootstrap-colorpicker.min.js"></script>
	<script
		src="../../resources/plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.zh-CN.js"></script>
	<script
		src="../../resources/plugins/bootstrap-markdown/js/bootstrap-markdown.js"></script>
	<script
		src="../../resources/plugins/bootstrap-markdown/locale/bootstrap-markdown.zh.js"></script>
	<script
		src="../../resources/plugins/bootstrap-markdown/js/markdown.js"></script>
	<script
		src="../../resources/plugins/bootstrap-markdown/js/to-markdown.js"></script>
	<script
		src="../../resources/plugins/ckeditor/ckeditor.js"></script>
	<script
		src="../../resources/plugins/input-mask/jquery.inputmask.js"></script>
	<script
		src="../../resources/plugins/input-mask/jquery.inputmask.date.extensions.js"></script>
	<script
		src="../../resources/plugins/input-mask/jquery.inputmask.extensions.js"></script>
	<script
		src="../../resources/plugins/datatables/jquery.dataTables.min.js"></script>
	<script
		src="../../resources/plugins/datatables/dataTables.bootstrap.min.js"></script>
	<script
		src="../../resources/plugins/chartjs/Chart.min.js"></script>
	<script
		src="../../resources/plugins/flot/jquery.flot.min.js"></script>
	<script
		src="../../resources/plugins/flot/jquery.flot.resize.min.js"></script>
	<script
		src="../../resources/plugins/flot/jquery.flot.pie.min.js"></script>
	<script
		src="../../resources/plugins/flot/jquery.flot.categories.min.js"></script>
	<script
		src="../../resources/plugins/ionslider/ion.rangeSlider.min.js"></script>
	<script
		src="../../resources/plugins/bootstrap-slider/bootstrap-slider.js"></script>
	<script
		src="../../resources/plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.min.js"></script>
	<script src="../../resources/js/site.js"></script>



</body>

</html>