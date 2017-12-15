//package tests;
//
//import clasesDAO.UsuarioDAO;
//import clasesDAOHibernateJPA.DAOFactory;
//import model.Usuario;
//
//public class TestUsuarioUpdate {
//	public static void main(String[] args) {
//		DAOFactory fac = new DAOFactory();
//		UsuarioDAO user = fac.getUsuarioDAO();
//		Long num = new Long(1);
//		Usuario us = user.recuperar(num); 
//		System.out.println("Usuario: "+us.getUsername());
//		System.out.println("Email: "+us.getApellido());
//		us.setApellido("vuelta");
//		us = user.actualizar(us);
//		System.out.println("Usuario: "+us.getUsername());
//		System.out.println("Email: "+us.getApellido());
//	}
//
//}
