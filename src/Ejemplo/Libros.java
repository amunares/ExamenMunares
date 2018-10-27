package Ejemplo;





public class Libros {
	private String firstNameBook;
	private String firstNameAutor;


	public Integer register(IRepository repository) throws Exception {
		Integer librosId = null;
		boolean good = false;
		// Lista de los libros
		String[] ot = new String[] { "Matematica", "Lenguaje", "Aritmetica" };
		
		// Pregunta si el nombre del libro esta en null
		
		if (!this.firstNameBook.isEmpty()) {
			// Pregunta si el nombre del autor esta en null
			if (!this.firstNameAutor.isEmpty()) {
				// Muestra el nomre del autor
				good = (this.firstNameAutor.length()>0 || this.firstNameBook.length()>0);
				if (good) {
					System.out.printf("El nombre del autor es: %f", firstNameAutor);
				}
				
				
				} else {
				throw new IllegalArgumentException("Nombre de Autor es requerido");
				}	

			// Muestra el nomre del Libro
			
				System.out.printf("El nombre del libro es: %f", firstNameBook);
			} else {
				throw new IllegalArgumentException("Nombre de Libro es requerido");
			}			
		
			
		//Retorna el id del libro
		return librosId;
	}



	public String getFirstNameAutor() {
		return firstNameAutor;
	}



	public void setFirstNameAutor(String firstNameAutor) {
		this.firstNameAutor = firstNameAutor;
	}



	public String getFirstNameBook() {
		return firstNameBook;
	}

	public void setFirstNameBook(String firstNameBook) {
		this.firstNameBook = firstNameBook;
	}

	
}