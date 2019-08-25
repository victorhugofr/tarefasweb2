package hibernateutil.testes;

import org.junit.Test;

import hibernatepratica.dao.DaoGeneric;
import hibernatepratica.model.UsuarioPessoa;
import hibernatepratica.util.HibernateUtil;

public class TestHibernate {

	@Test
	public void testHibernateUtil() {
		HibernateUtil.getEntityManager();
	}
	
	@Test
	public void testHibernateInsert() {
		DaoGeneric<UsuarioPessoa> daoGeneric= new DaoGeneric<UsuarioPessoa>();
		
		UsuarioPessoa usuario = new UsuarioPessoa();
		
		usuario.setCpf("70875454429");
		usuario.setEmail("teste@testes");
		usuario.setLogin("teste");
		usuario.setNome("teste");
		usuario.setSenha("teste");
		daoGeneric.salvar(usuario);
	}
	
	@Test
	public void testHibernateBuscar() {
		DaoGeneric<UsuarioPessoa> daoGeneric= new DaoGeneric<UsuarioPessoa>();
		
		UsuarioPessoa usuario = new UsuarioPessoa();
		
		usuario.setId(1L);
		usuario = daoGeneric.pesquisar(usuario);
		System.out.println(usuario);
	}
	
	@Test
	public void testHibernateUpdate() {
		DaoGeneric<UsuarioPessoa> daoGeneric= new DaoGeneric<UsuarioPessoa>();
		UsuarioPessoa usuario1 = new UsuarioPessoa();
		
		usuario1.setId(1L);
		UsuarioPessoa usuario2 = daoGeneric.pesquisar(usuario1);
		
		usuario2.setNome("teste222");
		usuario2 = daoGeneric.updateMerge(usuario2);
		System.out.println(usuario2);
	}
	
	@Test
	public void testHibernateDeletar() {
		DaoGeneric<UsuarioPessoa> daoGeneric= new DaoGeneric<UsuarioPessoa>();
		
		UsuarioPessoa usuario = new UsuarioPessoa();
		
		usuario.setId(2L);
		usuario = daoGeneric.pesquisar(usuario);
		daoGeneric.deletarPorId(usuario);
	}
}
