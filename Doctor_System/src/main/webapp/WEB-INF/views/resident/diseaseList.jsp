
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <!-- 页面meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">


    <title>后台管理系统-分站管理员管理</title>
    <meta name="description" content="后台管理系统-分站管理员管理">
    <meta name="keywords" content="后台管理系统-分站管理员管理">

    <meta content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no" name="viewport">

    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <link rel="stylesheet" href="../../../resources/plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../../resources/plugins/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="../../../resources/plugins/ionicons/css/ionicons.min.css">
    <link rel="stylesheet" href="../../../resources/plugins/iCheck/square/blue.css">
    <link rel="stylesheet" href="../../../resources/plugins/morris/morris.css">
    <link rel="stylesheet" href="../../../resources/plugins/jvectormap/jquery-jvectormap-1.2.2.css">
    <link rel="stylesheet" href="../../../resources/plugins/datepicker/datepicker3.css">
    <link rel="stylesheet" href="../../../resources/plugins/daterangepicker/daterangepicker.css">
    <link rel="stylesheet" href="../../../resources/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
    <link rel="stylesheet" href="../../../resources/plugins/datatables/dataTables.bootstrap.css">
    <link rel="stylesheet" href="../../../resources/plugins/treeTable/jquery.treetable.css">
    <link rel="stylesheet" href="../../../resources/plugins/treeTable/jquery.treetable.theme.default.css">
    <link rel="stylesheet" href="../../../resources/plugins/select2/select2.css">
    <link rel="stylesheet" href="../../../resources/plugins/colorpicker/bootstrap-colorpicker.min.css">
    <link rel="stylesheet" href="../../../resources/plugins/bootstrap-markdown/css/bootstrap-markdown.min.css">
    <link rel="stylesheet" href="../../../resources/plugins/adminLTE/css/AdminLTE.css">
    <link rel="stylesheet" href="../../../resources/plugins/adminLTE/css/skins/_all-skins.min.css">
    <link rel="stylesheet" href="../../../resources/css/style.css">
    <link rel="stylesheet" href="../../../resources/plugins/ionslider/ion.rangeSlider.css">
    <link rel="stylesheet" href="../../../resources/plugins/ionslider/ion.rangeSlider.skinNice.css">
    <link rel="stylesheet" href="../../../resources/plugins/bootstrap-slider/slider.css">
    <link rel="stylesheet" href="../../../resources/plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.css">
</head>

<body class="hold-transition skin-purple sidebar-mini" >

<div class="wrapper" style = "background: #ffff">

    <!-- 内容区域 -->
    <!-- @@master = admin-layout.html-->
    <!-- @@block = content -->

    <div >

        <!-- 内容头部 -->
        <section class="content-header">
            <h1>
                系统管理
                <small>居民管理</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="http://localhost:8080/successLogin/index"><i class="fa fa-dashboard"></i> 首页</a></li>
                <li><a href="#">系统管理</a></li>
                <li class="active">居民管理</li>
            </ol>
        </section>
        <!-- 内容头部 /-->

        <!-- 正文区域 -->
        <div class="content">

            <!-- .box-body -->
            <div class="box box-primary">
                <div class="box-header with-border">
                    <h3 class="box-title">列表</h3>
                </div>

                <div class="box-body">

                    <!-- 数据表格 -->
                    <div class="table-box">

                        <!--工具栏-->
                        <div class="pull-left">
                            <div class="form-group form-inline">
                                <div class="btn-group">
                                    <button type="button" class="btn btn-default" title="新建站点"
                                            onclick="window.location='http://localhost:8080/resident/addIndex'">
                                        <i class="fa fa-file-o"></i> 新增居民
                                    </button>
                                    <button type="button" class="btn btn-default" title="删除选中"
                                            onclick="javascript:deleteCheck();"><i
                                            class="fa fa-trash-o"></i> 删除选中
                                    </button>
                                    <button type="button" class="btn btn-default" title="组织站点分配"
                                            onclick=''><i class="fa fa-check"></i> 更换小组
                                    </button>
                                    <button type="button" class="btn btn-default" title="查询"
                                            onclick="javascript:selectResident()"><i
                                            class="btn bg-default"></i> 查询
                                    </button>
                                </div>
                            </div>
                        </div>
                        <div class="box-tools pull-right" >
                            <div class="has-feedback">
                                <input type="text" id = "name" class="form-control input-sm" placeholder="请输入居民的名字" >
                            </div>
                        </div>

                        <!--工具栏/-->

                        <!--数据列表-->
                        <table id="dataList" class="table table-bordered table-striped table-hover dataTable">
                            <thead>
                            <tr>
                                <th>选择</th>
                                <th class="sorting_asc">序号</th>
                                <th class="sorting_asc">居民姓名</th>
                                <th class="sorting_asc">居民电话</th>
                                <th class="sorting_asc">最后测量时间</th>
                                <th class="sorting_asc">组织站点</th>
                                <th class="sorting_asc">小组</th>
                                <th class="sorting_asc">疾病标签</th>
                                <th class="text-center">操作</th>
                            </tr>
                            </thead>
                            <tbody id = "content">

                            </tbody>
                        </table>
                    </div>

                </div>


            </div>

        </div>
        <!-- 正文区域 /-->

    </div>
</div>


<script src="../../../resources/plugins/jQuery/jquery-2.2.3.min.js"></script>
<script src="../../../resources/plugins/jQueryUI/jquery-ui.min.js"></script>
<script src="../../../resources/plugins/bootstrap/js/bootstrap.min.js"></script>
<script src="../../../resources/plugins/raphael/raphael-min.js"></script>
<script src="../../../resources/plugins/morris/morris.min.js"></script>
<script src="../../../resources/plugins/sparkline/jquery.sparkline.min.js"></script>
<script src="../../../resources/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script src="../../../resources/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<script src="../../../resources/plugins/knob/jquery.knob.js"></script>
<script src="../../../resources/plugins/daterangepicker/moment.min.js"></script>
<script src="../../../resources/plugins/daterangepicker/daterangepicker.js"></script>
<script src="../../../resources/plugins/daterangepicker/daterangepicker.zh-CN.js"></script>
<script src="../../../resources/plugins/datepicker/bootstrap-datepicker.js"></script>
<script src="../../../resources/plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js"></script>
<script src="../../../resources/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<script src="../../../resources/plugins/slimScroll/jquery.slimscroll.min.js"></script>
<script src="../../../resources/plugins/fastclick/fastclick.js"></script>
<script src="../../../resources/plugins/iCheck/icheck.min.js"></script>
<script src="../../../resources/plugins/adminLTE/js/app.min.js"></script>
<script src="../../../resources/plugins/treeTable/jquery.treetable.js"></script>
<script src="../../../resources/plugins/select2/select2.full.min.js"></script>
<script src="../../../resources/plugins/colorpicker/bootstrap-colorpicker.min.js"></script>
<script src="../../../resources/plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.zh-CN.js"></script>
<script src="../../../resources/plugins/bootstrap-markdown/js/bootstrap-markdown.js"></script>
<script src="../../../resources/plugins/bootstrap-markdown/locale/bootstrap-markdown.zh.js"></script>
<script src="../../../resources/plugins/bootstrap-markdown/js/markdown.js"></script>
<script src="../../../resources/plugins/bootstrap-markdown/js/to-markdown.js"></script>
<script src="../../../resources/plugins/ckeditor/ckeditor.js"></script>
<script src="../../../resources/plugins/input-mask/jquery.inputmask.js"></script>
<script src="../../../resources/plugins/input-mask/jquery.inputmask.date.extensions.js"></script>
<script src="../../../resources/plugins/input-mask/jquery.inputmask.extensions.js"></script>
<script src="../../../resources/plugins/datatables/jquery.dataTables.min.js"></script>
<script src="../../../resources/plugins/datatables/dataTables.bootstrap.min.js"></script>
<script src="../../../resources/plugins/chartjs/Chart.min.js"></script>
<script src="../../../resources/plugins/flot/jquery.flot.min.js"></script>
<script src="../../../resources/plugins/flot/jquery.flot.resize.min.js"></script>
<script src="../../../resources/plugins/flot/jquery.flot.pie.min.js"></script>
<script src="../../../resources/plugins/flot/jquery.flot.categories.min.js"></script>
<script src="../../../resources/plugins/ionslider/ion.rangeSlider.min.js"></script>
<script src="../../../resources/plugins/bootstrap-slider/bootstrap-slider.js"></script>
<script src="../../../resources/plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.js"></script>
<script src="../../../resources/plugins/bootstrap-datetimepicker/locales/bootstrap-datetimepicker.zh-CN.js"></script>
<script src="../../../resources/js/resident.js"></script>


</body>

</html>
