import java.util.Date;
public class Ciezarowka extends Samochod { 

	private int ladownosc;

	public Ciezarowka(String marka, String model, Date rocznik,int predkosc, int ladownosc) {
		super(marka, model, rocznik, predkosc);
		this.setLadownosc(ladownosc);
	}
	
	public int getLadownosc() {
		return ladownosc;
	}

	public void setLadownosc(int ladownosc) {
		this.ladownosc = ladownosc;
	}
	
	@Override
	public int getMaxPredkosc() {
		if (ladownosc <=1) {
			return 190;
		}
		else
			return 150;
		
	}

	@Override
	public String toString() {
		return "Cięzarówka "+ " marka:"+this.getMarka()+ " model:"+this.getModel()+" ładowność " + this.getLadownosc()+"t. \n";
	}



}
