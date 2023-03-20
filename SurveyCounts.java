import java.util.Scanner;

class SurveyCountApp {
	public static void main(String[] args) {

		try{
		Scanner input = new Scanner(System.in);
		int len = input.nextInt();
		input.nextLine();
		String[] answers = new String [len];

		for(int i=0; i<len; i++){
			answers[i] = input.nextLine();
		}

		int countSome = 0;
		for(int i=0; i<len; i++) {
			if(answers[i].equals("Some Impact")) {
				countSome++;
			}
		}
		System.out.println("Some Impact = " +countSome);
		} catch(Exception exName) {
		System.err.println("Something went wrong");
		System.err.println(exName.getMessage());
		}
	}
}
