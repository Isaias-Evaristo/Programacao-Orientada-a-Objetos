public class Produto {
    String nome;
    double preco;
    int quantidade;

    double calcularValorTotalEstoque() {
        return preco * quantidade;
    }

    void adicionarEstoque(int quantidadeAdicional) {
        quantidade += quantidadeAdicional;
        System.out.println(quantidadeAdicional + " unidades adicionadas ao estoque de " + nome);
    }
}