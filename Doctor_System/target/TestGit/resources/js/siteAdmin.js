

/**
 * 这是查询信息的方法
 */
function selectSiteAdminList(){

    $.ajax({
        url: '/siteAdmin/selectSiteAdmin',
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
        html += "<td>"+item.adminName+"</td>";
        html += "<td>"+item.phone+"</td>";
        html += "<td>"+item.doctorCount+"</td>";
        html += "<td>"+item.createTime+"</td>";
        html += "<td>"+item.siteName+"</td>";
        html += "<td>" +
            "<a class=\"btn bg-olive btn-xs\" href='http://localhost:8080/siteAdmin/modifyIndex?id=\""+item.id+"\"&name=\""+item.siteName+"\"&phone=\""+item.phone+"\"&doctorCount=\""+item.doctorCount+"\"&account=\""+item.account+"\"&adminName=\""+item.adminName+"\"'><img src=\"../resources/images/xiugai.png\" alt=\"修改\" title=\"修改\"/></a>"+
            "</td>";
        html += "</tr>";
    });
    $("#content").html(html);
}

/**
 * 这个是添加站点的方法
 */
function addSite(){
    $.ajax({
        url: '/siteList/insertSite',
        type: 'post',
        cache: false,
        data: {
            "name":$("#siteName").val(),
            "siteAdmin":$("#siteAdmin").val(),
            "doctorName":$("#siteNames").val(),
            "status":$("#status").val()
        },
        dataType: 'json',
        success: function (data) {
            if(data != null){
                alert("提交成功！！");
                window.location.href="http://localhost:8080/siteList/siteIndex";
            }
        },
        error: function (data) {
                alert("错了吧！！")
        }
    });
}

/**
 * 这个是修改站点的方法
 */
function modifySite(){
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