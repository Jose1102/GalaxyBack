package escuelaing.arsw.galaxy.appgalaxy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import escuelaing.arsw.galaxy.appgalaxy.repository.IUsuarioRepo;
import escuelaing.arsw.galaxy.appgalaxy.model.Usuario;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/galaxy")
public class GalaxyGameController {
	
	@Autowired
	private IUsuarioRepo repo;
	
	
	@GetMapping("/usuarios")
	public List<Usuario> usuarios(){
		return repo.findAll();
	}  
	
	
	
	@PostMapping("/usuarios")
	public Usuario insertar(@RequestBody Usuario u) {
		return repo.save(u);
	}

}