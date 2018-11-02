package Problem2;

public class Main {

	public static void main(String[] args) {
		Data test = new Data();
		test.add(1);
		test.add(9);
		test.add(4);
		test.add(5);
		test.add(10);
		test.add(0);
		test.print();
		System.out.println();
		System.out.println("Get Value: " + test.getValue(3));
		System.out.println();
		test.remove();
		test.print();
	
	}

}
