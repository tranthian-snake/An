<?php

?>

@extends('layouts.default')

@section('css')
    <link rel="stylesheet" type="text/css" href="{{asset('css/create.css')}}" media="all">
@endsection

@section('main')
    <section class = "user-create col-xs-12 col-md-12">
        <div class = "container">
            <div class = "row">
                <form action = "#">
                    {{csrf_field()}}
                    <label for="first-name">First Name:</label><br>
                    <input type="text" id="first-name" name="first-name" required><br><br>

                    <label for="last-name">Last Name:</label><br>
                    <input type="text" id="last-name" name="last-name" required><br><br>

                    <label for="sex">Sex:</label><br>
                    <select type="text" id="sex" name="sex" required><br><br>
                        <option value="male">Male</option>
                        <option value="female">Female</option>
                    </select><br><br>

                    <label for="birthday-time">Birthday (date and time):</label><br>
                    <input type="date" id="birthday-time" name="birthday-time"><br><br>

                    <label for="citizen-id">Citizen ID:</label><br>
                    <input type="number" id="citizen-id" name="citizen-id" maxlength="12" required><br><br>

                    <label for="email">Email:</label><br>
                    <input type="email" id="email" name="email" required><br><br>

                    <label for="phone">Phone:</label><br>
                    <input type="tel" id="phone" name="phone" placeholder="012345678900"
                           pattern="[0-9]{12}" title="Phone number with the giving pattern(12 numbers)"  required><br><br>

                    <label for="address">Address:</label><br>
                    <input type="text" id="address" name="address" required><br><br>

                    <input id = "submit" type="submit" value="Submit">
                </form>
            </div>
        </div>
    </section>
@endsection


