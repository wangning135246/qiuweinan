/**
 * 设置重置的方法
 */
function reset(){
    $("#account").val("");
    $("#pwd").val("");
}

/**
 * 这个是登录的方法
 */
function login(){
    $.ajax({
        url: '/userLogin/login',
        type: 'post',
        cache: false,
        data: {
            "account":$("#account").val(),
            "pwd":$("#pwd").val()
        },
        dataType: 'json',
        success: function (data) {
            if(data.data != null){
                alert("登陆成功！！！！");
                if(data.data == "超级管理员"){
                    window.location.href="http://localhost:8080/successLogin/index"
                }else{

                }
                window.location.href="http://localhost:8080/successLogin/index";
            }else{
                alert("账号或密码有误，请重新输入！！");
                reset();
            }
        },
        error: function (data) {
            alert("服务器异常！！！");
        }
    });
}
