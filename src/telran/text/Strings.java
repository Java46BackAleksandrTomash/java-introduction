package telran.text;

public class Strings {
/**
 * 
 * @param str1 ascii string with no repeated symbols
 * @param str2 ascii string with no repeated symbols
 * @return array with two numbers
 *    first - number of the symbols of the str2 that exist in str1 at the same indexes
 *    second - number of the symbols of the str2 that exist in str1 at different indexes
 */

	public static int[] deepNoRepeatedCompare(String str1, String str2) {
	//TODO
		//Hints for two different implementations
		//   first: additional helper array such that array['a'] 
		//          is an index of the symbol 'a' in str1 or -1
		//          example, str1 - "ctab" then array['a'] = 2;
		// ************************************************
		//   second: implementation based on the method indexOf
		int res[] = new int[2];
		/*******************************************/
		//first implementation O[N]
		helperImpl(str1, str2, res);
		/********************************************/
		//second implementation based on indexOf O[N^2]
		//indexOfImpl(str1, str2, res);
		
	return res;
}
private static void indexOfImpl(String str1, String str2, int[] res) {
	char str2Ar[] = str2.toCharArray();
	for(int i = 0; i < str2Ar.length; i++) {
		int index = str1.indexOf(str2Ar[i]);
		if (index >= 0) {
			res[index == i ? 0 : 1]++;
		}
	}
}
private static void helperImpl(String str1, String str2, int[] res) {
	int helper[] = new int [127];

	fillInitHelper(helper);
	fillHelperString1(str1, helper);
fillResult(helper, res, str2);
}
private static void fillInitHelper(int[] helper) {
	for(int i = 0; i < helper.length; i++) {
		helper[i] = -1;
	}
	
}
private static void fillResult(int[] helper, int[] res, String str2) {
	char str2Ar[] = str2.toCharArray();
	for (int i = 0; i < str2Ar.length; i++) {
		int index = helper[str2Ar[i]];
		if (index >= 0) {
			res[index == i ? 0 : 1]++;
		}
	}
}
private static void fillHelperString1(String str1, int[] helper) {
	char str1Ar[] = str1.toCharArray();
	for (int i = 0; i < str1Ar.length; i++) {
		helper[str1Ar[i]] = i;
	}
}
	/**
	 * 
	 * @param str1 English letters (may have repeats)
	 * @param str2 English letters (may have repeats)
	 * @return true if :
	 *     (1) str2 has the same as str1 length
	 *     (2) str2 comprises of all letters from str1
	 */
	public static boolean isAnagram(String str1, String str2) {
		
		// additional helper array such that array['a'] is the number of 'a' occurrences in str1
		//str1 = "hello", array['l'] = 2; array['w'] = 0;
		if (str1.length() != str2.length()) {
			return false;
		}
		int [] helper = new int[127];
		fillHelperOccurrences(str1, helper);
		return isAnagram(str2, helper);
		
	}
	private static boolean isAnagram(String str, int[] helper) {
		char[] strAr = str.toCharArray();
		for(int i = 0; i < strAr.length; i++) {
			int count = helper[strAr[i]]--;
			if (count == 0) {
				return false;
			}
		}
		return true;
	}
	private static void fillHelperOccurrences(String str, int[] helper) {
		char[] strAr = str.toCharArray();
		for(int i = 0; i < strAr.length; i++) {
			helper[strAr[i]]++;
		}
		
	}
	
	/***************************************** sharovarov***************************
	 
	 
//	public static int[] deepNoRepeatedCompare(String str1, String str2) {		
//		int[] resArr = {0, 0};
//		if (str1.length() <= 0 || str2.length() <= 0) {
//			return resArr;
//		}	
//	/** The first implementation **/	
//		int[] ar = new int[127];			
//		for(int i = 0; i < ar.length; i++) {
//			ar[i] = -1;
//		}
//		for(int i =0; i < str1.length(); i++) {
//			ar[str1.charAt(i)] = i;
//		}
//		for(int index = 0; index < str2.length(); index++) {
//			int indexCompar = ar[str2.charAt(index)];
//			if(indexCompar >= 0) {
//				if(indexCompar == index) {
//					resArr[0] += 1;
//				} else {
//					resArr[1] += 1;
//				}
//			}
//		}
//	/** The second implementation **/
////		for(int index = 0; index < str1.length(); index++) {	
////			int indexCompar = str2.indexOf(str1.charAt(index));
////			if(indexCompar >= 0) {
////				if(indexCompar == index) {
////					resArr[0] += 1;
////				} else {
////					resArr[1] += 1;
////				}
////			}
////		}	
//	/*******************************/	
//		return resArr;		
//	}
//	
//	public static boolean isAnagram(String str1, String str2) {
//		if (str1.length() != str2.length() || str1.length() <= 0) {
//			return false;
//		}
//	/** The first implementation (case insensitive)**/	
//		str1 = str1.toLowerCase();
//		str2 = str2.toLowerCase();
//		int[] ar = new int[26];
//		int[] arCompar = new int[26];
//		for(int i = 0; i < str1.length(); i++) {
//			ar[str1.charAt(i) - 97] += 1;
//			arCompar[str2.charAt(i) - 97] += 1;
//		}
//	/** The second implementation (case sensitive)**/	
////		int[] ar = new int[52];
////		int[] arCompar = new int[52];
////		for(int i = 0; i < str1.length(); i++) {
////			char symbStr1 = str1.charAt(i);
////			char symbStr2 = str2.charAt(i);
////			if(symbStr1 < 91) {
////				ar[symbStr1 - 65] += 1;
////			} else {
////				ar[symbStr1 - 71] += 1;	
////			}
////			if(symbStr2 < 91) {
////				arCompar[symbStr2 - 65] += 1;
////			} else {
////				arCompar[symbStr2 - 71] += 1;	
////			}
////		}
//	/** The third implementation (case sensitive)**/
////		int[] ar = new int[63];
////		int[] arCompar = new int[63];
////		for(int i = 0; i < str1.length(); i++) {
////				ar[str1.charAt(i) - 62] += 1;
////				arCompar[str2.charAt(i) - 62] += 1;	
////		}
//		return Arrays.equals(ar, arCompar) ? true : false;	
//		
//	}
	
}