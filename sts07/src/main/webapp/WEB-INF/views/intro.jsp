<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/day06/css/bootstrap.css" />
<link rel="stylesheet" type="text/css" href="/day06/css/bootstrap-theme.css" />
<style type="text/css">
	nav img{
		height: 100%;
	}
</style>
<script type="text/javascript" src="/day06/js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="/day06/js/bootstrap.js"></script>
</head>
<body>
<nav class="navbar navbar-default navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
	    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
	        <span class="sr-only">Toggle navigation</span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	    </button>
      <a class="navbar-brand" href="/day06/">
        <img alt="Brand" src="/day06/imgs/logo.png">
      </a>
    </div><!-- menu header end -->
    
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li><a href="/day06/">HOME</a></li>
        <li class="active"><a href="/day06/intro">INTRO</a></li>
        <li class="dropdown">
        	<a href="#" class="dropdown-toggle" data-toggle="dropdown" 
        		role="button" aria-haspopup="true" aria-expanded="false">
        		BBS<span class="caret"></span></a>
        	<ul class="dropdown-menu">
        		<li><a href="/day06/bbs">LIST</a></li>
        		<li role="separator" class="divider"></li>
        		<li><a href="/day06/bbs/add">ADD</a></li>
        	</ul>
        </li>
      </ul>
      
    </div><!-- /.navbar-collapse -->
    
  </div><!-- menu container-fluid end -->
</nav>
<div class="container">
 <div class="row">
   <div class="col-md-12">
		<div class="jumbotron">
		  <h1>Intro!</h1>
		</div>   
   </div>
 </div>
 <div id="content" class="row">
   <div class="col-md-12">
   	<p>...</p>
   </div>
 </div>
 <div id="footer" class="row">
   <div class="col-md-12">
	<address>
	  <strong>(주)비트컴퓨터 서초본원</strong><br>
	  비트캠프 서울시 서초구 강남대로 459 (서초동, 백암빌딩)<br>
	  <abbr title="Phone">P:</abbr> 02-3486-9600
	</address>
	
	<address>
	  <strong>Copyright (c) 비트캠프 All rights reserved.</strong><br>
	  <a href="mailto:bit01class@gmail.com">bit01class@gmail.com</a>
	</address>
   </div>
 </div>
</div>
</body>
</html>