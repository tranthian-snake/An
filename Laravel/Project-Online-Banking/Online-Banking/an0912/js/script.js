
function validateform() {
    var name = document.myform.name.value;
    var email = document.myform.email.value;
    var title = document.myform.title.value;
    var comment = document.myform.comment.value;

    if (name == null || name == "") {
        alert("Name can't be blank");
        return false;
    } else if (email == null || email == "") {
        alert("Email can't be blank");
        return false;
    } else if (title.length < 10) {
        alert("Title must be at least 10 characters long.");
        return false;
    } else if (comment.length < 10) {
        alert("Comment must be at least 10 characters long.");
        return false;
    }
}
