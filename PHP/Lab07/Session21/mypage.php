//snippet3
<?php
session_start();
$myname= $_SESSION['myname'];
?>
<HTML>
<HEAD> <TITLE> Homepage </TITLE> </HEAD>
<BODY>
Welcome <?php echo $myname ?> to MyPage.com <br>
</BODY>
</HTML>
