package br.edu.iftm.Poli;

public abstract class Produto {
    private String marca;
    private int codigoMercadoria;
    private int voltagem;
    
    public Produto(String marca, int codigoMercadoria, int voltagem){
        this.marca = marca;
        this.codigoMercadoria = codigoMercadoria;
        this.voltagem = voltagem;

    }

    public abstract void vender();

    public abstract void reservar();


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCodigoMercadoria() {
        return codigoMercadoria;
    }

    public void setCodigoMercadoria(int codigoMercadoria) {
        this.codigoMercadoria = codigoMercadoria;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
    
}
