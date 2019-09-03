package br.ufrn.imd.aulajsf.repositorios;
import java.util.ArrayList;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.ufrn.imd.aulajsf.dominio.Material;
import br.ufrn.imd.aulajsf.util.HibernateUtil;
public class MaterialRepositorio {


	private static EntityManager entityManager = HibernateUtil.getEntityManager();
	public static List<Material> materiais;
	
	public static void adicionar(Material material) {
		EntityTransaction transaction = entityManager.getTransaction();
		
//		transaction.begin();
		entityManager.persist(material);
//		transaction.commit();
	}
	
	public static void remover(Material material) {
		materiais.remove(material);
	}
	
	public static List<Material> listarMateriais(){
		EntityTransaction transaction = entityManager.getTransaction();
//		transaction.begin();
		List<Material> retorno = entityManager.createQuery("from Material").getResultList();
		materiais=retorno;
//		transaction.commit();
		return materiais;
	}
}
