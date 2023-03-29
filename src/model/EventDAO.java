package model;

import javax.persistence.EntityManager;

public class EventDAO {
	
	public void save(Event e) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		
		try {
			em.getTransaction().begin();
			em.persist(e);
			em.getTransaction().commit();
			
		} catch (Exception ex){
			em.getTransaction().rollback();
			System.out.println("There was an error while trying to save the event");
			throw ex;
			
		} finally  {
			em.close();
		}
	}

}
