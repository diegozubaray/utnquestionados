package ar.com.questionados.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.questionados.models.Respuesta;

@Repository
public interface RespuestaRepository extends JpaRepository<Respuesta, Long> {

}
