package service;

import java.util.List;

import entidades.Premio;

public interface PremioService {

	public List<Premio> findAll();

	public void saveOrUpdate(Premio premio);

}
