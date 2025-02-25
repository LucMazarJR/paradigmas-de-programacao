public class Cliente {
    public int numeroConta;
    public int numeroAgencia;
    public String nome;
    public float saldo;

    public Cliente() {
        this.nome = "Vazio";
    }
    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void realizarDeposito(float valor) {
        this.saldo += valor;
    }

    public void realizarSaque(float valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        }
        else{
            this.saldo = 0;
        }
    }

    public String mostrarCliente() {
        return  "Nome: " + this.nome + "\n"
        + "Numero da conta: " + this.numeroConta + "\n"
        + "Saldo da conta: " + this.saldo;
    }
}
