package tugas3;

public class List {
	private Node HEAD;

    // Konstruktor
    public List() {
        HEAD = null;
    }

    // Metode untuk menambahkan elemen baru di awal list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.setNext(HEAD);
        HEAD = newNode;
    }

    // Metode untuk menampilkan elemen-elemen dalam list
    public void displayElement() {
        Node curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
    }

    // Kelas Node untuk merepresentasikan elemen dalam list
    private class Node {
        private int data;
        private Node next;

        // Konstruktor Node
        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        // Getter dan setter untuk data
        public int getData() {
            return data;
        }

        // Getter dan setter untuk next
        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    // Fungsi main untuk mengeksekusi program
    public static void main(String[] args) {
        List myList = new List();
        // Menambahkan beberapa elemen ke dalam list
        myList.addFirst(1);
        myList.addFirst(10);
        myList.addFirst(16);
        myList.addFirst(28);

        // Menampilkan elemen-elemen dalam list
        System.out.println("Elemen dalam list:");
        myList.displayElement();
    }

}
