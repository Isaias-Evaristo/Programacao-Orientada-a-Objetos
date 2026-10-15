public class TestaProduto {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Notebook";
        produto.preco = 3500.00;
        produto.quantidade = 10;

        System.out.println("Produto: " + produto.nome);
        System.out.println("Valor total em estoque: R$ " + produto.calcularValorTotalEstoque());


        produto.adicionarEstoque(5);

        System.out.println("Nova quantidade: " + produto.quantidade);
        System.out.println("Novo valor total em estoque: R$ " + produto.calcularValorTotalEstoque());
    }
}