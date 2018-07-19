package ConPatrones;

public class ArticulosFactory {
	
	public Articulo getArticulo(String articulo) {
		if(articulo == null){
	         return null;
	      }		
	      
	      if(articulo.equalsIgnoreCase("Arroz con menestra")){
	         return new ArrozConMenestra();
	         
	      }else if(articulo.equalsIgnoreCase("Arroz Con Menestra y Pollo")){
	         return new ArrozConMenestrayPollo();
	         
	      }else if(articulo.equalsIgnoreCase("Pollo Asado")){
	         return new PolloAsado();
	      }
	      
	      return null;
	 }
	
}

