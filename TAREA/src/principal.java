
public class principal {

	public static void main(String[] args) {
		
		DVD dvd1 = new DVD(005, "Justice League", "Ted Danson", 160);
		DVD dvd2 = new DVD(006, "The Flash", "Grant Gustin", 130);
		
		System.out.println(dvd1.toString());
		System.out.println(dvd2.toString());
		
		dvd2.setDuracion(180);
		
		if (dvd1.getDuracion()>dvd2.getDuracion()){
			System.out.println(dvd1.getNombre() + " dura mas que " + dvd2.getNombre());
		}else {
			System.out.println(dvd2.getNombre() + " dura mas que " + dvd1.getNombre());
		}

		
	}

}
