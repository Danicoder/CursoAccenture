package rf.curso.S4_MiniApi2.dao;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import rf.curso.S4_MiniApi2.modelos.Country;
import rf.curso.S4_MiniApi2.service.JPAUtil;

public class CountryDao {
	EntityManager manager = JPAUtil.getEntityManager();

	// guardar Country
	public void guardar(Country Country) {
		manager.getTransaction().begin();
		manager.persist(Country);
		manager.getTransaction().commit();
	}

	// editar Country
	public void editar(Country Country) {
		manager.getTransaction().begin();
		manager.merge(Country);
		manager.getTransaction().commit();
	}

	// buscar Country
	public Country buscar(String country_id) {
		Country c = manager.find(Country.class, country_id);
		return c;
	}

	/// eliminar Country
	public void eliminar(String id) {
		Country c = manager.find(Country.class, id);
		manager.getTransaction().begin();
		manager.remove(c);
		manager.getTransaction().commit();
	}
	public void eliminar(Country c) {
		eliminar(c.getCountry_id());
	}
	// obtener todos los Country
	public List<Country> obtenerCountrys() {
		List<Country> listaCountrys = new ArrayList<>();
		Query q = manager.createQuery("SELECT c FROM COUNTRIES_DANI c");
		listaCountrys = (List<Country>) q.getResultList();
		return listaCountrys;
	}
	
}
