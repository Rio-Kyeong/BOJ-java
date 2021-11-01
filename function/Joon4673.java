package function;

public class Joon4673 {
	
	public static void main(String[] args) {
		boolean[] flag = new boolean[10001];
		
		for(int i = 1; i <= 10000; i++) {
			int num = d(i);
			
			if(num <= 10000) {
				flag[num]= true;
			}
			
		}
		
		for(int i = 1; i <= 10000; i++) {
			if(!flag[i]) {
				System.out.println(i);
			}
		}
}

	public static int d(int number) {
		
		int sum = number; //1234 = 1+2+3+4+1234 = 1244
		
		while(number != 0) {
			sum = sum + (number%10);
			number = number/10;
		}
		
		return sum;
	}
		


}
