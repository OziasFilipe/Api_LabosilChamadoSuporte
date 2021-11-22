package com.laborsil.start.controllersService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.laborsil.start.model.modelService;
import com.laborsil.start.model.modelUsuario;
import com.laborsil.start.repositoryController.RepositoryController;
import com.laborsil.start.repositoryController.RepositoryUsuario;

import io.swagger.annotations.ApiOperation;

@RestController
public class ControllerMedio {
	
	@Autowired 
	private RepositoryController repositorioController;
	
	@Autowired
	private RepositoryUsuario repositorioUsuario;
	
	//Get usuario medio 
	//
	@GetMapping("medioNomeUsuario")
	@ApiOperation(value = "Meus Chamados basico")
	public List<modelService> NomeUsuario (@RequestParam(value="medioNomeUsuario") String nome_usuario){
		return repositorioController.findByNomeUsuario(nome_usuario);
	}
	
	//Post usuario medio 
	//
	@PostMapping("medioAbrirChamado")
	@ApiOperation(value = "Abrir chamado")
	public modelService PostMedioAbrirChamado(@RequestBody modelService chamado) {
		return repositorioController.save(chamado);
	}
	
	@PostMapping("medioCreateUsuario")
	public modelUsuario PostCreateUsuarioMedio(@RequestBody modelUsuario usuario) {
		return repositorioUsuario.save(usuario);
	}
	
	//Put usuario medio 
	//
	@PutMapping("medioAlterarSenha")
	@ApiOperation(value = "Atualizar senha Usuario medio")
	public modelUsuario PutMedioUsuarioSenha(@RequestBody modelUsuario Usuario){
		return repositorioUsuario.save(Usuario);
	}
}
