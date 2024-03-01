package tugas4;

public class StrukturList {
	
	private Node head;

    // Konstruktor untuk kelas StrukturList
    public StrukturList() {
        this.head = null;
    }

    // Fungsi untuk menambahkan elemen di tengah list
    public void addMid(int data, int position) {
        Node newNode = new Node(data);

        // Jika list masih kosong
        if (head == null) {
            head = newNode;
        } else {
            Node curNode = head;
            Node posNode = null;
            int i = 1;

            // Jika posisi adalah 1, tambahkan di awal
            if (position == 1) {
                newNode.setNext(head);
                head = newNode;
            } else {
                // Selain itu, temukan posisi untuk menyisipkan elemen
                while (curNode != null && i < position) {
                    posNode = curNode;
                    curNode = curNode.getNext();
                    i++;
                }

                // Sisipkan elemen di posisi yang ditemukan
                posNode.setNext(newNode);
                newNode.setNext(curNode);
            }
        }
    }
 // Metode getter untuk mengembalikan kepala dari list
    public Node getHead() {
        return head;
    }

}
