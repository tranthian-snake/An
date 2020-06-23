<?php
$username='thidk';
$password='123';
if (isset($_COOKIE['PHP_AUTH_USER']) &
isset($_COOKIE['PHP_AUTH_PW']))
{
    if ($_COOKIE['PHP_AUTH_USER']===$username&
        $_COOKIE['PHP_AUTH_PW']===$password)
        echo "You are now logged in";
    else
        die("Invalid username/password combination");
}
else
{
    header('WWW-Authenticate: Basic realm="Restriction Area"');
    header('HTTP/1.0 401 Unauthorized');
    die("Please enter your username and password");
}
?>
