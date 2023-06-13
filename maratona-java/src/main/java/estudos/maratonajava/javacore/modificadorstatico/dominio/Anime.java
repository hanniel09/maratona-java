package estudos.maratonajava.javacore.modificadorstatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    static {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

}
