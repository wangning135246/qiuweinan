
$(document).ready(function() {

    GetUrl(0);

});



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
            $("#Box").attr("src","http://localhost:8080/doctor/index");
        }else if(address == 0){
            $("#Box").attr("src","http://localhost:8080/successLogin/index1");
        }else if(address == 4){
            $("#Box").attr("src","http://localhost:8080/resident/index");
        }else if(address == 5){
            $("#Box").attr("src","http://localhost:8080/group/index");
        }else if(address == 6){
            $("#Box").attr("src","http://localhost:8080/disease/index");
        }else if(address == 7){
            $("#Box").attr("src","http://localhost:8080/disease/index1");
        }
    }
    catch(e)
    {
        window.location.reload();
    }
}