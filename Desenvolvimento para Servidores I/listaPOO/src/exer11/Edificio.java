package exer11;

import java.util.ArrayList;

public class Edificio {
    private ArrayList<Apartamento> apartamentos; // Lista de apartamentos

    // Construtor inicializa a lista de apartamentos
    public Edificio() {
        this.apartamentos = new ArrayList<>();
    }

    // Método para adicionar um apartamento ao edifício (máximo de 3)
    public void adicionarApartamento(Apartamento apartamento) {
        if (apartamentos.size() < 3) {
            apartamentos.add(apartamento);
        } else {
            System.out.println("O edifício já possui 3 apartamentos.");
        }
    }

    // Método para listar todos os apartamentos
    public void listarApartamentos() {
        for (Apartamento apartamento : apartamentos) {
            System.out.println("Apartamento nº: " + apartamento.getNumeroIdentificador());
        }
    }

    // Método para buscar um apartamento pelo identificador
    public Apartamento buscarApartamento(int numeroIdentificador) {
        for (Apartamento apartamento : apartamentos) {
            if (apartamento.getNumeroIdentificador() == numeroIdentificador) {
                return apartamento;
            }
        }
        System.out.println("Apartamento com ID " + numeroIdentificador + " não encontrado.");
        return null;
    }
}
