public class Livro {
     private String nome;
     private String descricao;
     private double valor;
     private String isbn;
    //INformações Autor do Livro
     private Autor autor;
    //Informações do Ebook
     // private String marcaDagua;
     //Indica se o livro é impresso ou digital
     private boolean impresso;
     //indica se o livro é pocket (so pode ser preenchido se o livro for físico)
    private boolean pocket;

    public Livro() {

    }

    public Livro(String nome, double valor, boolean impresso, boolean pocket) {
        this.nome = nome;
        this.valor = valor;
        this.impresso = impresso;
        this.pocket = pocket;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isImpresso() {
        return impresso;
    }

    public void setImpresso(boolean impresso) {
        this.impresso = impresso;
    }

    public boolean isPocket() {
        return pocket;
    }

    public void setPocket(boolean pocket) {
        this.pocket = pocket;
    }

    

    public void mostrarDetalhes() {
        System.out.println("Detalhes do Livro");
        System.out.println("Titulo: " + this.nome);
        System.out.println("Descricao: " + this.descricao);
        System.out.println("Valor: R$ " + this.valor);
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Autor");
        System.out.println("Nome: " + autor.getNomeAutor());
        System.out.println("cpf: " + autor.getCpfAutor());
        System.out.println("email: " + autor.getEmailAutor());
        System.out.println("-----x-----");
    }

    //Taxa cobrada adicionalmente na venda de livros físicos
    public double getTaxaImpressao() {
        return this.valor * 0.05;
    }

    public boolean aplicaDescontoDe(double porcentagem) {
        if (this.impresso == true) {
            if (this.pocket == true) {
                //se for livro impresso e pocket , não dá desconto
                return false;
            } else {
                if (porcentagem > 0.3) {
                    //se for livro fisico, permitir ate 30% de desconto
                    return false;
                } else {
                    this.valor -= this.valor * porcentagem;
                }
            }
        } else {
            if (porcentagem > 0.15) {
                //se for ebook, permitir ate 15% de desconto
                return false;
            } else {
                this.valor -= this.valor * porcentagem;
            }
        }
        return true;
    }


}
