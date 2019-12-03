
public class Solution {

	public int solution(int n) {
		int answer = 0;
		
		int[] cal = new int[n + 1];
		
		cal[1] = 1;
		cal[2] = 2;
		
		for(int inx=3;inx<=n;inx++) {
			cal[inx] = (cal[inx-1] + cal[inx-2])%1000000007;
		}
		
		answer = cal[n];
		
		return answer;
	}
}
