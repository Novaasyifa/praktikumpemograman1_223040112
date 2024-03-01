package tugas2;

public class ContohFungsi {
	
	//fungsi untuk menambahkan dua bilangan
	public static int tambah(int a, int b) {
		return a + b;
	}
	
	//fungsi untuk mengalikan dua bilangan
	public static int kali(int a, int b) {
		return a * b;
	}
	
	public static void main(String [] args) {
		//mengambil fungsi tamabah dan menyimpan hasilnya dalam variabel hasilPenjumlahan
		int hasilPenjumlahan = tambah(5, 3);
		System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);
		
		//mengambil  fungsi kali dan menyimpan hasilnya dalam variabel hasilPerkalian
		int hasilPerkalian = kali(4, 6);
		System.out.println("Hasil perkalian: " + hasilPerkalian);
	}

}


//hasil eksekusi
//Hasil penjumlahan: 8
//Hasil perkalian: 24