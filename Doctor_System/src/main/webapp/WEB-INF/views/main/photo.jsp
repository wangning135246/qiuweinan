<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- 页面meta -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">

<title>社区医疗后台管理系统</title>
<meta name="description" content="社区医疗后台管理系统">
<meta name="keywords" content="社区医疗后台管理系统">

<!-- Tell the browser to be responsive to screen width -->
<meta
	content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no"
	name="viewport">

  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>


<link rel="stylesheet"
	href="../../../resources/plugins/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"
	href="../../../resources/plugins/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet"
	href="../../../resources/plugins/ionicons/css/ionicons.min.css">
<link rel="stylesheet"
	href="../../../resources/plugins/iCheck/square/blue.css">
<link rel="stylesheet"
	href="../../../resources/plugins/morris/morris.css">
<link rel="stylesheet"
	href="../../../resources/plugins/jvectormap/jquery-jvectormap-1.2.2.css">
<link rel="stylesheet"
	href="../../../resources/plugins/datepicker/datepicker3.css">
<link rel="stylesheet"
	href="../../../resources/plugins/daterangepicker/daterangepicker.css">
<link rel="stylesheet"
	href="../../../resources/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
<link rel="stylesheet"
	href="../../../resources/plugins/datatables/dataTables.bootstrap.css">
<link rel="stylesheet"
	href="../../../resources/plugins/treeTable/jquery.treetable.css">
<link rel="stylesheet"
	href="../../../resources/plugins/treeTable/jquery.treetable.theme.default.css">
<link rel="stylesheet"
	href="../../../resources/plugins/select2/select2.css">
<link rel="stylesheet"
	href="../../../resources/plugins/colorpicker/bootstrap-colorpicker.min.css">
<link rel="stylesheet"
	href="../../../resources/plugins/bootstrap-markdown/css/bootstrap-markdown.min.css">
<link rel="stylesheet"
	href="../../../resources/plugins/adminLTE/css/AdminLTE.css">
<link rel="stylesheet"
	href="../../../resources/plugins/adminLTE/css/skins/_all-skins.min.css">
<link rel="stylesheet"
	href="../../../resources/css/style.css">
<link rel="stylesheet"
	href="../../../resources/plugins/ionslider/ion.rangeSlider.css">
<link rel="stylesheet"
	href="../../../resources/plugins/ionslider/ion.rangeSlider.skinNice.css">
<link rel="stylesheet"
	href="../../../resources/plugins/bootstrap-slider/slider.css">
</head>

<body class="hold-transition skin-blue sidebar-mini">

		<!-- 内容区域 -->

			<img src="../../resources/images/center.jpg"
				width="100%" height="100%" />

		<!-- 内容区域 /-->


	<script
		src="../../../resources/plugins/jQuery/jquery-2.2.3.min.js"></script>
	<script
		src="../../../resources/plugins/jQueryUI/jquery-ui.min.js"></script>
	<script
		src="../../../resources/plugins/bootstrap/js/bootstrap.min.js"></script>
	<script
		src="../../../resources/plugins/raphael/raphael-min.js"></script>
	<script
		src="../../../resources/plugins/morris/morris.min.js"></script>
	<script
		src="../../../resources/plugins/sparkline/jquery.sparkline.min.js"></script>
	<script
		src="../../../resources/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
	<script
		src="../../../resources/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
	<script
		src="../../../resources/plugins/knob/jquery.knob.js"></script>
	<script
		src="../../../resources/plugins/daterangepicker/moment.min.js"></script>
	<script
		src="../../../resources/plugins/daterangepicker/daterangepicker.js"></script>
	<script
		src="../../../resources/plugins/daterangepicker/daterangepicker.zh-CN.js"></script>
	<script
		src="../../../resources/plugins/datepicker/bootstrap-datepicker.js"></script>
	<script
		src="../../../resources/plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js"></script>
	<script
		src="../../../resources/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
	<script
		src="../../../resources/plugins/slimScroll/jquery.slimscroll.min.js"></script>
	<script
		src="../../../resources/plugins/fastclick/fastclick.js"></script>
	<script
		src="../../../resources/plugins/iCheck/icheck.min.js"></script>
	<script
		src="../../../resources/plugins/adminLTE/js/app.min.js"></script>
	<script
		src="../../../resources/plugins/treeTable/jquery.treetable.js"></script>
	<script
		src="../../../resources/plugins/select2/select2.full.min.js"></script>
	<script
		src="../../../resources/plugins/colorpicker/bootstrap-colorpicker.min.js"></script>
	<script
		src="../../../resources/plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.zh-CN.js"></script>
	<script
		src="../../../resources/plugins/bootstrap-markdown/js/bootstrap-markdown.js"></script>
	<script
		src="../../../resources/plugins/bootstrap-markdown/locale/bootstrap-markdown.zh.js"></script>
	<script
		src="../../../resources/plugins/bootstrap-markdown/js/markdown.js"></script>
	<script
		src="../../../resources/plugins/bootstrap-markdown/js/to-markdown.js"></script>
	<script
		src="../../../resources/plugins/ckeditor/ckeditor.js"></script>
	<script
		src="../../../resources/plugins/input-mask/jquery.inputmask.js"></script>
	<script
		src="../../../resources/plugins/input-mask/jquery.inputmask.date.extensions.js"></script>
	<script
		src="../../../resources/plugins/input-mask/jquery.inputmask.extensions.js"></script>
	<script
		src="../../../resources/plugins/datatables/jquery.dataTables.min.js"></script>
	<script
		src="../../../resources/plugins/datatables/dataTables.bootstrap.min.js"></script>
	<script
		src="../../../resources/plugins/chartjs/Chart.min.js"></script>
	<script
		src="../../../resources/plugins/flot/jquery.flot.min.js"></script>
	<script
		src="../../../resources/plugins/flot/jquery.flot.resize.min.js"></script>
	<script
		src="../../../resources/plugins/flot/jquery.flot.pie.min.js"></script>
	<script
		src="../../../resources/plugins/flot/jquery.flot.categories.min.js"></script>
	<script
		src="../../../resources/plugins/ionslider/ion.rangeSlider.min.js"></script>
	<script
		src="../../../resources/plugins/bootstrap-slider/bootstrap-slider.js"></script>
	<script
			src="../../../resources/js/main.js"></script>
</body>

</html>