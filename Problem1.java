package answer;
/*
	 ������������word1��word2��дһ�������������word1 ת��Ϊword2�����ٲ���������
	
	���ܹ����ֲ���������
	
	1������һ���ַ�
	
	2��ɾ��һ���ַ�
	
	3���滻һ���ַ�
	
	��ʽ��
	
	���������������ַ��� word1 �� word2���������� word1 ת��Ϊ word2�����ٲ���������
	
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
