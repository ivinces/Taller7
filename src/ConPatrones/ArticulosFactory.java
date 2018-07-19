package ConPatrones;

public class ArticulosFactory {
	
	public Articulo getArticulo(String articulo) {
		if(articulo == null){
	         return null;
	      }		
	      
	      if(articulo.equalsIgnoreCase("CIRCLE")){
	         return new Circle();
	         
	      }else if(articulo.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();
	         
	      }else if(articulo.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }
	      
	      return null;
	 }
	
}

