
public class DVD {
	/*Atributos*/
	private int codigo;
	private String nombre;
	private String director;
	private int duracion;
	
	//constructores
	public DVD(int bcodigo, String bnombre, String bdirector, int bduracion)
	{
		/*b-parámetros*/
		codigo = bcodigo;
		nombre = bnombre;
		director = bdirector;
		duracion = bduracion;		
	}

	//metodos
	/*get - muestra - retorna el valor de un atributo
	  set - modifica el valor de un atributo*/
	public int getCodigo() {
		return codigo;
	}

	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public String toString(){
		return "La pelicula " + nombre + " con codigo " + codigo
				+ " dirigida por " + director
				+ " dura " + duracion + " minutos.";
	}
	
	
}
