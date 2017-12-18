package answer;
/*
 * ����һ���� n ������������ S���� S ���ҵ��������� a, b, c��ʹ�� a + b + c = 0��дһ�������ҵ���������Ҫ�����Ԫ�顣

	ע�����
	
	����Ԫ��(a, b, c)��Ҫ��a <= b <= c��������ܰ����ظ�����Ԫ�顣
	
	��ʽ��
	
	����������һ���� n ������������ S����������������Ҫ�����Ԫ�顣
	
	S = [ -1��0��1��2��-1��-4 ]
	
	( -1, 0, 1 )
	
	( -1, -1, 2 )
 */
public class problem2 {
	private static int[] a = {-1,0,1,2,-1,-4};;
	public static void main(String[] args) {
		quickSort(0,a.length-1);
		getSubArray(0);
	}

	private static void getSubArray(int start) {
		int temp = 0;
		if(start == a.length) {
			return;
		}else if(a[start]>0 || a[a.length-1] < 0){
			return;
		}else {
			for(int i=start+1;i<a.length;i++) {
				temp = 0-a[start]-a[i];
				if(temp<a[i]) {
					return;
				}else if(searchArray(i, temp)){
					System.out.println("("+a[start]+","+a[i]+","+temp+")");
				}
			}
		}
		getSubArray(start+1);
	}
	
	private static boolean searchArray(int start, int number) {
		if(start >= a.length-1) {
			return false;
		}
		for(int i=start;i<a.length;i++) {
			if(number == a[i]) {
				return true;
			}
		}
		return false;
	}
	
	private static void quickSort(int start, int end) {
		if(start >= end) {
			return;
		}
		int temp = a[end];
		int temp2;
		int i = start-1;
		for(int j = start;j<end;j++) {
			if(a[j]<temp) {
				i++;
				temp2 = a[j];
				a[j] = a[i];
				a[i] = temp2;
			}
		}
		temp2 = a[end];
		a[end] = a[i+1];
		a[i+1] = temp2;
		quickSort(start, i);
		quickSort(i+2, end);
		
	}
		
	
}
