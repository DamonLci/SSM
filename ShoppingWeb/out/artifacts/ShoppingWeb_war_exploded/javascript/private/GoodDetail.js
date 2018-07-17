function goodDetail() {
    $.ajax({
        url: "goodDetail",
        type: "post",
        dataType: "json",
        data: {
            goodid: $("#goodid").val(),

        },
        success: function (data) {
            var id = data.id;
            var gname = data.gname;
            var detail = data.details;
            var price = data.price;
            var details_imgs = data.detailImg;
            $("#content-detail").html(gname);
            $("#details").html(detail);
            $("#price").html(price);
            var img="<img src='images/shop/sh-detail/"+details_imgs+"'/>";
            $("#imgs-im").html(img);
            var addca="<a href='javascript:;' onclick='addCarts("+data.id+")'>ADD TO CART</a> ";
            $("#addcart").html(addca);
        }

    })
}

goodDetail()