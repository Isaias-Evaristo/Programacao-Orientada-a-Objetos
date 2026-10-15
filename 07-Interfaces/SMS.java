public class SMS implements Notificacao {
    private String numeroTelefone;

    public SMS(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS para " + numeroTelefone + ": " + mensagem);
    }
}