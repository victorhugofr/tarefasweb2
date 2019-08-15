package br.imd.producao;

public class UnidadeMedida {
	private String nome;
	private String abreviacao;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((abreviacao == null) ? 0 : abreviacao.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		UnidadeMedida other = (UnidadeMedida) obj;
		if (abreviacao == null) {
			if (other.abreviacao != null)
				return false;
		} else if (!abreviacao.equals(other.abreviacao))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAbreviacao() {
		return abreviacao;
	}
	public void setAbreviacao(String abreviacao) {
		this.abreviacao = abreviacao;
	}
}
