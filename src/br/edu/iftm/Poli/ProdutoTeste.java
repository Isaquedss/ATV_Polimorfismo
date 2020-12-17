package br.edu.iftm.Poli;

import br.edu.iftm.Poli.Mercadoria.Fogao;
import br.edu.iftm.Poli.Mercadoria.Freezer;
import br.edu.iftm.Poli.Mercadoria.Liquidificador;

public class ProdutoTeste {
    private static void executarAcao(Produto produto){
        produto.reservar();
        produto.vender();
    }

    public static void main(String[] args) {
        Queimadores queimador = new Queimadores("Consul", 345, 220);
        executarAcao(queimador);
        
        Fogao fogao = new Fogao("Consul", 3458955, 220, "OYU8996");
        fogao.acender();
        executarAcao(fogao);
        System.out.println();
        
        Eletroportatil eletro = new Eletroportatil("Mondial", 226, 110);
        executarAcao(eletro);

        Liquidificador liquidificador = new Liquidificador("Mondial", 2262588, 110, "SP1000");
        liquidificador.Ligando();
        executarAcao(liquidificador);
        System.out.println();

        Refrigeracao refrigeracao = new Refrigeracao("Eletrolux", 450, 220);
        executarAcao(refrigeracao);

        Freezer freezer = new Freezer("Eletrolux", 4503665, 220, "PKJ850");
        freezer.gelando();
        freezer.gelando(0);
        freezer.gelando(true);
        executarAcao(freezer);


    }

       
}