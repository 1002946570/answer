package answer;
/*
	 给出两个单词word1和word2，写一个函数计算出将word1 转换为word2的最少操作次数。
	
	你总共三种操作方法：
	
	1、插入一个字符
	
	2、删除一个字符
	
	3、替换一个字符
	
	格式：
	
	输入行输入两个字符串 word1 和 word2，最后输出将 word1 转换为 word2的最少操作次数。
	
	word1 = "mart"
	
	word2 = "karma"
	
	3
*/

public class Problem1 {

	public static void main(String[] args) {
		String word1 = "mart";
		String word2 = "karma";
		int answer = word1.length()-getMinTimes(word1,word2,0,0)+Math.abs(word1.length()-word2.length());
		System.out.println(answer);
	}
	
	private static int getMinTimes(String word1, String word2, int word1Start, int word2Start) {
		int tempMax = 0, temp = 0;
		if(word1Start == word1.length() || word2Start == word2.length()) {
			return 0;
		}
		for(int i=word1Start;i<word1.length();i++) {
			for(int j=word2Start;j<word2.length();j++) {
				if(word1.charAt(i) == word2.charAt(j)) {
					temp = 1 + getMinTimes(word1,word2,i+1,j+1);
					if(temp > tempMax) {
						tempMax = temp;
					}
				}
			}
		}
		return tempMax;
	}
	
}
