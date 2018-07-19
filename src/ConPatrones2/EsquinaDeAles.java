package ConPatrones2;

public class EsquinaDeAles extends Combo{
	
	public EsquinaDeAles() {
		
	}
	
	public Articulo fabricarArrozConMenestraYPollo() {
		Articulo articulo = new Articulo();
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
