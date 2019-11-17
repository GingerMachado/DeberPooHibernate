package net.ug.hibernate;

import org.hibernate.*;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.*;



public class DaoDecano {
	
	protected SessionFactory sessionFactory; //protected solo  es visible para superclases
	// ssesion factory  para poder usar los metodos dando acceso a hibernate
	
	protected void setup() {// lee configuracion de hibernate y levanta servicio
	
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure()
				.build();
		try {
			sessionFactory = new MetadataSources(registry)
					.buildMetadata().buildSessionFactory();			
		} catch (Exception e) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}
		
	
	protected void crear(Decano decano) {
		Session s = sessionFactory.openSession();
		s.beginTransaction();
		s.save(decano);
		s.getTransaction();
		s.close();
	}
	
	
	protected Decano read(long id) {
		Session s = sessionFactory.openSession();
		Decano decano = s.get(Decano.class, id);
		s.close();
		return decano;
				
	}
	
	protected void update(Decano decano) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.update(decano);
		s.getTransaction().commit();
		s.close();
	}
	
	protected void delete(int id) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		Decano decano = new Decano();
		decano.setId(id);
		s.delete(decano);
		s.getTransaction().commit();
		s.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
