function addCarts(gid) {
    $.ajax({
        url:"/User/addCart",
        type:"post",
        dataType: "json",
        data: {
            goodid: gid,
        },
        success:function (data) {
            alert(data);
        }
    })
}