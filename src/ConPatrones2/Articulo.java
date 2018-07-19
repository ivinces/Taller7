package ConPatrones2;

import SinPatrones.*;

public class Articulo {

	private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
	private String descripcion;
	private double precio;
	private String tipo; //Puede ser plato, bebida, botana, combo1, combo2, etc
	
	
	public Articulo() {
		
	}
	
	public Articulo(String nombre, String descripcion, double precio, String tipo) {
		// Recuerde que en composite se debe tener una lista/arreglo de articulos simples
	}
	
	public double getPrecio() {
		return precio;
	}
}
