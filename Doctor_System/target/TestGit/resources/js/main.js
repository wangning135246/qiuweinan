




/**
 * 这个是主页面的跳转
 * @param address
 * @constructor
 */
function GetUrl(address)
{
    var box = $("#Box");
    try
    {
        if(address == 1){
            box.attr("src","http://localhost:8080/siteList/siteIndex");
        }else if(address == 2){
            box.attr("src","http://localhost:8080/siteAdmin/index");
        }else if(address == 3){
            $("#Box").attr("src","http://localhost:8080/userList/index");
        }else{
            $("#Box").attr("src","http://localhost:8080/pwdModify/index?userName="+$("#userName").html());
        }
    }
    catch(e)
    {
        window.location.reload();
    }
}