function register(){
    $.ajax({
        url:"/register",
        type:"post",
        dataType:"json",
        data:{
            account:$("#account").val(),
            pass:$("#pass").val(),
            repass:$("#repass").val(),
            code:$("#code").val()
        },
        success:function(data){
            $("#mes").html(data);

            if(data == "注册成功"){
                window.location.href="/login.jsp";
            }
        }
    });
}