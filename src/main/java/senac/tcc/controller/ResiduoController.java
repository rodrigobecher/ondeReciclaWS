package senac.tcc.controller;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import senac.tcc.api.empresas.model.Categoria;
import senac.tcc.api.empresas.model.Residuo;
import senac.tcc.services.ResiduoService;

@RestController
@RequestMapping("/api/residuos")
public class ResiduoController {
	
	@Inject
	private ResiduoService serviceResiduo;
	
	
	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(method = RequestMethod.POST)
    public void adiciona(@RequestBody Residuo residuo) {
        serviceResiduo.salvar(residuo);
    }
	
	@CrossOrigin(origins = "http://localhost:8080")
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET)
	public List<Residuo> dados(){
		return serviceResiduo.lista();
	}
	
	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/{id}" , method = RequestMethod.GET)
	public Residuo busca(@PathVariable("id") int id) {
			return serviceResiduo.find(id);
		
	}
	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(method = RequestMethod.PUT)
	public void altera(@RequestBody Residuo residuo) {
		serviceResiduo.salvar(residuo);	
	}
	
	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void remove(@PathVariable("id") int id) {
		serviceResiduo.delete(id);
	}
	
	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/categoria", method = RequestMethod.GET)
	public List<Categoria> listaCategoria() {
		return serviceResiduo.listaCategoria();
	}
}
