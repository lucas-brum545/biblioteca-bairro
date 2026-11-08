import java.rmi.AlreadyBoundException;

public class Main {
    public static void main(String[] args){

        Livro cleanCode = new Livro("L001", "Clean Code");
        Livro estruturas = new Livro("L002", "Estruturas de Dados");
        Revista sciAm = new Revista("R001", "Scientific American");
        Revista recreio = new Revista("R002", "Recreio");
        DVD iveteSangalo = new DVD("D001","Ivete Sangalo Ao Vivo No Maracanã");
        DVD shakira = new DVD("D002", "Shakira live in Paris");

        // adicionando os itens no acervo

        Biblioteca bibliotecaBairro = new Biblioteca("Bairro do limoeiro");

        bibliotecaBairro.cadastrarItem(cleanCode);
        bibliotecaBairro.cadastrarItem(estruturas);
        bibliotecaBairro.cadastrarItem(sciAm);
        bibliotecaBairro.cadastrarItem(recreio);
        bibliotecaBairro.cadastrarItem(iveteSangalo);
        bibliotecaBairro.cadastrarItem(shakira);

        // cadastrando usuarios

        Usuario ana = new Aluno("Ana Paula Souza");
        Usuario bob = new Aluno("Bob Souza");
        Usuario jorge = new Professor("Jorge Moura Brandão");

        bibliotecaBairro.cadastrarUsuario(ana);
        bibliotecaBairro.cadastrarUsuario(bob);
        bibliotecaBairro.cadastrarUsuario(jorge);

        // mostrando o acervo cadastrado
        bibliotecaBairro.listarAcervo();

        // mostrando os usuarios cadastrados
        bibliotecaBairro.listarUsuarios();

        bibliotecaBairro.emprestar("L003", bob);
        bibliotecaBairro.emprestar("D002", jorge);
        bibliotecaBairro.emprestar("L001", ana);
        bibliotecaBairro.emprestar("L002", ana);
        bibliotecaBairro.emprestar("R001", ana);
        bibliotecaBairro.emprestar("D002", ana);
    }
}