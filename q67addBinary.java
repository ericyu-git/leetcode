//67. Add Binary

package com.teddycoupon.practise;

public class addBinary {

	public static void main(String[] args) {
		String a = "1";
		String b = "11";
		String c = addBinary(a,b);
		System.out.println(c);
	}
	public static String addBinary(String a, String b) {
        int ans = 0, sum = 0, carry = 0;
        StringBuilder res = new StringBuilder();
        int lenA = a.length() - 1, lenB = b.length() - 1;
        while (lenA >= 0 || lenB >= 0) {             
            int n = lenA < 0 ? 0 : Character.getNumericValue(a.charAt(lenA));  
            int m = lenB < 0 ? 0 : Character.getNumericValue(b.charAt(lenB));    
            sum = n + m + carry;
            ans = sum % 2;
            carry = sum / 2;
            res.append(ans);
            lenA--;
            lenB--;
        }
        if ( carry > 0) {
            res.append("1");
        }
        return res.reverse().toString();
    }
}
