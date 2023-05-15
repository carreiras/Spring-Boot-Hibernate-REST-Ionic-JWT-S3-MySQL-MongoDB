package carreiras.com.github.pedidosbackend.controller;

import carreiras.com.github.pedidosbackend.domain.Categoria;
import carreiras.com.github.pedidosbackend.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @RequestMapping(
            value = "/{id}",
            method = RequestMethod.GET
    )
    public ResponseEntity<?> findById(@PathVariable Integer id) {
        Categoria categoria = categoriaService.findById(id);
        return ResponseEntity.ok().body(categoria);
    }
}
