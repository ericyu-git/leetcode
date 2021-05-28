class Solution { 

    public int reverse(int x) {   

    int sign = 1; 

    int ans = 0; 

    if (x == 0) 

        return ans; 

    sign = x > 0 ? 1 : -1; 

    x *= sign; 

    if (x > (Math.pow(2,31)-1) || x < Math.pow(2,-31)){ 

        return ans; 

    } 

    while (x != 0){ 

        ans = (ans * 10) + (x % 10); 

        x /= 10; 

    } 

    ans *= sign; 

    return ans; 

   } 

} 
