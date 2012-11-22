package org.silk.entrepreneur.dao;

import java.util.List;

import org.silk.entrepreneur.model.Entrepreneur;

public interface EntrepreneurDao {
	public void save(Entrepreneur entrepreneur);
	public List<Entrepreneur> list();
	public void delete(Long id);
	public Entrepreneur listById(Long id);
}
