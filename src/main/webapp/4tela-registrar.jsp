<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8"%>
<%@ page import="Model.JavaBeans"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<%
	@ SuppressWarnings ("unchecked")
	ArrayList<JavaBeans> lista = (ArrayList<JavaBeans>) request.getAttribute("contatos");
%>
<% 
int i = 0;
float [] w;
float [] hd;
float [] d;
String [] p;
float [] kwh;

w = new float[10];
hd = new float[10];
d = new float[10];
kwh = new float[10];
p = new String[10];

w[i] = Float.parseFloat(request.getParameter("a"));
hd[i] = Float.parseFloat(request.getParameter("b"));
d[i] = Float.parseFloat(request.getParameter("c"));
p[i] = request.getParameter("Produto");
kwh[i] = (w[i]*hd[i]*d[i])/1000;
%>

<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Consumo de energia</title>
    <link rel="stylesheet" href="estilo.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Bebas+Neue&family=Pattaya&display=swap" rel="stylesheet">

</head>

<body>


<form  class="kwh" >

    <br>
    <div class="form-grup">
    <input type="text"  id="Produto" name="Produto" required>
    <label>Produto:</label>
    </div>
    
    <br>
    <div class="form-grup">
    <input type="number"  id="a" name="a" required>
    <label>Watts:</label>
    </div>

    <div class="aparece">
        <img src="827.png" class="botaoE" style="position:absolute;">
    <p class="borda" style="position:absolute; left:230px; top:83px;">Dúvidas sobre consumo do seu produto? confira <a href="6tabela.html" target="_blank">aqui</a></p>
    </div>

    <br>
    <div class="form-grup">
    <input type="number"  id="b" name="b" required> 
    <label>Hora/Dia:</label>
    </div>

    <br>
    <div class="form-grup">
    <input type="number"  id="c" name="c" required>
    <label>Dias:</label>
    </div>
    <br>
    <div>
    KWh:
    </div>
    <a class="dista" type="submit"><button class="botao">Adicionar produto</button></a>

</form>

<% 

boolean botao = Boolean.parseBoolean(request.getParameter("botao"));



		for(i = 0 ;i < lista.size(); i++){
		out.println("<div class='kwh'>  <br>   <div class='form-grup'>	    <input type='text'  id='produto' nome='produto' required value="+p[i]+">    <label>Produto:</label>	    </div>	    	    <br>	    <div class='form-grup'>	    <input type='number'  id='a' name='a' value="+w[i]+"> 	    <label>Watts:</label>	    </div>	    <div class='aparece'>	   <p class='borda' style='position:absolute; left:230px; top:83px;'>Dúvidas sobre consumo do seu produto? confira <a href='6tabela 2.html' target='_blank'>aqui</a></p>	    </div>	    <br>	    <div class='form-grup'>	    <input type='number'  id='b' name='b' value="+hd[i]+"> 	    <label>Hora/Dia:</label>	    </div>	    <br>	    <div class='form-grup'>	    <input type='number'  id='c' name='c' value="+d[i]+">	    <label>Dias:</label>	    </div>	    <br> <div> KWh: "+kwh[i]+"</div></div>");
		}


for(i=0;i<10;i++){
	out.println(w[i]+"<br>");
}


%>


<br>
<br>
<a href="5tela-renda-estado.html" class="botao dista">Próxima página</a>
</body>

</html>