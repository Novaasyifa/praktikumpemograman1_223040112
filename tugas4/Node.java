package tugas4;

public class Node {
	
	private int data;
	private Node next;
	
	//inisiasi atribut node
	
	public Node (int data) {
		this.data = data;
		this.next = null;
	}
	// Setter untuk atribut data
    public void setData(int data) {
        this.data = data;
    }
    
    // Getter untuk atribut data
    public int getData() {
        return data;
    }
    
    // Setter untuk atribut next
    public void setNext(Node next) {
        this.next = next;
    }
    
    // Getter untuk atribut next
    public Node getNext() {
        return next;
    }
	

}
