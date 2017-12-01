package tests;

import controller.UsuarioController;
import model.Usuario;

public class TestUsuarioShow {
	public static void main(String args[]){
		
		UsuarioController con = new UsuarioController();
		Long num = new Long(1);
		Usuario u = con.recuperar(num);
		System.out.println("Usuario: "+u.getUsername());
		System.out.println("Email: "+u.getEmail());
	}

}
