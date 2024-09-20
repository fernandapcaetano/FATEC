package br.fernandapcaetano.receitas.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.fernandapcaetano.receitas.model.Receita;

@Service
public class ReceitaService {
    
    public static List<Receita> receitas = new ArrayList<>();
    private Random random = new Random();

    //create
    public Receita create(Receita receita){
        receita.setId(gerarId());
        receitas.add(receita);
        return receita;
    }

    //read
    public List<Receita> findAll(){
        return receitas;
    }

    public Receita findById(Long id){
        if (id == null) {
            return null;
        }
        
        for (Receita elemento : receitas) {
            if (elemento.getId().equals(id)) {
                return elemento; 
            }
        }
        return null;
    }
    
    public Receita update(Long id, Receita receitaUpdateRequest){
        Receita receitaOriginal = findById(id);
        receitaOriginal.setNome(receitaUpdateRequest.getNome());
        receitaOriginal.setIngredientes(receitaUpdateRequest.getIngredientes());
        receitaOriginal.setInstrucoes(receitaUpdateRequest.getInstrucoes());
        return receitaOriginal;
    } 
    
    public void deleteById(Long id) {
        Receita receita = findById(id);
        receitas.remove(receita);
    }

    public List<Receita> findByIngredient(List<String> ingredients) {
        
    }
    
    public Long gerarId(){
        return Math.abs(random.nextLong());
    }
}
