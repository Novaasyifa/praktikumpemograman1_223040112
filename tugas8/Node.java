package tugas8;

public class Node {
	
	private int data;
    private Node next;

    // Konstruktor
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    // Getter untuk data
    public int getData() {
        return data;
    }

    // Setter untuk data
    public void setData(int data) {
        this.data = data;
    }

    // Getter untuk next
    public Node getNext() {
        return next;
    }

    // Setter untuk next
    public void setNext(Node next) {
        this.next = next;
    }
}
