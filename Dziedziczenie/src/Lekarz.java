import java.util.Date;

public class Lekarz extends Pracownik {
	private String specjalizacja;
	private Double liczbaGodzinMies;

	public Lekarz(String imie, String nazwisko, Date dataUrodzenia, String specjalizacja) {
		super(imie, nazwisko, dataUrodzenia);
		this.setSpecjalizacja(specjalizacja);
		
	}
	
	public Lekarz(Pracownik pracownik, String specjalizacja) {
        super(pracownik.getImie(),pracownik.getNazwisko(), pracownik.getDataUrodzenia()); 
        this.setSpecjalizacja(specjalizacja);
    }

	public String getSpecjalizacja() {
		return specjalizacja;
	}

	public void setSpecjalizacja(String specjalizacja) {
		this.specjalizacja = specjalizacja;
	}

	public Double getLiczbaGodzinMies() {
		return liczbaGodzinMies;
	}

	public void setLiczbaGodzinMies(Double liczbaGodzinMies) {
		this.liczbaGodzinMies = liczbaGodzinMies;
	}

	@Override
	public void getNadgodziny() {
		Double nadgodziny = (this.getLiczbaGodzinMies() - new Double(168));
		if (nadgodziny <= 0) {
			System.out.println("Lelarz "+ super.getImie()+ " " + super.getNazwisko() + " " + this.getSpecjalizacja() + " nie ma nadgodzin w tym miesiącu");
		} else {
			System.out.println("Lelarz "+ super.getImie()+ " " + super.getNazwisko() + " ma " + nadgodziny + " nadgodzin w tym miesiącu");
		}
	}

	@Override
	public String toString() {
		return ("Lelarz " + "Imię: "+ super.getImie()+ " Nazwisko: " + super.getNazwisko() + " specjalizacja - " + this.getSpecjalizacja() );
	}

}

