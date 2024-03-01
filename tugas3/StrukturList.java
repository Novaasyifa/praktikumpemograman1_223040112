package tugas3;

public class StrukturList {
	
	 private Node HEAD;

	    // Konstruktor
	    public StrukturList() {
	        HEAD = null;
	    }

	    // Fungsi untuk menambahkan elemen di akhir/tail list
	    public void addTail(int data) {
	        Node newNode = new Node(data); // Membuat node baru dengan data yang diberikan

	        // Jika list kosong, maka node baru menjadi HEAD
	        if (isEmpty()) {
	            HEAD = newNode;
	        } else {
	            Node curNode = HEAD; // Mengatur curNode menjadi HEAD
	            while (curNode.getNext() != null) { // Melakukan iterasi hingga curNode menunjuk ke node terakhir
	                curNode = curNode.getNext(); // Memperbarui curNode dengan node berikutnya
	            }
	            // Mengatur node berikutnya dari node terakhir menjadi node baru
	            curNode.setNext(newNode);
	        }
	    }

	    // Fungsi untuk mengecek apakah list kosong
	    public boolean isEmpty() {
	        return HEAD == null;
	    }

		
}
