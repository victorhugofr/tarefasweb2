import java.util.Date;
import java.util.List;

import br.imd.enums.StatusMovimentacao;
import br.imd.enums.TipoEntrada;

public class EntradaEstoque {
	private String codigo;
	private List<MovimentacaoEntrada> itens;
	private StatusMovimentacao status;
	private String observacoes;
	private Usuario responsavel;
	private Date dataCriaçao;
	private Date dataEntrada;
	private List<Documento> anexos;
	private boolean precisaConferenciaEstado;
	private boolean precisaPesagem;
	private boolean	precisaAnalise;
	private NotaFiscal notaFiscal;
	private ChecklistRecebimentoComum checklistRecebimento;
	private ConferenciaPesagem conferenciaPesagem;
	private ChecklistTransferencia checklistTransferencia;
	private String justificativa;
	private TipoEntrada tipoEntrada;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public List<MovimentacaoEntrada> getItens() {
		return itens;
	}
	public void setItens(List<MovimentacaoEntrada> itens) {
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
	public Usuario getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Usuario responsavel) {
		this.responsavel = responsavel;
	}
	public Date getDataCriaçao() {
		return dataCriaçao;
	}
	public void setDataCriaçao(Date dataCriaçao) {
		this.dataCriaçao = dataCriaçao;
	}
	public Date getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public List<Documento> getAnexos() {
		return anexos;
	}
	public void setAnexos(List<Documento> anexos) {
		this.anexos = anexos;
	}
	public boolean isPrecisaConferenciaEstado() {
		return precisaConferenciaEstado;
	}
	public void setPrecisaConferenciaEstado(boolean precisaConferenciaEstado) {
		this.precisaConferenciaEstado = precisaConferenciaEstado;
	}
	public boolean isPrecisaPesagem() {
		return precisaPesagem;
	}
	public void setPrecisaPesagem(boolean precisaPesagem) {
		this.precisaPesagem = precisaPesagem;
	}
	public boolean isPrecisaAnalise() {
		return precisaAnalise;
	}
	public void setPrecisaAnalise(boolean precisaAnalise) {
		this.precisaAnalise = precisaAnalise;
	}
	public NotaFiscal getNotaFiscal() {
		return notaFiscal;
	}
	public void setNotaFiscal(NotaFiscal notaFiscal) {
		this.notaFiscal = notaFiscal;
	}
	public ChecklistRecebimentoComum getChecklistRecebimento() {
		return checklistRecebimento;
	}
	public void setChecklistRecebimento(ChecklistRecebimentoComum checklistRecebimento) {
		this.checklistRecebimento = checklistRecebimento;
	}
	public ConferenciaPesagem getConferenciaPesagem() {
		return conferenciaPesagem;
	}
	public void setConferenciaPesagem(ConferenciaPesagem conferenciaPesagem) {
		this.conferenciaPesagem = conferenciaPesagem;
	}
	public ChecklistTransferencia getChecklistTransferencia() {
		return checklistTransferencia;
	}
	public void setChecklistTransferencia(ChecklistTransferencia checklistTransferencia) {
		this.checklistTransferencia = checklistTransferencia;
	}
	public String getJustificativa() {
		return justificativa;
	}
	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}
	public TipoEntrada getTipoEntrada() {
		return tipoEntrada;
	}
	public void setTipoEntrada(TipoEntrada tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anexos == null) ? 0 : anexos.hashCode());
		result = prime * result + ((checklistRecebimento == null) ? 0 : checklistRecebimento.hashCode());
		result = prime * result + ((checklistTransferencia == null) ? 0 : checklistTransferencia.hashCode());
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((conferenciaPesagem == null) ? 0 : conferenciaPesagem.hashCode());
		result = prime * result + ((dataCriaçao == null) ? 0 : dataCriaçao.hashCode());
		result = prime * result + ((dataEntrada == null) ? 0 : dataEntrada.hashCode());
		result = prime * result + ((itens == null) ? 0 : itens.hashCode());
		result = prime * result + ((justificativa == null) ? 0 : justificativa.hashCode());
		result = prime * result + ((notaFiscal == null) ? 0 : notaFiscal.hashCode());
		result = prime * result + ((observacoes == null) ? 0 : observacoes.hashCode());
		result = prime * result + (precisaAnalise ? 1231 : 1237);
		result = prime * result + (precisaConferenciaEstado ? 1231 : 1237);
		result = prime * result + (precisaPesagem ? 1231 : 1237);
		result = prime * result + ((responsavel == null) ? 0 : responsavel.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((tipoEntrada == null) ? 0 : tipoEntrada.hashCode());
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
		EntradaEstoque other = (EntradaEstoque) obj;
		if (anexos == null) {
			if (other.anexos != null)
				return false;
		} else if (!anexos.equals(other.anexos))
			return false;
		if (checklistRecebimento == null) {
			if (other.checklistRecebimento != null)
				return false;
		} else if (!checklistRecebimento.equals(other.checklistRecebimento))
			return false;
		if (checklistTransferencia == null) {
			if (other.checklistTransferencia != null)
				return false;
		} else if (!checklistTransferencia.equals(other.checklistTransferencia))
			return false;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (conferenciaPesagem == null) {
			if (other.conferenciaPesagem != null)
				return false;
		} else if (!conferenciaPesagem.equals(other.conferenciaPesagem))
			return false;
		if (dataCriaçao == null) {
			if (other.dataCriaçao != null)
				return false;
		} else if (!dataCriaçao.equals(other.dataCriaçao))
			return false;
		if (dataEntrada == null) {
			if (other.dataEntrada != null)
				return false;
		} else if (!dataEntrada.equals(other.dataEntrada))
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
		if (notaFiscal == null) {
			if (other.notaFiscal != null)
				return false;
		} else if (!notaFiscal.equals(other.notaFiscal))
			return false;
		if (observacoes == null) {
			if (other.observacoes != null)
				return false;
		} else if (!observacoes.equals(other.observacoes))
			return false;
		if (precisaAnalise != other.precisaAnalise)
			return false;
		if (precisaConferenciaEstado != other.precisaConferenciaEstado)
			return false;
		if (precisaPesagem != other.precisaPesagem)
			return false;
		if (responsavel == null) {
			if (other.responsavel != null)
				return false;
		} else if (!responsavel.equals(other.responsavel))
			return false;
		if (status != other.status)
			return false;
		if (tipoEntrada != other.tipoEntrada)
			return false;
		return true;
	}
	
}
