package Problem3;

public class Main {
	public class problemthree{
		
		public void ProblemThree(Data data, int value){
			
			data.search(value);
			
			
			
		}
		
		public void main(String[] args) {
			Data test = new Data();
			test.add(1);
			test.add(5);
			test.add(8);
			test.add(10);
			test.add(12);
			test.add(14);
			test.add(18);
			test.add(20);
			test.add(33);
			test.add(41);
			test.print();
			
		}
		
		
		
	}

}
