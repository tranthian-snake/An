//snippet11
<HTML>
<BODY>
<?php
$server="";
$username="root";
$password="";
$connect_mysql=mysqli_connect($server, $username, $password);
if ($connect_mysql)
    echo "Connection established";
$mysql_db=mysqli_select_db($connect_mysql, "USER");

if ($mysql_db)
    echo "<BR><BR>Connected to the databse<BR><BR>";

echo "<TABLE BORDER BGCOLOR='WHITE'>";
echo "<TR><TH>USER_ID</TH><TH>USER_NAME</TH><TH>USER_EMAIL_ID</TH>";
echo "<DBQUERY q> SELECT * FROM USER_CONTACT";
echo "<DBROW><TR><TD><? q.USER_ID></TD><TD><? q.USER_NAME></TD><TD><? q.USER_EMAIL_ID></TD></TR>";
echo "</DBQUERY>";
echo "</TR>";
echo "</TABLE>";
?>
</BODY>
</HTML>
