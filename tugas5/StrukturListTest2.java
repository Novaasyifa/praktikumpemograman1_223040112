package tugas5;

import java.util.ArrayList;

public class StrukturListTest2 {
	
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

        // 4. Hapus elemen di akhir list
        myList.remove(myList.size() - 1);

        // 5. Tampilkan elemen list
        System.out.println("Elemen list setelah penghapusan di akhir:");
        for (int num : myList) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 6. Hapus elemen di awal list
        myList.remove(0);

        // 7. Tampilkan elemen list
        System.out.println("Elemen list setelah penghapusan di awal:");
        for (int num : myList) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 8. Hapus elemen di akhir list lagi
        myList.remove(myList.size() - 1);

        // 9. Tampilkan elemen list setelah penghapusan di akhir
        System.out.println("Elemen list setelah penghapusan di akhir:");
        for (int num : myList) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
