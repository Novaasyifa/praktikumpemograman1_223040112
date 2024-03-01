package tugas4b;

public class StrukturList {
	
	private Node head;

    public StrukturList() {
        this.head = null;
    }

    // Menambahkan elemen di awal list
    public void addFirst(double data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }

    // Menambahkan elemen di tengah list
    public void addMid(double data, int position) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node curNode = head;
            Node posNode = null;
            int i = 1;

            if (position == 1) {
                newNode.setNext(head);
                head = newNode;
            } else {
                while (curNode != null && i < position) {
                    posNode = curNode;
                    curNode = curNode.getNext();
                    i++;
                }

                posNode.setNext(newNode);
                newNode.setNext(curNode);
            }
        }
    }

    // Menambahkan elemen di akhir list
    public void addLast(double data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node curNode = head;

            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }

            curNode.setNext(newNode);
        }
    }

    // Metode getter untuk mengembalikan kepala dari list
    public Node getHead() {
        return head;
    }

}
