<HTML>
<BODY>
<?php
error_reporting(0);
$multi="/usr/local/apache2/htdocs/email_list.txt";
$to_email=file('$email_list.txt');
$from="yourname@example.com";

for ($i=0; $i<count($to_email); $i++)
{
    $to_email[$i]=trim($to_email[$i]);
    $to=implode(",", $to_email);
    $subject="An example";
    $body="This is an example for the mail() function.";
    $send=mail($to, $subject, $body, $from);
    echo "Mail was sent to all the address!!!";
}
?>
</BODY>
</HTML>