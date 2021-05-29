//7. Reverse Integer

 public static int reverse(int x) {  
	        Stack<Integer> st = new Stack<Integer>();
	        int ans = 0, sign =1, n = 0;
	        if(x < 0 ){
	            sign = -1;
	            x *= sign;
	        }
	        if( x == 0) return ans;
	        while( x > 0){
	            st.push(x % 10);
	            x /= 10;            
	        }
	        while(!st.empty()){
	            ans += (st.pop() * Math.pow(10, n++));
	        }
            if(ans < Integer.MIN_VALUE || ans >= Integer.MAX_VALUE) return 0;
	        return ans * sign;
	    }