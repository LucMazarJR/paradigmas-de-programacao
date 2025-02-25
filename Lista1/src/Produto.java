public class Produto {
    public int id;
    public String descricao;
    public int qtde;
    public float preco;

    public Produto(){
        descricao = "Vazio";
    }

    public Produto(int id, String descricao, int qtde, float preco){
        this.id = id;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }

    public void comprar(int x){
        this.qtde += x;
    }

    public void vender(int x){
        if (this.qtde >= x){
            this.qtde -= x;
        }
        else{
            this.qtde = 0;
        }
    }

    public void subir(int x){
        this.preco += x;
    }

    public void descer(int x){
        if (this.preco >= x){
            this.preco -= x;
        }
        else{
            this.preco = 0;
        }
    }

    public void mostra(){
        System.out.println(
                "Id: " + this.id
                + "\nDescricao: " + this.descricao
                + "\nQuantidade: " + this.qtde
                + "\nPreco: " + this.preco + "\n"
        );
    }
}
