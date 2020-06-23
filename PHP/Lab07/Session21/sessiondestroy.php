//snippet4
<?php
session_start();
$myname=$_SESSION['myname'];
// The session_unset() function unregisters a session variable.
session_unset();
session_destroy();
echo "Session destroyed!"
?>
<HTML>
<HEAD> <TITLE> Session </TITLE> </HEAD>
<BODY>
<br>
<A HREF="mypage.php"> Homepage of MyPage.com </A>
</BODY>
</HTML>
