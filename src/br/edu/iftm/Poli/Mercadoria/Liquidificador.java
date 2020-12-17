package br.edu.iftm.Poli.Mercadoria;

import br.edu.iftm.Poli.Eletroportatil;

public class Liquidificador extends Eletroportatil {
        private String modelo;
        private boolean ligado;

    public Liquidificador(String marca, int codigoMercadoria, int voltagem, String modelo) {
        super(marca, codigoMercadoria, voltagem);
        this.modelo = modelo;
        this.ligado = true;
    }

    public void Ligando() {
        if (ligado == true) {
            System.out.printf("O liquidificador do modelo %s está funcionando\n", modelo);
        } else {
            System.out.printf("O liquidificador do modelo %s não esta funcionando\n", modelo);
        }
    }

    @Override
    public void vender() {
        if (isVenda() == true){
            System.out.printf("O produto %s com o código: %d, foi vendido e já foi entregue\n", modelo, getCodigoMercadoria() );
        }else {
            System.out.printf("Erro na venda do produto %s\n",modelo);
            System.out.printf("O %s está amassado\n", modelo);
        }
    }
    @Override
    public void reservar() {
        System.out.printf("O produto do modelo %s foi reservado\n", modelo);
    }



    
}
