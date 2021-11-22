package com.laborsil.start.repositoryController;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.laborsil.start.model.modelUsuario;

@Repository
public interface RepositoryUsuario extends JpaRepository<modelUsuario,Long> {


}
