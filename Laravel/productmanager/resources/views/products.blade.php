<?php
?>
@extends('layouts.upload');

@section('content')

    <div class="panel-body">
        @include('errors.503')

        @if(count($products) >0)
            <div class="product-container">
                <table class="table table-striped product-table">
                    <thead>
                    <td class="col-sm-4">Name</td>
                    <td class="col-sm-4">Price</td>
                    <td class="col-sm-4">Image</td>
                    </thead>
                    <tbody>
                    @foreach($products as $product)
                        <tr>
                            <td class="table-name col-sm-4">
                                <div><h3>{{$product->name}}</h3></div>
                            </td>
                            <td class="table-price col-sm-4">
                                <div><p>{{$product->price}}</p></div>
                            </td>
                            <td class="table-img col-sm-4">

                                <img src="{{$product->image}}"/>
                            </td>

                        </tr>
                    @endforeach
                    </tbody>
                </table>
            </div>
        @endif

        <form action="{{url('upload')}}" method="post"  class="form-horizontal">
            {{csrf_field()}}

            <div class="form-group">
                <label for="product" class="col-sm-3 control-label">Product</label>
                <div class="col-sm-6">
                    <input type="text" name="name" placeholder="Name..."><br><br>
                    <input type="text" name="price" placeholder="Price..."><br><br>
                    <input type="file" name="image" placeholder="Image..."><br><br>
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-offset-3 col-sm-6">
                    <button type="submit" class="btn btn-default">
                        <i class="fa fa-plus"></i> Add Product
                    </button>
                </div>
            </div>
        </form>
    </div>
@endsection
