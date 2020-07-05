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
      <a href="index" class="header-brand">mmtuts</a>
      <nav>
        <ul>
          <li><a href="portfolio">Portfolio</a></li>
          <li><a href="about">About me</a></li>
          <li><a href="contact">Contact</a></li>
        </ul>
        <a href="cases" class="header-cases">Cases</a>
      </nav>
    </header>
    <main>
      <section class="index-banner">
        <div class="vertical-center">
          <h2>I AM A FREELANCE WEB<br>DEVELOPER</h2>
          <h1>With specialty in back-end development, functionality, UX design, and Search Engine Optimization.</h1>
        </div>
      </section>
      <div class="wrapper">
        <section class="index-links">
          <a href="cases">
            <div class="index-boxlink-square">
              <h3>Cases</h3>
            </div>
          </a>
          <a href="#">
            <div class="index-boxlink-rectangle">
              <h3>Portfolio</h3>
            </div>
          </a>
            <a href="#">
            <div class="index-boxlink-square">
              <h3>mmtuts</h3>
            </div>
          </a>
            <a href="#">
            <div class="index-boxlink-rectangle">
              <h3>YouTube Channel</h3>
            </div>
          </a>
            <a href="#">
            <div class="index-boxlink-square">
              <h3>About</h3>
            </div>
          </a>
            <a href="#">
            <div class="index-boxlink-square">
              <h3>Contact</h3>
            </div>
          </a>
        </section>
        </div>
    </main>
    <div class="wrapper">
      <footer>
        <ul class="footer-links-main">
          <li><a href="#">Home</a></li>
          <li><a href="#">Cases</a></li>
          <li><a href="#">Portfolio</a></li>
          <li><a href="#">About me</a></li>
          <li><a href="#">Contact</a></li>
        </ul>
        <ul class="footer-links-cases">
          <li><p>Latest cases</p></li>
          <li><a href="#">MALING SHAOLIN - WEB DEVELOPMENT</a></li>
          <li><a href="#">EXCELLENTO - WEB DEVELOPMENT, SEO</a></li>
          <li><a href="#">MMTUTS - YOUTUBE CHANNEL</a></li>
          <li><a href="#">WELTEC - VIDEO PRODUCTION</a></li>
        </ul>
        <div class="footer-sm">
          <a href="#">
            <img src="{{URL::asset('img/youtube-symbol.png')}}" alt="youtube icon">
          </a>
          <a href="#">
            <img src="{{URL::asset('img/twitter-logo-button.png')}}" alt="youtube icon">
          </a>
          <a href="#">
            <img src="{{URL::asset('img/facebook-logo-button.png')}}" alt="youtube icon">
          </a>
        </div>
      </footer>
    </div>
  </body>
</html>
