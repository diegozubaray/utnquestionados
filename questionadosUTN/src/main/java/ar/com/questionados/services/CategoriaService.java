package ar.com.questionados.services;

import java.util.List;

import com.google.common.base.Optional;

import ar.com.questionados.models.Categoria;

public interface CategoriaService{
	

	public List<Categoria> obtenerTodas();	
	
	public Categoria obtenerPorId(Long id);
	
	List<Categoria> findAllById(Iterable<Long> id);
	
	public void insertar(Categoria categoria);
	
	public void eliminar(Long id);
}
