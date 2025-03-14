package ex0;

public class Carro {
    // private
    private String marca, modelo;
    private int ano;
    private float valocidade;

    public Carro(){
        this.marca = "Sem marca";
        this.modelo = "Sem modelo";
    }

    public Carro(String marca, String modelo, int ano, float velocidade){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
        this.setVelocidade(velocidade);
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setVelocidade(float valocidade){
        if (valocidade >= 0){
            this.valocidade = valocidade;
        }
        else{
            System.out.println("Valocidade invalida");
        }
    }

    public void setAno(int ano){
        if (ano >= 0){
            this.ano = ano;
        }
        else{
            System.out.println("Ano invalido");
        }
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getMarca(){
        return this.marca;
    }

    public float getVelocidade(){
        return this.valocidade;
    }

    public int getAno(){
        return this.ano;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + this.marca + '\'' +
                ", modelo='" + this.modelo + '\'' +
                ", ano=" + this.ano +
                ", valocidade=" + this.valocidade +
                '}';
    }

    public void acelerar(float x){
        this.valocidade += x;
        this.vericaVelMaxima();
    }

    private void vericaVelMaxima(){
        if (this.valocidade > 200){
            this.valocidade = 200;
        }
    }
}
