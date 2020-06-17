<?php
$server="";
$username="root";
$password="";
$connect_mysql=mysqli_connect($server, $username, $password);
if ($connect_mysql)
{
    echo "Connection established<br>";
}
else
{
    die("Unable to connect<br>");
}
$sql_disp=("SELECT * FROM customers;");
echo "<br>Displaying Records from the customers table:<br>";
$result=mysqli_query($connect_mysql, $sql_disp);
while ($row=mysqli_fetch_array($result))
{
    echo "$row[name]";
    echo "$row[isbn] <br>";
}
?>