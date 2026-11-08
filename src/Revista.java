public class Revista extends ItemBiblioteca{

    public Revista(String codigo, String titulo) {
        super(codigo, titulo);
    }

    public double geraMulta(int numDias){
        return numDias;
    }


    public int getPrazo(){
        return 7;
    }
}
