<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>社区医疗管理系统</title>

    <meta
            content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no"
            name="viewport">

    <link rel="stylesheet"
          href="../../../resources/plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet"
          href="../../../resources/plugins/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet"
          href="../../../resources/plugins/ionicons/css/ionicons.min.css">
    <link rel="stylesheet"
          href="../../../resources/plugins/adminLTE/css/AdminLTE.css">
    <link rel="stylesheet"
          href="../../../resources/plugins/iCheck/square/blue.css">
</head>

<body class="hold-transition login-page" style="background-image: url(../../../resources/images/center.jpg);background-repeat: no-repeat;background-size: cover">
<div class="login-box">
    <div class="login-logo">
        <a href="all-admin-index.html">社区医疗管理系统</a>
    </div>
    <!-- /.login-logo -->
    <div class="login-box-body">
        <p class="login-box-msg">登录系统</p>

            <div class="form-group has-feedback">
                <input type="text" id="account" name="username" class="form-control"
                       placeholder="用户名"> <span
                    class="glyphicon glyphicon-envelope form-control-feedback"></span>
            </div>
            <div class="form-group has-feedback">
                <input type="password" id="pwd" name="password" class="form-control"
                       placeholder="密码"> <span
                    class="glyphicon glyphicon-lock form-control-feedback"></span>
            </div>
            <div class="row" >
                <!-- /.col -->

                    <button type="submit" onclick="javascript:login();" class="btn btn-primary btn-block btn-flat" style="width: 320px;margin: auto">登录</button>
                    <button type="submit" onclick="javascript:reset();" class="btn btn-primary btn-block btn-flat" style="width: 320px;margin: 5px auto">重置</button>
                <!-- /.col -->
            </div>

    </div>
    <!-- /.login-box-body -->
</div>

<script src="../../../resources/plugins/jQuery/jquery-2.2.3.min.js"></script>
<script src="../../../resources/plugins/bootstrap/js/bootstrap.min.js"></script>
<script src="../../../resources/plugins/iCheck/icheck.min.js"></script>
<script src="../../../resources/js/login.js"></script>
</body>

</html>