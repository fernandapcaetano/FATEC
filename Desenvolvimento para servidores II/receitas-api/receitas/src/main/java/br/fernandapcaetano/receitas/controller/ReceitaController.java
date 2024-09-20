package br.fernandapcaetano.receitas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.fernandapcaetano.receitas.model.Receita;
import br.fernandapcaetano.receitas.service.ReceitaService;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/receitas")
public class ReceitaController {
    
    @Autowired
    private ReceitaService receitaService;

    @PostMapping
    public ResponseEntity<Receita> criar(@RequestBody Receita receita){
        Receita receitaCriada = receitaService.create(receita);
        return ResponseEntity.ok().body(receitaCriada);
    }

    @GetMapping
    public ResponseEntity<List<Receita>> findAll(){
        return ResponseEntity.ok().body(receitaService.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<Receita> getOne(@PathVariable("id") Long id){
        Receita receitaAchada = receitaService.findById(id);
        if (receitaAchada == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(receitaAchada);
    }

    @PutMapping("{id}")
    public ResponseEntity<Receita> updateById(@PathVariable("id") Long id, @RequestBody Receita receita){
        return ResponseEntity.ok().body(receitaService.update(id, receita));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") Long id){
        receitaService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("{ingredients}")
    public ResponseEntity<List<Receita>> findByIngredients(@PathParam("ingredients") List<String> ingredients){
        return receitaService.findByIngredient(ingredients);
    }
}
