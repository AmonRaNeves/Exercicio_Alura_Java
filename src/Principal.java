public class Principal {
    public static void main(String[] args){

        Musica Musica1 = new Musica();
        Musica1.artista = "Beethoven";
        Musica1.anoLancamento = 1770;
        Musica1.titulo = "Moonlight in C-Sharp Minor";

        Musica Musica2 = new Musica();
        Musica2.artista = "ACDC";
        Musica2.anoLancamento = 1960;
        Musica2.titulo = "Shoot to Thrill";

        Musica1.exibirFicha();
        Musica1.avaliacao(8);
        Musica1.avaliacao(10);
        Musica1.avaliacao(6);

        Musica2.exibirFicha();
        Musica2.avaliacao(8);
        Musica2.avaliacao(5);
        Musica2.avaliacao(4);

        System.out.println(Musica1.numAvaliacoes);
        System.out.println(Musica1.somaDasNotas);
        System.out.println(Musica1.mediaDeAvaliacoes());

        System.out.println(Musica2.numAvaliacoes);
        System.out.println(Musica2.somaDasNotas);
        System.out.println(Musica2.mediaDeAvaliacoes());
    }
}
