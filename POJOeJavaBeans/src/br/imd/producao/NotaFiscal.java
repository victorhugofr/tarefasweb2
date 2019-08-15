package br.imd.producao;
import java.math.BigDecimal;
import java.util.Date;

import br.imd.rh.PessoaJuridica;

public class NotaFiscal {
	private int serieNF;
	private int numeroNF;
	private PessoaJuridica transportadora;
	private Date dataEmissao;
	private PessoaJuridica emitente;
	private PessoaJuridica destinatario;
	private BigDecimal valortotal;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numeroNF;
		result = prime * result + serieNF;
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
		NotaFiscal other = (NotaFiscal) obj;
		if (numeroNF != other.numeroNF)
			return false;
		if (serieNF != other.serieNF)
			return false;
		return true;
	}
	public int getSerieNF() {
		return serieNF;
	}
	public void setSerieNF(int serieNF) {
		this.serieNF = serieNF;
	}
	public int getNumeroNF() {
		return numeroNF;
	}
	public void setNumeroNF(int numeroNF) {
		this.numeroNF = numeroNF;
	}
	public PessoaJuridica getTransportadora() {
		return transportadora;
	}
	public void setTransportadora(PessoaJuridica transportadora) {
		this.transportadora = transportadora;
	}
	public Date getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public PessoaJuridica getEmitente() {
		return emitente;
	}
	public void setEmitente(PessoaJuridica emitente) {
		this.emitente = emitente;
	}
	public PessoaJuridica getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(PessoaJuridica destinatario) {
		this.destinatario = destinatario;
	}
	public BigDecimal getValortotal() {
		return valortotal;
	}
	public void setValortotal(BigDecimal valortotal) {
		this.valortotal = valortotal;
	}
	
}
