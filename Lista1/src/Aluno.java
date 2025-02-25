import javax.swing.*;

public class Aluno {
    public int numeroAluno;
    public String nome;
    public int idade;
    public float p1;
    public float p2;

    public Aluno(){
        this.nome = "Vazio";
    }
    public Aluno(int numeroAluno, int idade, String nome, float p1, float p2){
        this.numeroAluno = numeroAluno;
        this.idade = idade;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }

    public float notaFinal(){
        return (this.p1 + this.p2)/2;
    }

    public String dadosAluno(){
        return("Numero Aluno: " + numeroAluno +
                "\nNome: " + nome +
                "\nIdade: " + idade);
    }

    public void passou(){
        if (this.notaFinal() >= 6){
            System.out.println(this.nome + " Passou!");
        }
        else{
            System.out.println(this.nome + " Não Passou!");
        }
    }
}
