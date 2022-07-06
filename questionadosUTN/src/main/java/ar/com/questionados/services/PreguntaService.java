package ar.com.questionados.services;

import java.util.List;

import ar.com.questionados.models.Pregunta;

public interface PreguntaService{
	
	public List<Pregunta> obtenerTodas();	
	
	public void insertar(Pregunta pregunta);
	
	Pregunta obtenerPorId(Long id);

}
