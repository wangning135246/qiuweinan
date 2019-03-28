$(document).ready(function() {

    selectSiteList();

});

/**
 * 这是查询信息的方法
 */
function selectSiteList(){

    $.ajax({
        url: '/siteList/selectSiteList',
        type: 'post',
        cache: false,
        data: {
            "siteName":$("#siteName").val()
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
        html += "<td>"+item.siteName+"</td>";
        html += "<td>"+item.siteCount+"</td>";
        html += "<td>"+item.doctorCount+"</td>";
        html += "<td>"+selectStatus(item.status)+"</td>";
        html += "<td>"+item.createTime+"</td>";
        html += "<td>" +
            "<a class=\"btn bg-olive btn-xs\" href='http://localhost:8080/siteList/siteModifyIndex?id=\""+item.id+"\"&name=\""+item.siteName+"\"&doctorCount=\""+item.doctorCount+"\"&adminCount=\""+item.siteCount+"\"&status=\""+item.status+"\"'><img src=\"../resources/images/xiugai.png\" alt=\"修改\" title=\"修改\"/></a>"+
            "<a class=\"btn bg-olive btn-xs\" href='javascript:removeSite(\""+item.id+"\");'><img src=\"../resources/images/schu.png\" alt=\"删除\" title=\"删除\"/></a>"
            +"</td>"
        html += "</tr>";
    });
    $("#content").html(html);
}

/**
 * 查询站点的状态
 * @param status
 */
function selectStatus(status) {
    if(status == 1){
        return "开启"
    }else{
        return "关闭"
    }
}
/**
 * 这个是删除站点的方法
 * @param id
 */
function removeSite(id){
    $.ajax({
        url: '/siteList/deleteSite',
        type: 'post',
        cache: false,
        data: {
            "id": id
        },
        dataType: 'json',
        success: function (data) {
            alert("删除成功！！");
            selectSiteList();
        },
        error: function (data) {
            alert("服务器异常！！！");
        }
    });
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
        url: '/siteList/modifySite',
        type: 'post',
        cache: false,
        data: {
            "id":$("#id").val(),
            "name":$("#siteName").val(),
            "status":$("#status").val()
        },
        dataType: 'json',
        success: function (data) {
            if(data != null){
                alert("修改成功！！");
                window.location.href="http://localhost:8080/siteList/siteIndex";
            }
        },
        error: function (data) {
            alert("错了吧！！")
        }
    });
}

function  addSiteJump() {
    window.location.href="http://localhost:8080/siteList/siteIndex";
}