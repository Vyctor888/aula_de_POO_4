

public class Main {
    public static void main(String[] args){
        Tarefa tarefa1 = new Tarefa("Estudar POO", "Revisar os conceitos de classes e objetos", "06-09-2024", 1);
        System.out.println("Titulo: " + tarefa1.getTitulo());
        tarefa1.exibirDetalhes();
        System.out.print("Novo prazo da tarefa1: ");
        tarefa1.setPrazo("2024-08-32");
        System.out.println("============== Tarefa 2 =============");
        
        Tarefa tarefa2 = new Tarefa("Estudar para a prova", "2024-09-14");
        tarefa2.exibirDetalhes();
        System.out.println("Dias restantes: " + tarefa2.calcularDiasRestantes());

        System.out.println("============ Tarefa 3 =============");
        Tarefa tarefa3 = new Tarefa("Estudar para a prova", 3);
        tarefa3.exibirDetalhes();
        System.out.print("Prioridade da tarefa: ");
        tarefa1.setPrioridade(7);

        System.out.println("=============== Imprimindo tarefa ugente ===============");

        TarefaUrgente tarefaUrg1 = new TarefaUrgente("Estudar para a prova", "Conceitos de POO", "2024-10-02", "Não entendi nada");
        tarefaUrg1.exibirDetalhes();

        System.out.println("=============== Imprimindo tarefa ugente ===============");

        Tarefa[] listaTarefas = new Tarefa[3];

        listaTarefas[0] = tarefa1;
        listaTarefas[1] = tarefa2;
        listaTarefas[2] = tarefaUrg1;

        for (Tarefa tarefa : listaTarefas) {
            tarefa.exibirDetalhes();
        }
        System.out.println("================= Tarefa Flexivel ==============");
        TarefaFlexivel tarefaFlex = new TarefaFlexivel("Estudar para a prova", "Conceitos de POO", "2024-10-02", 7);
        tarefaFlex.exibirDetalhes();

}