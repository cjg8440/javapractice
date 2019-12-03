package codemonster_ex1;

public class ex1Solution {
	
	public long solution(String block, int pos) {
        long answer = 0;
        int blocksize = block.length();
		
		pos -= 1;
		
		int count=0;
		int left= pos;
		int right = pos;
		boolean init = true;
		
		boolean dir = (block.charAt(pos)=='>'?true:false);
		
		while(true) {
			
			if((pos == -1)&&!dir) {
				break;
			}else if((pos == blocksize)&&dir) {
				break;
			}
			
			if(dir&&(right>=pos)&&!init) {
				answer += right - pos + 1;
				pos = right+1;
				continue;
			}else if(!dir&&(left<=pos)&&!init) {
				answer += pos-left + 1;
				pos = left-1;
				continue;
			}
			else {
				if(dir = (block.charAt(pos)=='>'?true:false)) {
					init = false;
					answer += count +1;
					count=0;
					left = (left>pos?pos:left);
					pos++;
				}else {
					dir = false;
					init = false;
					answer += count +1;
					count=0;
					right = (right<pos?pos:right);
					pos--;
				}
			}
			
		}
		
		answer += count;
		
        return answer;
    }

}
