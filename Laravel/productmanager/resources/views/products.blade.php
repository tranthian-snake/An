<?php
?>
@extends('layouts.upload');

@section('content')

    <div class="panel-body">
        @include('errors.503')
        <style>
            .col-sm-12{
                width: 100%;
                text-align: center;
                border: rgba(0, 0, 0, 0.28) 1px solid;
            }
            .product-table{
                padding: 50px 50px 50px 50px;
                text-align: center;
            }
            .product-table tbody{
                color: #5e5e5e;
                font-weight: 600;
                overflow: hidden;
            }
            .product-table thead{
                color: black;
                font-weight: 600;
                font-size: 30px;
            }
            .form-group{
                text-align: center;
            }
            .form-group input{
                width: 50%;
                height: 50px;
                border: 1px rgba(0, 0, 0, 0.39) solid;
                border-radius: 3px;
            }
            .form-group #image{
                width: 200px;
                height: 60px;
                background-color: rgba(94, 94, 94, 0.39);
                color: white;
            }
            .form-group button{
                width: 100px;
                height: 40px;
                background-color: black;
                color: white;
            }
        </style>

        @if(count($products) >0)
            <div class="product-container">
                <table class="table table-striped col-sm-12 product-table">
                    <thead>
                    <td class="col-sm-1">Id</td>
                    <td class="col-sm-4">Name</td>
                    <td class="col-sm-2">Price</td>
                    <td class="col-sm-5">Image</td>
                    </thead>
                    <tbody>
                    @foreach($products as $product)
                        <tr>
                            <td class="table-id col-sm-1">
                                <div>{{$product->id}}</div>
                            </td>
                            <td class="table-name col-sm-4">
                                <div><h4>{{$product->name}}</h4></div>
                            </td>
                            <td class="table-price col-sm-2">
                                <div><p>{{$product->price}}</p></div>
                            </td>
                            <td class="table-img col-sm-5">

                                <img src="img/{{$product->image}}" width="270px" height="150px"/>
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
                <label for="product" class="col-sm-3 control-label"><h2>New Product</h2></label>
                <div class="col-sm-6">
                    <input type="text" name="name" placeholder="Name..."><br><br>
                    <input type="text" name="price" placeholder="Price..."><br><br>
                    <input type="file" name="image" id="image" placeholder="Image..."><br><br>
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
