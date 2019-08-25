package hibernatepratica.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import hibernatepratica.dao.DaoGeneric;
import hibernatepratica.model.UsuarioPessoa;

@ViewScoped
@ManagedBean(name="usuarioPessoaBean")
public class UsuarioPessoaBean {
	UsuarioPessoa pessoa = new UsuarioPessoa();
	DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
	private List<UsuarioPessoa> pessoas = new ArrayList<UsuarioPessoa>();
	
	public String salvar() {
		daoGeneric.salvar(pessoa);
		pessoa = new UsuarioPessoa();
		carregarPessoas();
		return "";
	}

	public UsuarioPessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(UsuarioPessoa pessoa) {
		this.pessoa = pessoa;
	}

	public DaoGeneric<UsuarioPessoa> getDaoGeneric() {
		return daoGeneric;
	}

	public void setDaoGeneric(DaoGeneric<UsuarioPessoa> daoGeneric) {
		this.daoGeneric = daoGeneric;
	}
	
	public void carregarPessoas() {
		if(daoGeneric.getListEntity(UsuarioPessoa.class)!=null)
			pessoas=daoGeneric.getListEntity(UsuarioPessoa.class);
	}

	public List<UsuarioPessoa> getPessoas() {
		return pessoas;
	}
	
}