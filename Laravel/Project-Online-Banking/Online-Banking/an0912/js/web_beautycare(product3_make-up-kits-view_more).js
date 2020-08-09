$.ajax({
    url:"data/web_beautycare(product3_make-up-kits-view_more).json",
    method:"GET",
    success:function (result) {
        var arts=result.articles;
        for (i=0;i<arts.length;i++){
            var xyz =  '<div class="content">' +
                '<h3>'+arts[i].title+'</h3>\n' +
                '<p>'+arts[i].ttspd1+'</p>\n' +""
            ;
            var description = $(".description");
            description.append(xyz);
        }
    }
});