package ar.com.questionados.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ar.com.questionados.models.Pregunta;

@Repository
public interface PreguntaRepository extends JpaRepository<Pregunta, Long> {

	@Query("SELECT p FROM Pregunta p WHERE p.categoria.id = :idcategorias")
	List<Pregunta> getCategoriaById(
			 @Param("idcategorias") Long categoriaId
			);
	
}
