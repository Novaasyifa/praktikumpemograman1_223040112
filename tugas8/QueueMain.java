package tugas8;

public class QueueMain {
	
	public static void main(String[] args) {
        StrukturQueue queue = new StrukturQueue();

        // Sebelum melakukan enqueue
        /*System.out.println("### Sebelum Enqueue 3x ###");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());

        // Melakukan operasi enqueue 3x
        System.out.println("### Enqueue 3x ###");
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(1);

        // Setelah melakukan enqueue
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        System.out.println("Front: " + queue.front());*/
        
        // Sebelum melakukan enqueue
        System.out.println("### Sebelum Enqueue 4x ###");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        queue.displayElements();

        // Melakukan operasi enqueue 4x
        System.out.println("### Enqueue 4x ###");
        queue.enqueue(2);
        queue.enqueue(7);
        queue.enqueue(6);
        queue.enqueue(1);

        // Setelah melakukan enqueue
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        System.out.print("Elemen Queue: ");
        queue.displayElements();
        System.out.println("Front: " + queue.front());
        
        // Melakukan operasi dequeue
        System.out.println("### Dequeue ###");
        int removedElement = queue.dequeue();
        System.out.println("Elemen yang dihapus: " + removedElement);

        // Setelah melakukan dequeue
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        System.out.print("Elemen Queue: ");
        queue.displayElements();
        System.out.println("Front: " + queue.front());
    }
}
