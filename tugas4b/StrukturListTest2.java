package tugas4b;

public class StrukturListTest2 {
	
	public static void main(String[] args) {
        StrukturList myList = new StrukturList();

        // Tambah elemen 3.4 di akhir list
        myList.addFirst(2.1);

        // Tambah elemen 2.1 di awal list
        myList.addFirst(3.4);

        // Tambah elemen 1.1 di tengah list (index 2)
        myList.addMid(1.1, 3);

        // Tambah elemen 4.5 di akhir list
        myList.addLast(4.5);

        // Tambah elemen 5.5 di akhir list
        myList.addLast(5.5);

        // Tampilkan elemen list
        displayList(myList);
    }

    // Metode untuk menampilkan elemen-elemen dari list
    private static void displayList(StrukturList list) {
        Node current = list.getHead();

        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
         }

        System.out.println();
    }

}
