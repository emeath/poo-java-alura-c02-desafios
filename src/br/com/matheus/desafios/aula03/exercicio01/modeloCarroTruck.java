package br.com.matheus.desafios.aula03.exercicio01;

public class modeloCarroTruck extends Carro {
    private boolean possuiTracao4x4;
    private boolean possuiCarroceria;
    private double maximaCargaSuportada;

    public boolean isPossuiTracao4x4() {
        return possuiTracao4x4;
    }

    public void setPossuiTracao4x4(boolean possuiTracao4x4) {
        this.possuiTracao4x4 = possuiTracao4x4;
    }

    public boolean isPossuiCarroceria() {
        return possuiCarroceria;
    }

    public void setPossuiCarroceria(boolean possuiCarroceria) {
        this.possuiCarroceria = possuiCarroceria;
    }

    public double getMaximaCargaSuportada() {
        return maximaCargaSuportada;
    }

    public void setMaximaCargaSuportada(double maximaCargaSuportada) {
        this.maximaCargaSuportada = maximaCargaSuportada;
    }

    @Override
    public void exibeInformacoes() {
        super.exibeInformacoes();

        if (isPossuiCarroceria()) {
            System.out.println("Possui carroceria");
        } else {
            System.out.println("Nao possui carroceria");
        }

        System.out.println(isPossuiTracao4x4() ? "Possui tração 4x4" : "Não possui tração 4x4");
        System.out.println("Maxima carga suportada: " + maximaCargaSuportada + "kg");
    }
}
