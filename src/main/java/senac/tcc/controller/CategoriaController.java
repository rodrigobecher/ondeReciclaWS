package senac.tcc.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import senac.tcc.api.empresas.model.Categoria;
import senac.tcc.api.empresas.model.Residuo;
import senac.tcc.services.CategoriaService;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {

	@Inject
	private CategoriaService serviceCategoria;
	
	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(method = RequestMethod.POST)
    public void adiciona(@RequestBody Categoria categoria) {
		serviceCategoria.salvar(categoria);
    }
	
	@CrossOrigin(origins = "http://localhost:8080")
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> dados(){
		return serviceCategoria.lista();
	}
		
	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(method = RequestMethod.PUT)
	public void altera(@RequestBody Categoria categoria) {
		serviceCategoria.salvar(categoria);	
	}
	
	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void remove(@PathVariable("id") int id) {
		serviceCategoria.delete(id);
	}
}
