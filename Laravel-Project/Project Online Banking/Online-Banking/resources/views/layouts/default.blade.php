<?php

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Home</title>

    <link rel="stylesheet" type="text/css" href="{{asset('css/header.css')}}" media="all">
    <link rel="stylesheet" type="text/css" href="{{asset('css/footer.css')}}" media="all">

    @yield('css')

    <link rel="stylesheet" type="text/css" href="{{asset('vendors/bootstrap3.3.7/css/bootstrap.css')}}"/>
    <link rel="stylesheet" type="text/css" href="{{asset('vendors/fontawesome/css/all.css')}}"/>


</head>


<body>

@include('includes.header')

@yield('main')

@include('includes.footer')

</body>
</html>
