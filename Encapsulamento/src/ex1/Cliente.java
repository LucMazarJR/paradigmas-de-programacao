package ex1;
//Testeeeeeeeeee
public class Cliente {
    private String numeroConta;
    private String numeroAgencia;
    private String nome;
    private float saldo;

    public Cliente(){
        this.numeroConta = "Sem Numero da Conta";
        this.numeroAgencia = "Sem Numero da Agencia";
        this.nome = "Sem Nome";
    }

    public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo) {
        this.setNumeroConta(numeroConta);
        this.setNumeroAgencia(numeroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }

    public void setNumeroConta(String numeroConta) {
        if(numeroConta.length() != 8 && numeroConta.charAt(6) != '-'){
            System.out.println("Número da conta invalido, Recomendado: XXXXXX-X");
        }
        else{
            this.numeroConta = numeroConta;
        }
    }

    public void setNumeroAgencia(String numeroAgencia) {
        if(numeroAgencia.length() != 6 && numeroConta.charAt(4) != '-'){
            System.out.println("Número da agencia invalido, Recomendado: XXXX-X");
        }
        else{
            this.numeroAgencia = numeroAgencia;
        }
    }

    public void setNome(String nome) {
        if (nome.length() > 30){
            System.out.println("Nome muito grande...");
        }
        else{
            this.nome = nome;
        }
    }

    public void setSaldo(float saldo) {
        if (saldo < 0){
            System.out.println("Valor invalido");
        }
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public String getNome() {
        return nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void realizarDeposito(float valor){
        if (valor >= 0){
            this.saldo += valor;
        }
        else{
            System.out.println("Valor invalido");
        }
    }

    public void realizarSaque(float valor){
        if(this.saldo - valor >= 0 && valor >= 0){
            this.saldo -= valor;
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }

    public String imprimir() {
        return "Dados dos Clientes: \n" +
                "   Numero da Conta: " + this.numeroConta + '\n' +
                "   Numero da Agencia: " + this.numeroAgencia + '\n' +
                "   Nome: " + this.nome + '\n' +
                "   Saldo: " + this.saldo;
    }
}
