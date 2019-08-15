package br.imd.producao;
import java.math.BigDecimal;
import java.util.Date;

import br.imd.enums.EstadoLote;
import br.imd.rh.PessoaJuridica;
import br.imd.rh.producao.OrdemProducao;

public class LoteMaterial {
	private Material material;
	private Date dataValidade;
	private Date dataFabricacao;
	private EstadoLote estado;
	private String numeroLoteFabricante;
	private String numeroLoteInterno;
	private String numeroLoteFornecedor;
	private int volumes;
	private OrdemProducao ordemProducao;
	private PessoaJuridica fabricante;
	private PessoaJuridica fornecedor;
	private int qtdCaixaEmbarque;
	private BigDecimal pesoBrutoTotal;
	private BigDecimal pesoLiquidoTotal;
	private BigDecimal tara;
	private double valorUnitario;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataFabricacao == null) ? 0 : dataFabricacao.hashCode());
		result = prime * result + ((dataValidade == null) ? 0 : dataValidade.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((fabricante == null) ? 0 : fabricante.hashCode());
		result = prime * result + ((fornecedor == null) ? 0 : fornecedor.hashCode());
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		result = prime * result + ((numeroLoteFabricante == null) ? 0 : numeroLoteFabricante.hashCode());
		result = prime * result + ((numeroLoteFornecedor == null) ? 0 : numeroLoteFornecedor.hashCode());
		result = prime * result + ((numeroLoteInterno == null) ? 0 : numeroLoteInterno.hashCode());
		result = prime * result + ((ordemProducao == null) ? 0 : ordemProducao.hashCode());
		result = prime * result + ((pesoBrutoTotal == null) ? 0 : pesoBrutoTotal.hashCode());
		result = prime * result + ((pesoLiquidoTotal == null) ? 0 : pesoLiquidoTotal.hashCode());
		result = prime * result + qtdCaixaEmbarque;
		result = prime * result + ((tara == null) ? 0 : tara.hashCode());
		long temp;
		temp = Double.doubleToLongBits(valorUnitario);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + volumes;
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
		LoteMaterial other = (LoteMaterial) obj;
		if (dataFabricacao == null) {
			if (other.dataFabricacao != null)
				return false;
		} else if (!dataFabricacao.equals(other.dataFabricacao))
			return false;
		if (dataValidade == null) {
			if (other.dataValidade != null)
				return false;
		} else if (!dataValidade.equals(other.dataValidade))
			return false;
		if (estado != other.estado)
			return false;
		if (fabricante == null) {
			if (other.fabricante != null)
				return false;
		} else if (!fabricante.equals(other.fabricante))
			return false;
		if (fornecedor == null) {
			if (other.fornecedor != null)
				return false;
		} else if (!fornecedor.equals(other.fornecedor))
			return false;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		if (numeroLoteFabricante == null) {
			if (other.numeroLoteFabricante != null)
				return false;
		} else if (!numeroLoteFabricante.equals(other.numeroLoteFabricante))
			return false;
		if (numeroLoteFornecedor == null) {
			if (other.numeroLoteFornecedor != null)
				return false;
		} else if (!numeroLoteFornecedor.equals(other.numeroLoteFornecedor))
			return false;
		if (numeroLoteInterno == null) {
			if (other.numeroLoteInterno != null)
				return false;
		} else if (!numeroLoteInterno.equals(other.numeroLoteInterno))
			return false;
		if (ordemProducao == null) {
			if (other.ordemProducao != null)
				return false;
		} else if (!ordemProducao.equals(other.ordemProducao))
			return false;
		if (pesoBrutoTotal == null) {
			if (other.pesoBrutoTotal != null)
				return false;
		} else if (!pesoBrutoTotal.equals(other.pesoBrutoTotal))
			return false;
		if (pesoLiquidoTotal == null) {
			if (other.pesoLiquidoTotal != null)
				return false;
		} else if (!pesoLiquidoTotal.equals(other.pesoLiquidoTotal))
			return false;
		if (qtdCaixaEmbarque != other.qtdCaixaEmbarque)
			return false;
		if (tara == null) {
			if (other.tara != null)
				return false;
		} else if (!tara.equals(other.tara))
			return false;
		if (Double.doubleToLongBits(valorUnitario) != Double.doubleToLongBits(other.valorUnitario))
			return false;
		if (volumes != other.volumes)
			return false;
		return true;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public Date getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}
	public Date getDataFabricacao() {
		return dataFabricacao;
	}
	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	public EstadoLote getEstado() {
		return estado;
	}
	public void setEstado(EstadoLote estado) {
		this.estado = estado;
	}
	public String getNumeroLoteFabricante() {
		return numeroLoteFabricante;
	}
	public void setNumeroLoteFabricante(String numeroLoteFabricante) {
		this.numeroLoteFabricante = numeroLoteFabricante;
	}
	public String getNumeroLoteInterno() {
		return numeroLoteInterno;
	}
	public void setNumeroLoteInterno(String numeroLoteInterno) {
		this.numeroLoteInterno = numeroLoteInterno;
	}
	public String getNumeroLoteFornecedor() {
		return numeroLoteFornecedor;
	}
	public void setNumeroLoteFornecedor(String numeroLoteFornecedor) {
		this.numeroLoteFornecedor = numeroLoteFornecedor;
	}
	public int getVolumes() {
		return volumes;
	}
	public void setVolumes(int volumes) {
		this.volumes = volumes;
	}
	public OrdemProducao getOrdemProducao() {
		return ordemProducao;
	}
	public void setOrdemProducao(OrdemProducao ordemProducao) {
		this.ordemProducao = ordemProducao;
	}
	public PessoaJuridica getFabricante() {
		return fabricante;
	}
	public void setFabricante(PessoaJuridica fabricante) {
		this.fabricante = fabricante;
	}
	public PessoaJuridica getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(PessoaJuridica fornecedor) {
		this.fornecedor = fornecedor;
	}
	public int getQtdCaixaEmbarque() {
		return qtdCaixaEmbarque;
	}
	public void setQtdCaixaEmbarque(int qtdCaixaEmbarque) {
		this.qtdCaixaEmbarque = qtdCaixaEmbarque;
	}
	public BigDecimal getPesoBrutoTotal() {
		return pesoBrutoTotal;
	}
	public void setPesoBrutoTotal(BigDecimal pesoBrutoTotal) {
		this.pesoBrutoTotal = pesoBrutoTotal;
	}
	public BigDecimal getPesoLiquidoTotal() {
		return pesoLiquidoTotal;
	}
	public void setPesoLiquidoTotal(BigDecimal pesoLiquidoTotal) {
		this.pesoLiquidoTotal = pesoLiquidoTotal;
	}
	public BigDecimal getTara() {
		return tara;
	}
	public void setTara(BigDecimal tara) {
		this.tara = tara;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
}
