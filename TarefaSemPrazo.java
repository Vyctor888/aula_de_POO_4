public class TarefaSemPrazo extends Tarefa {
    public TarefaSemPrazo(String titulo, String descricao, String prazo, int prioridade) {
        super(titulo, descricao, prazo, prioridade);
    }
    @Override
    public long calcularDiasRestantes() {
        return -1;
    }
    @Override
    public void exibirDetalhes () {
        super.exibirDetalhes();
    }
}