package tugas10;

public class ParsePost {
	
	private MyStack stack;
	private String input;
	
	public ParsePost(String input) {
		super();
		this.input = input;
	}
	
	public int doParse() {
		stack = new MyStack(20);
		char ch;
		int i;
		int bill, bil2, hasilOps;
		
		for (i = 0; i < input.length(); i++) {
			ch = input.charAt(i);
			stack.displayStack(""+ ch+ " ");
			
			if (ch >= '0' && ch <= '9') {
				stack.push((int)(ch-'0'));
			}
			else {
				bil2 = stack.pop();
				bill = stack.pop();
				switch(ch) {
				case '+': hasilOps = bill + bil2; break;
				case '-': hasilOps = bill - bil2; break;
				case '*': hasilOps = bill * bil2; break;
				case '/': hasilOps = bill / bil2; break;
				default: hasilOps = 0;
				}
				stack.push(hasilOps);
			}
		}
		hasilOps = stack.pop();
		return hasilOps;
	}
}
