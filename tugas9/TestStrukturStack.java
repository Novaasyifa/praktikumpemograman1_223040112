package tugas9;

public class TestStrukturStack {
	
	  public static void main(String[] args) {
	        // Membuat objek StrukturStack dengan kapasitas 3
	        StrukturStack stack = new StrukturStack(3);
	        
	        // Sebelum push
	        System.out.println("Sebelum push:");
	        printStackInfo(stack);
	        System.out.println("Elemen dari atas: ");
	        printStackElements(stack);
	        
	        // Melakukan push 3x
	        stack.push(2);
	        stack.push(4);
	        stack.push(1);
	        
	        // Setelah push
	        System.out.println("\nSetelah push 3x:");
	        printStackInfo(stack);
	        System.out.println("Elemen dari atas: ");
	        printStackElements(stack);
	    }
	    
	    // Method untuk mencetak informasi stack
	    private static void printStackInfo(StrukturStack stack) {
	        System.out.println("Size: " + (stack.TOP + 1));
	        System.out.println("Empty: " + stack.isEmpty());
	        System.out.println("Full: " + (stack.TOP == stack.capacity - 1));
	        System.out.println("Top: " + stack.TOP);
	    }
	    
	    // Method untuk mencetak elemen dari atas stack
	    private static void printStackElements(StrukturStack stack) {
	        if (stack.isEmpty()) {
	            System.out.println("Stack kosong.");
	        } else {
	            for (int i = stack.TOP; i >= 0; i--) {
	                System.out.print(stack.array[i] + " ");
	            }
	            System.out.println();
	        }
	    }
}
