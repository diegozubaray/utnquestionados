package ar.com.questionados.models.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.questionados.models.Categoria;
import ar.com.questionados.repository.CategoriaRepository;

@RestController
@RequestMapping("/api/Categorias")
public class CategoriasContoller {
	
	@Autowired
	private CategoriaRepository cr;
	
	@GetMapping
	public List<Categoria> getAllCategoria() {
		return (List<Categoria>) cr.findAll();
	}
	
	@PostMapping
	public void createCategoria(@RequestBody Categoria categoria)	{
		cr.save(categoria);
	}
	
	@GetMapping("/{id}")
	public Categoria getCategoria(Long id) {
		return cr.findById(id).get();
	}	
	
	
	@DeleteMapping(value="/{id}")
	public void deleteCategoria(@PathVariable("id") Long id)
	{
		cr.deleteById(id);
	}
}
