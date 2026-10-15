public class Gerente extends Funcionario {
    double bonus;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario); // 'super' reaproveita o construtor da classe pai Funcionario
        this.bonus = bonus;
    }

    public double getSalarioTotal() {
        return salario + bonus;
    }
}
