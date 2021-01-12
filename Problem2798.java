import java.util.Scanner;

public class Problem2798 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] arr = new int[N];
 
		for(int i=0; i<N; i++) {
			arr[i] = scan.nextInt();
		}
		
		int result = search(arr, N, M);
		System.out.println(result);
	}
 
	//탐색
	static int search(int[] arr, int N, int M) {
		int result = 0;
		
		// 3장의 카드를 고르기 때문에 첫번째 카드는 N-2 까지만 순회
		for(int i=0; i<N-2; i++) {
			// 두번째 카드는 첫번째 카드 다음부터 N-1 까지만 순회
			for(int j=i+1; j<N-1; j++) {
				// 세번째 카드는 두번째 카드 다음부터 N까지 순회
				for(int k=j+1; k<N; k++) {
					// 3개 카드의 합 변수 temp
					int temp = arr[i] + arr[j] + arr[k];
					// M과 세 카드의 합이 같으면 temp return 및 종료 
					if(M == temp) {	
						return temp;
					}
					// 세카드의 합이 이전 합보다 크면서 M보다 작을 경우 result 갱신 
					if(result < temp && temp < M) {
						result = temp;
					}
				}
			}
		}
		// 모든 순회를 마치면 result 리턴 
		return result;
	}
}