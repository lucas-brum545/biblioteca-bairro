public class Professor extends Usuario{
    int QUANTIDADE_MAXIMA_EMPRESTIMOS = 5;

    public Professor(String nome) {
        super(nome);
    }

    public boolean atingiuLimiteEmprestimos()
    {
        if(this.getQuantidadeEmprestada() > QUANTIDADE_MAXIMA_EMPRESTIMOS)
            return true;
        return false;
    }
    public int getLimiteItens(){
        return 5;
    }
}
