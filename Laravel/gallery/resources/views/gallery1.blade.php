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
        <div class="panel-body">
          @yield('display');
        </div>
      </div>
    </div>
  </section>

</main>

</body>
</html>
