package problem01;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -3, 5, 6, -20 };
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {
		
		//
		// 코드를 완성 하십시오.
		//
//		System.out.println(arr);
//		arr = new int[] {-10, -3, 5, 6, -20};
//		
//		int max = arr[-20];
//		
//		for(int i = 1; i<arr.length ; i++) {
//			if(arr[i] >= max) {
//				max = arr[i];
//			}
//		}
//		System.out.println("max = "+max);
				
		arr[0] = -10;
		arr[1] = -3;
		arr[2] = 5;
		arr[3] = 6;
		arr[4] = -20;
		
		for(int i =0 ; i<=arr.length ; i++) {
			
			for(int j = 0 ; j<=arr.length ; j++) {
				if(arr[i]==4) {
					int max = arr[i]*arr[j];
					System.out.println(max);
				}
				
			}
			
		}
		
	
			
		
		
	}
}
