package conjunto;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private Integer matricula;
    private String email;
    private Double[] notas = new Double[2]; 

    protected Aluno(String nome, Integer matricula, String email, Double[] notas){
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
        this.notas = notas;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


      
    @Override
    public String toString(){
        return "Nome: " + nome +
               "\nEmail: " + email + 
               "\nMatricula: " + matricula + 
               "\nNota 1: " + notas[0] + "Nota 2: " + notas[1]+"\n";
    }

    public Double[] getNotas() {
        return notas;
    }

    public void setNotas(Double[] notas) {
        this.notas = notas;
    }
}