package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.UriComponentsBuilder;

import clasesDao.UsuarioDAO;
import clasesObj.Usuario;

@RestController
public class usuarioRestController {

	public usuarioRestController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	UsuarioDAO usuarioDAO;
	// Recupero todos los usuarios

	@RequestMapping(value = "/users/", method = RequestMethod.GET)
	public ResponseEntity<List<Usuario>> listAllUsers() {
		List<Usuario> users = usuarioDAO.recuperarTodos();
		if (users.isEmpty()) {
			return new ResponseEntity<List<Usuario>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Usuario>>(users, HttpStatus.OK);
	}

	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Usuario> getUser(@PathVariable("id") long id) {
		System.out.println("Obteniendo usuario con id " + id);
		Usuario user = usuarioDAO.recuperar(id);
		if (user == null) {
			System.out.println("Usuario con id " + id + " no encontrado");
			return new ResponseEntity<Usuario>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Usuario>(user, HttpStatus.OK);
	}

	// Creo un usuario
	@RequestMapping(value = "/users/", method = RequestMethod.POST)
	public ResponseEntity<Void> createUser(@RequestBody Usuario user, UriComponentsBuilder ucBuilder) {
		System.out.println("Creando el usuario " + user.getNombre());
		if (usuarioDAO.existe(user)) {
			System.out.println("Ya existe un usuario con nombre " + user.getNombre());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
			// Código de respuesta 409
		}
		usuarioDAO.persistir(user);
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/users/{id}").buildAndExpand(user.getId()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	// Actualizo un usuario
	@RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Usuario> updateUser(@PathVariable("id") long id, @RequestBody Usuario user) {
		System.out.println("Actualizando el usuario " + id);
		Usuario currentUser = usuarioDAO.recuperar(id);
		if (currentUser == null) {
			System.out.println("User with id " + id + " not found");
			return new ResponseEntity<Usuario>(HttpStatus.NOT_FOUND);
		}
		currentUser.setNombre(user.getNombre());
		currentUser.setApellido(user.getApellido());
		currentUser.setEmail(user.getEmail());
		currentUser.setNick(user.getNick());
		usuarioDAO.modificar(currentUser);
		return new ResponseEntity<Usuario>(currentUser, HttpStatus.OK);
	}

	// Elimino un usuario
	@RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Usuario> deleteUser(@PathVariable("id") long id) {
		System.out.println("Obteniendo y eliminando el usuario con id " + id);
		Usuario user = usuarioDAO.recuperar(id);
		if (user == null) {
			System.out.println("No es posible eliminar, no se encuentra el usuario con id " + id);
			return new ResponseEntity<Usuario>(HttpStatus.NOT_FOUND);
		}
		usuarioDAO.eliminar(id);
		return new ResponseEntity<Usuario>(HttpStatus.NO_CONTENT);
	}
	
	//Chequear Autenticacion
	@RequestMapping(value = "/autenticacion", method = RequestMethod.POST)
	public boolean autenticarUsuario()
	//FALTA ELIMINAR TODOS

}
