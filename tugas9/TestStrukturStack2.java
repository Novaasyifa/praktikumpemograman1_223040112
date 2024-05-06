package tugas9;

public class TestStrukturStack2 {
	
	 public static void main(String[] args) {
	        // Membuat objek StrukturStack dengan kapasitas 3
	        StrukturStack stack = new StrukturStack(3);
	        
	        // Sebelum push
	        System.out.println("Sebelum push:");
	        printStackInfo(stack);
	        
	        // Melakukan push 3x
	        stack.push(2);
	        stack.push(4);
	        stack.push(1);
	        
	        // Setelah push
	        System.out.println("\nSetelah push 3x:");
	        printStackInfo(stack);
	        
	        // Melakukan pop 2x
	        System.out.println("\nPop elemen: " + stack.pop());
	        System.out.println("Pop elemen: " + stack.pop());
	        
	        // Setelah pop
	        System.out.println("\nSetelah pop 2x:");
	        printStackInfo(stack);
	    }
	    
	    // Method untuk mencetak informasi stack
	    private static void printStackInfo(StrukturStack stack) {
	        System.out.println("Size: " + stack.size());
	        System.out.println("Empty: " + stack.isEmpty());
	        System.out.println("Full: " + stack.isFull());
	        System.out.println("Top: " + stack.top());
	    }

}
