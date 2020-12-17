package br.edu.iftm.Poli;

public class Eletroportatil extends Produto {
        private boolean venda;

    public Eletroportatil(String marca, int codigoMercadoria, int voltagem) {
        super(marca, codigoMercadoria, voltagem);
        this.venda = false;
    }

    @Override
    public void vender() {
        if (venda == true){
            System.out.printf("O produto %s com o inicio do código %d foi vendido e já esta em rota de entrega \n", getMarca(), getCodigoMercadoria() );
        }else {
            System.out.printf("Erro na venda do produto código %d\n", getCodigoMercadoria());
            System.out.println("Produto amassado");
        }
    }

    @Override
    public void reservar() {
        System.out.printf("Os produtos com o inicio do código %d foram reservados para separação \n", getCodigoMercadoria());
    }

    public boolean isVenda() {
        return venda;
    }

    public void setVenda(boolean venda) {
        this.venda = venda;
    }
    
}
