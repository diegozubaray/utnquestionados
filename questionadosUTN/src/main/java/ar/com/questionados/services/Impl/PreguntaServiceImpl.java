package ar.com.questionados.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ar.com.questionados.models.Pregunta;
import ar.com.questionados.repository.PreguntaRepository;
import ar.com.questionados.services.PreguntaService;

public class PreguntaServiceImpl implements PreguntaService {
	
	@Autowired
	private PreguntaRepository pr;

	@Override
	public List<Pregunta> obtenerTodas() {
		return pr.findAll();
	}

	@Override
	public void insertar(Pregunta pregunta) {
	}

	@Override
	public Pregunta obtenerPorId(Long id) {
		return pr.findById(id).get();
	}


}
