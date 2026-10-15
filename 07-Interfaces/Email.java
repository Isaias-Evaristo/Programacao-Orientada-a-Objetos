public class Email implements Notificacao {
    private String enderecoEmail;

    public Email(String enderecoEmail) {
        this.enderecoEmail = enderecoEmail;
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando EMAIL para " + enderecoEmail + ": " + mensagem);
    }
}