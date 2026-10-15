public class TestaAbstracao {
    public static void main(String[] args) {


        Forma f1 = new Quadrado("Vermelho", 4.0);
        Forma f2 = new Circulo("Azul", 3.0);

        System.out.println("Quadrado " + f1.cor + " | Área: " + f1.calcularArea());
        System.out.println("Círculo " + f2.cor + " | Área: " + f2.calcularArea());
    }
}