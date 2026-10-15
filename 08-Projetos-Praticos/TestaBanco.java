public class TestaBanco {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Isaias Evaristo", "123.456.789-00");


        ContaCorrente cc = new ContaCorrente(101, cliente, 1000.00);
        ContaPoupanca cp = new ContaPoupanca(202, cliente, 1000.00);

        System.out.println("--- BANCO DIGITAL POO ---");
        System.out.println("Titular: " + cliente.getNome() + " | CPF: " + cliente.getCpf());
        System.out.println("Saldo inicial CC: R$ " + cc.getSaldo());
        System.out.println("Saldo inicial Poupança: R$ " + cp.getSaldo());
        System.out.println("-------------------------------------------------");

        cc.depositar(200.00);
        cc.sacar(100.00);

        System.out.println("-------------------------------------------------");

        cp.sacar(100.00);
        cp.renderJuros(5.0);

        System.out.println("=================================================");
        System.out.println("EXTRATO FINAL:");
        System.out.println("Saldo Final Conta Corrente: R$ " + cc.getSaldo());
        System.out.println("Saldo Final Poupança: R$ " + cp.getSaldo());
    }
}