package ConPatrones;

public class ArticulosFactory {
	
	public Articulo getArticulo(String articulo) {
		if(articulo == null){
	         return null;
	      }		
	      
	      if(articulo.equalsIgnoreCase("Arroz con menestra")){
	         return new ArrozConMenestra();
	         
	      }else if(articulo.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();
	         
	      }else if(articulo.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }
	      
	      return null;
	 }
	
}

