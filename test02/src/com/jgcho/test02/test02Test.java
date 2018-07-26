package com.jgcho.test02;

//같은숫자는 싫어

public class test02Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,1,3,3,0,1,1};
		int[] answer = {};
        int[] temp = new int[arr.length];
        int count = 0;
        
        for(int inx=0;inx<arr.length;inx++){
            
            if(inx == 0){
                temp[0] = arr[0];
                count++;
            }else{
                if(arr[inx] == arr[inx-1])
                    continue;
                else{
                    temp[count] = arr[inx];
                    count++;
                }
            }
            
        }
        
        answer = new int[count];
        
        for(int inx=0;inx<count;inx++) {
        	answer[inx] = temp[inx];
        }
        
        
        for(int inx=0;inx<answer.length;inx++) {
        	System.out.print(answer[inx] + " ");
        }

	}

}
