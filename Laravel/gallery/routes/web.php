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
    $tasks= Gallery::orderBy('created_at', 'desc')->get();

    return view('tasks', [
        'tasks' => $tasks
    ]);
});

Route::post('/upload', function (Request $request){
    //validate information
    $validator= Validator::make($request->all(), [
        'filename' => 'required|max:255',
    ]);

    if ($validator->fails()){
        return redirect('/')
            ->withInput()
            ->withErrors($validator);
    }

    $task = new Gallery;
    $task->imgFullNameGallery = $request ->file;
    $task->titleGallery = $request ->filetitle;
    $task->descGallery = $request ->filedesc;
    $rowCount=0;
    $task->orderGallery = $rowCount + 1;
    $task->save();

    return redirect('/');
});

Route::get('/gallery1', function () {
    return view('gallery1');
});
