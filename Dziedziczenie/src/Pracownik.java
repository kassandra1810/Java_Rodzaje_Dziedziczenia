import java.util.Date;
	public abstract class Pracownik {
		
		private String imie;
		private String nazwisko;
		private Date dataUrodzenia;
		
		public Pracownik (String imie, String nazwisko, Date dataUrodzenia) {
	        super();
	        this.setImie(imie);
	        this.setNazwisko(nazwisko);
	        this.setDataUrodzenia(dataUrodzenia);
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

		public Date getDataUrodzenia() {
			return dataUrodzenia;
		}

		public void setDataUrodzenia(Date dataUrodzenia) {
			this.dataUrodzenia = dataUrodzenia;
		}
		public abstract void getNadgodziny(); 
		
		public String toString() {
			return this.getClass().getSimpleName() + ": " + this.getImie() + " " + this.getNazwisko();
		}
	}


