// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int times = Integer.parseInt(args[0]);
		double sum = 0;
		int count = 1;
		for(int i = 1 ; i <=times ; i++){
			if( i % 2 == 0){
				sum = sum - (double)1/(count);
			}
			else{
				sum = sum + (double)1/(count);
			}
            count += 2;
		}
		System.out.println("pi according to java: 3.141592653589793");
		System.out.println("pi, approximated: " + (sum*4));
	}
}
