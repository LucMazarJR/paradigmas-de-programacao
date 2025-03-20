package ex2;

public class Aluno {
    private String numeroAluno;
    private String nome;
    private int idade;
    private float p1;
    private float p2;

    public Aluno(){
        this.numeroAluno = "000000";
        this.nome = "Sem nome";
    }

    public Aluno(String numeroAluno, String nome, int idade, float p1, float p2) {
        this.setNumeroAluno(numeroAluno);
        this.setNome(nome);
        this.setIdade(idade);
        this.setP1(p1);
        this.setP2(p2);
    }

    public String getNumeroAluno() {
        return numeroAluno;
    }

    public void setNumeroAluno(String numeroAluno) {
        if (numeroAluno.length() != 6) {
            System.out.println("Numero Aluno invalido");
        }
        this.numeroAluno = numeroAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() <= 30){
            this.nome = nome;
        }
        else{
            System.out.println("Nome invalido");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade < 0){
            System.out.println("idade invalida");
        }
        else{
            this.idade = idade;
        }
    }

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        if(p1 < 0){
            System.out.println("Nota invalida");
        }
        else{
            this.p1 = p1;
        }
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        if(p2 < 0){
            System.out.println("Nota invalida");
        }
        else{
            this.p2 = p2;
        }
    }

    public double notaFInal(){
        return (this.p1 + this.p2)/2.0;
    }

    public String dadosAluno(){
        return "Numero do Aluno: " + this.numeroAluno +
                "\nNome: " + this.nome +
                "\nIdade: " + this.idade;
    }
}
