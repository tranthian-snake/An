<?php

?>

@extends('layouts.default')

@section('css')
    <link rel="stylesheet" type="text/css" href="{{asset('css/outside.css')}}" media="all">
@endsection

@section('main')
    <section class = "transaction-outside col-xs-12 col-md-12">
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
                    <label for="bank">Choose the bank:</label><br>
                    <input list="bank">
                    <datalist id="bank">
                        <option value="Vietinbank">
                        <option value="Techcombank">
                        <option value="PVBank">
                        <option value="VCBank">
                    </datalist><br>
                    <label for="branch">Choose the branch:</label><br>
                    <input list="branch">
                    <datalist id="branch">
                        <option value="Vietinbank-HQ">
                        <option value="Techcombank-HQ">
                        <option value="PVBank-HQ">
                        <option value="VCBank-HQ">
                    </datalist><br>
                    <label for="receiver">Transfer to:</label><br>
                    <input type="text" id="receiver" name="receiver" required><br><br>
                    <label for="money">VND:</label><br>
                    <input type="text" id="money" name="money" required><br><br>
                    <label for="message">Message Info:</label><br>
                    <textarea type="text" id="message" name="message" rows="5" cols="50" required></textarea><br>
                    <input id = "submit" type="submit" value="Submit">
                </form>
            </div>
        </div>
    </section>
@endsection


