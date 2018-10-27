package Ejemplo;





public class Libros2 {
	private String firstNameBook;
	private String firstNameAutor;


	public Integer register(IRepository repository) throws Exception {
		Integer librosId = null;
		boolean good = false;
		String[] ot = new String[] { "Matematica", "Lenguaje", "Aritmetica" };
	
		if (this.firstNameBook.isEmpty()) { return librosId;}
		if (this.firstNameAutor.isEmpty()){return librosId;}
		good = (this.firstNameAutor.length()>0 || this.firstNameBook.length()>0);
		if (good) {System.out.printf("El nombre del autor es: %f", firstNameAutor);
				return librosId;
				}
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