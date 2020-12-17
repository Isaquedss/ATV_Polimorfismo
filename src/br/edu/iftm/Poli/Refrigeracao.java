package br.edu.iftm.Poli;

public class Refrigeracao extends Produto {
    private boolean venda;

    public Refrigeracao(String marca, int codigoMercadoria, int voltagem) {
        super(marca, codigoMercadoria, voltagem);
        this.venda = true;
    }

    @Override
    public void vender() {
        if (venda == true){
            System.out.printf("Os produto %s com o inicio do código %d foram vendidos e entregue ao destinatário em Brasilia\n", getMarca(), getCodigoMercadoria() );
        }else {
            System.out.println("Erro na venda do produto(Produto não é o mesmo escolhido). Produto Armario Incorreto ");
        }

    }

    @Override
    public void reservar() {
       System.out.printf("Os produtos com o inicio do codigo %d foram reservados para entrega em Brasilia\n" , getCodigoMercadoria());   
    }

    public boolean isVenda() {
        return venda;
    }

    public void setVenda(boolean venda) {
        this.venda = venda;
    }
    
}
