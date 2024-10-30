package conjunto;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Conjunto {
private static Map<Integer, Aluno> mapa = new HashMap<>();
private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
    
    Integer escolha = 0,i=0;
    while(escolha!=10){
        System.out.println("1.Cadastrar\n2.Media dos alunos\n3.Aprovados e reprovados\n4.Buscar por matricula\n5.Ordem alfabetica\n6.Exibir todos\n10.Sair");
        escolha = scanner.nextInt();
        scanner.nextLine();
        if (escolha==1){
            cadastrar();
        }else if(escolha==2){
            media();
        }else if(escolha==3){
            aprovadosEReprovados();
        }else if(escolha==4){
            buscarPorMatricula();
        }else if(escolha==5){
            nomesEmOrdem();
        }else if(escolha==6){
            exibirTudo();
        }else if(escolha==10){
            System.out.println("saindo...");
        }else{
            System.out.println("Escolha invalida");
        }
        i++;
    }
        
}
    public static void cadastrar(){
        Double [] aux = new Double [2];
        Integer matricula;
        String nome, email;
        System.out.println("Nome: ");
                    nome = scanner.nextLine();
                    System.out.println("Matricula: ");
                    matricula = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Email: ");
                    email = scanner.nextLine();
                    System.out.println("Primeira nota: ");
                    aux[0] = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Segunda nota: ");
                    aux[1] = scanner.nextDouble();
                    scanner.nextLine();
                    //instanciando objeto
                    Aluno a1 = AlunoFactory.create(nome, matricula, email, aux);
                    //pondo objeto num set
                    Set<Aluno> Setalunos = new HashSet<>();
                    Setalunos.add(a1);
                    //pondo num mapa

                    mapa.put(a1.getMatricula(), a1);
                    
                    
    }
    
    public static void media(){
        for (Aluno a : mapa.values() ){
            Double[] notas = a.getNotas();
            if (notas != null && notas.length >= 2){
                double auxiliar = (notas[0] + notas[1]);
                System.out.println("Media: " + auxiliar / 2);
            }       
        }
    }
    
    public static void aprovadosEReprovados(){
        for (Aluno a : mapa.values() ){
            Double[] notas = a.getNotas();
            if (notas != null && notas.length >= 2){
                double auxiliar = (notas[0] + notas[1]) /2;
                if (auxiliar > 7.){
                    System.out.println("Aluno aprovado");
                    System.out.println(a);
                }
                else{
                    System.out.println("Aluno reprovado");
                    System.out.println(a);
                }
                
            }       
        }     
    }
    
    public static void buscarPorMatricula(){
        Integer matriculaEscolhida;
        System.out.println("Matricula que deseja buscar: ");
        matriculaEscolhida = scanner.nextInt();
       for (Aluno a : mapa.values()){
           Integer matricula = a.getMatricula();
           if (matricula!=null && matricula == matriculaEscolhida){
               System.out.println("Nome: " + a.getNome());
           }
       }
}
    public static void nomesEmOrdem(){
       SortedSet<String>ss = new TreeSet<String>();
       for (Aluno a: mapa.values()){
           ss.add(a.getNome());
       }
           System.out.println("Nome: " + ss);
    }
    public static void exibirTudo(){
        for (Aluno a: mapa.values()){
            System.out.println(a);
       }
    }
}