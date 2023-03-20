import java.util.Scanner;
class BitCounterApp {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//int x = in.nextInt();
		/*
		int counter = 0;
		while(x > 0) {
			if(x%2 == 1){
				counter ++; //counter = counter + 1; counter +=1;
			}
			x = x/2; //x/=2
		}*/
		/*
		int counter = 0;	
		for(int x  = in.nextInt(); x > 0; x/= 2) {
			if(x%2 == 1) {
				counter++;
			}
		}
		System.out.println(counter); //error bc scope of counter is only in the for loop :P*/
		double number = in.nextDouble();
		double total = 0;
		int count = 0;
		while(number != -999) {
			total += number;
			count++;
			number = in.nextDouble();
		}
		System.out.println(total/count);
	}
}
