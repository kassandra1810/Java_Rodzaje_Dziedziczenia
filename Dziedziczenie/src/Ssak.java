
public class Ssak extends StworzenieWodne {
	
	private int dlugoscWstrzymywaniaOddechu;

	public Ssak(String nazwa, Integer waga, Integer wiek, int dlugoscWstrzymywaniaOddechu, RodzajWody woda, Integer tempetarura) {
		super(nazwa, waga, wiek, woda, tempetarura);
		this.setDlugoscWstrzymywaniaOddechu(dlugoscWstrzymywaniaOddechu);
	}
	
	public Ssak(String nazwa, Integer waga, Integer wiek, int dlugoscWstrzymywaniaOddechu, RodzajWody woda, String obszar) {
		super(nazwa, waga, wiek, woda, obszar);
		this.setDlugoscWstrzymywaniaOddechu(dlugoscWstrzymywaniaOddechu);
	}

	@Override
	public String toString() {
		String s = (this.getClass().getSimpleName()+" nazwa: "+ this.getnazwa()+ ", długość wstrzymywania oddechu: "+this.getDlugoscWstrzymywaniaOddechu() +" min" +", "
				+ "wiek: "+this.getWiek()+", waga w kg: "+ this.getWaga()+", rodzaj wody: "+ this.getRodzajWody() + " obszar: "+ this.getObszar()+ " temperatura "+ this.getTempetarura());
		return s;
	}

	public int getDlugoscWstrzymywaniaOddechu() {
		return dlugoscWstrzymywaniaOddechu;
	}

	public void setDlugoscWstrzymywaniaOddechu(int dlugoscWstrzymywaniaOddechu) {
		this.dlugoscWstrzymywaniaOddechu = dlugoscWstrzymywaniaOddechu;
	}

}
