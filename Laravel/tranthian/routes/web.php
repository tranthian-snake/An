<?php

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| This file is where you may define all of the routes that are handled
| by your application. Just tell Laravel the URIs it should respond
| to using a Closure or controller method. Build something great!
|
*/


use App\Task;
use Illuminate\Http\Request;

Route::get('/', function () {
    return view('welcome');
});

/***
 * Show Task Dashboard
 */

Route::get('/', function () {
    //
});

/***
 * Add New Task
 */
Route::post('/task', function (){
    //
});

/***
 * Delete Task
 */
Route::delete('/task/{task}', function (Task $task){
    //
});
