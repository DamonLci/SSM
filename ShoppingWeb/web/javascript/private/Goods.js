function showGoods(ppage) {
    $.ajax({
        url:"goodList",
        type:"post",
        dataType:"json",
        data:{
            page:ppage
        },
        success:function (data) {
            var currentPage=data.currentPage;
            var totalPage=data.totalPage;
            var goods=data.goods;
            var goodContent="";
            for(var i=0;i<goods.length;i++){
                var good=goods[i];
                goodContent+="<li class='product-item kid woman'> " +
                    "<div class='product-thumb clearfix'>" +
                    "<a href='/shop-detail.jsp?id="+good.id+"'>" +
                    " <img src='images/shop/sh-4/"+good.gpic+"'></a>" +
                    "</div><div class='product-info clearfix'>" +
                    "<span class='product-title'>"+good.gname+"</span>" +
                    "<div class='price'><ins><span class='amount'>"+good.price+"</span></ins></div></div>" +
                    "<div class='add-to-cart text-center'><a href='javascript:;' onclick='addCarts("+good.id+")'>ADD TO CART</a> </div><a href='#' class='like'>" +
                    "<i class='fa fa-heart-o'></i>" +
                    "</a></li>"

            }
            $("#goodscontent").html(goodContent);
            $("#totalpage").html(totalPage);
            $("#currentpage").html(currentPage);
        }

    });

}
showGoods(1);

function nextPage() {
    var scurrentPage=$("#currentpage").html();
    var currentPage=parseInt(scurrentPage);
    var nextPage=currentPage+1;
    var totalPage=parseInt($("#totalpage").html());
    if(nextPage<=totalPage){
        showGoods(nextPage);
    }
}
function lastPage() {
    var scurrentPage=$("#currentpage").html();
    var currentPage=parseInt(scurrentPage);
    var lastPage=currentPage-1;
    if(lastPage>0){
        showGoods(lastPage);
    }

}
function endPage() {
    var totalPage=parseInt($("#totalpage").html());
    showGoods(totalPage);
}
function startPage() {
    showGoods(1);
}