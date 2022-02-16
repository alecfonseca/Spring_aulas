package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

public class HelloController {
	
	    @GetMapping
		public String getHello() {
			return "Hello World !";
	}
	    @GetMapping("/habilidade")
		public String getHello1() {
	    	return "Habilidades Utilizadas foram:<br />Atenção ao detalhe,<br />Persistência,<br />Proatividade !";
	    }
	    @GetMapping("/objetivo")
		public String getHello2() {
	    	return "Objetivos da semana:<br />Conseguir revisar conteúdos,<br />Realizar tarefas do Projeto,<br />conseguir descansar um pouco !";
	    }		
}
