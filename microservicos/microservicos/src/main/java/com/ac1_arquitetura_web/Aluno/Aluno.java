package com.ac1_arquitetura_web.Aluno;

public class Aluno {
    private Long id;
    private String nome;
    private int idade;
    private String curso;
    private String email;


    // Construtor
    public Aluno(Long id, String nome, int idade, String curso, String email) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.email = email;
    }
    
    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


