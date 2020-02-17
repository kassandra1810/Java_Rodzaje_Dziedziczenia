import java.util.Date;

public class Pielegniarka extends Pracownik {
	private Double liczbaGodzinMies;
	private int liczWykonanychZastrzykow;

	public Pielegniarka(String imie, String nazwisko, Date dataUrodzenia, int liczWykonanychZastrzykow) {
		super(imie, nazwisko, dataUrodzenia);
		this.setLiczWykonanychZastrzykow(liczWykonanychZastrzykow);
	}
	
	public Pielegniarka(Pracownik pracownik, int liczWykonanychZastrzykow) {
        super(pracownik.getImie(),pracownik.getNazwisko(), pracownik.getDataUrodzenia()); 
        this.setLiczWykonanychZastrzykow(liczWykonanychZastrzykow);
    }

	public Double getLiczbaGodzinMies() {
		return liczbaGodzinMies;
	}

	public void setLiczbaGodzinMies(Double liczbaGodzinMies) {
		this.liczbaGodzinMies = liczbaGodzinMies;
	}

	public void getNadgodziny() {
		Double nadgodziny = (this.getLiczbaGodzinMies() - new Double(84));
		if (nadgodziny <= new Double(0)) {
			System.out.println("Pielęgniarka "+ super.getImie()+ " " + super.getNazwisko() + " nie ma nadgodzin w tym miesiącu");
		} else {
			System.out.println("Pielęgniarka "+ super.getImie()+ " " + super.getNazwisko() + " ma " + nadgodziny + " nadgodzin w tym miesiącu");
		}
	}

	public int getLiczWykonanychZastrzykow() {
		return liczWykonanychZastrzykow;
	}

	public void setLiczWykonanychZastrzykow(int liczWykonanychZastrzykow) {
		this.liczWykonanychZastrzykow = liczWykonanychZastrzykow;
	}

	@Override
	public String toString() {
		return ("Pielęgniarka" + " Imię: "+ super.getImie() + " Nazwisko: " + super.getNazwisko() + "Liczba zastrzyków - "+this.getLiczWykonanychZastrzykow());
	}

}

