package ex4;

public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido;

    public Rio(){
        this.nome = "Vazio";
        this.poluido = false;
    }

    public Rio(String nome, float nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    public void chover(float x){
        this.nivel += x;
    }

    public void ensolarar(float x){
        if (this.nivel >= x){
            this.nivel -= x;
        }
        else {
            this.nivel = 0;
        }
    }

    public void limpar(){
        this.poluido = false;
    }

    public void sujar(){
        this.poluido = true;
    }

    public void mostra(){
        System.out.println(
                "Nome: " + this.nome
                + "\nNivel: " + this.nivel
                + "\nPoluido: " + this.poluido + "\n"
        );
    }
}
