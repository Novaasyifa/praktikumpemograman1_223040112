package tugas5;

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
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public void removeHead() {
    	if (isEmpty()) {
    		System.out.println("List kosong");
    	}
    	else {
    		Node temp = head;
    		head = head.getNext();
    		dispose(temp);
    	}
    }

	private void dispose(Node temp) {
		// TODO Auto-generated method stub
		temp.setNext(null);
        temp = null;
	}
	
	 // Fungsi removeTail
    public void removeTail() {
        if (head != null) {
            // Jika satu elemen list
            if (head.next == null) {
                head = null;
            } else {
                Node preNode = null;
                Node lastNode = head;

                // Menemukan elemen terakhir dan node sebelumnya
                while (lastNode.next != null) {
                    preNode = lastNode;
                    lastNode = lastNode.next;
                }

                // Menghapus elemen terakhir
                preNode.next = null;
            }
        }
    }
    
    public void removeMid(int e) {
    	Node preNode = new Node(0);
    	Node tempNode;
    	int i;
    	boolean ketemu;
    	
    	if (isEmpty()) {
    		System.out.println("Elemen list kosong");
    	} else {
    		ketemu = false;
    		i = 1;
    		tempNode = head;
    		while (tempNode.getNext() != null && !ketemu) {
    			if (tempNode.getData() == e) {
    				ketemu = true;
    			} else {
    				preNode = tempNode;
    				tempNode = tempNode.getNext();
    				i++;
    			}
    		}
    		if (ketemu == true) {
    			if (i == 1)
    				head = null;
    			else {
    				preNode.setNext(tempNode.getNext());
    				dispose(tempNode);
    			}
    		}
    	}
    }


}
