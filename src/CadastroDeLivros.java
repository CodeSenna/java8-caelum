public class CadastroDeLivros {

    public static void main(String[] args) {
        Autor autorRodrigo = criarAutor(
                "Rodrigo Turini",
                "rodrigo.turini@caelum.com",
                "123.456.789.10");

        Livro livroJava8 = criarLivro(
                "Java 8 Prático",
                "Novos recursos da linguagem",
                59.90,
                "978-85-66250-46-6",
                autorRodrigo);
        livroJava8.mostrarDetalhes();

        Autor autorPaulo = criarAutor(
                "Paulo Silveira",
                "paulo.silveira@caelum.com",
                "123.456.789.10");

        Livro livroLogica = criarLivro(
                "Lógica de Programação",
                "Crie seus primeiros programas",
                59.90,
                "978-85-66250-22-0",
                autorPaulo);
        livroLogica.mostrarDetalhes();
    }

    private static Autor criarAutor(String nome, String email, String cpf) {
        Autor autor = new Autor();
        autor.nome = nome;
        autor.email = email;
        autor.cpf = cpf;
        return autor;
    }

    private static Livro criarLivro(String nome, String descricao, double valor, String isbn, Autor autor) {
        Livro livro = new Livro();
        livro.nome = nome;
        livro.descricao = descricao;
        livro.valor = valor;
        livro.isbn = isbn;
        livro.autor = autor;
        return livro;
    }
}
