package tugas5;

import java.util.ArrayList;

public class StrukturListTest3 {
	
	 public static void main(String[] args) {
	        // 1. Create list dengan keyword new
	        ArrayList<Integer> myList = new ArrayList<>();

	        // 2. Tambah elemen sehingga elemen list berisi (2, 6, 3, 5, 1)
	        myList.add(2);
	        myList.add(6);
	        myList.add(3);
	        myList.add(5);
	        myList.add(1);

	        // 3. Tampilkan elemen list
	        System.out.println("Elemen list:");
	        for (int num : myList) {
	            System.out.print(num + " ");
	        }
	        System.out.println();

	        // 4. Hapus elemen 3 di tengah list
	        int indexToRemove = myList.indexOf(3);
	        if (indexToRemove != -1) {
	            myList.remove(indexToRemove);
	        }

	        // 5. Tampilkan elemen list
	        System.out.println("Elemen list setelah penghapusan di tengah:");
	        for (int num : myList) {
	            System.out.print(num + " ");
	        }
	        System.out.println();

	        // Tes
	        // 6. Tambahkan lagi instruksi di atas untuk menghapus elemen list di tengah
	        myList.remove(Integer.valueOf(6)); // Menghapus elemen 6
	        myList.remove(Integer.valueOf(5)); // Menghapus elemen 5

	        // 7. Tampilkan elemen list
	        System.out.println("Elemen list setelah penghapusan di tengah:");
	        for (int num : myList) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }

}
