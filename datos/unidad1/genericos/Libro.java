package datos.unidad1.genericos;

public class Libro extends Producto<Integer>{
	public Libro(String nombre, double precio, Integer paginas) {
        	super(nombre, precio, paginas);
    	}
	
	public void mostrarDetalles() {
		String datos= "Nombre: "+super.nombre+
			"\nPrecio: "+ super.precio +
			"\nPáginas: " + super.getExtra();

		System.out.println(datos);
    }
}

