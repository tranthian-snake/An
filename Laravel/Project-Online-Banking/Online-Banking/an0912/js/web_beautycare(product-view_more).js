$.ajax({
    url:"data/web_beautycare(product-view_more).json",
    method:"GET",
    success:function (result) {
        var arts=result.articles;
        for (i=0;i<arts.length;i++){
            var xyz =  '<div class="content">' +
                '<h3>'+arts[i].title+'</h3>\n' +
                '<p>'+arts[i].ttspd1+'</p>\n' +
                '<p>'+arts[i].ttspd2+'</p>\n' +
                '<p>'+arts[i].ttspd3+'</p>\n'+''
            ;
            var description = $(".description");
            description.append(xyz);
        }
    }
});