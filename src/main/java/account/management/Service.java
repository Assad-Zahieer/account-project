package account.management;

public class Service extends Map {
	
	public static void main(String[] args) {
		addAccount("peter", "crouch", "12");
		addAccount("peter", "crouch", "18");
		addAccount("assad", "zahieer", "14");
		retrieveAccount();
		retrieveEntries();
		numOfAccount("peter");
	}

}
