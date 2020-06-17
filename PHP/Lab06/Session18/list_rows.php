//snippet3
<?php
$connect=mysqli_connect("localhost","root", "");
if ($result=mysqli_query($connect,"SELECT * FROM Employees"));
{
    $rows=mysqli_num_rows($result);
    echo "the table contains $rows rows.<br>";
}
?>
