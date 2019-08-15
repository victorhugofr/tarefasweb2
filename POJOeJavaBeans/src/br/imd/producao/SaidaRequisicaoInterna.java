package br.imd.producao;
import java.util.List;

import br.imd.enums.StatusRequisicao;
import br.imd.rh.Setor;

public class SaidaRequisicaoInterna {
	String codigo;
	Usuario requisitante;
	Setor setorRequisitante;
	Usuario responsavelSetor;
	StatusRequisicao statusRequisicao;
	List<ItemRequisicao> itensRequisicao;
	List<HistoricoRequisicao> historicoRequisicao;
	SaidaEstoque saidaEstoque;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Usuario getRequisitante() {
		return requisitante;
	}
	public void setRequisitante(Usuario requisitante) {
		this.requisitante = requisitante;
	}
	public Setor getSetorRequisitante() {
		return setorRequisitante;
	}
	public void setSetorRequisitante(Setor setorRequisitante) {
		this.setorRequisitante = setorRequisitante;
	}
	public Usuario getResponsavelSetor() {
		return responsavelSetor;
	}
	public void setResponsavelSetor(Usuario responsavelSetor) {
		this.responsavelSetor = responsavelSetor;
	}
	public StatusRequisicao getStatusRequisicao() {
		return statusRequisicao;
	}
	public void setStatusRequisicao(StatusRequisicao statusRequisicao) {
		this.statusRequisicao = statusRequisicao;
	}
	public List<ItemRequisicao> getItensRequisicao() {
		return itensRequisicao;
	}
	public void setItensRequisicao(List<ItemRequisicao> itensRequisicao) {
		this.itensRequisicao = itensRequisicao;
	}
	public List<HistoricoRequisicao> getHistoricoRequisicao() {
		return historicoRequisicao;
	}
	public void setHistoricoRequisicao(List<HistoricoRequisicao> historicoRequisicao) {
		this.historicoRequisicao = historicoRequisicao;
	}
	public SaidaEstoque getSaidaEstoque() {
		return saidaEstoque;
	}
	public void setSaidaEstoque(SaidaEstoque saidaEstoque) {
		this.saidaEstoque = saidaEstoque;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((historicoRequisicao == null) ? 0 : historicoRequisicao.hashCode());
		result = prime * result + ((itensRequisicao == null) ? 0 : itensRequisicao.hashCode());
		result = prime * result + ((requisitante == null) ? 0 : requisitante.hashCode());
		result = prime * result + ((responsavelSetor == null) ? 0 : responsavelSetor.hashCode());
		result = prime * result + ((saidaEstoque == null) ? 0 : saidaEstoque.hashCode());
		result = prime * result + ((setorRequisitante == null) ? 0 : setorRequisitante.hashCode());
		result = prime * result + ((statusRequisicao == null) ? 0 : statusRequisicao.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SaidaRequisicaoInterna other = (SaidaRequisicaoInterna) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (historicoRequisicao == null) {
			if (other.historicoRequisicao != null)
				return false;
		} else if (!historicoRequisicao.equals(other.historicoRequisicao))
			return false;
		if (itensRequisicao == null) {
			if (other.itensRequisicao != null)
				return false;
		} else if (!itensRequisicao.equals(other.itensRequisicao))
			return false;
		if (requisitante == null) {
			if (other.requisitante != null)
				return false;
		} else if (!requisitante.equals(other.requisitante))
			return false;
		if (responsavelSetor == null) {
			if (other.responsavelSetor != null)
				return false;
		} else if (!responsavelSetor.equals(other.responsavelSetor))
			return false;
		if (saidaEstoque == null) {
			if (other.saidaEstoque != null)
				return false;
		} else if (!saidaEstoque.equals(other.saidaEstoque))
			return false;
		if (setorRequisitante == null) {
			if (other.setorRequisitante != null)
				return false;
		} else if (!setorRequisitante.equals(other.setorRequisitante))
			return false;
		if (statusRequisicao != other.statusRequisicao)
			return false;
		return true;
	}
	
}
