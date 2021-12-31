package proyectoClass;

public class ProjectTest {

	public static void main(String[] args) {
		
		//Prueba del constructor y GETnombre
		
        Project juego = new Project("Mario");
        String nombre = juego.getNombre();

        System.out.println("Nombre del juego: " + nombre);
        //------------------------------------------------------------
        System.out.println("\n\n");
        //------------------------------------------------------------
        Project tienda = new Project("Steam", "Tienda de videojuegos de PC");
        String datos = tienda.elevatorPitch();

        System.out.println("Descripción del pryecto " + datos);
		
        
        //------------------------------------------------------------
        System.out.println("\n\n");
        //------------------------------------------------------------
        
        
        //Prueba de los SET
        Project escuela = new Project ();
        escuela.setNombre ("Concurso de talentos");
		escuela.setDescripcion("Un concurso para que los competidores sorprendan al publico");
		String concurso = escuela.getNombre();
		String objetivo = escuela.getDescripcion();
		
		System.out.println("El proyecto escolar es: " + concurso + "\nDescripción: " + objetivo);
		
	}
}
