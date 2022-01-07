package interface1;

public interface Vehiculo {
	
	public String fechaCreacion = "tengo fecha de creacion";
	
	public String acelerar();

	public String frenar();
	
	public default String fechaCreacion() {
		return Vehiculo.fechaCreacion;
	};
	
	public String numeroRuedas();
}
