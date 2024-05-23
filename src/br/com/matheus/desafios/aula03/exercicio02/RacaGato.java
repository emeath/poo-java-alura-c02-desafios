package br.com.matheus.desafios.aula03.exercicio02;

public enum RacaGato {
    PERSA("Persa"),
    SIAMES("Siamês"),
    MAINE_COON("Maine Coon"),
    ANGORA("Angorá"),
    SRD("(Sem Raça Definida) / Viralata");

    private final String descricao;

    RacaGato(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
