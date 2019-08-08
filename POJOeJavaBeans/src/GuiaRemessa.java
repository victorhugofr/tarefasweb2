import java.util.Date;

import br.imd.enums.ViaTransporte;

public class GuiaRemessa {
	private int numeroGuiaRemessa;
	private Date dataEmissao;
	private ViaTransporte viaTransporte;
	private String especieEmbalagem;
	private NaturezaOperacao naturezaOperacao;
	private int remessa;
	
	public int getNumeroGuiaRemessa() {
		return numeroGuiaRemessa;
	}
	public void setNumeroGuiaRemessa(int numeroGuiaRemessa) {
		this.numeroGuiaRemessa = numeroGuiaRemessa;
	}
	public Date getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public ViaTransporte getViaTransporte() {
		return viaTransporte;
	}
	public void setViaTransporte(ViaTransporte viaTransporte) {
		this.viaTransporte = viaTransporte;
	}
	public String getEspecieEmbalagem() {
		return especieEmbalagem;
	}
	public void setEspecieEmbalagem(String especieEmbalagem) {
		this.especieEmbalagem = especieEmbalagem;
	}
	public NaturezaOperacao getNaturezaOperacao() {
		return naturezaOperacao;
	}
	public void setNaturezaOperacao(NaturezaOperacao naturezaOperacao) {
		this.naturezaOperacao = naturezaOperacao;
	}
	public int getRemessa() {
		return remessa;
	}
	public void setRemessa(int remessa) {
		this.remessa = remessa;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataEmissao == null) ? 0 : dataEmissao.hashCode());
		result = prime * result + ((especieEmbalagem == null) ? 0 : especieEmbalagem.hashCode());
		result = prime * result + ((naturezaOperacao == null) ? 0 : naturezaOperacao.hashCode());
		result = prime * result + numeroGuiaRemessa;
		result = prime * result + remessa;
		result = prime * result + ((viaTransporte == null) ? 0 : viaTransporte.hashCode());
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
		GuiaRemessa other = (GuiaRemessa) obj;
		if (dataEmissao == null) {
			if (other.dataEmissao != null)
				return false;
		} else if (!dataEmissao.equals(other.dataEmissao))
			return false;
		if (especieEmbalagem == null) {
			if (other.especieEmbalagem != null)
				return false;
		} else if (!especieEmbalagem.equals(other.especieEmbalagem))
			return false;
		if (naturezaOperacao == null) {
			if (other.naturezaOperacao != null)
				return false;
		} else if (!naturezaOperacao.equals(other.naturezaOperacao))
			return false;
		if (numeroGuiaRemessa != other.numeroGuiaRemessa)
			return false;
		if (remessa != other.remessa)
			return false;
		if (viaTransporte != other.viaTransporte)
			return false;
		return true;
	}
}
