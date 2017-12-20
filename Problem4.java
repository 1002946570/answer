package answer;
/*
 * 	写一个函数计算数字 k 在 0 到 n 中的出现的次数，k 可能是 0 ~ 9 的一个值。

	格式：
	
	输入依次输入一个数字 n，和一个数字 k，最后计算出数字 k 在 0 到 n 中出现的次数。
	
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
