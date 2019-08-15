package br.imd.producao;
import java.math.BigDecimal;
import java.util.Date;

import br.imd.enums.TipoMovimentacao;
import br.imd.rh.PessoaJuridica;

public class MovimentacaoEstoque {
	Usuario responsavel;
	PessoaJuridica pjOrigem;
	Almoxarifado almoxarifadoOrigem;
	PessoaJuridica pjDestino;
	Almoxarifado almoxarifadoDestino;
	BigDecimal qtdMovimentada;
	LoteMaterial itemLote;
	Material itemMaterial;
	Date dataMovimentacao;
	TipoMovimentacao tipoMovimentacao;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((almoxarifadoDestino == null) ? 0 : almoxarifadoDestino.hashCode());
		result = prime * result + ((almoxarifadoOrigem == null) ? 0 : almoxarifadoOrigem.hashCode());
		result = prime * result + ((dataMovimentacao == null) ? 0 : dataMovimentacao.hashCode());
		result = prime * result + ((itemLote == null) ? 0 : itemLote.hashCode());
		result = prime * result + ((itemMaterial == null) ? 0 : itemMaterial.hashCode());
		result = prime * result + ((pjDestino == null) ? 0 : pjDestino.hashCode());
		result = prime * result + ((pjOrigem == null) ? 0 : pjOrigem.hashCode());
		result = prime * result + ((qtdMovimentada == null) ? 0 : qtdMovimentada.hashCode());
		result = prime * result + ((responsavel == null) ? 0 : responsavel.hashCode());
		result = prime * result + ((tipoMovimentacao == null) ? 0 : tipoMovimentacao.hashCode());
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
		MovimentacaoEstoque other = (MovimentacaoEstoque) obj;
		if (almoxarifadoDestino == null) {
			if (other.almoxarifadoDestino != null)
				return false;
		} else if (!almoxarifadoDestino.equals(other.almoxarifadoDestino))
			return false;
		if (almoxarifadoOrigem == null) {
			if (other.almoxarifadoOrigem != null)
				return false;
		} else if (!almoxarifadoOrigem.equals(other.almoxarifadoOrigem))
			return false;
		if (dataMovimentacao == null) {
			if (other.dataMovimentacao != null)
				return false;
		} else if (!dataMovimentacao.equals(other.dataMovimentacao))
			return false;
		if (itemLote == null) {
			if (other.itemLote != null)
				return false;
		} else if (!itemLote.equals(other.itemLote))
			return false;
		if (itemMaterial == null) {
			if (other.itemMaterial != null)
				return false;
		} else if (!itemMaterial.equals(other.itemMaterial))
			return false;
		if (pjDestino == null) {
			if (other.pjDestino != null)
				return false;
		} else if (!pjDestino.equals(other.pjDestino))
			return false;
		if (pjOrigem == null) {
			if (other.pjOrigem != null)
				return false;
		} else if (!pjOrigem.equals(other.pjOrigem))
			return false;
		if (qtdMovimentada == null) {
			if (other.qtdMovimentada != null)
				return false;
		} else if (!qtdMovimentada.equals(other.qtdMovimentada))
			return false;
		if (responsavel == null) {
			if (other.responsavel != null)
				return false;
		} else if (!responsavel.equals(other.responsavel))
			return false;
		if (tipoMovimentacao != other.tipoMovimentacao)
			return false;
		return true;
	}
	public Usuario getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Usuario responsavel) {
		this.responsavel = responsavel;
	}
	public PessoaJuridica getPjOrigem() {
		return pjOrigem;
	}
	public void setPjOrigem(PessoaJuridica pjOrigem) {
		this.pjOrigem = pjOrigem;
	}
	public Almoxarifado getAlmoxarifadoOrigem() {
		return almoxarifadoOrigem;
	}
	public void setAlmoxarifadoOrigem(Almoxarifado almoxarifadoOrigem) {
		this.almoxarifadoOrigem = almoxarifadoOrigem;
	}
	public PessoaJuridica getPjDestino() {
		return pjDestino;
	}
	public void setPjDestino(PessoaJuridica pjDestino) {
		this.pjDestino = pjDestino;
	}
	public Almoxarifado getAlmoxarifadoDestino() {
		return almoxarifadoDestino;
	}
	public void setAlmoxarifadoDestino(Almoxarifado almoxarifadoDestino) {
		this.almoxarifadoDestino = almoxarifadoDestino;
	}
	public BigDecimal getQtdMovimentada() {
		return qtdMovimentada;
	}
	public void setQtdMovimentada(BigDecimal qtdMovimentada) {
		this.qtdMovimentada = qtdMovimentada;
	}
	public LoteMaterial getItemLote() {
		return itemLote;
	}
	public void setItemLote(LoteMaterial itemLote) {
		this.itemLote = itemLote;
	}
	public Material getItemMaterial() {
		return itemMaterial;
	}
	public void setItemMaterial(Material itemMaterial) {
		this.itemMaterial = itemMaterial;
	}
	public Date getDataMovimentacao() {
		return dataMovimentacao;
	}
	public void setDataMovimentacao(Date dataMovimentacao) {
		this.dataMovimentacao = dataMovimentacao;
	}
	public TipoMovimentacao getTipoMovimentacao() {
		return tipoMovimentacao;
	}
	public void setTipoMovimentacao(TipoMovimentacao tipoMovimentacao) {
		this.tipoMovimentacao = tipoMovimentacao;
	}
}
