package answer;
/*
 * 	дһ�������������� k �� 0 �� n �еĳ��ֵĴ�����k ������ 0 ~ 9 ��һ��ֵ��

	��ʽ��
	
	������������һ������ n����һ������ k������������� k �� 0 �� n �г��ֵĴ�����
	
	n=12
	
	k=1
	
	5
 */
public class Problem4 {
	private int number; 
	public static void main(String[] args) {
		int n = 132;
		int k = 1;
		int answer = getNumber(n, k);
		System.out.println(answer);
	}
	private static int getNumber(int a, int b) {
		int tempNumber = 0;
		if(a<b) {
			return 0;
		}else {
			int temp = a;
			while(true) {
				if(temp<=9) {
					if(temp == b) {
						tempNumber++;
					}
					break;
				}
				if(temp % 10 == b) {
					tempNumber++;
				}
				temp /= 10;
			}
		}
		return (tempNumber + getNumber(a-1, b));
	}
}
