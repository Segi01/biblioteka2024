package biblioteka;

import java.util.ArrayList;
import java.util.List;

import biblioteka.interfejs.BibliotekaInterfejs;

public class Bliblioteka implements BibliotekaInterfejs {

	private List<Knjiga> knjige=new ArrayList<>();
	
	
	
	@Override
	public void dodajKnjigu(Knjiga k) {
		
		knjige.add(k);
		
		
	}

	@Override
	public void obrisiKnjigu(Knjiga k) {
		
		knjige.remove(k);
		
	}

	@Override
	public List<Knjiga> vratiSveKnjige() {
		
		return knjige;
		
		
	}

	@Override
	public List<Knjiga> pronadjiKnjigu(Autor autor, long isbn, String naslov, String izdavac) {
		
		List<Knjiga> rezultati=new ArrayList<>();
		
		
		for (Knjiga knjiga : knjige) {
			if(knjiga.getNaslov().toUpperCase().contains(naslov.toUpperCase()))
					rezultati.add(knjiga);
		}
		return rezultati;
		
	}

}
