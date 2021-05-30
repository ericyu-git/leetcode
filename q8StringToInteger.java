//8. String to Integer (atoi)

public static int myAtoi(String s) {
	       int   ans = 0, i = 0, sign = 1;
	       s = s.trim();
           if(s == null || s.length() == 0) return ans;   
	       if(s.charAt(i) == '-'){
	           sign = -1;
	           i++;
	       }else if(s.charAt(i) == '+'){
               i++;
           }
	       while(i < s.length()){
	           if(s.charAt(i) < '0' || s.charAt(i) > '9'){
	               break;
	           }else if(ans > (Integer.MAX_VALUE - (s.charAt(i) - '0')) / 10){
                   ans = sign == 1? Integer.MAX_VALUE:Integer.MIN_VALUE;
                   return ans;
               }else
	               ans = ans * 10 + (s.charAt(i++) - '0');
	           }
	      return ans * sign;
   }