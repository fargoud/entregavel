package br.com.digitalhouse;

public class Aluno {
    private String nomeAluno;
    private String sobrAluno;
    private Integer codAluno;

    public Aluno(String nome, String sobrenome, Integer codAluno) {
        this.nomeAluno = nome;
        this.sobrAluno = sobrenome;
        this.codAluno = codAluno;
    }

    public String getNome() {
        return nomeAluno;
    }

    public void setNome(String nome) {
        this.nomeAluno = nome;
    }

    public String getSobrenome() {
        return sobrAluno;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrAluno = sobrenome;
    }

    public Integer getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(Integer codAluno) {
        this.codAluno = codAluno;
    }
}
