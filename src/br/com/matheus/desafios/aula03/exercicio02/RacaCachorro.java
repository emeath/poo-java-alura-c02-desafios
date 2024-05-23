package br.com.matheus.desafios.aula03.exercicio02;

public enum RacaCachorro {
    SHIHTZU("Shih Tzu"),
    ROTTWEILER("Rottweiler"),
    PUG("Pug"),
    GOLDEN("Golden Retriever"),
    PASTOR_ALEMAO("Pastor Alemão"),
    YORKSHIRE("Yorkshire Terrier"),
    BORDER_COLLIE("Border Collie"),
    SRD("(Sem Raça Definida) / Viralata");

    private final String descricao;

    RacaCachorro(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
