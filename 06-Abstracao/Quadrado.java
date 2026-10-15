public class Quadrado extends Forma {
    double lado;

    public Quadrado(String cor, double lado) {
        super(cor);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}