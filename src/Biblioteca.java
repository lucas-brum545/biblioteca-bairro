import java.util.List;

public class Biblioteca {
    private final String nome;
    private final ItemBiblioteca[] acervo;
    private final Usuario[] usuarios;
    private int totalUsuarios;
    private int totalItensAcervo;
    private int CAPACIDADE_ACERVO = 200;
    private int CAPACIDADE_USUARIOS = 200;

    public Biblioteca(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome da biblioteca e obrigatorio.");
        }
        this.nome = nome;
        this.acervo = new ItemBiblioteca[CAPACIDADE_ACERVO];
        this.usuarios = new Usuario[CAPACIDADE_USUARIOS];
        this.totalItensAcervo = 0;
        this.totalUsuarios = 0;
    }

    public void cadastrarItem(ItemBiblioteca item) {
        if (item == null) {
            throw new IllegalArgumentException("Item nao pode ser nulo.");
        }
        if (totalItensAcervo >= acervo.length) {
            throw new IllegalStateException("Acervo lotado (limite do array).");
        }
        if (buscarItemPorCodigo(item.getCodigo()) != null) {
            throw new IllegalStateException("Ja existe item com o codigo " + item.getCodigo());
        }
        acervo[totalItensAcervo] = item;
        totalItensAcervo++;
    }

    public void cadastrarUsuario(Usuario usuario) {
        if (usuario == null) {
            throw new IllegalArgumentException("Usuario nao pode ser nulo.");
        }
        if (totalUsuarios >= usuarios.length) {
            throw new IllegalStateException("Limite de usuarios atingido.");
        }
        usuarios[totalUsuarios] = usuario;
        totalUsuarios++;
    }

    public ItemBiblioteca buscarItemPorCodigo(String codigo) {
        for (int i = 0; i < totalItensAcervo; i++) {
            if (acervo[i].getCodigo().equals(codigo)) {   // equals, nunca ==
                return acervo[i];
            }
        }
        return null;
    }

    public boolean emprestar(String codigoItem, Usuario usuario){
        ItemBiblioteca item = buscarItemPorCodigo(codigoItem);

        if(item == null){
            System.out.println("[x]  Item não encontrado." );
            return false;
        }

        if(usuario.atingiuLimiteEmprestimos()){
            System.out.println("[x]  ERRO: Usuario atingiu o limite permitido de emprestimos.");
            return false;
        }

        item.setDisponivel(false);
        usuario.setQuantidadeEmprestada(usuario.getQuantidadeEmprestada() + 1);
        System.out.println("[:)]  Emprestado com sucesso.");
        return true;
    }

    public double devolver(String codigoItem, Usuario usuario, int numDiasAtraso){
        ItemBiblioteca item = buscarItemPorCodigo(codigoItem);

        if(item == null){
            System.out.println("Item nao encontrado.");
            return 0.0;
        }

        item.setDisponivel(true);
        double multa = item.geraMulta(numDiasAtraso);
        return multa;
    }

    public void listarAcervo(){
        System.out.println("=========== ACERVO ===========");
        for (int i = 0; i < totalItensAcervo; i++) {
            ItemBiblioteca item = acervo[i];
            System.out.println(i+1 + ". " + item.getTitulo());
        }
    }

    public void listarUsuarios(){
        System.out.println("=========== USUARIOS ===========");
        for (int i = 0; i < totalUsuarios; i++) {
            Usuario usuario = usuarios[i];
            System.out.println(i+1 + ". " + usuario.getNome());
        }
    }
}
