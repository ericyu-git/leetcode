//69. sqrt(x)

 public int mySqrt(int x) {
		    int ans = 0, lo = 0, hi = x % 2 == 0 ? x / 2 : x / 2 + 1;
       if ( x == 0) return ans;
		    while (lo <= hi) {
		        if (Math.pow(lo, 2) >= x) {
	        	ans = Math.pow(lo, 2) == x ? lo : lo - 1;
		        	break;
		        }else if (Math.pow(hi, 2) <= x) {
                    ans = hi;
                    break;
                }else {
                    lo++;
                    hi--;
                    continue;
		        }
		    }
        return ans;
   }