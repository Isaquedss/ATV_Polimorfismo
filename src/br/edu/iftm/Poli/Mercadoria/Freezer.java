package br.edu.iftm.Poli.Mercadoria;

import br.edu.iftm.Poli.Refrigeracao;

public class Freezer extends Refrigeracao {
    private String modelo;

    public Freezer(String marca, int codigoMercadoria, int voltagem, String modelo) {
        super(marca, codigoMercadoria, voltagem);
        this.modelo = modelo;

    }

    public void gelando(){
        System.out.printf("O freezer da %s (modelo:%s Codigo:%d) está gelando tudo!!\n ", getMarca(), modelo, getCodigoMercadoria() );
    }

    public void gelando(boolean gelar){
        if(gelar){
            System.out.println("Ta gelando os produtos");
        } else {
            System.out.println("Esse freezer não está gelando nada");
        }            
    }

    public void gelando(double temperatura ){
        if(temperatura >= 20){
            System.out.println("As coisas dentro do freezer estão descongelando");
        } else if(temperatura <= 10 ){
            System.out.println("O freezer está gelando em temperatura adequada");
        }
    }

    @Override
    public void vender() {
        if (isVenda() == true){
            System.out.printf("O produto (%s modelo:%s Codigo:%d) foi vendido para Brasilia\n", getMarca(),modelo, getCodigoMercadoria() );
        }else {
            System.out.println("Erro na venda do produto (Código não é o mesmo escolhido). Codigo 3685986 incorreto ");
        }

    }

    @Override
    public void reservar() {
       System.out.printf("O produto (%s modelo:%s Codigo:%d) foi reservado para Brasilia\n", getMarca(), modelo, getCodigoMercadoria());   
    }


    
}
