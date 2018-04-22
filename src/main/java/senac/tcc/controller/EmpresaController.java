package senac.tcc.controller;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import senac.tcc.api.empresas.model.Empresa;
import senac.tcc.services.EmpresaService;

@RestController
@RequestMapping("/api/empresas")
public class EmpresaController {
	
	@Inject
	private EmpresaService service;
	
	
	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(method = RequestMethod.POST)
    public void adiciona(@RequestBody Empresa empresa) {
       service.salvar(empresa);
    }
	
	@RequestMapping("/cu")
	@GET
	public Empresa teste() {
		Empresa empresa = new Empresa();
		empresa.setNome("teste");
		empresa.setEndereco("teste");
		empresa.setId(1);
		return empresa;
	}
	@CrossOrigin(origins = "http://localhost:8080")
	@ResponseBody
	@Produces(MediaType.APPLICATION_JSON)
	@RequestMapping(method = RequestMethod.GET)
	public List<Empresa> dados(){
		return service.lista();
	}
	
	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/{id}" , method = RequestMethod.GET)
	public Empresa busca(@PathVariable("id") int id) {
			Empresa empresa = service.find(id);
			return empresa;
		
	}
	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(method = RequestMethod.PUT)
	public void altera(@RequestBody Empresa empresa) {
		service.alterar(empresa);	
	}
	
	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void remove(@PathVariable("id") int id) {
		service.delete(id);
	}

}
