<?php
?>

@extends('layouts.default')

@section('css')
    <link rel="stylesheet" type="text/css" href="{{asset('css/home.css')}}" media="all">
@endsection

@section('main')
    <section class = "intro col-xs-12 col-md-12">
        <div class = "container">
            <div class = "row">
                <div class = "intro-content col-xs-6 col-md-6">
                    <h1>Banking made easy</h1>
                    <h2>Spend, save and manage your money, all in one place.
                        Open a full UK bank account from your phone, for free.</h2>
                    <button href = "#">Get a Bank account now</button>
                </div>
                <div class = "col-xs-6 col-md-6">

                </div>
            </div>
        </div>
    </section>

    <!--Web services-->
    <section class = "services col-xs-12 col-md-12">
        <div class = "container">
            <div class = "row">
                <div class = "services-content col-xs-6 col-md-6">
                    <h1>Get paid... a day early</h1>
                    <h2>Put your salary into OnlineBanking and we can advance you the cash one day early.
                        No cost, no hassle. Just more time with your money.</h2>
                    <button href = "#">Find out more</button>
                </div>
                <div class = "services-images text-right col-xs-6 col-md-6">
                    <img src = "{{asset('images/home(nhận%20tiền)3.png')}}">
                </div>
            </div>
        </div>
    </section>

    <section class = "services col-xs-12 col-md-12">
        <div class = "container">
            <div class = "row">

                <div class = "services-images text-left col-xs-6 col-md-6">
                    <img src = "{{asset('images/home(sắp%20xếp)5.png')}}">
                </div>

                <div class = "services-content col-xs-6 col-md-6">
                    <h1>Salary Sorter</h1>
                    <h2>Sort your money between savings, bills and spending in a few taps.
                        All your money neatly separated so you can't overspend, but still under one roof.</h2>
                    <button href = "#">Find out more</button>
                </div>
            </div>
        </div>
    </section>

    <section class = "services col-xs-12 col-md-12">
        <div class = "container">
            <div class = "row">
                <div class = "services-content col-xs-6 col-md-6">
                    <h1>Bills Pots</h1>
                    <h2>Pick a Pot to pay bills from, so you can't accidentally spend the rent.
                        When a bill is due, we pay it from the Pot for you – easy.</h2>
                    <button href = "#">Bills with OnlineBanking</button>
                </div>
                <div class = "services-images text-right col-xs-6 col-md-6">
                    <img src = "{{asset('images/home(lợn)5.png')}}">
                </div>
            </div>
        </div>
    </section>

    <section class = "services col-xs-12 col-md-12">
        <div class = "container">
            <div class = "row">

                <div class = "services-images text-left col-xs-6 col-md-6">
                    <img src = "{{asset('images/home(quản%20lý)5.png')}}">
                </div>

                <div class = "services-content col-xs-6 col-md-6">
                    <h1>Manage</h1>
                    <h2>Pay Direct Debits through OnlineBanking and we’ll tell you
                        if they’re higher for the upcoming month. So no nasty surprises.</h2>
                </div>
            </div>
        </div>
    </section>

    <section class = "services col-xs-12 col-md-12">
        <div class = "container">
            <div class = "row">


                <div class = "services-content col-xs-6 col-md-6">
                    <h1>Spend</h1>
                    <h2>Get instant notifications the second you pay. Set budgets for things like groceries and going out,
                        and get warnings if you’re spending too fast (if you want them).</h2>
                </div>

                <div class = "services-images text-right col-xs-6 col-md-6">
                    <img src = "{{asset('images/home(thanh%20toán)5.png')}}">
                </div>
            </div>
        </div>
    </section>

    <section class = "services col-xs-12 col-md-12">
        <div class = "container">
            <div class = "row">
                <div class = "services-images text-left col-xs-6 col-md-6">
                    <img src = "{{asset('images/home(du%20lịch)5.png')}}">
                </div>
                <div class = "services-content col-xs-6 col-md-6">
                    <h1>Travel</h1>
                    <h2>Use OnlineBanking anywhere in the world that accepts Mastercard.
                        We don’t charge any fees for spending abroad,
                        and we don’t mark up the exchange rate – unlike most other banks.</h2>
                    <button href = "#">Travelling with OnlineBanking</button>
                </div>

            </div>
        </div>
    </section>

    <section class = "services col-xs-12 col-md-12">
        <div class = "container">
            <div class = "row">


                <div class = "services-content col-xs-6 col-md-6">
                    <h1>Borrow</h1>
                    <h2>We offer overdrafts up to £500 and loans up to £3,000.
                        Checking if you're eligible won't leave a mark on your credit score,
                        there are no lengthy forms to fill in, and no charges for paying us back early.</h2>
                    <button href = "#">Borrowing with OnlineBanking</button>
                </div>


                <div class = "services-images text-right col-xs-6 col-md-6">
                    <img src = "{{asset('images/home(cho%20vay)5.png')}}">
                </div>

            </div>
        </div>
    </section>

    <section class = "services col-xs-12 col-md-12">
        <div class = "container">
            <div class = "row">

                <div class = "services-images text-left col-xs-6 col-md-6">
                    <img src = "{{asset('images/home(bao%20ve).png')}}">
                </div>

                <div class = "services-content col-xs-6 col-md-6">
                    <h1>Stay Safe</h1>
                    <h2>Your money in Online is FSCS protected up to £85,000. Compared to other UK banks,
                        we’re 4x better at stopping card fraud, and 3x better at stopping identity theft.</h2>
                    <button href = "#">Find out more</button>
                </div>
            </div>
        </div>
    </section>

@endsection



