public class CadastroDeLivro {

    public static void main(String[] args) {

        Livro livro = new Livro("Programacao Orientada a Objetos", 129.90, true, false);
        Livro livro2 = new Livro("Programacao Orientada a Objetos", 59.90, true, true);

        Livro livro3 = new Livro();
        livro3.setNome( "Programacao Orientada a Objetos");
        livro3.setValor(39.90);
        livro3.setImpresso(false);

        CarrinhoCompra c = new CarrinhoCompra();
        c.adiciona(livro);
        c.adiciona(livro2);
        c.adiciona(livro3);

        System.out.printf("R$ %.2f\n", c.getTotal());


    }
}
