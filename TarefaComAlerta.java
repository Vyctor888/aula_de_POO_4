public class TarefaComAlerta extends Tarefa implements Notificacao {
    @Override
    public void enviarNotificacao () {
        System.out.println("A tarefa " + super.getTitulo() + " foi criada!!");
    }
    public TarefaComAlerta (String titulo, String descricao, String prazo, int prioridade) {
        super(titulo, descricao, prazo, prioridade);
        this.enviarNotificacao();
    }
}