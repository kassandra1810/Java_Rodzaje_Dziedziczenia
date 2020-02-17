enum RodzajWody {WodySlodkie, WodySlone};

/**
 * @author Lilia
 *
 */
public abstract class StworzenieWodne {
	
	private String nazwa;
	private Integer waga;
	private Integer wiek;
	private Integer tempetarura; //wody ciepłe, zimne
	private String obszar; // na powierzchni, w pobliżu dna
	private RodzajWody rodzaj;
	
	public StworzenieWodne(String nazwa, Integer waga, Integer wiek, RodzajWody woda, Integer tempetarura) {
		this.setnazwa(nazwa);
		this.setWaga(waga);
		this.setWiek(wiek);
		this.setRodzajWody(woda);
		this.setTempetarura(tempetarura);
	}
	public StworzenieWodne(String nazwa, Integer waga, Integer wiek, RodzajWody woda, String obszar) {
		this.setnazwa(nazwa);
		this.setWaga(waga);
		this.setWiek(wiek);
		this.setRodzajWody(woda);
		this.setObszar(obszar);
	}

	public String getnazwa() {
		return nazwa;
	}

	public void setnazwa(String nazwa) {
		this.nazwa = nazwa;
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

	public RodzajWody getRodzajWody() {
		return rodzaj;
	}

	public void setRodzajWody(RodzajWody rodzaj) {
		this.rodzaj = rodzaj;
	}

	public Integer getTempetarura() {
		return tempetarura;
	}

	public void setTempetarura(Integer tempetarura) {
		this.tempetarura = tempetarura;
	}

	public String getObszar() {
		return obszar;
	}

	public void setObszar(String obszar) {
		this.obszar = obszar;
	}

}

