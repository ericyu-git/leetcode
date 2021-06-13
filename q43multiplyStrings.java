//43 Multiply Strings

    public String multiply(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int[] p = new int[num1.length() + num2.length()];
        for(int i = num1.length() - 1; i >= 0; i--){
            for(int j = num2.length() - 1; j >= 0; j--){
                int m1 = Character.getNumericValue(num1.charAt(i));
                int m2 = Character.getNumericValue(num2.charAt(j));
                int ans = m1 * m2;
                int sum = ans + p[i + j + 1];
                p[i + j] += sum / 10;
                p[i + j + 1] = sum % 10;
            }
        }
        for(int n : p)
            if(!(sb.length() == 0 && n == 0)) sb.append(n);
        return sb.length() == 0? "0":sb.toString();
    }