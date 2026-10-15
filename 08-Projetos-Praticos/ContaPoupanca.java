public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, Cliente titular, double saldoInicial) {
        super(numero, titular, saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " na Poupança " + getNumero() + " (Sem taxa)");
        } else {
            System.out.println("Saldo insuficiente na Poupança!");
        }
    }

    public void renderJuros(double taxaPercentual) {
        double rendimento = saldo * (taxaPercentual / 100);
        saldo += rendimento;
        System.out.println("Rendimento de R$ " + rendimento + " aplicado na Poupança " + getNumero());
    }
}