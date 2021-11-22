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
public class ControllerBasic {
	
	@Autowired 
	private RepositoryController repositorioController;
	
	@Autowired
	private RepositoryUsuario repositorioUsuario;
	 
	//Get usuario basic 
	//
	@GetMapping("basicNomeUsuario")
	@ApiOperation(value = "Meus Chamados basico")
	public List<modelService> NomeUsuario (@RequestParam(value="basicNomeUsuario") String nome_usuario){
		return repositorioController.findByNomeUsuario(nome_usuario);
	}
	
	//Post usuario medio 
	//
	@PostMapping("basicAAbrirChamado")
	@ApiOperation(value = "Abrir chamado")
	public modelService PostBasicAbrirChamado(@RequestBody modelService chamado) {
		return repositorioController.save(chamado);
	}
	
	//Put usuario medio 
	//
	@PutMapping("basicAlterarSenha")
	@ApiOperation(value = "Atualizar senha Usuario basico")
	public modelUsuario PutUsuarioSenha(@RequestBody modelUsuario Usuario){
		return repositorioUsuario.save(Usuario);
	}
}
