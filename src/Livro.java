public class Livro extends ItemBiblioteca{

    public Livro(String codigo, String titulo) {
        super(codigo, titulo);
    }

    public double geraMulta(int numDias){
        return numDias*0.5;
    }


    public int getPrazo(){
        return 14;
    }


}
