//27. Remove Element


public int removeElement(int[] A, int elem) {
        int n = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] != elem){
                A[n++] = A[i];    
            }else{
                continue;
            }
        }
        return n;
    }