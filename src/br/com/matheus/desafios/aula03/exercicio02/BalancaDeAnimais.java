package br.com.matheus.desafios.aula03.exercicio02;

import java.util.concurrent.ThreadLocalRandom;

public class BalancaDeAnimais {

    private int numeroDePesagensFeitas;

    public int getNumeroDePesagensFeitas() {
        return numeroDePesagensFeitas;
    }

    public void pesarAnimal(Animal animal) {
        System.out.println("<><><><><><<><><>><><><><");
        System.out.println(animal);
        numeroDePesagensFeitas++;
        String pronome;
        pronome = animal.getSexo() == Sexo.FEMININO ? "a" : "o";
        System.out.println("Pesando " + pronome + " " + animal.getNome());
        System.out.println("Peso do animal é: " + (animal.getPeso() + ThreadLocalRandom.current().nextDouble(0, 1)) + "kg");
        System.out.println("Pesagem numero >>> " + numeroDePesagensFeitas);
    }
}
