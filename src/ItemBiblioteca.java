public abstract class ItemBiblioteca {
    private String codigo;
    private String titulo;
    private boolean disponivel = true;

    public ItemBiblioteca(String codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    protected void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public abstract double geraMulta(int numDiasAtraso);
    public abstract int getPrazo();
}
