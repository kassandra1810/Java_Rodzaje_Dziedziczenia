
public class Rekin extends StworzenieMorskie {
	
	private String rodzina;

	public Rekin(String gatunek, Integer waga, Integer wiek, String rodzina) {
		super(gatunek, waga, wiek);
		this.setRodzina(rodzina);
	}

	public String getRodzina() {
		return rodzina;
	}

	public void setRodzina(String rodzina) {
		this.rodzina = rodzina;
	}

	@Override
	public String toString() {
		String s = (this.getClass().getSimpleName()+" gatunek: "+ this.getGatunek()+", rodzina: "+this.getRodzina() +", wiek: "+this.getWiek()+", waga: "+ this.getWaga());
		return s;
	}

}
