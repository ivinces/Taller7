package ConPatrones2;

import SinPatrones.*;

public class PollosGus extends Combo{
	
	public PollosGus() {
		
	}
	
	public Articulo fabricarArrozConMenestraYPollo() {
		Articulo articulo = new Articulo(); //Construir 
		return articulo;
	}
	
	public Articulo fabricarPolloAsado() {
		Articulo articulo = new Articulo();
		return articulo;
	}
	
	public Articulo fabricarArrozConMenestra() {
		Articulo articulo = new Articulo();
		return articulo;
	}
	
	//Muchos otros metodos parecidos para otros productos
        
        @Override
    public void armarCombo(Articulo a1, Articulo a2) {
         System.out.println("El combo armado es: "+a1.getNombre() + " + " + a2.getNombre());
    }
	
}
