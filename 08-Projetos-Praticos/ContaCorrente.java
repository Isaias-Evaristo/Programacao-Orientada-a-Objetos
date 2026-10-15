public class ContaCorrente extends Conta {

    public ContaCorrente(int numero, Cliente titular, double saldoInicial) {
        super(numero, titular, saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        double valorComTaxa = valor + 2.50;
        if (valorComTaxa <= saldo) {
            saldo -= valorComTaxa;
            System.out.println("Saque de R$ " + valor + " na CC " + getNumero() + " (Taxa: R$ 2.50)");
        } else {
            System.out.println("Saldo insuficiente para cobrir o saque e a taxa na CC!");
        }
    }
}
