public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        /*System.out.println("Duração: " + duracaoEmMinutos);
        System.out.println("Avaliação: " + somaDasAvaliacoes);
        System.out.println("Todas Avaliações: " + totalDeAvaliacoes);
        System.out.println("Disponível no seu Plano: " + incluidoNoPlano);*/
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

}

