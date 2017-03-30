package Java;

public class Arrays_01 {

	public static void main(String[] args) {

		
		int[] ar=new int[5];
		
		ar[0]=1;
		ar[1]=12;
		ar[2]=16;
		ar[3]=19;
		ar[4]=25;
		
		int sizeofArray=ar.length;
		System.out.println("The size of the array is "+sizeofArray);
		
		System.out.println("================================");
		
		for(int i=0;i<sizeofArray;i++){
			System.out.println(ar[i]);
			
		}
		
		
	}

}
