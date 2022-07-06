package ar.com.questionados.services.Impl;


import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import ar.com.questionados.models.Pregunta;
import ar.com.questionados.models.Respuesta;
import ar.com.questionados.repository.PreguntaRepository;
import ar.com.questionados.repository.RespuestaRepository;
import ar.com.questionados.services.QuestionadosService;

public class QuestionadosServiceImpl implements QuestionadosService  {
	
	@Autowired
	PreguntaRepository preguntaRepo;
	@Autowired
	RespuestaRepository respuestaRepo;

	@Override
	public Pregunta getPreguntaByCategoriaId(Long id) {
		List<Pregunta> listaPreguntas = preguntaRepo.getCategoriaById(id);
		int cantidadPreguntas = listaPreguntas.size();
		Random rand = new Random();
		Pregunta preguntaRandom = listaPreguntas.get(rand.nextInt(0));
		Pregunta preguntaObtenida = new Pregunta();
		preguntaObtenida.setEnunciado(preguntaRandom.getEnunciado());
		preguntaObtenida.setIdcategoria(preguntaRandom.getIdcategoria());
		Set<Respuesta> respuestas = new HashSet<>();
		for (Respuesta respuesta : preguntaRandom.getRespuestas()) {
			Respuesta respuestaFE = new Respuesta();
			respuestaFE.setIdRespuesta(respuesta.getIdRespuesta());
			respuestaFE.setTexto(respuesta.getTexto());
			respuestas.add(respuestaFE);
		}
		preguntaObtenida.setRespuestas(respuestas);
		return preguntaObtenida;
	}


	@Override
	public Boolean validarRespuesta(Respuesta respuestaUsuarioDTO) {
		Respuesta respuestaUsuario = respuestaRepo.findById(respuestaUsuarioDTO.getIdRespuesta()).get();
		if (respuestaUsuario.isEsCorrecta()) {
			return true;
		} else {
			return false;
		}
	}

}
