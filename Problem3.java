package answer;
/*
 * 	��һ����·���� N ������վ�����е� i ������վ������gas[ i ]�����Ҵӵ� i ������վǰ���� i+1 ������վ��Ҫ��������cost[ i ]��

	����һ�������������޴������������Ҫ��ĳһ������վ�����ƻ�·һ�ܣ�һ��ʼ����Ϊ�ա�
	
	дһ��������ɻ��ƻ�·һ��ʱ�����ļ���վ�ı�ţ��������ڻ���һ�ܵķ������򷵻�-1��
	
	ע�����
	
	1�����ݱ�֤��Ψһ��
	
	2��O(n)ʱ���O(1)����ռ�
	
	��ʽ��
	
	��������������һ����ʾÿ������վ�����͵����������� gas ��һ����ʾ����վ֮������������� cost ���������ɻ���һ�ܵļ���վ�ı�ţ�����������򷵻� -1��
	
	gas = [ 1��1��3��1 ]
	
	cost = [ 2��2��1��1 ]
	
	2
 */
public class Problem3 {

	public static void main(String[] args) {
		int[] gas = {1,1,3,1};
		int[] cost = {2,2,1,1};
		int max = 0;
		int maxPoint = 0;
		int temp = 0;
		int tempGas = 0;
		int point;
		for(int i=0;i<gas.length;i++) {
			temp = gas[i] - cost[i];
			if(temp>max) {
				maxPoint = i;
			}
		}
		point = maxPoint;
		for(int i=0;i<gas.length;i++) {
			point = point % gas.length;
			tempGas = tempGas + gas[point] - cost[point];
			if(tempGas<0) {
				System.out.println("-1");
				return;
			}
			point++;
		}
		System.out.println(maxPoint);
	}
	
}
