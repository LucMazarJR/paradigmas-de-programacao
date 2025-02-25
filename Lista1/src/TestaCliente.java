public class TestaCliente {
    public static void main(String[] args) {
        Cliente fulano = new Cliente(1, 1, "Fulano", 0.0f);
        Cliente beltrano = new Cliente(2, 1, "Beltrano", 1000.0f);

        fulano.realizarDeposito(1000);
        beltrano.realizarDeposito(10);

        fulano.realizarSaque(10);
        beltrano.realizarSaque(1000);

        System.out.println(fulano.mostrarCliente());
        System.out.println(beltrano.mostrarCliente());
    }
}
