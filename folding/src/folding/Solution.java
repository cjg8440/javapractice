package folding;

public class Solution {

	public int[] solution(int n) {
		int[] answer = {};

		int temp[][] = new int[n + 1][];

		temp[1] = new int[] { 0 };
		temp[2] = new int[] { 0, 0, 1 };

		if (n > 2) {

			for (int inx = 3; inx <= n; inx++) {

				int length = temp[inx - 1].length;
				temp[inx] = new int[length*2 + 1];
				int jnx = 0;
				
				int k = 1;

				while (jnx < length*2 + 1) {

					if (jnx < length)
						temp[inx][jnx] = temp[inx - 1][jnx];
					else if (jnx == length)
						temp[inx][jnx] = 0;
					else {
						temp[inx][jnx] = temp[inx - 1][length - k] ^ 1;
						k++;
					}
					jnx++;
				}
			}
		}

		answer = temp[n];

		return answer;
	}

}
