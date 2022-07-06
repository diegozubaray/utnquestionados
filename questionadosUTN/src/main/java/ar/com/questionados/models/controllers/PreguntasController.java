package ar.com.questionados.models.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.questionados.models.Categoria;
import ar.com.questionados.models.Pregunta;
import ar.com.questionados.repository.PreguntaRepository;

@RestController
@RequestMapping("/api/preguntas")
public class PreguntasController {
	
	
	@Autowired
	private PreguntaRepository pr;
	
	
	@GetMapping
	public List<Pregunta> getAllPreguntas() {
		return (List<Pregunta>) pr.findAll();
	}

	
	@PostMapping
	public void createPregunta(@RequestBody Pregunta pregunta)	{
		pr.save(pregunta);
	}
	
	@GetMapping("/{id}")
	public Pregunta obtenerPorId(Long id) {
		return pr.findById(id).get();
	}
}
