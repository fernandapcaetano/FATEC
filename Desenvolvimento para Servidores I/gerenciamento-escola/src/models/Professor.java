package models;

import java.time.LocalDate;

public class Professor extends BaseEntity{

    private LocalDate dataEntrada;
    private Turma turma;
    
    public Professor(int id, String nome, LocalDate dataEntrada, Turma turma) {
        super(id, nome);
        this.dataEntrada = dataEntrada;
        this.turma = turma;
    }
    public LocalDate getDataEntrada() {
        return dataEntrada;
    }
    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
    public Turma getTurma() {
        return turma;
    }
    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    
}
