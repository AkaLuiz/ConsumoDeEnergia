package com.energia.ConsumoEnergia.controles;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.energia.ConsumoEnergia.entities.Eletrodomestico;
import com.energia.ConsumoEnergia.repositorio.eletroRepositorio;


@RestController
@RequestMapping("/api2")
public class EletroControle {

	//acoes
		@Autowired
		private eletroRepositorio acoes;
	

		
		// Cadastro
		@RequestMapping(value="/cadastro", method=RequestMethod.POST)
		public @ResponseBody Eletrodomestico cadastro(@RequestBody Eletrodomestico eletro) {
			
			return acoes.save(eletro);
		}	
		
		// CadastroDeProduto
				@RequestMapping(value="/cadastrarProduto", method=RequestMethod.GET)
				public @ResponseBody String cadastro() {	
					
					return "<!DOCTYPE html>\r\n"
							+ "<html lang=\"pt-br\">\r\n"
							+ "<head>\r\n"
							+ "    <meta charset=\"UTF-8\">\r\n"
							+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
							+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
							+ "    <title>Consumo de energia</title>\r\n"
							+ "    <link rel=\"stylesheet\" href=\"estilo.css\">\r\n"
							+ "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx\" crossorigin=\"anonymous\">\r\n"
							+ "    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\r\n"
							+ "    <link href=\"https://fonts.googleapis.com/css2?family=Bebas+Neue&family=Pattaya&display=swap\" rel=\"stylesheet\">\r\n"
							+ "    <style>\r\n"
							+ "    body{\r\n"
							+ "    background-image: url(127447954.jpg);\r\n"
							+ "    background-repeat: no-repeat;\r\n"
							+ "    background-size: cover;\r\n"
							+ "    background-attachment: fixed;\r\n"
							+ "    margin:0;\r\n"
							+ "    height: 100%;\r\n"
							+ "    \r\n"
							+ "}\r\n"
							+ ".kwh{\r\n"
							+ "  padding:10px;\r\n"
							+ "    display:table;\r\n"
							+ "    margin: 15px;\r\n"
							+ "    border-radius: 10px;\r\n"
							+ "    background-color: rgba(226, 226, 226, 0.521);\r\n"
							+ "    border-bottom: 40px rgba(226, 226, 226, 0.521);\r\n"
							+ "    box-shadow: 3px 4px 5px #00000060;\r\n"
							+ "}\r\n"
							+ ".borda{\r\n"
							+ "  margin:15px;\r\n"
							+ "  margin-top: 10px;\r\n"
							+ "  display:table;\r\n"
							+ "  border:transparent solid;\r\n"
							+ "  border-radius:5px;\r\n"
							+ "  background-color: #ffffff80;\r\n"
							+ "  border-bottom: 5px;\r\n"
							+ "  \r\n"
							+ "}\r\n"
							+ "\r\n"
							+ ".quadro{\r\n"
							+ "    position:absolute;\r\n"
							+ "    display:table;\r\n"
							+ "    border:solid transparent;\r\n"
							+ "    border-radius: 5px;\r\n"
							+ "    background-color: #ffffff80;\r\n"
							+ "    padding:20px;\r\n"
							+ "    margin-top:100px;\r\n"
							+ "    left:50%;\r\n"
							+ "    box-shadow: 3px 4px 5px #00000060;\r\n"
							+ "    width:290px;\r\n"
							+ "    margin-left:-145px;\r\n"
							+ "}\r\n"
							+ "\r\n"
							+ ".botao{\r\n"
							+ "  text-decoration: none;\r\n"
							+ "  background-color: #ffffff80;\r\n"
							+ "  border: transparent;\r\n"
							+ "  border-color: BLACK;\r\n"
							+ "  color: BLACK;\r\n"
							+ "  padding: 7px;\r\n"
							+ "  font-weight: bold;\r\n"
							+ "  font-size: 12pt;\r\n"
							+ "  margin-top: 20px;\r\n"
							+ "  border-radius: 4px;\r\n"
							+ "  cursor: pointer;\r\n"
							+ "  outline: none;\r\n"
							+ "  transition: all .4s ease-out;\r\n"
							+ "}\r\n"
							+ "\r\n"
							+ ".botao:hover{\r\n"
							+ "  background-color: BLACK;\r\n"
							+ "  color: #fff;\r\n"
							+ "}\r\n"
							+ "\r\n"
							+ ".botaoE{\r\n"
							+ "  height:5%;\r\n"
							+ "  padding: 7px;\r\n"
							+ "  font-weight: bold;\r\n"
							+ "  font-size: 12pt;\r\n"
							+ "  margin-left:190px;\r\n"
							+ "  top:90px;\r\n"
							+ "\r\n"
							+ "}\r\n"
							+ "\r\n"
							+ "\r\n"
							+ "  .form-grup{\r\n"
							+ "    position:relative;\r\n"
							+ "  }\r\n"
							+ "\r\n"
							+ "    input{\r\n"
							+ "    background-color: transparent;\r\n"
							+ "    border: 0;\r\n"
							+ "    border-bottom: 1px solid black;\r\n"
							+ "    outline: none;\r\n"
							+ "    width:100%;\r\n"
							+ "    }\r\n"
							+ "\r\n"
							+ "    input:focus{\r\n"
							+ "    background-color: transparent;\r\n"
							+ "    box-shadow: 0 0 0 0;\r\n"
							+ "    border-top:none; \r\n"
							+ "    border-left:none;\r\n"
							+ "    border-right:none;\r\n"
							+ "    outline: 0;\r\n"
							+ "    \r\n"
							+ "    }\r\n"
							+ "\r\n"
							+ "    .form-grup label{\r\n"
							+ "      position:absolute;\r\n"
							+ "      left:5px;\r\n"
							+ "      opacity:0.5;\r\n"
							+ "      pointer-events: none;\r\n"
							+ "      transition: 0.5s;\r\n"
							+ "   }\r\n"
							+ "\r\n"
							+ "   .form-grup input:focus + label,\r\n"
							+ "   .form-grup input:hover + label,\r\n"
							+ "   .form-grup input:valid + label\r\n"
							+ "   {\r\n"
							+ "      font-size: small;\r\n"
							+ "      transform: translateY(-20px);\r\n"
							+ "      opacity:1;\r\n"
							+ "    }\r\n"
							+ "\r\n"
							+ "    .dista{\r\n"
							+ "      margin-left:15px;\r\n"
							+ "    }\r\n"
							+ "\r\n"
							+ "\r\n"
							+ "    input::-webkit-outer-spin-button,\r\n"
							+ "input::-webkit-inner-spin-button {\r\n"
							+ "    -webkit-appearance: none;\r\n"
							+ "    margin: 0;\r\n"
							+ "}\r\n"
							+ ".bordinha{\r\n"
							+ "  margin-top: 50px;\r\n"
							+ "  margin-left:25%;\r\n"
							+ "  margin-bottom:25px;\r\n"
							+ "  width: 705px;\r\n"
							+ "  padding:0px;\r\n"
							+ "  border: transparent ;\r\n"
							+ "  border-radius:5px;\r\n"
							+ "  background: #ffffff90;\r\n"
							+ "}\r\n"
							+ "tr:nth-child(odd) {\r\n"
							+ "  background: #ffffff90;\r\n"
							+ "}\r\n"
							+ "\r\n"
							+ ".aparece p {\r\n"
							+ "  display:none;\r\n"
							+ "  \r\n"
							+ "}\r\n"
							+ ".aparece:hover p{\r\n"
							+ "  display:block;\r\n"
							+ "}\r\n"
							+ "\r\n"
							+ "\r\n"
							+ "    </style>\r\n"
							+ "</head>\r\n"
							+ "\r\n"
							+ "<body>\r\n"
							+ "\r\n"
							+ "<form action=\"registro\" class=\"kwh\">\r\n"
							+ "\r\n"
							+ "    <br>\r\n"
							+ "    <div class=\"form-grup\">\r\n"
							+ "    <input type=\"text\"  id=\"Produto\" name=\"Produto\" required>\r\n"
							+ "    <label>Produto:</label>\r\n"
							+ "    </div>\r\n"
							+ "    \r\n"
							+ "    <br>\r\n"
							+ "    <div class=\"form-grup\">\r\n"
							+ "    <input type=\"number\"  id=\"a\" name=\"a\" required>\r\n"
							+ "    <label>Watts:</label>\r\n"
							+ "    </div>\r\n"
							+ "\r\n"
							+ "    <div class=\"aparece\">\r\n"
							+ "        <img src=\"827.png\" class=\"botaoE\" style=\"position:absolute;\">\r\n"
							+ "    <p class=\"borda\" style=\"position:absolute; left:230px; top:83px;\">Dúvidas sobre consumo do seu produto? confira <a href=\"6tabela.html\" target=\"_blank\">aqui</a></p>\r\n"
							+ "    </div>\r\n"
							+ "\r\n"
							+ "    <br>\r\n"
							+ "    <div class=\"form-grup\">\r\n"
							+ "    <input type=\"number\"  id=\"b\" name=\"b\" required> \r\n"
							+ "    <label>Hora/Dia:</label>\r\n"
							+ "    </div>\r\n"
							+ "\r\n"
							+ "    <br>\r\n"
							+ "    <div class=\"form-grup\">\r\n"
							+ "    <input type=\"number\"  id=\"c\" name=\"c\" required>\r\n"
							+ "    <label>Dias:</label>\r\n"
							+ "    </div>\r\n"
							+ "    <br>\r\n"
							+ "    <div>\r\n"
							+ "    KWh:\r\n"
							+ "    </div>\r\n"
							+ "    <a class=\"dista\" type=\"submit\"><button class=\"botao\">Adicionar produto</button></a>\r\n"
							+ "\r\n"
							+ "</form>\r\n"
							+ "\r\n"
							+ "\r\n"
							+ "<a href=\"5tela-renda-estado.html\" class=\"botao dista\">Próxima página</a>\r\n"
							+ "\r\n"
							+ "</body>\r\n"
							+ "\r\n"
							+ "</html>";
					
				}
				
		// CadastroDeProduto
		@RequestMapping(value="/registro", method=RequestMethod.GET)
		public @ResponseBody String cadastro(HttpServletRequest request, HttpServletResponse response) {
			
			String nome = request.getParameter("Produto");
			int watts = Integer.parseInt(request.getParameter("a"));
			int horaspordia = Integer.parseInt(request.getParameter("b"));
			int dias = Integer.parseInt(request.getParameter("c"));
			
			Eletrodomestico eletro = new Eletrodomestico();
			
			eletro.setNome(nome);
			eletro.setWatts(watts);
			eletro.setHorasPorDia(horaspordia);
			eletro.setDias(dias);
			;
			acoes.save(eletro);
			
		return "<!DOCTYPE html>\r\n"
				+ "<html lang=\"pt-br\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>Consumo de energia</title>\r\n"
				+ "    <link rel=\"stylesheet\" href=\"estilo.css\">\r\n"
				+ "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx\" crossorigin=\"anonymous\">\r\n"
				+ "    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\r\n"
				+ "    <link href=\"https://fonts.googleapis.com/css2?family=Bebas+Neue&family=Pattaya&display=swap\" rel=\"stylesheet\">\r\n"
				+ "    <style>\r\n"
				+ "    body{\r\n"
				+ "    background-image: url(127447954.jpg);\r\n"
				+ "    background-repeat: no-repeat;\r\n"
				+ "    background-size: cover;\r\n"
				+ "    background-attachment: fixed;\r\n"
				+ "    margin:0;\r\n"
				+ "    height: 100%;\r\n"
				+ "    \r\n"
				+ "}\r\n"
				+ ".kwh{\r\n"
				+ "  padding:10px;\r\n"
				+ "    display:table;\r\n"
				+ "    margin: 15px;\r\n"
				+ "    border-radius: 10px;\r\n"
				+ "    background-color: rgba(226, 226, 226, 0.521);\r\n"
				+ "    border-bottom: 40px rgba(226, 226, 226, 0.521);\r\n"
				+ "    box-shadow: 3px 4px 5px #00000060;\r\n"
				+ "}\r\n"
				+ ".borda{\r\n"
				+ "  margin:15px;\r\n"
				+ "  margin-top: 10px;\r\n"
				+ "  display:table;\r\n"
				+ "  border:transparent solid;\r\n"
				+ "  border-radius:5px;\r\n"
				+ "  background-color: #ffffff80;\r\n"
				+ "  border-bottom: 5px;\r\n"
				+ "  \r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".quadro{\r\n"
				+ "    position:absolute;\r\n"
				+ "    display:table;\r\n"
				+ "    border:solid transparent;\r\n"
				+ "    border-radius: 5px;\r\n"
				+ "    background-color: #ffffff80;\r\n"
				+ "    padding:20px;\r\n"
				+ "    margin-top:100px;\r\n"
				+ "    left:50%;\r\n"
				+ "    box-shadow: 3px 4px 5px #00000060;\r\n"
				+ "    width:290px;\r\n"
				+ "    margin-left:-145px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".botao{\r\n"
				+ "  text-decoration: none;\r\n"
				+ "  background-color: #ffffff80;\r\n"
				+ "  border: transparent;\r\n"
				+ "  border-color: BLACK;\r\n"
				+ "  color: BLACK;\r\n"
				+ "  padding: 7px;\r\n"
				+ "  font-weight: bold;\r\n"
				+ "  font-size: 12pt;\r\n"
				+ "  margin-top: 20px;\r\n"
				+ "  border-radius: 4px;\r\n"
				+ "  cursor: pointer;\r\n"
				+ "  outline: none;\r\n"
				+ "  transition: all .4s ease-out;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".botao:hover{\r\n"
				+ "  background-color: BLACK;\r\n"
				+ "  color: #fff;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".botaoE{\r\n"
				+ "  height:5%;\r\n"
				+ "  padding: 7px;\r\n"
				+ "  font-weight: bold;\r\n"
				+ "  font-size: 12pt;\r\n"
				+ "  margin-left:190px;\r\n"
				+ "  top:90px;\r\n"
				+ "\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "  .form-grup{\r\n"
				+ "    position:relative;\r\n"
				+ "  }\r\n"
				+ "\r\n"
				+ "    input{\r\n"
				+ "    background-color: transparent;\r\n"
				+ "    border: 0;\r\n"
				+ "    border-bottom: 1px solid black;\r\n"
				+ "    outline: none;\r\n"
				+ "    width:100%;\r\n"
				+ "    }\r\n"
				+ "\r\n"
				+ "    input:focus{\r\n"
				+ "    background-color: transparent;\r\n"
				+ "    box-shadow: 0 0 0 0;\r\n"
				+ "    border-top:none; \r\n"
				+ "    border-left:none;\r\n"
				+ "    border-right:none;\r\n"
				+ "    outline: 0;\r\n"
				+ "    \r\n"
				+ "    }\r\n"
				+ "\r\n"
				+ "    .form-grup label{\r\n"
				+ "      position:absolute;\r\n"
				+ "      left:5px;\r\n"
				+ "      opacity:0.5;\r\n"
				+ "      pointer-events: none;\r\n"
				+ "      transition: 0.5s;\r\n"
				+ "   }\r\n"
				+ "\r\n"
				+ "   .form-grup input:focus + label,\r\n"
				+ "   .form-grup input:hover + label,\r\n"
				+ "   .form-grup input:valid + label\r\n"
				+ "   {\r\n"
				+ "      font-size: small;\r\n"
				+ "      transform: translateY(-20px);\r\n"
				+ "      opacity:1;\r\n"
				+ "    }\r\n"
				+ "\r\n"
				+ "    .dista{\r\n"
				+ "      margin-left:15px;\r\n"
				+ "    }\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "    input::-webkit-outer-spin-button,\r\n"
				+ "input::-webkit-inner-spin-button {\r\n"
				+ "    -webkit-appearance: none;\r\n"
				+ "    margin: 0;\r\n"
				+ "}\r\n"
				+ ".bordinha{\r\n"
				+ "  margin-top: 50px;\r\n"
				+ "  margin-left:25%;\r\n"
				+ "  margin-bottom:25px;\r\n"
				+ "  width: 705px;\r\n"
				+ "  padding:0px;\r\n"
				+ "  border: transparent ;\r\n"
				+ "  border-radius:5px;\r\n"
				+ "  background: #ffffff90;\r\n"
				+ "}\r\n"
				+ "tr:nth-child(odd) {\r\n"
				+ "  background: #ffffff90;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".aparece p {\r\n"
				+ "  display:none;\r\n"
				+ "  \r\n"
				+ "}\r\n"
				+ ".aparece:hover p{\r\n"
				+ "  display:block;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "    </style>\r\n"
				+ "</head>\r\n"
				+ "\r\n"
				+ "<body>\r\n"
				+ "<form action=\"registro\" class=\"kwh\">\r\n"
				+ "\r\n"
				+ "    <br>\r\n"
				+ "    <div class=\"form-grup\">\r\n"
				+ "    <input type=\"text\"  id=\"Produto\" name=\"Produto\" required>\r\n"
				+ "    <label>Produto:</label>\r\n"
				+ "    </div>\r\n"
				+ "    \r\n"
				+ "    <br>\r\n"
				+ "    <div class=\"form-grup\">\r\n"
				+ "    <input type=\"number\"  id=\"a\" name=\"a\" required>\r\n"
				+ "    <label>Watts:</label>\r\n"
				+ "    </div>\r\n"
				+ "\r\n"
				+ "    <div class=\"aparece\">\r\n"
				+ "        <img src=\"827.png\" class=\"botaoE\" style=\"position:absolute;\">\r\n"
				+ "    <p class=\"borda\" style=\"position:absolute; left:230px; top:83px;\">Dúvidas sobre consumo do seu produto? confira <a href=\"6tabela.html\" target=\"_blank\">aqui</a></p>\r\n"
				+ "    </div>\r\n"
				+ "\r\n"
				+ "    <br>\r\n"
				+ "    <div class=\"form-grup\">\r\n"
				+ "    <input type=\"number\"  id=\"b\" name=\"b\" required> \r\n"
				+ "    <label>Hora/Dia:</label>\r\n"
				+ "    </div>\r\n"
				+ "\r\n"
				+ "    <br>\r\n"
				+ "    <div class=\"form-grup\">\r\n"
				+ "    <input type=\"number\"  id=\"c\" name=\"c\" required>\r\n"
				+ "    <label>Dias:</label>\r\n"
				+ "    </div>\r\n"
				+ "    <br>\r\n"
				+ "    <div>\r\n"
				+ "    KWh:\r\n"
				+ "    </div>\r\n"
				+ "    <a class=\"dista\" type=\"submit\"><button class=\"botao\">Adicionar produto</button></a>\r\n"
				+ "\r\n"
				+ "</form>\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "<a href=\"5tela-renda-estado.html\" class=\"botao dista\">Próxima página</a>\r\n"
				+ "\r\n"
				+ "</body>\r\n"
				+ "\r\n"
				+ "</html>";
		}
	
}