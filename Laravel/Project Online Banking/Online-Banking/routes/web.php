<?php

use Illuminate\Support\Facades\Route;
use App\Task;
use Illuminate\Http\Request;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/


Route::get('/', function () {
    return view('content.home');
});

Route::get('/user', function () {
    return view('content.user');
});

Route::get('/blog', function(){
    return view('content.blog');
});

Route::get('/create',function(){
    return view('content.create');
});

Route::get('/login',function(){
    return view('content.login');
});

Route::get('/inside',function(){
    return view('content.inside');
});

Route::get('/outside',function(){
    return view('content.outside');
});

Route::get('/success',function(){
    return view('content.success');
});

Route::get('/careers', function () {
    return view('content.careers');
});

Route::get('/community', function () {
    return view('content.community');
});
