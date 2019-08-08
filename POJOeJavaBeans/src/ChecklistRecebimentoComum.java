import java.util.Date;
import java.util.List;

import br.imd.rh.Funcionario;

public class ChecklistRecebimentoComum {
	private Date dataChegada;
	private LoteMaterial lote;
	private boolean meterialConfereNF;
	private boolean	etiquetadoIdentificacao;
	private boolean embalagemIntegra;
	private boolean embalagemSuja;
	private boolean embalagemUmida;
	private boolean embalagemDeformada;
	private boolean embalagemVazada;
	private boolean embalagemLacreViolado;
	private String placa;
	private float temperatura;
	private int	numeroConhecimento;
	private String	motorista;
	private String	observacoes;
	private Funcionario conferente;
	private List<Documento> anexoFotos;
	private boolean aprovado;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anexoFotos == null) ? 0 : anexoFotos.hashCode());
		result = prime * result + (aprovado ? 1231 : 1237);
		result = prime * result + ((conferente == null) ? 0 : conferente.hashCode());
		result = prime * result + ((dataChegada == null) ? 0 : dataChegada.hashCode());
		result = prime * result + (embalagemDeformada ? 1231 : 1237);
		result = prime * result + (embalagemIntegra ? 1231 : 1237);
		result = prime * result + (embalagemLacreViolado ? 1231 : 1237);
		result = prime * result + (embalagemSuja ? 1231 : 1237);
		result = prime * result + (embalagemUmida ? 1231 : 1237);
		result = prime * result + (embalagemVazada ? 1231 : 1237);
		result = prime * result + (etiquetadoIdentificacao ? 1231 : 1237);
		result = prime * result + ((lote == null) ? 0 : lote.hashCode());
		result = prime * result + (meterialConfereNF ? 1231 : 1237);
		result = prime * result + ((motorista == null) ? 0 : motorista.hashCode());
		result = prime * result + numeroConhecimento;
		result = prime * result + ((observacoes == null) ? 0 : observacoes.hashCode());
		result = prime * result + ((placa == null) ? 0 : placa.hashCode());
		result = prime * result + Float.floatToIntBits(temperatura);
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
		ChecklistRecebimentoComum other = (ChecklistRecebimentoComum) obj;
		if (anexoFotos == null) {
			if (other.anexoFotos != null)
				return false;
		} else if (!anexoFotos.equals(other.anexoFotos))
			return false;
		if (aprovado != other.aprovado)
			return false;
		if (conferente == null) {
			if (other.conferente != null)
				return false;
		} else if (!conferente.equals(other.conferente))
			return false;
		if (dataChegada == null) {
			if (other.dataChegada != null)
				return false;
		} else if (!dataChegada.equals(other.dataChegada))
			return false;
		if (embalagemDeformada != other.embalagemDeformada)
			return false;
		if (embalagemIntegra != other.embalagemIntegra)
			return false;
		if (embalagemLacreViolado != other.embalagemLacreViolado)
			return false;
		if (embalagemSuja != other.embalagemSuja)
			return false;
		if (embalagemUmida != other.embalagemUmida)
			return false;
		if (embalagemVazada != other.embalagemVazada)
			return false;
		if (etiquetadoIdentificacao != other.etiquetadoIdentificacao)
			return false;
		if (lote == null) {
			if (other.lote != null)
				return false;
		} else if (!lote.equals(other.lote))
			return false;
		if (meterialConfereNF != other.meterialConfereNF)
			return false;
		if (motorista == null) {
			if (other.motorista != null)
				return false;
		} else if (!motorista.equals(other.motorista))
			return false;
		if (numeroConhecimento != other.numeroConhecimento)
			return false;
		if (observacoes == null) {
			if (other.observacoes != null)
				return false;
		} else if (!observacoes.equals(other.observacoes))
			return false;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		if (Float.floatToIntBits(temperatura) != Float.floatToIntBits(other.temperatura))
			return false;
		return true;
	}
	public Date getDataChegada() {
		return dataChegada;
	}
	public void setDataChegada(Date dataChegada) {
		this.dataChegada = dataChegada;
	}
	public LoteMaterial getLote() {
		return lote;
	}
	public void setLote(LoteMaterial lote) {
		this.lote = lote;
	}
	public boolean isMeterialConfereNF() {
		return meterialConfereNF;
	}
	public void setMeterialConfereNF(boolean meterialConfereNF) {
		this.meterialConfereNF = meterialConfereNF;
	}
	public boolean isEtiquetadoIdentificacao() {
		return etiquetadoIdentificacao;
	}
	public void setEtiquetadoIdentificacao(boolean etiquetadoIdentificacao) {
		this.etiquetadoIdentificacao = etiquetadoIdentificacao;
	}
	public boolean isEmbalagemIntegra() {
		return embalagemIntegra;
	}
	public void setEmbalagemIntegra(boolean embalagemIntegra) {
		this.embalagemIntegra = embalagemIntegra;
	}
	public boolean isEmbalagemSuja() {
		return embalagemSuja;
	}
	public void setEmbalagemSuja(boolean embalagemSuja) {
		this.embalagemSuja = embalagemSuja;
	}
	public boolean isEmbalagemUmida() {
		return embalagemUmida;
	}
	public void setEmbalagemUmida(boolean embalagemUmida) {
		this.embalagemUmida = embalagemUmida;
	}
	public boolean isEmbalagemDeformada() {
		return embalagemDeformada;
	}
	public void setEmbalagemDeformada(boolean embalagemDeformada) {
		this.embalagemDeformada = embalagemDeformada;
	}
	public boolean isEmbalagemVazada() {
		return embalagemVazada;
	}
	public void setEmbalagemVazada(boolean embalagemVazada) {
		this.embalagemVazada = embalagemVazada;
	}
	public boolean isEmbalagemLacreViolado() {
		return embalagemLacreViolado;
	}
	public void setEmbalagemLacreViolado(boolean embalagemLacreViolado) {
		this.embalagemLacreViolado = embalagemLacreViolado;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public float getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}
	public int getNumeroConhecimento() {
		return numeroConhecimento;
	}
	public void setNumeroConhecimento(int numeroConhecimento) {
		this.numeroConhecimento = numeroConhecimento;
	}
	public String getMotorista() {
		return motorista;
	}
	public void setMotorista(String motorista) {
		this.motorista = motorista;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public Funcionario getConferente() {
		return conferente;
	}
	public void setConferente(Funcionario conferente) {
		this.conferente = conferente;
	}
	public List<Documento> getAnexoFotos() {
		return anexoFotos;
	}
	public void setAnexoFotos(List<Documento> anexoFotos) {
		this.anexoFotos = anexoFotos;
	}
	public boolean isAprovado() {
		return aprovado;
	}
	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
}
