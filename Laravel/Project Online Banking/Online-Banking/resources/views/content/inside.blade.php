<?php

?>

@extends('layouts.default')

@section('css')
    <link rel="stylesheet" type="text/css" href="{{asset('css/inside.css')}}" media="all">
@endsection

@section('main')
    <section class = "transaction-inside col-xs-12 col-md-12">
        <div class = "container">
            <div class = "row">
                <form action="#">
                    {{csrf_field()}}
                    <label for="user">Account:</label><br>
                    <input list="user">
                    <datalist id="user">
                        <option value="19034908954011">
                        <option value="19034908954011">
                        <option value="19034908954011">
                        <option value="19034908954011">
                    </datalist><br>
                    <ul>
                        <li>VND-TGTT-HQNM</li>
                        <li>19034908954011</li>
                        <li>VND: 1,443,387</li>
                    </ul>
                    <label for="receiver">Transfer to:</label><br>
                    <input type="text" id="receiver" name="receiver" required><br><br>
                    <label for="money">VND:</label><br>
                    <input type="text" id="money" name="money" required><br><br>
                    <label for="message">Message Info:</label><br>
                    <textarea type="text" id="message" name="message" rows="3" cols="50" required></textarea><br>
                    <input id = "submit" type="submit" value="Submit">
                </form>
            </div>
        </div>
    </section>
@endsection


