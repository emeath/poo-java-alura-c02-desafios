import br.com.matheus.desafios.aula01.Aluno;
import br.com.matheus.desafios.aula01.Calculadora;
import br.com.matheus.desafios.aula01.Pessoa;
import br.com.matheus.desafios.aula01.musica.Artista;
import br.com.matheus.desafios.aula01.musica.Musica;
import br.com.matheus.desafios.aula01.Carro;

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


    }
}