package conjunto;

public class AlunoFactory {
    
    public static Aluno create (String nome, Integer matricula, String email, Double[] notas){       
        return new Aluno(nome, matricula, email, notas);
    }
    
}
