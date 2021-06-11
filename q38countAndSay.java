//38. Count and Say

public static String countAndSay(int n) {
        String init = "1";
        for(int i = 1; i < n; i++){
        	init = count(init);           
        }
        return init;
    }
	private static String count(String s){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        char c = s.charAt(0);
        for(int j = 0; j < s.length(); j++){
            if(c == s.charAt(j)) count++;
            else{
                sb.append(count);
                sb.append(c);
                count = 1;
                c = s.charAt(j);
            }
        }
        sb.append(count);
        sb.append(c);
        return sb.toString();
	}