package senac.tcc.controller;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import senac.tcc.api.empresas.model.Cliente;
import senac.tcc.services.ClienteService;


@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Inject 
	ClienteService service;
	
	@RequestMapping(method = RequestMethod.POST)
	@CrossOrigin(origins = "http://localhost:8080")
	public Cliente gravaCliente(@RequestBody Cliente cliente) {
		return service.salvar(cliente);
	}
	
	@RequestMapping(value = "/validaCliente", method = RequestMethod.POST)
	public Cliente verificaUsuario(@RequestBody Cliente cliente) {
		Cliente clienteExiste = service.verificaUsuario(cliente); 
		return clienteExiste;
	}
	
	
	
	
}
 