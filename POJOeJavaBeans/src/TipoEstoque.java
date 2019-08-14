
public class TipoEstoque {
	int LOTE;
	int MATERIAL;
	public int getLOTE() {
		return LOTE;
	}
	public void setLOTE(int lOTE) {
		LOTE = lOTE;
	}
	public int getMATERIAL() {
		return MATERIAL;
	}
	public void setMATERIAL(int mATERIAL) {
		MATERIAL = mATERIAL;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + LOTE;
		result = prime * result + MATERIAL;
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
		TipoEstoque other = (TipoEstoque) obj;
		if (LOTE != other.LOTE)
			return false;
		if (MATERIAL != other.MATERIAL)
			return false;
		return true;
	}
	
}
