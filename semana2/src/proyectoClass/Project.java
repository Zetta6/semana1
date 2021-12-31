package proyectoClass;

public class Project {
	
	private String nombre;
	
	private String descripcion;
	
	//GET general
	public String elevatorPitch () {
		return nombre + ": " + descripcion;
	}
	
	public Project() { }

	public Project(String nombre) {
		this.nombre = nombre;
	}

	public Project(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	
	// GET nombre
    public String getNombre () {
    	
        return nombre;
    }

    // SET nombre
    public void setNombre (String nombre) {

        this.nombre = nombre;
    }
    
    
    
    //GET descripcion
    public String getDescripcion () {
    	
    	return descripcion;
    }
    
    //SET descripcion
    public void setDescripcion (String descripcion) {
    	this.descripcion = descripcion;
    }
}
