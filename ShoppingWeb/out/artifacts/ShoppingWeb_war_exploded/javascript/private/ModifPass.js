function login(){
    $.ajax({
        url:"/modifyPass",
        type:"post",
        dataType:"json",
        data:{
            pass:$("#pass").val(),
            newpass:$("#newpass").val(),
            confnewpass:$("#confnewpass").val(),
            code:$("#code").val()
        },
        success:function(data){
            $("#mes").html(data);
            if(data == "修改成功！"){

            }
        },
        error:function(xhr){alert(xhr.responseText)}
    });
}