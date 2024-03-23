package tugas7;

public class Node {
	
	private MataKuliah data;
	private Node next;

	public Node(MataKuliah data) {
		this.data=data;
	}

//	public void Node(MataKuliah data) {
//	this.data = data;
//}
	
	//setter getter
	public void setsks(MataKuliah data) {
		this.data = data;
	}
	 public void setnext(Node next) {
		 this.next = next;
	 }
	 
	 public Node getNext() {
		 return next;
	 }
	 
	 public MataKuliah getData() {
		 return data;
	 }


}
