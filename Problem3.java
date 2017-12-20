package answer;
/*
 * 	在一条环路上有 N 个加油站，其中第 i 个加油站有汽油gas[ i ]，并且从第 i 个加油站前往第 i+1 个加油站需要消耗汽油cost[ i ]。

	你有一辆油箱容量无限大的汽车，现在要从某一个加油站出发绕环路一周，一开始油箱为空。
	
	写一个函数求可环绕环路一周时出发的加油站的编号，若不存在环绕一周的方案，则返回-1。
	
	注意事项：
	
	1、数据保证答案唯一。
	
	2、O(n)时间和O(1)额外空间
	
	格式：
	
	输入行依次输入一个表示每个加油站的汽油的容量的数组 gas 和一个表示加油站之间耗油量的数组 cost ，最后输出可环绕一周的加油站的编号，如果不存在则返回 -1。
	
	gas = [ 1，1，3，1 ]
	
	cost = [ 2，2，1，1 ]
	
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
