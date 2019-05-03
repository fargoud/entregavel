package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nomeCurso;
    private Integer codCurso;
    private Integer quantMaxAlunos;
    private ArrayList<Aluno> alunosMatriculados;

    public Curso(String nome, Integer codCurso, Integer quantMaxAlunos, ArrayList<Aluno> alunosMatriculados) {
        this.nomeCurso = nome;
        this.codCurso = codCurso;
        this.quantMaxAlunos = quantMaxAlunos;
        this.alunosMatriculados = alunosMatriculados;
    }

    public String getNome() {
        return nomeCurso;
    }

    public void setNome(String nome) {
        this.nomeCurso = nome;
    }

    public Integer getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(Integer codCurso) {
        this.codCurso = codCurso;
    }

    public Integer getQuantMaxAlunos() {
        return quantMaxAlunos;
    }

    public void setQuantMaxAlunos(Integer quantMaxAlunos) {
        this.quantMaxAlunos = quantMaxAlunos;
    }

    public ArrayList<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void setAlunosMatriculados(ArrayList<Aluno> alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }



}
