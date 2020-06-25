<?php
$_SESSION['username'] = "Admin";
?>
<HTML>
<HEAD><TITLE>Welcome</TITLE></HEAD>
<BODY>
<H4>
    <?php
    include_once "upload.php";
    echo "Welcome $fn !" ;
    ?>
</H4>
</BODY>
</HTML>