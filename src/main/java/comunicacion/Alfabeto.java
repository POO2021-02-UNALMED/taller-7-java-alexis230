package comunicacion;

public class Alfabeto extends Pictograma{
    String [] letras;
    String interpretacion;

    public Alfabeto(String origen, String [] letras, String interpretacion){
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    public String interpretacion(){
        return interpretacion;
    }

    public int cantidadLetras(){
        return letras.length;
    }

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
}