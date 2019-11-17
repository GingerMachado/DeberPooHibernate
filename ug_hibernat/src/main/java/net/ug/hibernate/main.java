package net.ug.hibernate;

public class main {
	
	public static void main(String[] args ) {
		crear();
		//read();
		//update();
		//delete();
		
	}
	
	public static void crear() {
		DaoDecano daoDecano = new DaoDecano();
		Decano decanos = new Decano(1,"0953940395","Ginger","Machado","0976546876");
		daoDecano.setup();
		daoDecano.crear(decanos);
		
	}
	
	/*public static void read() {
		DaoDecano daoDecano = new DaoDecano();
		daoDecano.setup();
		Decano decano = daoDecano.read(1);
		daoDecano.imprimir();
			
	}*/
	
	public static void update() {

		DaoDecano daoDecano = new DaoDecano();
		daoDecano.setup();
		Decano  decano = daoDecano.read(1);
		decano.setCellphone("2606049");
		daoDecano.update(decano);	}
	
	public static void delete() {
		DaoDecano daoDecano = new DaoDecano();
		daoDecano.setup();
		daoDecano.delete(1);
		
	}
	

}



