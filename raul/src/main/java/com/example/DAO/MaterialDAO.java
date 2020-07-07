package com.example.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.raul.Entities.Material;

@Repository
public class MaterialDAO {

	@Autowired
	private EntityManager em;

	public void save(Material material) {
		em.getTransaction().begin();
		em.persist(material);
		em.getTransaction().commit();
	}

	public void update(Material material) {
		em.getTransaction().begin();
		em.merge(material);
		em.getTransaction().commit();
	}

	public List<Material> listAll() {
		return em.createQuery("select m from material m order by m.code", Material.class).getResultList();
	}

	public Material findById(int reg) {
		return em.find(Material.class, reg);
	}

	public void remove(int code) {
		em.getTransaction().begin();
		Material materialToRemove = findById(code);
		if (materialToRemove != null) {
			em.remove(materialToRemove);
		}
		em.getTransaction().commit();
	}
}

