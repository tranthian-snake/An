<?php
?>
{{--Tha ke tu gallery.blade template--}}
@extends('layouts.gallery');


{{--Noi dung trang con--}}
{{--Dung app.css--}}
@section('content')

  {{--    Dinh nghia phan noi dung cua trang task--}}
  <div class="panel-body">
    {{--        Hien thi thong bao loi--}}
    @include('errors.503')

    {{--        Hien thi Task hien tai co trong database--}}
    @if(count($tasks) >0)
  <div class="gallery-container">
          <table class="table table-striped task-table">
            {{--                        Tao tieu de cua cac cot--}}
            <thead>
            <td>imgFullNameGallery</td>
            <td>titleGallery</td>
            <td>descGallery</td>
            </thead>
            {{--                        Tao cac dong de hien thi noi dung--}}
            <tbody>
            @foreach($tasks as $task)
              <tr>
                <td class="table-img">
                  <div style="background-image: url({{$task->imgFullNameGallery}}"></div>
                </td>
                <td class="table-title">
                  <div><h3>{{$task->titleGallery}}</h3></div>
                </td>
                <td class="table-desc">
                  <div><p>{{$task->descGallery}}</p></div>
                </td>

              </tr>
            @endforeach
            </tbody>
          </table>
  </div>
    @endif

    {{--        form nhap task moi--}}
    <form action="{{url('upload')}}" method="post"  class="form-horizontal">
      {{csrf_field()}}

      {{--            Ten Task--}}
      <div class="form-group">
        <label for="task" class="col-sm-3 control-label"><h2>Upload</h2></label><br><br>
        <div class="col-sm-6">
          <input type="text" name="filename" placeholder="File name..."><br><br>
          <input type="text" name="filetitle" placeholder="Image title..."><br><br>
          <input type="text" name="filedesc" placeholder="Image description..."><br><br>
          <input type="file" name="file"><br><br>
        </div>
      </div>

      {{--            Nut Task--}}
      <div class="form-group">
        <div class="col-sm-offset-3 col-sm-6">
          <button type="submit" name="submit">UPLOAD</button>
        </div>
      </div>
    </form>

  </div>
@endsection



@extends('gallery1');

@section('display')
  @include('errors.503')

  {{--        Hien thi Task hien tai co trong database--}}
  @if(count($tasks) >0)
    <div class="gallery-container">
      <table class="table table-striped task-table">
        {{--                        Tao tieu de cua cac cot--}}
        <thead>
        <td>imgFullNameGallery</td>
        <td>titleGallery</td>
        <td>descGallery</td>
        </thead>
        {{--                        Tao cac dong de hien thi noi dung--}}
        <tbody>
        @foreach($tasks as $task)
          <tr>
            <td class="table-img">
              <div style="background-image: url({{$task->imgFullNameGallery}}"></div>
            </td>
            <td class="table-title">
              <div><h3>   {{$task->titleGallery}}   </h3></div>
            </td>
            <td class="table-desc">
              <div><p>{{$task->descGallery}}</p></div>
            </td>

          </tr>
        @endforeach
        </tbody>
      </table>
    </div>
  @endif
@endsection
