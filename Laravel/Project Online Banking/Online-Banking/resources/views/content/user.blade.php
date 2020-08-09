<?php
?>

@extends('layouts.default')

@section('css')
    <link rel="stylesheet" type="text/css" href="{{asset('css/user.css')}}" media="all">
@endsection

@section('main')
    <section class = "user-tab col-xs-12 col-md-12">
        <div class = "container">
            <div class = "row">
                <div class = "menu-list">
                    <ul class = "col-xs-12 col-md-12">
                        <li class = "col-xs-2 col-md-2"><a href = "#">Accounts</a></li>
                        <li class = "col-xs-2 col-md-2"><a href = "#">Transaction</a></li>
                        <li class = "col-xs-2 col-md-2"><a href = "#">Bills</a></li>
                        <li class = "col-xs-2 col-md-2"><a href = "#">Borrowing</a></li>
                        <li class = "col-xs-2 col-md-2"><a href = "#">Cards</a></li>
                        <li class = "col-xs-2 col-md-2"><a href = "#">Savings</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </section>

    <section class = "col-xs-12 col-md-12">
        <div class = "container">
            <div class = "row">
                <!--            Main page-->
                <div id="main_page" class = "section1 col-xs-12 col-md-12">

                    <!--                Login info-->
                    <div class = "login_info col-xs-3 col-md-3">
                        <ul>
                            <li><a href = "#"><i class="fas fa-user"></i>Login history</a></li>
                            <li><a href = "#"><i class="far fa-id-card"></i>Information change</a></li>
                            <li><a href = "#"><i class="fas fa-lock"></i>Password Manage</a></li>
                            <li><a href = "#"><i class="fas fa-envelope"></i>Inbox</a></li>
                            <li><a href = "#"><i class="fas fa-search"></i>Search</a></li>
                        </ul>
                    </div>

                    <!--                Account info-->
                    <div class = "account_info col-xs-5 col-md-5">

                        <!--                    List the account-->
                        <div class = "money-table col-xs-12 col-md-12">
                            <table class = "table-striped text-center col-xs-12 col-md-12">
                                <tr>
                                    <th>Account number</th>
                                    <th>Currency</th>
                                    <th>Current Balance</th>
                                </tr>
                                <tr>
                                    <td>19034908954011</td>
                                    <td>VND</td>
                                    <td>20.000.000</td>
                                </tr>
                                <tr>
                                    <td>19034908954011</td>
                                    <td>VND</td>
                                    <td>20.000.000</td>
                                </tr>
                                <tr>
                                    <td>19034908954011</td>
                                    <td>VND</td>
                                    <td>20.000.000</td>
                                </tr>
                            </table>
                            <button class = "submit"><a href = "#">Transaction Manage</a></button>
                        </div>

                        <!--                    Check the transaction for specific account-->
                        <div class = "money-checking hidden col-xs-12 col-md-12">
                            <form class = "col-xs-12 col-md-12">
                                <!--                            Select Account-->
                                <div class = "col-xs-12 col-md-12">
                                    <h2>Select your account</h2>
                                    <input class = "datalist col-xs-12 col-md-12" list="account-card">
                                    <datalist id="account-card">
                                        <!--                                Lam 1 bang data lien ket voi database de hien ra cac tai khoan dang so huu-->
                                        <option value="19202938271">
                                        <option value="19202938123">
                                    </datalist>
                                </div>


                                <!--                            Choose the transaction-->
                                <!--                            Hien ra thong tin cua tai khoan duoc chon o tren bang data-->
                                <div class= "col-xs-12 col-md-12">
                                    <h3>Account:</h3><p>25614123132</p>
                                    <h3>Current balance:</h3><p>252132312</p>
                                    <table class = "text-center col-xs-12 col-md-12">
                                        <tr>
                                            <th>Transaction ID</th>
                                            <th>Type</th>
                                            <th>Date</th>
                                        </tr>
                                        <tr>
                                            <td>123912121212</td>
                                            <td>Debit</td>
                                            <td>20/11/2020</td>
                                        </tr>
                                    </table>
                                </div>

                                <div class = "col-xs-12 col-md-12">
                                    <h2>Select your transaction</h2>
                                    <!--                            Chon khoang thoi gian/ kieu giao dich ma minh muon tim kiem-->
                                    <input type="radio" id="trans1" name="transactions" value="10-transactions">
                                    <label for="trans1">Last 10 transactions</label><br>
                                    <input type="radio" id="trans2" name="transactions" value="1-months-transactions">
                                    <label for="trans2">Transaction in 1 months</label><br>
                                    <input type="radio" id="trans3" name="transactions" value="3-months-transactions">
                                    <label for="trans3">Transaction in 3 months</label>
                                    <div class = "col-xs-12 col-md-12 text-right">
                                        <button class = "download">Download</button>
                                        <button class = "submit">Submit</button>
                                    </div>
                                </div>
                            </form>

                            <div class = "col-xs-12 col-md-12">
                                <!--                        Choose the date for a specific transaction-->
                                <form class = "col-xs-12 col-md-12">
                                    <h2>Transaction search</h2>
                                    <!--                            Khoang thoi gian cu the duoc chon theo ngay/thang/nam-->

                                    <table class = "text-center table-striped col-xs-12 col-md-12">
                                        <tr>
                                            <th>From</th>
                                            <th>To</th>
                                            <th>Min</th>
                                            <th>Max</th>
                                        </tr>
                                        <tr>
                                            <td>1/1/2011</td>
                                            <td>2/1/2011</td>
                                            <td>1.000.000</td>
                                            <td>2.000.000</td>
                                        </tr>
                                    </table>
                                    <div class = "col-xs-12 col-md-12 text-right">
                                        <button class = "download">Download</button>
                                        <button class = "submit">Submit</button>
                                    </div>

                                </form>
                            </div>
                        </div>

                        <!--                    Paying the bill-->
                        <div class = "money-bills hidden col-xs-12 col-md-12">
                            <ul>
                                <li a href = "#">Nạp tiền di động trả trước</li>
                                <li a href = "#">Nạp tiền di động trả sau</li>
                                <li a href = "#">EVN</li>
                                <li a href = "#">FPT</li>
                            </ul>
                        </div>

                        <!--                    Paying the loan-->
                        <div class = "money-loan hidden col-xs-12 col-md-12">
                            <table class = "table-striped text-center col-xs-12 col-md-12">
                                <tr>
                                    <th>Contact Number</th>
                                    <th>Due Date</th>
                                    <th>Current Loan</th>
                                    <th>Rates(%/year)</th>
                                </tr>
                                <tr>
                                    <td>19034908954011</td>
                                    <td>20/11/2020</td>
                                    <td>20.000.000</td>
                                    <td>10%</td>
                                </tr>
                            </table>
                            <button class = "submit"><a href = "#">Paying the loan</a></button>
                        </div>

                        <!--                    Check the cards in possesion-->
                        <div class = "money-cards hidden col-xs-12 col-md-12">
                            <table class = "table-striped text-center col-xs-12 col-md-12">
                                <tr>
                                    <th>Card Number</th>
                                    <th>Rank</th>
                                    <th>Card due</th>
                                    <th>Current Balance</th>
                                </tr>
                                <tr>
                                    <td>19034908954011</td>
                                    <td>Debit</td>
                                    <td>20/11/2020</td>
                                    <td>50.000.000</td>
                                </tr>
                            </table>
                            <button class = "submit"><a href = "#">Paying the loan</a></button>
                        </div>

                        <!--                    Check the money saving-->
                        <div class = "money-savings hidden col-xs-12 col-md-12">
                            <div class = "col-xs-12 col-md-12">
                                <h2>Online Savings</h2>
                                <table class = "table-striped text-center col-xs-12 col-md-12">
                                    <tr>
                                        <th>Contact Number</th>
                                        <th>Due Date</th>
                                        <th>Current Loan</th>
                                        <th>Rates(%/year)</th>
                                    </tr>
                                    <tr>
                                        <td>19034908954011</td>
                                        <td>20/11/2020</td>
                                        <td>20.000.000</td>
                                        <td>10%</td>
                                    </tr>
                                </table>
                            </div>
                            <div class = "col-xs-12 col-md-12">
                                <h2>Bank Saving</h2>
                                <table class = "table-striped text-center col-xs-12 col-md-12">
                                    <tr>
                                        <th>Contact Number</th>
                                        <th>Due Date</th>
                                        <th>Current Loan</th>
                                        <th>Rates(%/year)</th>
                                    </tr>
                                    <tr>
                                        <td>19034908954011</td>
                                        <td>20/11/2020</td>
                                        <td>20.000.000</td>
                                        <td>10%</td>
                                    </tr>
                                </table>
                            </div>
                        </div>
                    </div>

                    <!--                Help Support-->
                    <div class = "help col-xs-4 col-md-4">
                        <div class = "help-menu col-xs-12 col-md-12">
                            <ul class = "col-xs-12 col-md-12">
                                <li><a href ="#">How to use</a></li>
                                <li><a href ="#">ATM location</a></li>
                                <li><a href ="#">OnlineBanking Discover</a></li>
                                <li><a href ="#">Investment Rates</a></li>
                                <li><a href ="#">Security Rates</a></li>
                            </ul>
                        </div>

                        <div class = "help-menu col-xs-12 col-md-12">
                            <ul class = "col-xs-12 col-md-12">
                                <li><a href = "#">Transaction</a></li>
                                <li><a href = "#">24/7 Transaction</a></li>
                                <li><a href = "#">Investment</a></li>
                                <li><a href = "#">Phone Recharge</a></li>
                                <li><a href = "#">Credit Loans</a></li>
                            </ul>
                        </div>
                    </div>

                </div>


            </div>
        </div>
    </section>

@endsection



