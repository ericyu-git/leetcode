//q1742maximumNumberOfBallsInABox

public class q1742maximumNumberOfBallsInABox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int low = 1, high = 10;
		System.out.println(countBalls(low, high));
	}
	public static int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = 0;
        for (int i = lowLimit; i <= highLimit; i++){
            int box = 0, temp = i;
            while(temp > 0){
                box += temp % 10;
                temp /= 10;
            }
            if (map.get(box) != null) {
            	int vlu = map.get(box);
            	map.put(box, vlu + 1);
            }else {
            	map.put(box, 1);
            }
        }
        for (int j : map.keySet()){
            max = Math.max(max, map.get(j));
        }
        return max;
    }
}
