<?php
?>

@extends('layouts.default')

@section('css')
    <link rel="stylesheet" type="text/css" href="{{asset('css/community.css')}}" media="all">
@endsection
@section('main')
    <section class = "intro col-xs-12 col-md-12">
        <div class = "container">
            <div class = "row">
                <div class = "intro-content col-xs-8 col-md-8">
                    <h1>Meet the OnlineBanking Community</h1>
                    <h2>Our community is the heart and soul of everything we do.
                        Join it and help us to build the bank you’ve always dreamed of.</h2>
                    <button href = "#">Visit the community forum</button>
                </div>
                <div class = "col-xs-4 col-md-4">

                </div>
            </div>
        </div>
    </section>

    <section class = "body-events col-xs-12 col-md-12">
        <div class = "container">
            <div class = "row">
                <div class = "body-content col-xs-6 col-md-6">
                    <h1>Events</h1>
                    <h2>We want to meet you! We often host events inviting team members from
                        across the company to share what they’re working on. Join the discussion,
                        ask the the burning questions you’ve always wanted to, and enjoy sneak
                        peeks you won’t find anywhere else.</h2>
                    <button href = "#">See our events</button>
                </div>
                <div class = "body-images text-right col-xs-6 col-md-6">
                    <img src = "{{asset('images/community(events).jpg')}}" height="100%" width="95%">
                </div>
            </div>
        </div>
    </section>

    <section class = "body col-xs-12 col-md-12">
        <div class = "container">
            <div class = "row">

                <div class = "body-images text-left col-xs-6 col-md-6">
                    <img src = "{{asset('images/community(social-media).jpg')}}" height="100%" width="95%"/>
                </div>

                <div class = "body-content col-xs-6 col-md-6">
                    <h1>Join us on social media</h1>
                    <h2>Follow us on <a href="#">Twitter</a>, <a href="#">Facebook</a> and
                        <a href="#">Instagram</a> to see what we're up to and join the conversation.
                        <br><br>And if you're working towards a savings goal, join our community of savers
                        in the <a href="#">OnlineBanking Saving Squad</a> Facebook group.</h2>
                </div>
            </div>
        </div>
    </section>

@endsection