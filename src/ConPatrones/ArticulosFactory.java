package ConPatrones;

public class ArticulosFactory {
	
	public Articulo getArticulo(String articulo) {
		if(articulo == null){
	         return null;
	      }		
	      
	      if(articulo.equalsIgnoreCase("CIRCLE")){
	         return new Circle();
	         
	      }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();
	         
	      }else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }
	      
	      return null;
	 }
	
}

