package tugas7;

public class ListMKTest {
	
	public static void main (String [] args) {
		MataKuliah List = new MataKuliah();
		
//		List.addHead(new MataKuliah("IF001", "Dasar Pemograman", 4));
//		List.addHead(new MataKuliah("IF002", "Pemograman Web",3));
//		List.addHead(new MataKuliah("IF003", "Struktur Diskrit", 3));
//		List.addHead(new MataKuliah("IF004", "Konstruksi PL Berorientasi", 3));
//		List.displayElement();
		
		List.addHead(new MataKuliah("IF001", "Dasar Pemograman", 4));
		List.addMiddle(new MataKuliah("IF002", "Pemograman Web",3),2);
		List.addMiddle(new MataKuliah("IF003", "Struktur Diskrit", 3),3);
		List.addTail(new MataKuliah("IF004", "Konstruksi PL Berorientasi", 3));
		List.displayElement();
		

	}
}
