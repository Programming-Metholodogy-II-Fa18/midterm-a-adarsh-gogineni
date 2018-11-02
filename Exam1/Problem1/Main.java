package Problem1;

public class Main {
	
	public static void ExamSort(int []a,int size){
		
		if(size < 2){
			return;
		}
		
		int mid = size/2;
		int left[] = new int[mid];
		int right[] = new int[size-mid];
		
		for(int i = 0; i < left.length; i++){
			left[i] = a[i];
		}
		
		for(int i = 0; i < right.length; i++){
			right[i] = a[mid+i];
		}
		
		ExamSort(left,left.length);
		ExamSort(right,right.length);
		Merge(a,left,right);
		
		
		
		
	}
	
	
	public static void Merge(int a[], int left[], int right[]){
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < left.length && j < right.length){
			if(left[i]<= right[j]){
				a[k++] = left[i];
				i++;
			}
			else{
				a[k++] = right[j];
				j++;
			}
		}
		
		while(j<right.length){
			a[k++] = right[j];
			j++;
		}
		
		while(i < left.length){
			a[k++] = left[i];
			i++;
		}
		
	}
	
	public static void print(int a[]){
		for(int i = 0; i <a.length; i++){
			System.out.print(a[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int a[] = {15,9,60,44,12,1,4};
		ExamSort(a,a.length);
		print(a);
		
		
	}

	

}
