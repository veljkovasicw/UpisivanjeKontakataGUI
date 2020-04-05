package model;



public class Prijatelji extends Kontakti{

	private static Prijatelji instance=null;
	
	private Prijatelji() {
		super();
	
	}
	
	@Override
	public String toString() {
		
		return "Prijatelji";
	}
	
	public static Prijatelji getInstance() {

		if (instance==null) {
			
			instance= new Prijatelji();
		} 
		return instance;
	}

}


