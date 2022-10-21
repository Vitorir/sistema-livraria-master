public class CarrinhoCompra {
    private double total;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    void adiciona(Livro livro) {
        this.total += livro.getValor();
        System.out.println("Adicionado " + livro.getNome());
    }

}
