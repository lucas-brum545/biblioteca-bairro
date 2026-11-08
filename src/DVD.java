public class DVD extends ItemBiblioteca{
    public DVD(String codigo, String titulo) {
        super(codigo, titulo);
    }

    @Override
    public double geraMulta(int numDiasAtraso) {
        return numDiasAtraso;
    }

    @Override
    public int getPrazo() {
        return 5;
    }
}
