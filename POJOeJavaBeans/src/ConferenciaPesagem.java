import java.util.Date;

public class ConferenciaPesagem {
	private Date data;
	private LoteMaterial lote;
	private int numeroVolumes;
	private double taraKg;
	private int	pesoVolumes;
	private boolean	executado;
	private boolean	conferido;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (conferido ? 1231 : 1237);
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + (executado ? 1231 : 1237);
		result = prime * result + ((lote == null) ? 0 : lote.hashCode());
		result = prime * result + numeroVolumes;
		result = prime * result + pesoVolumes;
		long temp;
		temp = Double.doubleToLongBits(taraKg);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		ConferenciaPesagem other = (ConferenciaPesagem) obj;
		if (conferido != other.conferido)
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (executado != other.executado)
			return false;
		if (lote == null) {
			if (other.lote != null)
				return false;
		} else if (!lote.equals(other.lote))
			return false;
		if (numeroVolumes != other.numeroVolumes)
			return false;
		if (pesoVolumes != other.pesoVolumes)
			return false;
		if (Double.doubleToLongBits(taraKg) != Double.doubleToLongBits(other.taraKg))
			return false;
		return true;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public LoteMaterial getLote() {
		return lote;
	}
	public void setLote(LoteMaterial lote) {
		this.lote = lote;
	}
	public int getNumeroVolumes() {
		return numeroVolumes;
	}
	public void setNumeroVolumes(int numeroVolumes) {
		this.numeroVolumes = numeroVolumes;
	}
	public double getTaraKg() {
		return taraKg;
	}
	public void setTaraKg(double taraKg) {
		this.taraKg = taraKg;
	}
	public int getPesoVolumes() {
		return pesoVolumes;
	}
	public void setPesoVolumes(int pesoVolumes) {
		this.pesoVolumes = pesoVolumes;
	}
	public boolean isExecutado() {
		return executado;
	}
	public void setExecutado(boolean executado) {
		this.executado = executado;
	}
	public boolean isConferido() {
		return conferido;
	}
	public void setConferido(boolean conferido) {
		this.conferido = conferido;
	}
}
