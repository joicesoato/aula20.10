package application;

public class Main {
    public static void main(String[] args) {
        NotificacaoSms notSMS = new NotificacaoSms(
            "Marco",
            "1423456543", 
            "Mensagem de Teste",
            1);

        notSMS.exibirInformacoesRemetente();
        notSMS.enviar();
        notSMS.registrarLog();

        notSMS.definirPrioridade(8);
        System.out.println(notSMS.obterNivelPrioridade());
        notSMS.definirPrioridade(0);

        Notificacao notif = new NotificacaoSms(
            "Fulano", "1423456543", "Testando", 3);
        notif.exibirInformacoesRemetente();
        notif.enviar();

        Priorizavel objPriorizavel = new NotificacaoSms(
            "Ciclano", "134334567", "Novo Teste", 2);
        
        objPriorizavel.definirPrioridade(6);
        
    }
}