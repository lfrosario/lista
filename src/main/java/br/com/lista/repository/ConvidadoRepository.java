package br.com.lista.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.lista.model.Convidado;

public interface ConvidadoRepository extends CrudRepository<Convidado, Long>{
	List<Convidado> findByNome(String nome);
}

