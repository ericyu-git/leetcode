 public static int lengthOfLongestSubstring(String s) {
    int len = 0, lo = 0, hi =0;
    Set<Character> subs = new HashSet<>();
    while(hi < s.length()){
        if(!subs.contains(s.charAt(hi))){
            subs.add(s.charAt(hi));
            len = len > subs.size()? len:subs.size();
            hi++;
        }else{
            subs.remove(s.charAt(lo++));
            
        }
    }
    return len;
    }
