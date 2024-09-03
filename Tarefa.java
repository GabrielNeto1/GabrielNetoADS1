public class Tarefa {
    private String arroz;
    private String feijao;
    private String salada;
    private String macarrao;

    //Construtor:
    public Tarefa(String arroz, String feijao, String salada, String macarrao) {
        this.arroz = arroz;
        this.feijao = feijao;
        this.salada = salada;
        this.macarrao = macarrao;
    }
    
    // Métodos 'set' e 'get':
    public String getArroz() {
        return arroz;
    }
    public void setArroz(String arroz) {
        this.arroz = arroz;
    }
    public String getFeijao() {
        return feijao;
    }
    public void setFeijao(String feijao) {
        this.feijao = feijao;
    }
    public String getSalada() {
        return salada;
    }
    public void setSalada(String salada) {
        this.salada = salada;
    }
    public String getMacarrao() {
        return macarrao;
    }
    public void setMacarrao(String macarrao) {
        this.macarrao = macarrao;
    }
    // Método para exibir detalhes da tarefa
    public void exibirDetalhes() {
        System.out.println("Arroz: " + arroz);
        System.out.println("Feijao: " + feijao);
        System.out.println("Salada: " + salada);
        System.out.println("Macarrao: " + macarrao);
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
    // Desafio 1: Instância da classe Tarefa
    Tarefa tarefa = new Tarefa("Comer arroz","Fazer salada","Botar macarrao", 1);

    // Desafio 1: Modificando título da tarefa
    tarefa.setArroz("Comer arroz sempre");

    // Desafio 1: Exibindo novo título
    System.out.println("Novo Título: " + tarefa.getArroz());

    // Desafio 2: Exibir detalhes
    tarefa.exibirDetalhes();
    }
}

// Alunos: 
// Manoel Gabriel Silva Neto - Matrícula: 04168994
// Sandro Augusto do Nascimento Miranda - Matrícula: 04046045
