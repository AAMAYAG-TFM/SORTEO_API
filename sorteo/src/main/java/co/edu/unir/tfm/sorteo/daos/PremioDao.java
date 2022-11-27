package co.edu.unir.tfm.sorteo.daos;

import co.edu.unir.tfm.sorteo.entities.Premio;

public interface PremioDao {

	public Premio buscarPorID(String ideOrganizacion, Integer idePremio);

}
