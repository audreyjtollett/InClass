

public class Account {
	//Fields
	private int balance;
	private int num;
	private Customer owner;

	//Constructor   //constructors ususally public
	public Account(Customer _owner, int _anum, int _bal) {
		owner = _owner;
		num = _anum;
		if(_bal > 0){//verify no one is doing stupid shit!!!
			balance = _bal;
		}else{
			balance = 0;
		}
	}

	//Methods
	public boolean deposit(int amt) {
		if(amt > 0) {
			balance += amt;
			return true;
		} else{
			return false;
		}//makes sure you can't  deposit negative ergo withdraw
	}
	public boolean withdraw(int amt) {
		if(amt > 0 && amt < balance) {
			balance -= amt;
			return true;
		}else {
			return false;
		}
			//makes sure you can't withdraw negative nor over-withdraw
	}
	public String toString() {
		return(f + " " + l + " Balance: $" + (balance / 100.0)) ;// THIS IS MISTAKE LOL
	}

	public int getBalance(){ //getter
		return balance;
	}

	/*public String getOwner(){
		return owner;
	}
	public void setName(String newName){ //setter
		newName.split(" ");
		if(pieces.length >= 2) {
			name = newName;
		}
		
	}*/

	//why not make public if adding setter and getter??
	//-> allows you to make if statements creating parameters for doing things :D

	//simple way to test class in by adding a main inside of class with tester code
	//public static void main(String[] args) {
//because main is INSIDE of the class, private doesn't work how you would think
		//we don't want people to just be able to set balances...
		//***ACCESS CONTROL YAY***
	//public fields - anyone ever can do anything to them
	//private fields ONLY CODE WITHIN THE CLASS can do things to it
	//also default accessibility and protected fields... we will do these later

		// can't just print x, it will return the location (Account@7ad027385....)
		// need to print a string or an int that will be converted to string
		
		//can write special method .toString()
		
		//what can go  wrong?
		//adversarial users -> make sure people can't mess with my code!!!
		//incompetent stupid users -> stupid proof my code!!!
	//}

}

class ATM {
	public static void main(String[] args) {
		System.out.println("Hello!");
		Customer atollett = new Customer("Audrey", "Tollett", 10000); //this is an instance of Account
		Account x = new Account(atollett, 123, 2000);
		Account y = new Account(atollett, 2343, 3000);

		System.out.println(x);
		System.out.println(y);
		/*System.out.println(x.getBalance());
		x.deposit(100980);
		System.out.println(x.getBalance());
		System.out.println(x);
		//x.balance = 250000;
		System.out.println(x);*/
		//Account a = new Account("Sally Ride", 123, -20099);
	}
}

//Privacy with Access
//getters and setters
//
//GETTERS: methods that let you see a field value
//SETTERS: methods that let you change a field value
//
//note that now compiling will make .class files for all classes in code!
//
//
//
//PLANNING AN OOP PROFECT
//UML diagrams -Unified Modeling Language
//a formal way to plan for larger projects
//
//Behavior diagrams
//and 
//Structure diagrams
//
