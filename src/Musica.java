public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    int numAvaliacoes;
    double somaDasNotas;

    double resultadoMedia;

    void avaliacao(double nota) {
        somaDasNotas += nota;
        numAvaliacoes++;
    }

    void exibirFicha(){
        System.out.println("O nome do artista é: " + artista);
        System.out.println("A música é: " + titulo);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println();

    }
    double mediaDeAvaliacoes(){

        return resultadoMedia = somaDasNotas / 2;

    }
}
