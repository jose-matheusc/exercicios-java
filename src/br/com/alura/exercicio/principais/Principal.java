package src.exercicio;

public class Principal{

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.saudacao();


        Musica minhaMusica = new Musica();
        minhaMusica.titulo = "Ryu";
        minhaMusica.artista = "The Runner";
        minhaMusica.anoLancamento = 2023;
        minhaMusica.avalia(8.9);
        minhaMusica.avalia(8.2);


        minhaMusica.exibeFichaTecnica();

//        idadePessoa minhaPessoa = new idadePessoa();
//        minhaPessoa.setNome("teteu");
//        System.out.println(minhaPessoa.getNome());

    }
}
