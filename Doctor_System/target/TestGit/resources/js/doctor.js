$(document).ready(function() {

    selectDoctorList();

});

/**
 * 这是查询信息的方法
 */
function selectDoctorList(){

    $.ajax({
        url: '/doctor/selectDoctor',
        type: 'post',
        cache: false,
        data: {
            "name":$("#name").val()
        },
        dataType: 'json',
        success: function (data) {
            insertHtml(data.data);
        },
        error: function (data) {
            alert("服务器异常！！！");
        }
    });
}

/**
 * 填充时间的页面信息
 * @param data
 * @returns
 */
function insertHtml(data){

    $("#content").html("");
    if(data == null || data.length == 0){
        return ;
    }
    var html = "";
    $.each(data, function(index, item){
        html += "<tr>";
        html += "<td>"+"<input name=\"ids\" type=\"checkbox\">"+"</td>";
        html += "<td>"+item.id+"</td>";
        html += "<td>"+item.account+"</td>";
        html += "<td>"+item.doctorName+"</td>";
        html += "<td>"+item.phone+"</td>";
        html += "<td>"+item.residentCount+"</td>";
        html += "<td>"+item.createTime+"</td>";
        html += "<td>" +
            "<a class=\"btn bg-olive btn-xs\" href='http://localhost:8080/siteAdmin/modifyIndex?id=\""+item.id+"\"&name=\""+item.siteName+"\"&phone=\""+item.phone+"\"&doctorCount=\""+item.residentCount+"\"&account=\""+item.account+"\"&adminName=\""+item.doctorName+"\"'><img src=\"../resources/images/xiugai.png\" alt=\"修改\" title=\"修改\"/></a>"+
            "</td>";
        html += "</tr>";
    });
    $("#content").html(html);
}

/**
 * 这个是添加站点的方法
 */
function addDoctor(){
    var one =  $("#siteAdminPasswordOne").val()
    var two = $("#siteAdminPasswordTwo").val()
    var password;
    if(one != two){
        alert("两次输入的密码不同，请重新输入！！")
        return;
    }else{
        password = $("#siteAdminPasswordOne").val();
    }
    $.ajax({
        url: '/siteAdmin/insertSiteAdmin',
        type: 'post',
        cache: false,
        data: {
            "siteName":$("#siteName").val(),
            "siteAdminAccount":$("#siteAdminAccount").val(),
            "password":password,
            "phone":$("#phone").val(),
            "siteNames":$("#siteNames").val(),
            "address":$("#address").val()
        },
        dataType: 'json',
        success: function (data) {
            if(data != null){
                alert("提交成功！！");
                window.location.href="http://localhost:8080/siteAdmin/index";
            }
        },
        error: function (data) {
            alert("错了吧！！")
        }
    });
}

/**
 * 这个是修改分站管理员的方法
 */
function modifySiteAdmin(){
    $.ajax({
        url: '/siteAdmin/modifyAdminUser',
        type: 'post',
        cache: false,
        data: {
            "id":$("#id").val(),
            "name":$("#adminName").val(),
            "phone":$("#phone").val()
        },
        dataType: 'json',
        success: function (data) {
            if(data != null){
                alert("修改成功！！");
                window.location.href="http://localhost:8080/siteAdmin/index";
                selectSiteAdminList();
            }
        },
        error: function (data) {
            alert("错了吧！！")
        }
    });
}

function  addSiteJump() {
    window.location.href="http://localhost:8080/siteAdmin/index";
}