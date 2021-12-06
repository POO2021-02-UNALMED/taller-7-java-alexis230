package comunicacion;

public class Alfabeto extends Pictograma{
	private String [] letras;
	private String interpretacion;

    public Alfabeto(String origen, String [] letras, String interpretacion){
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }
    
    public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

    @Override
	String interpretacion() {
    	return interpretacion;
	}
    
	@Override
	public String toString() {
		String letra = "";
		for (int i = 0; i < letras.length; i++) {
			if (i == letras.length - 1) {
				letra += letras[i];
				break;
			}
			letra += letras[i] + ", ";
		}
		return letra;
	}
	
}