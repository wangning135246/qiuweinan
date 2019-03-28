$(document).ready(function() {

    selectGroupList();

});

/**
 * 这是查询信息的方法
 */
function selectGroupList(){

    $.ajax({
        url: '/group/selectGroup',
        type: 'post',
        cache: false,
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
        html += "<td>"+item.id+"</td>";
        html += "<td>"+item.groupName+"</td>";
        html += "<td>"+item.groupCount+"</td>";
        html += "<td>" +
            "<a class=\"btn bg-olive btn-xs\" href='javascript:removeGroup(\""+item.id+"\");'><img src=\"../resources/images/schu.png\" alt=\"删除\" title=\"删除\"/></a>"
            +"</td>"
        html += "</tr>";
    });
    $("#content").html(html);
}

/**
 * 这个是删除小组的方法
 * @param id
 */
function removeGroup(id){
    $.ajax({
        url: '/group/deleteGroup',
        type: 'post',
        cache: false,
        data: {
            "id": id
        },
        dataType: 'json',
        success: function (data) {
            alert("删除成功！！");
            selectGroupList();
        },
        error: function (data) {
            alert("服务器异常！！！");
        }
    });
}