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
		HashMap hm = new HashMap();
		for (String st:word) {
			if (st!=null && st.length()>0) {
				arrWord.add(0, st);
				if (!hm.containsKey(st)) {
					hm.put(st, st);					
				}
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
			System.out.print(key+" ");
		}		
	}
	
	public static void qqqq(String input) {
		
		if (input == null) {
			return;
		}
		
		String strArr = input.replace(",", " ").replace(".", " ");
		String[] strArr1 = strArr.split(" ");
		
		for (int i = strArr1.length - 1; i >= 0; i--) {
			System.out.print(strArr1[i] + " ");
		}
		
//		StringBuffer sb = new StringBuffer();
//		for (int i = 0; i < strArr.length; i++) {
//			sb.insert(0, strArr[i]);
//		}
//		
//		for (int i = 0; i < sb.length(); i++) {
//			System.out.print(sb.charAt(i));
//		}
		
	}
	
	public static void main(String[] args) {
		Test0.execute("I, Jimmy, saw a saw saw a saw");
//		Test0.qqqq("I, Jimmy, saw a saw saw a saw");
	}
	
}
