$(document).ready(function() {

    selectResident();

});

/**
 * 这是查询信息的方法
 */
function selectResident(){

    $.ajax({
        url: '/resident/selectResident',
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
        html += "<td>"+item.residentName+"</td>";
        html += "<td>"+item.phone+"</td>";
        html += "<td>"+item.createTime+"</td>";
        html += "<td>"+item.siteName+"</td>";
        html += "<td>"+item.doctorName+"</td>";
        html += "<td>"+item.diseaseLable+"</td>";
        html += "<td>" +
            "<a class=\"btn bg-olive btn-xs\" href='http://localhost:8080/resident/modifyIndex?id=\""+item.id+"\"&residentName=\""+item.residentName+"\"&siteName=\""+item.siteName+"\"&phone=\""+item.phone+"\"&doctorName=\""+item.doctorName+"\"&diseaseLable=\""+item.diseaseLable+"\"'><img src=\"../resources/images/xiugai.png\" alt=\"修改\" title=\"修改\"/></a>"+
            "</td>";
        html += "</tr>";
    });
    $("#content").html(html);
}

/**
 * 这个是添加居民的方法
 */
function addResident(){
    $.ajax({
        url: '/resident/addResident',
        type: 'post',
        cache: false,
        data: {
            "residentName":$("#residentName").val(),
            "doctorName":$("#doctorName").val(),
            "siteName":$("#siteName").val(),
            "phone":$("#phone").val(),
            "diseaseLable":$("#diseaseLable").val(),
        },
        dataType: 'json',
        success: function (data) {
            if(data != null){
                alert("提交成功！！");
                window.location.href="http://localhost:8080/resident/index";
            }
        },
        error: function (data) {
            alert("错了吧！！")
        }
    });
}

/**
 * 这个是修改居民的方法
 */
function modifyResident(){
    $.ajax({
        url: '/resident/modifyResident',
        type: 'post',
        cache: false,
        data: {
            "id":$("#id").val(),
            "residentName":$("#residentName").val(),
            "doctorName":$("#doctorName").val(),
            "siteName":$("#siteName").val(),
            "phone":$("#phone").val(),
            "diseaseLable":$("#diseaseLable").val(),
        },
        dataType: 'json',
        success: function (data) {
            if(data != null){
                alert("修改成功！！");
                window.location.href="http://localhost:8080/resident/index";
                selectSiteAdminList();
            }
        },
        error: function (data) {
            alert("错了吧！！")
        }
    });
}

function  addSiteJump() {
    window.location.href="http://localhost:8080/resident/index";
}