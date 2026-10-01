package datos.unidad1.genericos;

public class Electronico extends Producto<String> {

    // Constructor según el diagrama UML: Electronico(nombre, precio, garantia)
    public Electronico(String nombre, double precio, String garantia) {
        super(nombre, precio, garantia);
    }

    @Override
    public void mostrarDetalles() {
        String datos = "Nombre: " + super.nombre +
                       "\nPrecio: $" + super.precio +
                       "\nGarantía: " + super.getExtra();

        System.out.println(datos);
    }
}