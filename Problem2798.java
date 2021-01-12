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
 
	//Ž��
	static int search(int[] arr, int N, int M) {
		int result = 0;
		
		// 3���� ī�带 ���� ������ ù��° ī��� N-2 ������ ��ȸ
		for(int i=0; i<N-2; i++) {
			// �ι�° ī��� ù��° ī�� �������� N-1 ������ ��ȸ
			for(int j=i+1; j<N-1; j++) {
				// ����° ī��� �ι�° ī�� �������� N���� ��ȸ
				for(int k=j+1; k<N; k++) {
					// 3�� ī���� �� ���� temp
					int temp = arr[i] + arr[j] + arr[k];
					// M�� �� ī���� ���� ������ temp return �� ���� 
					if(M == temp) {	
						return temp;
					}
					// ��ī���� ���� ���� �պ��� ũ�鼭 M���� ���� ��� result ���� 
					if(result < temp && temp < M) {
						result = temp;
					}
				}
			}
		}
		// ��� ��ȸ�� ��ġ�� result ���� 
		return result;
	}
}