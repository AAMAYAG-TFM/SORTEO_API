package co.edu.unir.tfm.sorteo.services;

import java.util.List;

import co.edu.unir.tfm.sorteo.entities.Premio;

public interface PremioService {

	public List<Premio> findAll();

	public void saveOrUpdate(Premio premio);

}
