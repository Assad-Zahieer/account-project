package account.management;

import java.util.HashMap;
import java.util.Map.Entry;

public class Map {
	static HashMap<Integer, Account>hash = new HashMap<Integer, Account>();
	static int key = 1;
	public static void addAccount(String firstName, String lastName, String accountNumber) {
		Account account = new Account(firstName, lastName, accountNumber);
		hash.put(key, account);
		key ++;
	}
	public static void retrieveAccount() {
		for (Account account: hash.values()) {
			System.out.println(account);
		}		
	}
	public static void retrieveEntries() {
		for(Entry<Integer, Account> entry : hash.entrySet()) {
			int keyValue = entry.getKey();
			Account account = entry.getValue();
			System.out.println(keyValue + " : " + account);
		}
		
	}

}
