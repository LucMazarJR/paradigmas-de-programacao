import ex1.Cliente;

public class TesteCliente {
    public static void main(String[] args) {
        Cliente fulano = new Cliente();
        Cliente fulano2 = new Cliente("111111-1", "1111-1", "Ciclano", 0);

        fulano.setNome("fulano");
        fulano.setSaldo(500);
        fulano.setNumeroAgencia("1234-5");
        fulano.setNumeroConta("123456-7");

        // fulano.nome = "Ciclano"; - Não Conseque acessar...

        System.out.println(fulano.imprimir());

        fulano.realizarDeposito(200);
        fulano.realizarSaque(100);

        System.out.println(fulano.imprimir());

        System.out.println(fulano.getSaldo());
        System.out.println(fulano.getNumeroAgencia());
        System.out.println(fulano.getNumeroConta());
        System.out.println(fulano.getNome());

        System.out.println(fulano2.imprimir());
    }
}
