<?php
?>

@extends('layouts.default')

@section('css')
    <link rel="stylesheet" type="text/css" href="{{asset('css/success.css')}}" media="all">
@endsection

@section('main')
    <section class = "transaction-confirm text-center col-xs-12 col-md-12">
        <div class = "container">
            <div class = "row">

                <div class = "receiver-info col-xs-12 col-md-12">
                    <h1>The money was sent to</h1>
                    <h2>005982759201089</h2>
                    <h3>Nguyen Van A</h3>
                </div>

                <table class = "table tab-content table-striped text-center col-xs-12 col-md-12">
                    <tr>
                        <td class = "table-head">Total money:</td>
                        <td>VND: 152,000</td>
                    </tr>
                    <tr>
                        <td class = "table-head">Transaction Fee:</td>
                        <td>VND: 0</td>
                    </tr>
                    <tr>
                        <td class = "table-head">Transaction code:</td>
                        <td>2315123123125</td>
                    </tr>
                </table>

                <div class = "done-button col-xs-12 col-md-12">
                    <button class = "submit" >New Transaction</button><br>
                    <button class = "submit" >Home</button>
                </div>
            </div>
        </div>
    </section>
@endsection
