package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class FiltroRecomendacao {
   private String recomendacao;

   public void filtra(Classificavel classificavel){
       if (classificavel.getClassificassao() >= 4){
           System.out.println("Está entre os preferidos do momento");
       } else if (classificavel.getClassificassao() >= 2) {
           System.out.println("Muito Bem avaliado no momento");
       } else {
           System.out.println("Coloque na sua lista para assistir depois");
       }
   }
}
