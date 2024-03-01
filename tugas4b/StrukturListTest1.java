package tugas4b;

public class StrukturListTest1 {
	
	public static void main(String[] args) {
        StrukturList myList = new StrukturList();

     // Tambah elemen 2.1 di awal list
        myList.addFirst(2.1);

        // Tambah elemen 3.4 di akhir list
        myList.addLast(3.4);

        // Tambah elemen 4.5 di akhir list
        myList.addLast(4.5);

        // Tampilkan elemen list
        displayList(myList);
    }

    // Metode untuk menampilkan elemen-elemen dari list
    private static void displayList(tugas4b.StrukturList list) {
        Node current = list.getHead();

        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }

        System.out.println();
    }

}
