package controller;

import org.springframework.stereotype.Controller;

import clasesDAOHibernateJPA.UsuarioDAOHibernateJPA;
import model.Usuario;

@Controller
public class UsuarioController {
	
	private UsuarioDAOHibernateJPA user;
	
	public Usuario recuperar(Long id) {
		return this.user.recuperar(id);
	}
}
