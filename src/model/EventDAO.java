package model;

import javax.persistence.EntityManager;

public class EventDAO {
	
	public void save(Event obj) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		
		try {
			em.getTransaction().begin();
			em.persist(obj);
			em.getTransaction().commit();
			
		} catch (Exception e){
			em.getTransaction().rollback();
			System.out.println("There was an error while trying to save the event");
			throw e;
			
		} finally  {
			em.close();
		}
	}

}
