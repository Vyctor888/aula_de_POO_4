public class TarefaUrgente extends Tarefa {
    private String razaoUrgencia;

    //construtor completo da tarefa urgente
    public TarefaUrgente(String titulo, String descricao, String prazo, String razaoUrgencia) {
        super(titulo, descricao, prazo, 5);
        this.razaoUrgencia = razaoUrgencia;
    }

    // Métodos get set
    public String getRazaoUrgencia () {
        return this.razaoUrgencia;
    }
    public void setRazaoUrgencia (String razaoUrgencia) {
        this.razaoUrgencia = razaoUrgencia;
    }

    @Override
    public void exibirDetalhes () {
        super.exibirDetalhes();
        System.out.println("Razão da urgencia: " + this.razaoUrgencia);
    }
}