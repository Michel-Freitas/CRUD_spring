package br.com.crudspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.crudspring.service.UsuarioService;

@Controller
@RequestMapping(path = "/usuario/")
public class UsuarioController {
	
	@Autowired
	UsuarioService userServi;
	
	@RequestMapping(path = "/cadastro")
	public String pagCadastroUsuario() {
		return "sistema/cadastro";
	}
	
	@RequestMapping(path = "/salvarUsuario", method = RequestMethod.POST)
	public String cadastrarUsuario(@RequestParam String nome, String login, String senha) {
		userServi.cadastroUser(nome, login, senha);
		return "redirect:/";
	}
}