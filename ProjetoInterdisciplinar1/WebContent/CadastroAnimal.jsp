<!DOCTYPE html>
<html lang="en">
<head>
<title>Pet Amigo</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- css -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
<link rel="stylesheet" href="css/font-awesome.min.css" type="text/css" media="all" />
<!--// css -->
<!-- font -->
<link href="//fonts.googleapis.com/css?family=Source+Sans+Pro" rel="stylesheet">
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
<!-- //font -->
<script src="js/jquery-1.11.1.min.js"></script>
<script src="js/bootstrap.js"></script>
</head>
<body>
<div class="header-top-w3layouts">
	<div class="container">
		<div class="col-md-6 logo-w3">
			<a href="index.html"><img src="imagens/pata.jpg" alt=" " /><h1>Pet Amigo</h1></a>
		</div>
		
</div>
<div class="header-bottom-w3ls">
	<div class="container">
		<div class="col-md-7 navigation-agileits">
			<nav class="navbar navbar-default">
				<div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
					<ul class="nav navbar-nav ">
						<li><a href="index.jsp" class="hyper "><span>Inicio</span></a></li>	
						<li><a href="AdoteUmAnimal.jsp" class="hyper"><span>Adote um animal</span></a></li>
						<li><a href="EncontreUmPar.jsp" class="hyper"><span> Encontre um par</span></a></li>
						<li><a href="AnimaisPerdidos.jsp" class="hyper"><span>Perdidos</span></a></li>
					    <li><a href="DoadoresSangue.jsp" class="hyper"><span>Doadores de Sangue</span></a></li>
					</ul>
				</div>
			</nav>
		</div>
		
		
	</div>
</div>

	<div class="login">
	
		<div class="main-agileits">
				<div class="form-w3agile">
					<h3>Cadastro do Animal</h3>
					<form action="ServletAnimal" method="post">
						<div class="key">
							<input  type="hidden"  name="id">
							<input  type="text"  name="nome" required placeholder="Nome">
							<div class="clearfix"></div>
						</div>
						<div class="key">
							
							<input  type="text"  name="raca"  required  placeholder="Raca">
							<div class="clearfix"></div>
						</div>
						<div class="key">
							
							<input  type="text"  name="idade"  required placeholder="Idade">
							<div class="clearfix"></div>
						</div>
						<div class="key">
							
							<%-- <input  type="text" name="sexo" required="" placeholder="Sexo"> --%>
							<h6>SEXO</h6>
							<input type="radio" name="sexo" value="macho"/> Macho
							<input type="radio" name="sexo" value="femea"/> Femea
							<div class="clearfix"></div>
						</div>
						<div class="key">
							
							<%-- <input  type="text" name="pelagem" required="" placeholder="Pelagem"> --%>
							<h6>PELAGEM</h6>
							<input type="radio" name="pelagem" value="curto"/> Curto <br />
							<input type="radio" name="pelagem" value="longo"/> Longo <br />
							<div class="clearfix"></div>
						</div>
						<div class="key">
							
							<%-- <input  type="text" name="porte" required="" placeholder="Porte"> --%>
							<h6>PORTE</h6>
							<input type="radio" name="porte" value="pequeno"/> Pequeno <br />
							<input type="radio" name="porte" value="medio"/> Medio <br />
							<input type="radio" name="porte" value="grande"/> Grande <br />
							<div class="clearfix"></div>
						</div>
						<div class="key">
							
							<%-- <input  type="text" name="especificacao" required="" placeholder="Especificação">--%>
							<h6>Especificação do cadastro</h6>
							<input type="radio" name="especificacao" value="adocao"/> Adoção <br />
							<input type="radio" name="especificacao" value="perdido"/> Perdido <br />
							<input type="radio" name="especificacao" value="pretendente"/> Pretendente <br />
							<input type="radio" name="especificacao" value="doarSangue"/> Doar Sangue
							<div class="clearfix"></div>
						</div>
						
							Imagem:<input type="file" name="imagem"><br/>
							
							
						<input type="submit" value="Cadastrar">
					</form>
				</div>
			</div>
		</div>
	
<div class="footer">
	<div class="container">
		<div class="col-md-3 footer-grids fgd1">
		<a href="index.html"><h3>Pet Amigo</h3></a>
		<ul>
			<li>Caruaru</li>
			<li>Pernanbuco.</li>
			<li><a href="mailto:info@example.com">petamigo@outlook.com</a></li>
			<a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a>
			<a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a>
			<a href="#"><i class="fa fa-instagram" aria-hidden="true"></i></a>
		</ul>
		</div>
		<div class="col-md-3 footer-grids fgd2">
			<h4>Informações</h4> 
			<ul>
				<li><a href="FaleConosco.jsp">Fale Conosco</a></li>
				<li><a href="Dicas.jsp">Dicas</a></li>
				<li><a href="QuemSomos.jsp">Quem somos</a></li>
			</ul>
		</div>
		<div class="col-md-3 footer-grids fgd3">
			<h4>Animais</h4> 
			<ul>
				<li><a href="AdoteUmAnimal.jsp">Adote</a></li>
				<li><a href="EncontreUmPar.jsp">Encontre um par</a></li>
				<li><a href="AnimaisPerdidos.jsp">Animais Perdidos</a></li>
				
			</ul>
		</div>
		<div class="col-md-3 footer-grids fgd4">
			<h4>Minha Conta</h4> 
			<ul>
				
				<li><a href="login.jsp">Login</a></li>
				<li><a href="CadastroUsuario.jsp">Se cadastre</a></li>
			</ul>
		</div>
		<div class="clearfix"></div>
		<p class="copy-right">© 2016 Pet Amigo . Todos os direitos reservados | Design por VieCost Software</p>
	</div>
</div>
	  
</body>
</html>