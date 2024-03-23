package tugas7;

public class MataKuliah {
	
	Node HEAD; 
	private String kode;
	private String nama;
	private int sks;

	public MataKuliah() {
		this.HEAD = null;
	}
	
	public boolean isEmpty() {
		return HEAD == null;
	}
	
	
	public MataKuliah(String kode, String nama, int sks) {
		super();
		this.setKode(kode);
		this.setNama(nama);
		this.setsks(sks);
	}

//** setter dan getter **//
public String getKode() {
 return kode;
}
public void setKode(String kode) {
 this.kode = kode;
}
public String getNama() {
 return nama;
}
public void setNama(String nama) {
 this.nama = nama;
}
public int getsks() {
 return sks;
}
public void setsks(int sks) {
 this.sks = sks;
}

public void displayElement() {
	if(isEmpty()) {
		System.out.println("List Kosong");
	}else {
		Node curNode = HEAD;
		while (curNode != null) {
			System.out.println("Matakuliah: "+curNode.getData().getKode()+" "+curNode.getData().getNama()+" "+curNode.getData().getsks());
					curNode = curNode.getNext();
		}
		System.out.println();
	}
}

public void addHead(MataKuliah data) {
	Node newNode = new Node(data);
	if(isEmpty()) {
		HEAD = newNode;
	} else {
		newNode.setnext(HEAD);
		HEAD = newNode;
	}

}

public void addTail(MataKuliah data) {
	Node posNode = null, curNode = null, newNode = new Node(data);
	
	if (isEmpty()) {
		HEAD =newNode;
	}else {
		curNode = HEAD;
		while (curNode != null) {
			posNode = curNode;
			curNode = curNode.getNext();
		}
		posNode.setnext(newNode);;
	}
}

public void addMiddle(MataKuliah data, int position) {
	Node posNode = null, curNode = null, newNode = new Node(data);
	int i;
	if (isEmpty()) {
		HEAD = newNode;
	}else {
		curNode = HEAD;
		if(position == 1) {
			newNode.setnext(HEAD);
			HEAD = newNode;
		}else {
			i = 1;
			while (curNode != null && i < position) {
				posNode = curNode;
				curNode = curNode.getNext();
				i++;
			}
			posNode.setnext(newNode);
			newNode.setnext(curNode);
		}
	}
}


}
