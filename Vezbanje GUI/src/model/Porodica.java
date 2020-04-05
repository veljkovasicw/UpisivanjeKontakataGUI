package model;



public class Porodica extends Kontakti{

	
	private static Porodica instance=null;
	
	
	private Porodica() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		
		return "Porodica";
	}

	
	public static Porodica getInstance() {

		if (instance==null) {
			
			instance= new Porodica();
		} 
		return instance;
	}

	
	

}
