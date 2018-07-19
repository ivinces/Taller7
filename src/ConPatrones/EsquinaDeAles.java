package ConPatrones;

public class EsquinaDeAles extends Combo{
	
	public EsquinaDeAles(){
		
	}
	
	public Articulo fabricarArrozConMenestraYPollo() {
		ArticulosFactory articulo = new ArticulosFactory();
		return articulo.getArticulo("Arroz Con Menestra y Pollo");
	}
	
	public Articulo fabricarPolloAsado() {
		ArticulosFactory articulo = new ArticulosFactory();
		return articulo.getArticulo("Pollo Asado");
	}
	
	public Articulo fabricarArrozConMenestra() {
		ArticulosFactory articulo = new ArticulosFactory();
		return articulo.getArticulo("Arroz con menestra");
	}
	
	//Muchos otros metodos parecidos para otros productos
	@Override
    public void armarCombo(Articulo a1, Articulo a2) {
         System.out.println("El combo armado es: "+a1.getNombre() + " + " + a2.getNombre());
    }

	@Override
	public void crear() {
		// TODO Auto-generated method stub
		
	}
}
