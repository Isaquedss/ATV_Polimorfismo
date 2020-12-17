package br.edu.iftm.Poli.Mercadoria;

import br.edu.iftm.Poli.Queimadores;

public class Fogao extends Queimadores {
    private String modelo;

    public Fogao(String marca, int codigoMercadoria, int voltagem, String modelo) {
        super(marca, codigoMercadoria, voltagem);
        this.modelo = modelo;
    }

    public void acender(){
        System.out.println("O Fogão acendeu a chama");
    }
    @Override
    public void vender() {
        if (isVenda() == true){
        System.out.printf("O produto (%s modelo:%s Codigo:%d) foi vendido para Uberaba\n", getMarca(), modelo, getCodigoMercadoria() );
        }else {
        System.out.println("Erro na venda da mercadoria. Código 8862233 diferente da escolhida\n ");
        }
    }
    
    @Override
    public void reservar() {
        System.out.printf("O produto %s do modelo %s com o código %d foi reservado para Uberaba\n", getMarca(), modelo, getCodigoMercadoria());
    }
    
}
