package ar.com.questionados.services;

import java.util.List;

import ar.com.questionados.models.Respuesta;

public interface RespuestaService{
	
	public Respuesta crearRespuesta(Respuesta respuesta);

	public Respuesta obtenerPorId(Long id);

	public List<Respuesta> obtenerTodas();

}
