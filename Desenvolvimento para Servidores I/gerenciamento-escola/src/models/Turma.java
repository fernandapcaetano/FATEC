package models;

import java.util.List;

//Extendendo a entidade base
public class Turma extends BaseEntity {
    private String descricao;
    private Professor professor;
    private List<Aluno> alunos;

    public Turma(int id, String nome, String descricao, Professor professor, List<Aluno> alunos) {
        //Referenciando os atributos da classe mãe
        super(id, nome);
        this.descricao = descricao;
        this.professor = professor;
        this.alunos = alunos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    
    
}
