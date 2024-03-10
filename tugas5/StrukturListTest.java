package tugas5;

import java.util.ArrayList;

public class StrukturListTest {
	
	 public static void main(String[] args) {
	        // 1. Create list dengan keyword new
	        ArrayList<Integer> myList = new ArrayList<>();

	        // 2. Tambah elemen 2 di awal list
	        myList.add(0, 2);

	        // 3. Tambah elemen 9 di awal list
	        myList.add(0, 9);

	        // 4. Tambah elemen 7 di awal list
	        myList.add(0, 7);

	        // 5. Tampilkan elemen list
	        System.out.println("Elemen list:");
	        for (int num : myList) {
	            System.out.print(num + " ");
	        }
	        System.out.println();

	        // 6. Hapus elemen list di awal list
	        myList.remove(0);

	        // 7. Tampilkan elemen list
	        System.out.println("Elemen list setelah penghapusan:");
	        for (int num : myList) {
	            System.out.print(num + " ");
	        }
	        System.out.println();

	        // Lakukan hapus elemen list di awal list sebanyak 3x
	        for (int i = 0; i < 3; i++) {
	            if (!myList.isEmpty()) {
	                myList.remove(0);
	            } else {
	                break; // Keluar dari loop jika daftar sudah kosong
	            }
	        }

	        // Tampilkan elemen list setelah penghapusan sebanyak 3x
	        System.out.println("Elemen list setelah penghapusan 3x:");
	        for (int num : myList) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }

}
