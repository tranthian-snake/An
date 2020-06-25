<?php
if (isset($_POST['submit'])) {
    $fullname = $_POST['fullname'];
    $email = $_POST['email'];
    $usernames = $_POST['username'];
    $passwords = $_POST['password'];
    $hash = password_hash($passwords, PASSWORD_DEFAULT);
    include_once "login.php";
    $sql = "SELECT * FROM customer;";
    $stmt = mysqli_stmt_init($conn);
    if (!mysqli_stmt_prepare($stmt, $sql)) {
        echo "SQL statement failed!";
    } else {
        mysqli_stmt_execute($stmt);
        $result = mysqli_stmt_get_result($stmt);
        $sql = "INSERT INTO customer (fullname, email, username, password) VALUES (?,?,?,?);";
        if (!mysqli_stmt_prepare($stmt, $sql)) {
            echo "SQL statement failed!";
        } else {
            mysqli_stmt_bind_param($stmt, "ssss", $fullname, $email, $usernames, $passwords);
            mysqli_stmt_execute($stmt);
        }
    }
}
