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
use App\Gallery;
use Illuminate\Http\Request;

Route::get('/', function () {
    return view('index');
});

Route::get('/cases', function () {
    return view('cases');
});

Route::get('/index', function () {
    return view('index');
});

Route::get('/case1', function () {
    return view('case1');
});
Route::get('/gallery', function () {
    return view('gallery');
});
Route::get('/gallery-upload', function () {
    return view('gallery-upload');
});

Route::post('/upload', function (Request $request){
    //validate information
    $validator= Validator::make($request->all(), [
        'name' => 'required|max:255',
        'orderGallery' => 'required|max:11',
    ]);

    if ($validator->fails()){
        return redirect('/')
            ->withInput()
            ->withErrors($validator);
    }

    $task = new Gallery;
    $task->name = $request ->name;
    $task->save();

    return redirect('/');
});

Route::get('/show', function () {
    $tasks= Task::orderBy('titleGallery', 'imgFullNameGallery','descGallery')->get();

    return view('gallery', [
        'gallery' => $tasks
    ]);
});

