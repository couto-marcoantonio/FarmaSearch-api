package br.com.ceub.FarmaSearchapi.controller;

import br.com.ceub.FarmaSearchapi.dto.FarmaciaDto;
import br.com.ceub.FarmaSearchapi.repository.FarmaciaRepository;
import br.com.ceub.FarmaSearchapi.service.FarmaciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.List;

@RestController("/api/farmacia")
public class FarmaciaController {

    @Autowired
    private FarmaciaService service;

    @Autowired
    private FarmaciaRepository repository;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public FarmaciaDto cadastrar(@Valid @RequestBody FarmaciaDto farmacia) throws Exception {
        return this.service.cadastrar(farmacia);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<FarmaciaDto> listarTodos(){
        return this.service.listarTodos();
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public FarmaciaDto alterar(@RequestBody FarmaciaDto farmacia){
        return this.service.alterar(farmacia);
    }

    @DeleteMapping(name = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deletar(@PathVariable BigDecimal id){
        this.repository.deleteById(id);
    }


}
