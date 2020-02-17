import java.util.Date;

public abstract class Samochod {
	private String marka;
	private String model;
	private Date rocznik;
	private int predkosc;
		
	public Samochod (String marka, String model, Date rocznik, int predkosc) {
        this.setModel(model);
        this.setMarka(marka);
        this.setRocznik(rocznik);
        this.setPredkosc(predkosc);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public Date getRocznik() {
		return rocznik;
	}

	public void setRocznik(Date rocznik) {
		this.rocznik = rocznik;
	}
	//
	public abstract int getMaxPredkosc(); 
	
	public abstract String toString();

	public int getPredkosc() {
		return predkosc;
	}

	public void setPredkosc(int predkosc) {
		this.predkosc = predkosc;
	}
}
