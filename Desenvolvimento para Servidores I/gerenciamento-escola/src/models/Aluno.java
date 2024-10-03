package models;

import java.time.LocalDate;

public class Aluno {
    private LocalDate dataEntrada;
    private Turma turma;
    
    public Aluno(LocalDate dataEntrada, Turma turma) {
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
