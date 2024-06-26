import br.com.matheus.desafios.aula01.Aluno;
import br.com.matheus.desafios.aula01.Calculadora;
import br.com.matheus.desafios.aula01.Pessoa;
import br.com.matheus.desafios.aula01.musica.Artista;
import br.com.matheus.desafios.aula01.musica.Musica;
import br.com.matheus.desafios.aula01.Carro;
import br.com.matheus.desafios.aula03.exercicio02.*;
import br.com.matheus.desafios.aula03.exercicio03.ContaBancaria;
import br.com.matheus.desafios.aula03.exercicio03.ContaCorrente;
import br.com.matheus.desafios.aula03.exercicio03.Titular;

public class Main {
    public static void main(String[] args) {

        // 01
        Pessoa pessoa = new Pessoa();
        pessoa.ola();

        //02
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.dobrar(42.3));

        //03
        Artista artista = new Artista();
        artista.setBanda("Radiohead");
        artista.setNome("Thom Yorke");
        artista.setEstiloMusical("Alt Rock");
        artista.setIdade(55);

        Musica musica = new Musica();
        musica.setTitulo("Karma Police");
        musica.setAnoLancamento(1997);
        musica.setArtista(artista);

        System.out.println(musica.getArtista());
        musica.exibirFichaTecnica();
        musica.avaliar(10);
        musica.avaliar(5);
        musica.avaliar(8);
        musica.avaliar(2.1);
        musica.avaliar(7.9);
        musica.exibirFichaTecnica();

        // 04
        Carro carro = new Carro();
        carro.setModelo("Ford Thunderbird");
        carro.setCor("Vermelha");
        carro.setAnoFabricacao(2002);
        carro.exibirFichaTecnica();

        //05
        Aluno aluno = new Aluno();
        aluno.setIdade(13);
        aluno.setNome("John Neves");
        aluno.exibirInformacoes();

        //---------------------------------------

        // aula 03 - exercicio 1
        br.com.matheus.desafios.aula03.exercicio01.Carro carro1 = new br.com.matheus.desafios.aula03.exercicio01.Carro();
        carro1.setModelo("Ford Ka");
        carro1.setPrecoMedioAno1(10000);
        carro1.setPrecoMedioAno2(20000);
        carro1.setPrecoMedioAno3(17500);
        carro1.exibeInformacoes();

        br.com.matheus.desafios.aula03.exercicio01.modeloCarroTruck carro2 = new br.com.matheus.desafios.aula03.exercicio01.modeloCarroTruck();
        carro2.setModelo("Fiat Toro");
        carro2.setPrecoMedioAno1(34000);
        carro2.setPrecoMedioAno2(21300);
        carro2.setPrecoMedioAno3(77500);
        carro2.setPossuiTracao4x4(false);
        carro2.setPossuiCarroceria(true);
        carro2.setMaximaCargaSuportada(975);
        carro2.exibeInformacoes();


        //---------------------------------------

        // aula 03 - exercicio 2
        Animal animal = new Animal();
        animal.setAltura(1.3);
        animal.setIdade(3);
        animal.setPeso(17.5);
        animal.setSexo(Sexo.MASCULINO);
        animal.setNome("Animal");
        animal.emitirSom();
        animal.exibirInformacoes();

        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Rex");
        cachorro.setRaca(RacaCachorro.SRD);
        cachorro.setAltura(0.5);
        cachorro.setIdade(2);
        cachorro.setPeso(10);
        cachorro.setSexo(Sexo.MASCULINO);
        cachorro.exibirInformacoes();
        cachorro.emitirSom();
        cachorro.abandarRabo();

        Gato gata = new Gato();
        gata.setNome("Mimi");
        gata.setRaca(RacaGato.SIAMES);
        gata.setAltura(0.32);
        gata.setIdade(4);
        gata.setPeso(6);
        gata.setSexo(Sexo.FEMININO);
        gata.exibirInformacoes();
        gata.emitirSom();
        gata.arranharMoveis();

        BalancaDeAnimais balanca = new BalancaDeAnimais();
        balanca.pesarAnimal(gata);
        balanca.pesarAnimal(animal);
        balanca.pesarAnimal(cachorro);

        //---------------------------------------

        // aula 03 - exercicio 3
        Titular titular = new Titular();
        titular.setNome("Nome do Titular");
        titular.setEndereco("Uma Rua, XXX - Um bairro - Uma cidade, Um estado - Um País");
        titular.setDocumentoDeIdentificacao("Documento Id: 3234.4432-4323.1234");

        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setNumeroDaConta("123-1233");
        contaBancaria.setTitular(titular);
        contaBancaria.consultarSaldo();
        contaBancaria.depositar(1000);
        contaBancaria.sacar(9999);
        contaBancaria.depositar(-22);
        contaBancaria.depositar(1000);
        contaBancaria.sacar(730);
        contaBancaria.exibirInformacoesConta();

        Titular titularDaContaCorrente = new Titular();
        titularDaContaCorrente.setNome("Um Titular de uma Conta Corrente");
        titularDaContaCorrente.setEndereco("Uma Outra Rua, YYY - Um Bairro Diferente - Uma cidade, Um estado - Um País");
        titularDaContaCorrente.setDocumentoDeIdentificacao("Documento Id: 0000.4112-0909.1111");

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setNumeroDaConta("cc22-33211-v2");
        contaCorrente.setTitular(titularDaContaCorrente);
        contaCorrente.exibirInformacoesConta();
        contaCorrente.depositar(1000);
        contaCorrente.receberDepositoSalario(9999);
        contaCorrente.sacar(500);
        // passou 1 mes
        contaCorrente.cobrarTarifaMensal();
        // passou 1 mes
        contaCorrente.cobrarTarifaMensal();
        // passou 1 mes
        contaCorrente.cobrarTarifaMensal();
        // passou 1 mes
        contaCorrente.cobrarTarifaMensal();
        // passou 1 mes
        contaCorrente.cobrarTarifaMensal();
        // passou 1 mes
        contaCorrente.cobrarTarifaMensal();
        // passou 1 mes
        contaCorrente.cobrarTarifaMensal();
        contaCorrente.exibirInformacoesConta();




    }
}