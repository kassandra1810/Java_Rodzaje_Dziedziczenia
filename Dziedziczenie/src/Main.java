import java.util.Date;

public class Main {

	public static void main(String[] args) {
// DISJOINT Klasy Osobowka i Ciezarowka dziedziczą po klasie abstrakcyjnej Samochod	
		System.out.print("DISJOINT \n \n");
		Osobowka o1 = new Osobowka ("Ford", "Mustang",new Date(1976),200,4);
		System.out.print(o1); //.toStrong - polimorfizm, metoda działa inaczej Klasy Osobowka i Ciezarowka
		System.out.println("Maksymalna przędkość to : "+ o1.getMaxPredkosc()); //o1.getMaxPredkosc() - polinorfizm, metoda działa inaczej kla Klasy Osobowka i Ciezarowka
		Ciezarowka c1 = new Ciezarowka ("Ford", "F-Max",new Date(2019),200,40);
		System.out.print(c1);
		System.out.println("Maksymalna przędkość to : "+ c1.getMaxPredkosc());
		System.out.print("________________________________________________________________________________________\n");
		
// DYNAMIC
		System.out.print("DYNAMIC \n \n");
		Pracownik p1  = new Lekarz("Katarzyna","Kowalska",new Date(10/02/1977),"Chirurg"); //Tworzę lekarza
		System.out.println(p1); //.toStrong - polimorfizm, metoda działa inaczej kla Klasy Lekarz i Pielegniarka
		p1 = new Pielegniarka (p1, 433); //Tworzę pielęgniarkę na bazie lekarza
		System.out.println(p1);
		Pracownik p2  = new Pielegniarka("Dominika","Kowalska",new Date(10/02/1977),200); //Tworzę lekarza
		System.out.println(p2);
		p2 = new Lekarz(p2,"Internista"); //Tworzę lekarza na bazie pielęgniarki
		System.out.println(p2);
		System.out.print("________________________________________________________________________________________\n");
		
// OVERLAPPING metoda spłaszczenia
		System.out.print("OVERLAPPING \n \n");
		Kierowca k1 = new Kierowca("Robert","Wiśniewski",TypKierowcy.KierowcaAutobusu);// tworzę kierowcę i ręcznie w konstruktorze nadaje mu typ
		Kierowca k2 = new Kierowca("Adam","Kowalski",2); //Typ kierowcy jest nadawany automatycznie na podstawie parametrów - Kierowca samochodu
		Kierowca k3 = new Kierowca("Aneta","Walewska",8.5); //Kierowca ciężarówki - parametr staż prowadzenia 
		Kierowca k4 = new Kierowca("Aleksander","Wiśniewski","Badania pozytywne"); //Kierowca ciężarówki - parametr Badania
/*		System.out.println(k2);
		System.out.println(k3);
		System.out.println(k4);*/
		System.out.println(k1);
		k1.setKierowcaTyp(TypKierowcy.KierowcaCiezarowki); //dodanie typu
		System.out.println(k1);
		k1.removeKierowcaTyp(TypKierowcy.KierowcaAutobusu); //usuwanie typu
		System.out.println(k1);
		System.out.print("________________________________________________________________________________________\n");
		
// WIELOASPEKTOWE aspektem jest Rodzaj wody (Wody słodkie lub słone) jeżeli wody są słone to podajemy temperaturę, a leżeli słodkie - obszar w którym pływa.
		System.out.print("MULTI-ASPECT \n \n");
		Ryba r = new Ryba ("Rekin",200,20,"ryba chrzęstnoszkieletowa",RodzajWody.WodySlone,23); // Dziedziczy po klasie Stworzenie Wodne 
		Ssak s = new Ssak ("Delfin",100,5,15,RodzajWody.WodySlone,19);	//Dziedziczy po klasie Stworzenie Wodne
		Ryba sum = new Ryba ("Sum",50, 5, "ryba chrzęstnoszkieletowa",RodzajWody.WodySlodkie,"W pobliżu dna"); // Dziedziczy po klasie Stworzenie Wodne
		System.out.println(r);//.toString() polimorfizm, metoda działa inaczej Klasy Ryba i Ssak
		System.out.println(s);	
		System.out.println(sum);
		System.out.print("________________________________________________________________________________________\n");
		
// WIELODZIEDZICZENIE 
		System.out.print("MULTI-INHERITANCE \n \n");
		Rekin rek = new Rekin ("ryba",12,20,"ryba chrzęstnoszkieletowa");//dziedziczy po klasie Stworzenie morskie
		Wieloryb w = new Wieloryb ("ssak",150,100,true); //implementuje interfejs IWieloryb i dziedziczy po klasie Stworzenie morskie
		RekinWielorybi rw = new RekinWielorybi ("ryba", 30, 70,"ryba chrzęstnoszkieletowa", true); // implementuje IWieloryb i dziedziczy po klasie Rekin 
		System.out.println(rek); // .toString() polimorfizm, metoda działa inaczej klasy Rekin i Wieloryb
		System.out.println(w);
		System.out.println(rw);
		System.out.print("________________________________________________________________________________________\n");
	}

}
