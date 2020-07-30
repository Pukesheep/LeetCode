package Test0;

import java.util.*;

public class Test0 {

	/*鴻揚科技面試專用，請勿外洩予他人
	 *題目0:
	 * 將一個字串作以下處理
	 * 1. 將",""."全部移除
	 * 2. 切割為WORD後,將句子倒置
	 * 3. 列印出不重複字元及其出現次數
	 * */	
	
	public static void execute(String stInp) {
		if (stInp==null)
			return;
		String[] word = stInp.replace(",", " ").replace(".", " ").split(" ");
		ArrayList<String> arrWord = new ArrayList<String>();
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (String st:word) {
			if (st!=null && st.length()>0) {
				arrWord.add(0, st);
			}
		}
		for (int i = 0; i < arrWord.size(); i++) {
			String st = arrWord.get(i);
			if (arrWord.indexOf(st) != i) {
				int j = hm.get(st);
				hm.put(st, ++j);
			} else {
				hm.put(st, 1);
			}
		}
		System.out.println("Reversed String=");
		for (String st:arrWord) {
			System.out.print(st+" ");
		}		
		System.out.println();
		System.out.println();
		System.out.println("All Words=");
		for (Object key:hm.keySet()) {
			System.out.print(key+" : " + hm.get(key) + " times");
			System.out.println();
		}		
	}
	
	
	public static void main(String[] args) {
		Test0.execute("I, Jimmy, saw a saw saw a saw");
	}
	
}
