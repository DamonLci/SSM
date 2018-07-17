function login(){
    $.ajax({
        url:"/login",
        type:"post",
        dataType:"json",
        data:{
            account:$("#account").val(),
            pass:$("#pass").val(),
            code:$("#code").val()
        },
        success:function(data){
            $("#mes").html(data);
            //alert(data);
            if(data == "登录成功！"){
                //window.location.href="index.jsp";
            }
        }
    });
}