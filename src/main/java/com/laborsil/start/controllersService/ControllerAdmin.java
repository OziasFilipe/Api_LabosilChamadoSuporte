package com.laborsil.start.controllersService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.laborsil.start.model.modelService;
import com.laborsil.start.model.modelUsuario;
import com.laborsil.start.repositoryController.RepositoryController;
import com.laborsil.start.repositoryController.RepositoryUsuario;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="apiService")
@CrossOrigin(origins="*")
@RestController
@RequestMapping("/")

public class ControllerAdmin {

	@Autowired 
	private RepositoryController repositorioController;
	
	@Autowired
	private RepositoryUsuario repositorioUsuario;
	
	//Get usuario medio 
	//	
	@GetMapping("postservice")
	public modelService teste (modelService servico) {
		return servico;
	}
	
	@GetMapping("postusuario")
	public modelUsuario teste2 (modelUsuario servico) {
		return servico;
	}
	
	@GetMapping("usuarioAll")
	@ApiOperation(value = "Obter todos os usuarios")
	public List<modelUsuario> GetAllUsuario(modelUsuario usuario) {
		return repositorioUsuario.findAll();
	}
	
	@GetMapping("admServicoAll")
	@ApiOperation(value = "Obter todos os servicos")
	public List<modelService> GetAllService(){
		return repositorioController.findAll();
	}
	
	@GetMapping("admChamadoAberto")
	@ApiOperation(value = "Obter todos os  chamados")
	public List<modelService> GetAllChamadoAberto(@RequestParam(value="admChamadoAberto")String andamento_chamado) {
		return repositorioController.findByAndamentoChamado(andamento_chamado);
	}
	
	@GetMapping("admProtocoloChamado/{protocolo_chamado}")
	@ApiOperation(value="Obter atraves do protocolo")
	public List<modelService> GetAllProtocolo(@PathVariable(value="protocolo_chamado") Long protocolo_chamado){
		return repositorioController.findByProtocoloChamado(protocolo_chamado);
	}
	
	@GetMapping("admPrioridadeChamado")
	@ApiOperation(value="Obter atraves da prioridade da chamada")
	public List<modelService> GetAllPriorideChamado(@RequestParam(value="prioridadeChamado") String prioridade_chamado){
		return repositorioController.findByprioridadeChamado(prioridade_chamado);
	}
	
	@GetMapping("usuarioLogin")
	@ApiOperation(value = "Obter usuario")
	public List<modelUsuario> GetUsuario (@RequestParam(value = "usuarioLogin")String nomeUsuario){
		return repositorioController.findByByUsuarioLogin(nomeUsuario);
	}
	
	//Post usuario medio 
	//
	@PostMapping("admAAbrirChamado")
	@ApiOperation(value = "Abrir chamado")
	public modelService PostAbrirChamado(@RequestBody modelService chamado) {
		return repositorioController.save(chamado);
	}
	
	@PostMapping("admACreateUsuario")
	public modelUsuario PostCreateUsuario(@RequestBody modelUsuario usuario) {
		return repositorioUsuario.save(usuario);
	}
	//Put usuario medio 
	//
	@PutMapping("admAlterarSenha")
	@ApiOperation(value = "Atualizar senha Usuario adm")
	public modelUsuario PutMedioUsuarioSenha(@RequestBody modelUsuario Usuario){
		return repositorioUsuario.save(Usuario);
	}
	
	@PutMapping("admAlterarServico")
	@ApiOperation(value = "atualiar os servoços")
	public modelService PutAdmService(@RequestBody modelService servico) {
		return repositorioController.save(servico);
	}
	// Delete Usuario 
	@DeleteMapping("deleteAllBancohash334059")
	@ApiOperation(value = "Deletar All Usuario")
	public void deleteA() {
		repositorioUsuario.deleteAll();	 
	}
}
