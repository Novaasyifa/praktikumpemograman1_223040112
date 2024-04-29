package tugas8;

public class StrukturQueue {
	
	private Node FRONT;
    private Node REAR;

    // Konstruktor
    public StrukturQueue() {
        FRONT = null;
        REAR = null;
    }
    // / Operasi untuk menambahkan elemen ke dalam antrian
    public void enqueue(int data) {
        Node newNode = new Node(data);
        
        if (isEmpty()) {
            FRONT = newNode;
            REAR = newNode;
        } else {
            REAR.setNext(newNode);
            REAR = newNode;
        }
    }
    // Metode untuk memeriksa apakah antrian kosong
    public boolean isEmpty() {
        return FRONT == null;
    }
    // Operasi untuk mengembalikan jumlah elemen dalam antrian
    public int size() {
        int size = 0;
        Node curNode = FRONT;
        
        while (curNode != null) {
            size++;
            curNode = curNode.getNext();
        }
        
        return size;
    }

    // Operasi untuk mengembalikan elemen yang ditunjuk oleh penunjuk FRONT
    public int front() {
        return FRONT != null ? FRONT.getData() : -1;
    }
 // Operasi untuk menampilkan elemen-elemen dalam antrian
    public void displayElements() {
        if (isEmpty()) {
            System.out.println("Elemen Queue: Queue kosong");
            return;
        }

        Node curNode = FRONT;
        System.out.print("Elemen Queue: ");
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
        System.out.println();
    }
 // Operasi untuk menghapus elemen dari depan antrian
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Antrian kosong, tidak bisa dequeue");
        }

        int removedData = FRONT.getData();
        if (FRONT == REAR) {
            FRONT = null;
            REAR = null;
        } else {
            FRONT = FRONT.getNext();
        }
        return removedData;
    }

}
