package ConPatrones;

public class PollosGus {
	
	public PollosGus() {
		
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
	
}
