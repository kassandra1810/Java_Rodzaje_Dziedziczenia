
public class Ryba extends StworzenieWodne {
	
	private String rodzina;

	public Ryba(String nazwa, Integer waga, Integer wiek, String rodzina, RodzajWody woda, Integer temperatura) {
		super(nazwa, waga, wiek, woda, temperatura);
		this.setRodzina(rodzina);
	}
	
	public Ryba(String nazwa, Integer waga, Integer wiek, String rodzina, RodzajWody woda, String obszar) {
		super(nazwa, waga, wiek, woda, obszar);
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
		String s = (this.getClass().getSimpleName()+" nazwa: "+ this.getnazwa()+", rodzina: "+this.getRodzina() +", wiek: "+this.getWiek()+", waga w kg: "+ this.getWaga()+", typ wody: "+this.getRodzajWody()+ " obszar: "+ this.getObszar()+ " temperatura "+ this.getTempetarura());
		return s;
	}

}
