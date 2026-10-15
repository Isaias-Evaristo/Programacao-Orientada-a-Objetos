public class TestaInterface {
    public static void main(String[] args) {

        Notificacao n1 = new Email("isaias@email.com");
        Notificacao n2 = new SMS("(81) 98888-7777");

        n1.enviar("Seu código de acesso é 1234.");
        n2.enviar("Sua compra no cartão foi aprovada!");
    }
}