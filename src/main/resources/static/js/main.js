var apiServer = 'http://44pggn.natappfree.cc/wechat'
var openId = ""
var facePhoto = ""

//获取后台session中的openId
function getSession(param) {
    $.ajax({
        url:apiServer+'/getSession?param='+param,
        type:'get',
        async :false,//设置ajax为同步
        success:function (res){
            openId = res
            //$("#openId").val(res)
        }
    })
}

//获取路径中的参数
function getUrlParameter( name ){
    name = name.replace(/[\[]/,"\\\[").replace(/[\]]/,"\\\]");
    var regexS = "[\\?&]"+name+"=([^&#]*)";
    var regex = new RegExp( regexS );
    var results = regex.exec(window.parent.location.href );
    if( results == null )    return "";  else {

        return results[1];
    }
}
//格式化日期
function formatDate(date) {
    var year= date.getFullYear();
    var month= date.getMonth() + 1;
    var date= date.getDate();
    return  year + "-" + month + "-" + date;
}

function intToDate(date) {
    var jsonDate=new Date(date*1000);
    var year= jsonDate.getFullYear();
    var month= jsonDate.getMonth() + 1;
    var date= jsonDate.getDate();
    return  year + "-" + month + "-" + date;
}

function intToDateInfo(date) {
    var jsonDate=new Date(date*1000);
    var year= jsonDate.getFullYear();
    var month= jsonDate.getMonth() + 1;
    var date= jsonDate.getDate();
    var hour = jsonDate.getHours();
    var minute = jsonDate.getMinutes();
    var seconds = jsonDate.getSeconds()
    return  year + "-" + month + "-" + date+" "+hour+":"+minute+":"+seconds;
}
