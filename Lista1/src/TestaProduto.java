public class TestaProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto(1, "TV", 20, 1500.0f);
        Produto p2 = new Produto();

        p1.mostra();
        p2.mostra();

        p1.comprar(10);
        p2.comprar(20);

        p1.vender(5);
        p2.vender(20);

        p1.mostra();
        p2.mostra();

        p1.subir(1000);
        p2.subir(200);

        p1.descer(100000000);
        p2.descer(1);

        p1.mostra();
        p2.mostra();
    }
}
