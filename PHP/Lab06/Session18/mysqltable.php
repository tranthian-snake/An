//snippet6
<?php
$server="";
$username="root";
$password="";
$connect_mysql=mysqli_connect($server, $username, $password ='USER');
if ($connect_mysql)
{
    echo "Connection established";
}
else
{
    die("Unable to connect<BR>");
}
$mysql_db=mysqli_select_db($connect_mysql, "USER");
if ($mysql_db)
{
    echo "Connected to the database<BR>";
}
else
{
    die("Unable to connect to the database<BR>");
}
$sql_table="CREATE TABLE USER_CONTACT("."USER_ID INT NOT NULL PRIMARY KEY, "."USER_NAME CHAR(25) NOT NULL
, "."USER_EMAIL_ID CHAR(25)".")";

if (mysqli_query($connect_mysql, $sql_table))
{
    echo "Table is created<BR>";
}
else
{
    die("Unable to create the table<BR>");
}
?>
