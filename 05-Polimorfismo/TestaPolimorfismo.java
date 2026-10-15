public class TestaPolimorfismo {
    public static void main(String[] args) {
        Veiculo v1 = new Automovel(); 
        Veiculo v2 = new Moto();      

        System.out.println("Testando o Automóvel:");
        v1.mover();

        System.out.println("-------------------------");

        System.out.println("Testando a Moto:");
        v2.mover();
    }
}
