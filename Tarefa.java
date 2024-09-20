import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeParseException;


public class Tarefa {
    // Atributos privados
    private String titulo;
    private String descricao;
    private String prazo;
    private int prioridade;

    //Metodo para validar prazo
    private boolean isPrazoValido (String prazo){
        try {
            LocalDate.parse(prazo);
            return true;
        } catch(DateTimeParseException e){
            return false;
        }
    }
    // Construtor 1: completo
    public Tarefa(String titulo, String descricao, String prazo, int prioridade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
        this.prioridade = prioridade;
    }
    //construtor 2: menos parametros
    public Tarefa(String titulo, String prazo){
        this.titulo = titulo;
        this.prazo = prazo;
        this.prioridade = 0;
        this.descricao = "";
    }
    // construtor 3
    public Tarefa(String titulo, int prioridade) {
        this.titulo = titulo;
        this.descricao = "";
        this.prazo = "";
        this.prioridade = prioridade;
    }
    

    // Métodos Get e Set
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getPrazo() {
        return this.prazo;
    }

    public void setPrazo(String prazo) {
        if (isPrazoValido(prazo)){
            this.prazo = prazo;
        } else {
            System.out.println("Prazo invalido!");
        }
    }
    public int getPrioridade() {
        return this.prioridade;
    }

    public void setPrioridade(int prioridade) {
        if (prioridade <= 5){
            this.prioridade = prioridade;
        }
        else {
            System.out.println("Prioridade invalida!");
        }
    }

    // Implementar getters e settes para os outros atributos
    public void exibirDetalhes() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Descricao: " + this.descricao);
        System.out.println("Prazo: " + this.prazo);
        System.out.println("Prioridade: " + this.prioridade);
    }
    //calcular tempo para o prazo
    public long calcularDiasRestantes() {
        LocalDate dataPrazo = LocalDate.parse(this.prazo);
        LocalDate hoje = LocalDate.now();
        return ChronoUnit.DAYS.between(hoje, dataPrazo);
    }
}