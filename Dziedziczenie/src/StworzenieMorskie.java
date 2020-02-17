
public abstract class StworzenieMorskie {
	private String gatunek;
	private Integer waga;
	private Integer wiek;
	
	public StworzenieMorskie(String gatunek, Integer waga, Integer wiek) {
		this.setGatunek(gatunek);
		this.setWaga(waga);
		this.setWiek(wiek);
	}

	public String getGatunek() {
		return gatunek;
	}

	public void setGatunek(String gatunek) {
		this.gatunek = gatunek;
	}

	public Integer getWaga() {
		return waga;
	}

	public void setWaga(Integer waga) {
		this.waga = waga;
	}

	public Integer getWiek() {
		return wiek;
	}

	public void setWiek(Integer wiek) {
		this.wiek = wiek;
	}
	
	public abstract String toString();
}
