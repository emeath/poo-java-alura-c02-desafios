package br.com.matheus.desafios.aula03.exercicio02;

//### Exercicio 2
//Crie uma classe Animal com um método emitirSom(). Em seguida, crie duas subclasses: Cachorro e Gato, que herdam da classe Animal. Adicione o método emitirSom() nas subclasses, utilizando a anotação @Override para indicar que estão sobrescrevendo o método. Além disso, adicione métodos específicos para cada subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o Gato.

public class Gato extends Animal {

    private RacaGato raca;

    public RacaGato getRaca() {
        return raca;
    }

    public void setRaca(RacaGato raca) {
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println("miau!");
    }

    public void arranharMoveis() {
        if (sexo == Sexo.MASCULINO) {
            System.out.println("Gato " + nome + " está arranhando os moveis!");
        } else {
            System.out.println("Gata " + nome + " está arranhando os moveis!");
        }

    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Raça do gato: " + raca + " - " + raca.getDescricao());
    }
}
