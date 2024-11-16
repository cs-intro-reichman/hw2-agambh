// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int seed=Integer.parseInt(args[0]);
		int num, count;
		String mode= args[1];
		if(mode.equals("v")){
			for(int i=1; i<=seed ; i++){
			    num=i;
				count=1;
			    while( num != 1 || count == 1){
					System.out.print(num+ " ");
					if( num % 2 == 0 )
						num = num / 2;
					else 
						num = num*3 + 1;
					count++;
				}
				System.out.println(num + " (" + count + ")");
			}
		}
		System.out.println("Every one of the first " + seed + "hailstone sequences reached 1.");
	}
		
}
