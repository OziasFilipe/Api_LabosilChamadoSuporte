package com.laborsil.start.repositoryController;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.laborsil.start.model.modelService;
import com.laborsil.start.model.modelUsuario;


@Repository
public interface RepositoryController extends JpaRepository<modelService,Long> {
	
	@Query("FROM modelService WHERE andamento_chamado = ?1")
		List<modelService> findByAndamentoChamado(String andamento_chamado);
		
	@Query("FROM modelService WHERE protocolo_chamado = ?1")
		List<modelService> findByProtocoloChamado(Long protocolo_chamado);

	@Query("FROM modelService WHERE prioridade_chamado =?1")
		List<modelService> findByprioridadeChamado(String prioridade_chamado);

	@Query("FROM modelService WHERE nome_usuario = ?1")
		List<modelService> findByNomeUsuario(String nome_usuario);

	@Query("FROM modelUsuario WHERE nome_usuario = ?1")
		List<modelUsuario> findByByUsuarioLogin(String nome_usuario);

	
}
