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

use App\Post;

//Route::get('/', 'HomeController@showWelcome');

Route::get('/', function () {
    return view('welcome');
});

Route::get('profile/{name}', 'ProfileController@showProfile');

Route::get('home', 'HomeController@showWelcome');
Route::get('about', 'AboutController@showDetails');

//Route::get('about', function (){
//    return 'About Content';
//});

Route::get('about/directions', array('as' => 'directions', function (){
    $theURL = URL::route('directions');
    return "Directions go to this URL: $theURL";
}));

//Route:any('submit-form', function (){
//    return 'Process Form';
//});

Route::any('submit-form', function (){
    return 'Process Form';
});

//Route::get('about/{theSubject}', function ($theSubject){
//    return $theSubject . ' content goes here';
//});


Route::get('about/{theSubject}', 'AboutController@showSubject');

Route::get('about/classes/{theSubject}', function ($theSubject){
    return "Content on $theSubject" ;
});

Route::get('about/classes/{theArt}/{thePrice}', function ($theArt, $thePrice){
    return "The product: $theArt and $thePrice" ;
});

Route::get('where', function (){
//    return Redirect::to('about/directions') ;
    return Redirect::route('directions') ;
});

Route::get('/insert', function (){
    DB::insert('insert into posts(title, body, is_admin) values(?,?,?)', ['PHP with Laravel', 'Laravel is the best fremework !', 0]);
    return 'DONE';
});

Route::get('/read', function (){
    $result=DB::select('select * from posts where id = ?', [1]);
//    return $result;
    foreach ($result as $post){
        return $post->body;
    }
});

Route::get('update', function (){
    $updated=DB::update('update posts set title = "New Title hihi" where id > ?', [1]);
    return $updated;
});

Route::get('delete', function (){
    $deleted=DB::delete('delete from posts where id = ?',[3]);
    return $deleted;

});



//Đọc dữ liệu ORM
Route::get('readAll', function (){
    $posts= Post::all();
    foreach ($posts as $p){
//        return $p->title;
        echo $p->title . " " . $p->body;
        echo "<br>";
    }
});


//Tìm kiếm bản ghi
Route::get('findId', function (){
    $posts=Post::where('id','>=',1)
        ->where('title', 'PHP with Laravel')
        ->where('body', 'like', '%la%')
        ->orderBy('id', 'desc')
        ->take(10)
        ->get();
    foreach ($posts as $p) {
        echo $p->title;
        echo "<br>";
    }

});


//Thêm mới bản ghi
Route::get('insertORM', function (){
    $p= new Post;
    $p->title='insert ORM';
    $p->body='INSERTED done done ORM';
    $p->is_admin=1;
    $p->save();
});


//Cập nhật bản ghi
Route::get('updateORM', function (){
//    $p=Post::find(2);
//    $p=Post::where('id', '>=', 2);
    $p=Post::where('id', 4)->first();
    $p->title='update ORM';
    $p->body='updated Ahihii DONE DONE';
    $p->save();
});


//Xóa bản ghi
Route::get('deleteORM', function (){
    Post::where('id', '>=', 14)
        ->delete();
});

Route::get('destroyORM', function (){
    Post::destroy([7,11]);
});