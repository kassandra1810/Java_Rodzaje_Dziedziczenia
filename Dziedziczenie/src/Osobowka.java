import java.util.Date;

public class Osobowka extends Samochod{
	private int liczbaMiejsc;

	public Osobowka(String marka, String model, Date rocznik,int predkosc, int liczbaMiejsc) {
		super(marka, model, rocznik, predkosc);
		this.setLiczbaMiejsc(liczbaMiejsc);
	}
	
	public int getLiczbaMiejsc() {
		return liczbaMiejsc;
	}

	public void setLiczbaMiejsc(int liczbaMiejsc) {
		this.liczbaMiejsc = liczbaMiejsc;
	}
	
	@Override
	public int getMaxPredkosc() {
		if (liczbaMiejsc <=2) {
			return 340;
		}
		else
			return 240;
		
	}

	@Override
	public String toString() {
		return "Osobowka "+ " marka:"+this.getMarka()+ " model:"+this.getModel()+" liczba miejsc:" + liczbaMiejsc +"\n";
	}



}
