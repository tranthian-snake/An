<!DOCTYPE html>
<html>
<head>
    <title></title>
</head>
<body>
<p></p>
<p></p>
<?php
$test= 'false';
if (isset($_COOKIE['test'])) $test=$_COOKIE['test'];
echo "<p><b>The value of the cookie 'test' is: $test</b></p>";
setcookie('test', 'I love cookies');

//set the cookie
setcookie("cookie[three]", "cookiethree");
setcookie("cookie[two]", "cookietwo");
setcookie("cookie[one]", "cookieone");

// after the page reloads, print them out
if (isset($_COOKIE['cookie']))
{
    foreach ($_COOKIE['cookie'] as $name=> $value)
    {
        $name= htmlspecialchars($name);
        $value= htmlspecialchars($value);
        echo "$name ";
    }
}
?>
</body>
</html>
