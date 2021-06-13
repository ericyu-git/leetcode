//45. JumpII

public static int jump(int[] A) {
        if(A.length == 1) return 0;
        int ans = 0, max = 0, po = 0;
        for(int i = 0; i < A.length - 1; i++){
        	int jump = i + A[i];
            max = Math.max(max, jump);
            if(jump >= A.length - 1) return ++ans; 
            if(po == i){
                po = max;
                ans++;
            }
            }
        return ans;
        }