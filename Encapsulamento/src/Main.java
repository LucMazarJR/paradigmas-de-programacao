import ex0.Carro;

public class Main {
    public static void main(String[] args) {
        Carro obj1 = new Carro();

        obj1.setMarca("Ferrari");

        obj1.setVelocidade(10);

        System.out.println("Ano: " + obj1.getAno());

        Carro obj2 = new Carro("Chevrolet", "Onix", 2021, 0);
    }
}