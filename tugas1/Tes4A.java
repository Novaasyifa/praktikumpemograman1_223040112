package tugas1;

public class Tes4A {
	
	 public static void main(String[] args) {
	        // Membuat 4 buah node: n1, n2, n3, dan n4
	        Node n1 = new Node(5);
	        Node n2 = new Node(7);
	        Node n3 = new Node(9);
	        Node n4 = new Node(8);

	        // Membuat relasi Node n1, n2, n3, dan n4
	        n1.setNext(n2);
	        n2.setNext(n3);
	        n3.setNext(n4);

	        // Menampilkan nilai dari setiap node menggunakan pointer p
	        Node p = n1;
	        while (p != null) {
	            System.out.printf("%d ", p.getNilai());
	            p = p.getNext();
	        }
	    }
	
}
