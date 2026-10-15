public class TestaHeranca {
    public static void main(String[] args) {
        // Funcionário comum
        Funcionario f = new Funcionario("Carlos", 3000.00);
        f.exibirDados();

        System.out.println("----------------------------------------");

        // Gerente herdando tudo de Funcionário + bônus próprio
        Gerente g = new Gerente("Isaias", 7000.00, 2000.00);
        g.exibirDados(); // Método herdado da classe pai sem precisar reescrever!
        System.out.println("Bônus: R$ " + g.bonus);
        System.out.println("Salário Total com bônus: R$ " + g.getSalarioTotal());
    }
}