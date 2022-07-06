package ar.com.questionados.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.google.common.base.Optional;

import ar.com.questionados.models.Categoria;
import ar.com.questionados.repository.CategoriaRepository;
import ar.com.questionados.services.CategoriaService;

public class CategoriaServiceImpl implements CategoriaService{
	
	@Autowired
	private CategoriaRepository cr;



	@Override
	public List<Categoria> obtenerTodas() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Categoria> findAllById(Iterable<Long> id) {
		// TODO Auto-generated method stub
		return cr.findAllById(id);
	}

	@Override
	public void insertar(Categoria categoria) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Categoria obtenerPorId(Long id) {
		return cr.findById(id).get();
	}

	


}
