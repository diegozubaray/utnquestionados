package ar.com.questionados.services;

import ar.com.questionados.models.Pregunta;
import ar.com.questionados.models.Respuesta;

public interface QuestionadosService {

	Pregunta getPreguntaByCategoriaId(Long id);

	Boolean validarRespuesta(Respuesta respuesta);
	
}
