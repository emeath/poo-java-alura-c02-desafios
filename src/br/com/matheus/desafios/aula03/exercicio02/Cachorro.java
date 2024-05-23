package br.com.matheus.desafios.aula03.exercicio02;

//### Exercicio 2
//Crie uma classe Animal com um método emitirSom(). Em seguida, crie duas subclasses: Cachorro e Gato, que herdam da classe Animal. Adicione o método emitirSom() nas subclasses, utilizando a anotação @Override para indicar que estão sobrescrevendo o método. Além disso, adicione métodos específicos para cada subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o Gato.

public class Cachorro extends Animal {

    private RacaCachorro raca;

    public RacaCachorro getRaca() {
        return raca;
    }

    public void setRaca(RacaCachorro raca) {
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au au!");
    }

    public void abandarRabo() {
        if (sexo == Sexo.MASCULINO) {
            System.out.println("Cachorro " + nome + " está abanando o rabo!");
        } else {
            System.out.println("Cachorra " + nome + " está abanando o rabo!");
        }

    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Raça do cachorro: " + raca + " - " + raca.getDescricao());
    }
}
