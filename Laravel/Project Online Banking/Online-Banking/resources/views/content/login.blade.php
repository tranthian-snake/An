<?php

?>

@extends('layouts.default')

@section('css')
    <link rel="stylesheet" type="text/css" href="{{asset('css/login.css')}}" media="all">
@endsection

@section('main')
    <section class = "account-login text-center col-xs-12 col-md-12">
        <div class = "container">
            <div class = "row">
                {{csrf_field()}}
                <form class = "col-xs-12 col-md-12 text-center" action="#">
                    <label for="account-name">Account/ Phone's Number:</label><br>
                    <input type="text" id="account-name" name="account-name" required><br><br>
                    <label for="account-password">Account's Password</label><br>
                    <input type="password" id="account-password" name="account-password" required><br><br>
                    <input id = "submit" type="submit" value="Login">
                </form>

                <h2 href = "user-create.html">New to our services? Create new Account.</h2>

                <h3 href = "#">Forgot your password?</h3>
            </div>
        </div>
    </section>
@endsection


