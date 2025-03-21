import ex2.Aluno;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNome("Maria");
        aluno.setIdade(18);
        aluno.setNumeroAluno(123456);
        aluno.setP1(10);
        aluno.setP2(0);

        System.out.println(aluno.dadosAluno());
        System.out.println("Sua média final foi: " + aluno.notaFInal());

        //aluno.nome = "Clara" - Da erro
    }
}
