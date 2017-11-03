class Vozilo {

	int p, v;
	String gorivo;

	Vozilo() {

		p = 10;
		v = 100;
		gorivo = "Nafta";
	}

	Vozilo(int p, int v, String gorivo) {

		this.p = p;
		this.v = v;
		this.gorivo = gorivo;

	}

	int potrosnja_goriva() {
		
		
		return v * p / 10; 
	}

	int brzina_kretanja() {
		return v;
	}

	int potrebno_goriva(int n) {
		int container;
		container = n * p;

		return container;
	}

	void podaci() {
		System.out.println("Porsjecna brzina kojom se krece vozilo je " + v + " Potorsnja goriva je " + p + "Vrsta goriva je " + gorivo);
	}

	
	}
	class Domaci {

		public static void main(String [] Args) {

			Vozilo objekat_vozilo = new Vozilo (10, 100, "Benzin");
			Vozilo objekat1_vozilo1 = new Vozilo (15, 80, "Dizel");

			objekat_vozilo.potrosnja_goriva();
			objekat_vozilo.brzina_kretanja();
			objekat_vozilo.potrebno_goriva(10);
			objekat_vozilo.podaci();

			objekat1_vozilo1.potrosnja_goriva();
			objekat1_vozilo1.brzina_kretanja();
			objekat1_vozilo1.potrebno_goriva(10);
			objekat1_vozilo1.podaci();

		}
}