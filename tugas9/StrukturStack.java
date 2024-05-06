package tugas9;

public class StrukturStack {
	
	protected int[] array;
	protected int capacity;
	protected int TOP;
	
	public final int MIN = -1;
	
	public StrukturStack(int capacity) {
		super();
		array = new int[capacity];
		this.capacity = capacity;
		TOP = -1;
	}
	
	public boolean isEmpty() {
		return (TOP == MIN);
	}
	
	public boolean isFull() {
		return (TOP == capacity - 1);
	}
	
	public void push(int data) {
		if (isFull()) {
			System.out.println("Stack penuh");
		}
		else {
			TOP++;
			array[TOP] = data;
		}
	}
	
	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack kosong");
			return -1; // Mengembalikan nilai default jika stack kosong
		} else {
			int data = array[TOP];
			TOP--;
			return data;
		}
	}
	
	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack kosong");
			return -1; // Mengembalikan nilai default jika stack kosong
		} else {
			return array[TOP];
		}
	}
	
	public int size() {
		return TOP + 1;
	}
	
	public int top() {
		return TOP;
	}

}
