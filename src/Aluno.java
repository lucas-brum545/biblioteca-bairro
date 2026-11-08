import java.rmi.AlreadyBoundException;

public class Aluno extends Usuario{
    int QUANTIDADE_MAXIMA_EMPRESTIMOS = 3;

    @Override
    public boolean atingiuLimiteEmprestimos() {
        if(this.getQuantidadeEmprestada() == QUANTIDADE_MAXIMA_EMPRESTIMOS)
            return true;
        return false;
    }

    public Aluno(String nome) {
        super(nome);
    }

    public int getLimiteItens(){
        return 3;
    }
}
