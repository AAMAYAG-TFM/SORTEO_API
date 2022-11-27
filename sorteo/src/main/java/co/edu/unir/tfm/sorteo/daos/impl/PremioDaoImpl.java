package co.edu.unir.tfm.sorteo.daos.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.unir.tfm.sorteo.daos.PremioDao;
import co.edu.unir.tfm.sorteo.entities.Premio;

@Repository
public class PremioDaoImpl implements PremioDao {

    @Autowired
    private EntityManager em;
    
    
    
	@Override
	public Premio buscarPorID(String ideOrganizacion, Integer idePremio) {
        Session sesion = em.unwrap(Session.class);

        Query<Premio> theQuery = sesion.createQuery("from PREMIO", Premio.class);
        
        List<Premio> premios = theQuery.getResultList();
        
        return null;
	}

}
			