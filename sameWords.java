import java.io.File;
import java.util.Scanner;
class sameWordsApp{
	public static void main(String[] args) {
		//String[] a = {"cat", "dog", "funny", "haha"};
		//String[] b = {"dog", "butt", "stupid", "lol"};
		try{
			File inputFile1 = new File("wordlist1.txt");
			Scanner input1 = new Scanner(inputFile1);
			
			File inputFile2 = new File("wordlist2.txt");
			Scanner input2 = new Scanner(inputFile2);

			int len1 = input1.nextInt();
			input1.nextLine();
			String[] results1 = new String [len1];
			System.err.println(results1.length);
			for(int i=0; i<len1; i++){
				results1[i] = input1.nextLine();
			}

			int len2 = input2.nextInt();
			input2.nextLine();
			String[] results2 = new String [len2];
			System.err.println(results2.length);
			for(int i=0; i<len2; i++){
				results2[i] = input2.nextLine();
			}

		} catch(Exception usuck){
			System.err.println("Something went wrong :(");
		}
		compare(inputFile1, inputFile2);
	}
	public static void compare(String[] lista, String[] listb){
		for(int i=0; i<lista.length; i++){
			for(int j=0; j<listb.length; j++){
				if(lista[i].equals(listb[j])){
					System.out.println(lista[i]);
				}
			}
		}
	}
	//public static void common(String[] list1, String[] list2, String[] list3, String[] list4, String[] list5){
		
//	}
}
