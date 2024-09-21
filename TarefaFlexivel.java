public class TarefaFlexivel extends Tarefa {
    private int diasFlexibilidades;

    //construtor completo da tarefa urgente
    public TarefaFlexivel(String titulo, String descricao, String prazo, int diasFlexibilidades) {
        super(titulo, descricao, prazo, 1);
        this.diasFlexibilidades = diasFlexibilidades;
    }

    // Métodos get set
    public int getDiasFlexibilidades () {
        return this.diasFlexibilidades;
    }
    public void setDiasFlexibilidades (int diasFlexibilidades) {
        this.diasFlexibilidades = diasFlexibilidades;
    }

    @Override
    public void exibirDetalhes () {
        System.out.println("============ Tarefa com prezo flexível ===========");
        super.exibirDetalhes();
        System.out.println("Dias de flexibilidades: " + this.diasFlexibilidades);
    }
}