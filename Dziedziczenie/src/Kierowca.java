import java.util.EnumSet;

enum TypKierowcy {KierowcaSamochodu, KierowcaCiezarowki, KierowcaAutobusu};

public class Kierowca {
	private String imie;
	private String nazwisko;
	//kierowca sam
	private Integer iloscPunktowKarnych;
	//kierowca cie
	private Double stazProwadzenia; 
	//kierowca aut
	private String badaniaOkresowe; 
	private EnumSet<TypKierowcy> kierowcaTyp = EnumSet.of(TypKierowcy.KierowcaSamochodu); // kierowca znika
	
	public Kierowca (String imie, String nazwisko,TypKierowcy kierowcaautobusu) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.kierowcaTyp.add(kierowcaautobusu);	
	}	
	public Kierowca (String imie, String nazwisko, String badaniaOkresowe) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.badaniaOkresowe = badaniaOkresowe;
		this.kierowcaTyp.add(TypKierowcy.KierowcaAutobusu);	
	}
	public Kierowca (String imie, String nazwisko, Integer iloscPunktowKarnych) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.iloscPunktowKarnych = iloscPunktowKarnych;
		this.kierowcaTyp.add(TypKierowcy.KierowcaSamochodu);	
	}
	public Kierowca (String imie, String nazwisko, Double stazProwadzenia) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.stazProwadzenia = stazProwadzenia;
		this.kierowcaTyp.add(TypKierowcy.KierowcaCiezarowki);	
	}
		
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public int getIloscPunktowKarnych() {
		return iloscPunktowKarnych;
	}
	public void setIloscPunktowKarnych(int iloscPunktowKarnych) {
		this.iloscPunktowKarnych = iloscPunktowKarnych;
	}
	public Double getStazProwadzenia() {
		return stazProwadzenia;
	}
	public void setStazProwadzenia(Double stazProwadzenia) {
		this.stazProwadzenia = stazProwadzenia;
	}
	public String getBadaniaOkresowe() {
		return badaniaOkresowe;
	}
	public void setBadaniaOkresowe(String badaniaOkresowe) {
		this.badaniaOkresowe = badaniaOkresowe;
	}
	public EnumSet<TypKierowcy> getKierowcaTyp() {
		EnumSet<TypKierowcy> kierowcaKopia = this.kierowcaTyp.clone();
		return kierowcaKopia;
	}
	public void setKierowcaTyp(TypKierowcy typ ) {
		this.kierowcaTyp.add(typ);
	}
	public void removeKierowcaTyp(TypKierowcy typ) {
		this.kierowcaTyp.remove(typ);
	}
	
	@Override
	public String toString() {
		String s = ("Imie: "+this.getImie()+" nazwisko: "+this.getNazwisko()+" Typ kierowcy: "+this.kierowcaTyp);
		return s;
	}

}
