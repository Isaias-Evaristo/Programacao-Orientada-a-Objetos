public class TestaConta {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Isaias", 500.00);

        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo inicial: R$ " + conta.getSaldo());


        conta.depositar(200.00);
        conta.sacar(150.00);


        conta.sacar(1000.00);

        System.out.println("Saldo final: R$ " + conta.getSaldo());
    }
}
