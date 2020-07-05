<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>My Portfolio</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://fonts.googleapis.com/css?family=Catamaran:100,200,300,400,500,600,700,800,900|Cormorant+Garamond:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">
    <link rel="stylesheet" href="{{URL::asset('css/style.css')}}">
  </head>
  <body>
    <header>
      <a href="index" class="header-brand">GALLERY</a>
      <nav>
        <ul>
          <li><a href="portfolio">Portfolio</a></li>
          <li><a href="about">About me</a></li>
          <li><a href="contact">Contact</a></li>
        </ul>
        <a href="cases" class="header-cases">ALBUM</a>
      </nav>
    </header>
    <main>
      <section class="gallery-links">
        <div class="wrapper">
          <h2>Gallery</h2>
          <div class="gallery-container">
            @if(count($tasks) >0)
              <div class="panel panel-default">
                <div class="panel-heading">
                  Current Task
                </div>
                <div class="panel-body">
                  <table class="table table-striped task-table">
                    {{--                        Tao tieu de cua cac cot--}}
                    <thead>
                    <td>Title Gallery</td>
                    <td>Img Full Name Gallery</td>
                    <td>descGallery</td>
                    <td>&nbsp;</td>
                    </thead>
                    {{--                        Tao cac dong de hien thi noi dung--}}
                    <tbody>
                    @foreach($tasks as $task)
                      <tr>
                        <td class="table-text">
                          <div>{{$task->titleGallery}}</div>
                        </td>
                        <td class="table-text">
                          <div>{{$task->imgFullNameGallery}}</div>
                        </td>
                        <td class="table-text">
                          <div>{{$task->descGallery}}</div>
                        </td>
                      </tr>
                    @endforeach
                    </tbody>
                  </table>
                </div>
              </div>
            @endif
              }
            }
            ?>
          </div>
        </div>
      </section>

    </main>

  </body>
</html>
