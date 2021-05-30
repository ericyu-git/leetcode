//13 Roman to Int

public int romanToInt(String s) { 
        int res = 0;
        HashMap<Character, Integer> ro = new HashMap<Character, Integer>('M', 1000,'D', 500,'C', 100,'L', 50,'X', 10,'V', 5,'I', 1); 
        // Map<Character , Integer> ro = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);
        ro.put('M', 1000);
        ro.put('D', 500);
        ro.put('C', 100);
        ro.put('L', 50);
        ro.put('X', 10);
        ro.put('V', 5);
        ro.put('I', 1);
        for(int i = 0; i < s.length(); i++){
            if(i == s.length() -1){
                res += ro.get(s.charAt(i));
                return res;
            }
            char cur = s.charAt(i);
            char nx = s.charAt(i+1);
            if(ro.get(cur) >= ro.get(nx)){
                res += ro.get(cur);
            }else{
                res += ro.get(nx) - ro.get(cur);
                i++;
            }
        }
        return res;
    }