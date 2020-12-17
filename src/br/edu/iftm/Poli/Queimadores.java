package br.edu.iftm.Poli;

public class Queimadores extends Produto {

    private boolean venda;

    //Cada "Marca" possui os três digitos iniciais do codigo da mercadoria unicos e diferentes entre marcas.
    public Queimadores(String marca, int codigoMercadoria, int voltagem) {
        super(marca, codigoMercadoria, voltagem);
        this.venda = true;
    }

    @Override
    public void vender() {
        if (venda == true){
        System.out.printf("Os produto %s com o inico do código %d foram vendidos\n", getMarca(), getCodigoMercadoria() );
        }else {
        System.out.printf("Erro na venda dos produtos código %d\n", getCodigoMercadoria());
        }
    }       

    @Override
    public void reservar() {
        System.out.printf("Os produtos %s com o inicio do código %d foram reservados e vendidos\n", getMarca(), getCodigoMercadoria());
    }

    public boolean isVenda() {
        return venda;
    }

    public void setVenda(boolean venda) {
        this.venda = venda;
    }
    
}
