package br.com.digitalhouse;

public class Professor {
    private String nome;
    private String sobrenome;
    private Integer tempoCasa;
    private Integer codProfessor;

    public Professor() {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tempoCasa = tempoCasa;
        this.codProfessor = codProfessor;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getTempoCasa() {
        return tempoCasa;
    }

    public void setTempoCasa(Integer tempoCasa) {
        this.tempoCasa = tempoCasa;
    }

    public Integer getCodProfessor() {
        return codProfessor;
    }

    public void setCodProfessor(Integer codProfessor) {
        this.codProfessor = codProfessor;
    }
}
