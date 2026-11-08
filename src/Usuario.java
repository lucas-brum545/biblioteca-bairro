public abstract class Usuario {
    private String nome;
    private int quantidadeEmprestada;

    protected Usuario(String nome, int quantidadeEmprestada) {
        this.nome = nome;
        this.quantidadeEmprestada = 0;
    }

    public abstract boolean atingiuLimiteEmprestimos();

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeEmprestada() {
        return quantidadeEmprestada;
    }

    public void setQuantidadeEmprestada(int quantidadeEmprestada) {
        this.quantidadeEmprestada = quantidadeEmprestada;
    }
}
