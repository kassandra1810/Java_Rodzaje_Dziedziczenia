
public class RekinWielorybi extends Rekin implements IWieloryb {

	private boolean PozywieniaPlankton;

	public RekinWielorybi(String gatunek, Integer waga, Integer wiek, String rodzina, boolean pp) {
		super(gatunek, waga, wiek, rodzina);
		this.setPozywieniaPlankton(pp);
	}

	@Override
	public String getPozywienie() {
		String s = "Rekin wielorybi żywi się planktonem";
		return s;
	}

	@Override
	public String toString() {
		String s = (this.getClass().getSimpleName()+" gatunek: "+ this.getGatunek()+", rodzina: "+this.getRodzina()+", pożywienie: "+this.getPozywienie() +", wiek: "+this.getWiek()+", waga: "+ this.getWaga());
		return s;
	}
	

	public boolean isPozywieniaPlankton() {
		return PozywieniaPlankton;
	}

	public void setPozywieniaPlankton(boolean pozywieniaPlankton) {
		PozywieniaPlankton = pozywieniaPlankton;
	}

}

