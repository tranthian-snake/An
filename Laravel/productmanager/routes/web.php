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

use App\Product;
use Illuminate\Http\Request;

Route::get('/', function () {
    $products= Product::orderBy('created_at', 'desc')->get();

    return view('products', [
        'products' => $products
    ]);
});

Route::post('/upload', function (Request $request){
    $validator= Validator::make($request->all(), [
        'name' => 'required|max:255',
    ]);

    if ($validator->fails()){
        return redirect('/')
            ->withInput()
            ->withErrors($validator);
    }

    $product = new Product;
    $product->id = $request ->id;
    $product->name = $request ->name;
    $product->price= $request ->price;
    $product->image= $request ->image;
    $product->save();

    return redirect('/');
});


Route::get('update', function (){
    $updated=DB::update('update products set name = "Pink Rose" where id = ?', [1]);
    return $updated;
});

Route::get('find', function (){
    $products=Product::where('id','>=',1)
        ->where('name', 'like', '%a%')
        ->orderBy('id', 'desc')
        ->take(10)
        ->get();
    foreach ($products as $p) {
        echo "<div>" . $p->name;
        echo ", price: ";
        echo $p->price;
        echo "<br>";
        echo  '<img src="img/' . $p->image . '" width="120px" height="90px"/>';
        echo "</div>";
    }

});

Route::get('delete/{delete}', function ($id){
    $deleted=DB::delete('delete from products where id = ?',[$id]);
    return redirect('/');

});

