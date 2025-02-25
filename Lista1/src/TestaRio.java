public class TestaRio {
    public static void main(String[] args) {
        Rio a = new Rio("Nilo", 100f, true);
        Rio b = new Rio();

        a.mostra();
        b.mostra();

        a.chover(100);
        b.chover(50);

        a.mostra();
        b.mostra();

        a.ensolarar(200);
        b.ensolarar(10);

        a.mostra();
        b.mostra();

        a.limpar();
        b.sujar();

        a.mostra();
        b.mostra();
    }
}
