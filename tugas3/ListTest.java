package tugas3;

import java.util.ArrayList;

public class ListTest {
	
	 public static void main(String[] args) {
	        // Membuat objek ArrayList untuk menyimpan elemen-elemen
	        ArrayList<Integer> list = new ArrayList<>();

	        // Menambahkan elemen di akhir list menggunakan metode add
	        list.add(3);
	        list.add(4);
	        list.add(5);
	        
	        // Menampilkan setiap elemen yang terdapat di list
	        System.out.println("Isi list setelah penambahan:");
	        for (int i = 0; i < list.size(); i++) {
	            System.out.print(list.get(i) + " ");
	        }
	    }

}
