
public class Wieloryb extends StworzenieMorskie implements IWieloryb {
	
	private boolean PozywieniaPlankton;

	public Wieloryb(String gatunek, Integer waga, Integer wiek, boolean pp) {
		super(gatunek, waga, wiek);
		this.setPozywieniaPlankton(pp);
	}

	public boolean isPozywieniaPlankton() {
		return PozywieniaPlankton;
	}
	
	@Override
	public String getPozywienie() {
		String s = "Wieloryb żywi się planktonem";
		return s;
	}

	public void setPozywieniaPlankton(boolean pozywieniaPlankton) {
		PozywieniaPlankton = pozywieniaPlankton;
	}

	@Override
	public String toString() {
		String s = (this.getClass().getSimpleName()+" gatunek: "+ this.getGatunek()+", pożywienie: "+this.getPozywienie() +", wiek: "+this.getWiek()+", waga: "+ this.getWaga());
		return s;
	}

}
