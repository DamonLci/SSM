function CartList() {
    $.ajax({
        url:"/User/CartList",
        type:"post",
        dataType: "json",
        data: {
        },
        success:function (data) {
            var goods=data.viewCartPos;
            var goodContent="";
            for(var i=0;i<data.length;i++){
                var good=data[i];
                goodContent+="<li class='product-item kid woman'> " +
                    "<div class='product-thumb clearfix'>" +
                    "<a href='/shop-detail.jsp?id="+good.gid+"'>" +
                    " <img src='../images/shop/sh-4/"+good.gpic+"'></a>" +
                    "</div><div class='product-info clearfix'>" +
                    "<span class='product-title'>"+good.gname+"</span>" +
                    "<div class='price'><ins><span class='amount' >"+good.price+"</span></ins></div></div>" +
                    "<span class='product-title' id='amount'>"+good.amount+"</span>个"+
                    "<div class='product-pagination text-center margin-top-11 clearfix'>"+
                    " <ul class='flat-pagination'>"+
                    "<li class='prev'>"+
                    "  <a href='javascript:;' onclick='Update("+good.gid+")'><i class='fa fa-angle-left'></i></a>"+
                    " </li>"+
                    " <li><a href='javascript:;' onclick='ReduceCart("+good.gid+")'><i class='fa fa-angle-right'></i></a></li>"+
                    " </ul>"+
                    "  </div>"

            }
            $("#carlist").html(goodContent);
        }
    });
}


CartList();

function ReduceCart(gid) {
    $.ajax({
        url:"/User/Reduce",
        type:"post",
        dataType: "json",
        data: {
            goodid: gid,
        },
        success:function (data) {
            $("#amount").html(data);
        }
    })
}
function Update(gid) {
    $.ajax({
        url:"/User/Update",
        type:"post",
        dataType: "json",
        data: {
            goodid: gid,
        },
        success:function (data) {
            $("#amount").html(data);
        }
    })
}
function checkout() {
    $.ajax({
        url:"/User/CheckOut",
        type:"post",
        dataType:"json",
        data:{

        },
        success:function (data) {
            $("#mess").html(data);
        }
    })
}