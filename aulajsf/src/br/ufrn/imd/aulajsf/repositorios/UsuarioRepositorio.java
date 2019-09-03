package br.ufrn.imd.aulajsf.repositorios;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.ufrn.imd.aulajsf.dominio.Usuario;
import br.ufrn.imd.aulajsf.util.HibernateUtil;

public class UsuarioRepositorio {
	
	private static EntityManager entityManager = HibernateUtil.getEntityManager();
	
	public static Usuario getUsuario(String login, String senha) {	
			EntityTransaction transaction = entityManager.getTransaction();
//			transaction.begin();
			List<Usuario> retorno= entityManager.createQuery("from Usuario u where u.login='"+login+"'").getResultList();
			
		
			System.out.println(retorno.size());
		for(Usuario u:retorno) {
			if(u.getLogin().equals(login) && u.getSenha().equals(senha)) {
				System.out.println("achou");
				return u;
			}
		}
		System.out.println("aaaaaaaaaaa");
		return null;
	}
	
	public static void salvar(Usuario entidade) {
		
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(entidade);
		transaction.commit();
	}
}
