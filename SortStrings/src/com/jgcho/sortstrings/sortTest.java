package com.jgcho.sortstrings;

import java.util.ArrayList;

public class sortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strings = { "abce", "abcd", "cdx" };
		String[] answer;
		int n = 2;
		int i = 0;

		ArrayList<String> answerArr = new ArrayList<String>();


		while (i < strings.length) {

			if (answerArr.size() == 0) {
				answerArr.add(strings[i]);
			} else {
				/*for (int inx = 0; inx < i; inx++) {
					if ((int)answerArr.get(inx).charAt(n) > (int)strings[i].charAt(n)) {
						answerArr.add(inx, strings[i]);
						break;
					} else if (answerArr.get(inx).charAt(n) == strings[i].charAt(n)) {
						if (answerArr.get(inx).compareTo(strings[i]) > 0) {
							answerArr.add(inx, strings[i]);
							break;
						} else {
							answerArr.add(inx+1,strings[i]);
							break;
						}
					} else {
						answerArr.add(strings[i]);
						break;
					}
				}*/
				
			}
			
			i++;
		}
		
		/*answer = new String[answerArr.size()];
		

		for (int inx = 0; inx < answerArr.size(); inx++) {
			answer[inx] = answerArr.get(inx);
		}*/
		
		for(String s : answerArr) {
			System.out.println(s);
		}

	}

}
