public class TestaAluno {
    public static void main(String[] args) {
        Aluno a1, a2, a3;
        a1= new Aluno(1, 19, "Sofia", 9.2f, 10.0f);
        a2 = new Aluno(2, 20, "Amanda", 5.5f, 6.6f);
        a3 = new Aluno(3, 19, "Luciano", 10.0f, 9.9f);

        System.out.println("A nota final de " + a1.nome + " foi: " + a1.notaFinal());
        System.out.println(a2.dadosAluno());
        a3.passou();
    }
}
