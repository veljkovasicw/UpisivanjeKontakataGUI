package model;


public class Posao extends Kontakti{

	private static Posao instance=null;
	
	private Posao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		
		return "Posao";
	}
	
	public static Posao getInstance() {

		if (instance==null) {
			
			instance= new Posao();
		} 
		return instance;
	}


}
