import java.math.BigDecimal;

public class VolumeMaterial {
	String codigo;
	Material material;
	BigDecimal qtdInicial;
	BigDecimal qtdAtual;
	DimensaoUnidade dimensao;
	Localizacao localizacao;
	LoteMaterial lote;
	VolumeMaterial VolumeOrigem;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((VolumeOrigem == null) ? 0 : VolumeOrigem.hashCode());
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((dimensao == null) ? 0 : dimensao.hashCode());
		result = prime * result + ((localizacao == null) ? 0 : localizacao.hashCode());
		result = prime * result + ((lote == null) ? 0 : lote.hashCode());
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		result = prime * result + ((qtdAtual == null) ? 0 : qtdAtual.hashCode());
		result = prime * result + ((qtdInicial == null) ? 0 : qtdInicial.hashCode());
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
		VolumeMaterial other = (VolumeMaterial) obj;
		if (VolumeOrigem == null) {
			if (other.VolumeOrigem != null)
				return false;
		} else if (!VolumeOrigem.equals(other.VolumeOrigem))
			return false;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (dimensao == null) {
			if (other.dimensao != null)
				return false;
		} else if (!dimensao.equals(other.dimensao))
			return false;
		if (localizacao == null) {
			if (other.localizacao != null)
				return false;
		} else if (!localizacao.equals(other.localizacao))
			return false;
		if (lote == null) {
			if (other.lote != null)
				return false;
		} else if (!lote.equals(other.lote))
			return false;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		if (qtdAtual == null) {
			if (other.qtdAtual != null)
				return false;
		} else if (!qtdAtual.equals(other.qtdAtual))
			return false;
		if (qtdInicial == null) {
			if (other.qtdInicial != null)
				return false;
		} else if (!qtdInicial.equals(other.qtdInicial))
			return false;
		return true;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public BigDecimal getQtdInicial() {
		return qtdInicial;
	}
	public void setQtdInicial(BigDecimal qtdInicial) {
		this.qtdInicial = qtdInicial;
	}
	public BigDecimal getQtdAtual() {
		return qtdAtual;
	}
	public void setQtdAtual(BigDecimal qtdAtual) {
		this.qtdAtual = qtdAtual;
	}
	public DimensaoUnidade getDimensao() {
		return dimensao;
	}
	public void setDimensao(DimensaoUnidade dimensao) {
		this.dimensao = dimensao;
	}
	public Localizacao getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}
	public LoteMaterial getLote() {
		return lote;
	}
	public void setLote(LoteMaterial lote) {
		this.lote = lote;
	}
	public VolumeMaterial getVolumeOrigem() {
		return VolumeOrigem;
	}
	public void setVolumeOrigem(VolumeMaterial volumeOrigem) {
		VolumeOrigem = volumeOrigem;
	}
}
