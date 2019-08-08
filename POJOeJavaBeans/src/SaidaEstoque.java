import java.util.Date;
import java.util.List;

import br.imd.enums.StatusMovimentacao;
import br.imd.rh.PessoaJuridica;

public class SaidaEstoque {
	private Usuario responsavel;
	private Date dataEnvio;
	private Date dataCriacao;
	private List<MovimentacaoSaida> itens;
	private StatusMovimentacao status;
	private String observacoes;
	private PessoaJuridica transportadora;
	private List<Documento> anexos;
	private GuiaRemessa guiaRemessa;
	private PessoaJuridica pjDestinatario;
	private String justificativa;
	public Usuario getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Usuario responsavel) {
		this.responsavel = responsavel;
	}
	public Date getDataEnvio() {
		return dataEnvio;
	}
	public void setDataEnvio(Date dataEnvio) {
		this.dataEnvio = dataEnvio;
	}
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public List<MovimentacaoSaida> getItens() {
		return itens;
	}
	public void setItens(List<MovimentacaoSaida> itens) {
		this.itens = itens;
	}
	public StatusMovimentacao getStatus() {
		return status;
	}
	public void setStatus(StatusMovimentacao status) {
		this.status = status;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public PessoaJuridica getTransportadora() {
		return transportadora;
	}
	public void setTransportadora(PessoaJuridica transportadora) {
		this.transportadora = transportadora;
	}
	public List<Documento> getAnexos() {
		return anexos;
	}
	public void setAnexos(List<Documento> anexos) {
		this.anexos = anexos;
	}
	public GuiaRemessa getGuiaRemessa() {
		return guiaRemessa;
	}
	public void setGuiaRemessa(GuiaRemessa guiaRemessa) {
		this.guiaRemessa = guiaRemessa;
	}
	public PessoaJuridica getPjDestinatario() {
		return pjDestinatario;
	}
	public void setPjDestinatario(PessoaJuridica pjDestinatario) {
		this.pjDestinatario = pjDestinatario;
	}
	public String getJustificativa() {
		return justificativa;
	}
	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anexos == null) ? 0 : anexos.hashCode());
		result = prime * result + ((dataCriacao == null) ? 0 : dataCriacao.hashCode());
		result = prime * result + ((dataEnvio == null) ? 0 : dataEnvio.hashCode());
		result = prime * result + ((guiaRemessa == null) ? 0 : guiaRemessa.hashCode());
		result = prime * result + ((itens == null) ? 0 : itens.hashCode());
		result = prime * result + ((justificativa == null) ? 0 : justificativa.hashCode());
		result = prime * result + ((observacoes == null) ? 0 : observacoes.hashCode());
		result = prime * result + ((pjDestinatario == null) ? 0 : pjDestinatario.hashCode());
		result = prime * result + ((responsavel == null) ? 0 : responsavel.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((transportadora == null) ? 0 : transportadora.hashCode());
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
		SaidaEstoque other = (SaidaEstoque) obj;
		if (anexos == null) {
			if (other.anexos != null)
				return false;
		} else if (!anexos.equals(other.anexos))
			return false;
		if (dataCriacao == null) {
			if (other.dataCriacao != null)
				return false;
		} else if (!dataCriacao.equals(other.dataCriacao))
			return false;
		if (dataEnvio == null) {
			if (other.dataEnvio != null)
				return false;
		} else if (!dataEnvio.equals(other.dataEnvio))
			return false;
		if (guiaRemessa == null) {
			if (other.guiaRemessa != null)
				return false;
		} else if (!guiaRemessa.equals(other.guiaRemessa))
			return false;
		if (itens == null) {
			if (other.itens != null)
				return false;
		} else if (!itens.equals(other.itens))
			return false;
		if (justificativa == null) {
			if (other.justificativa != null)
				return false;
		} else if (!justificativa.equals(other.justificativa))
			return false;
		if (observacoes == null) {
			if (other.observacoes != null)
				return false;
		} else if (!observacoes.equals(other.observacoes))
			return false;
		if (pjDestinatario == null) {
			if (other.pjDestinatario != null)
				return false;
		} else if (!pjDestinatario.equals(other.pjDestinatario))
			return false;
		if (responsavel == null) {
			if (other.responsavel != null)
				return false;
		} else if (!responsavel.equals(other.responsavel))
			return false;
		if (status != other.status)
			return false;
		if (transportadora == null) {
			if (other.transportadora != null)
				return false;
		} else if (!transportadora.equals(other.transportadora))
			return false;
		return true;
	}
	
	
}
