package account.management;

import java.util.HashMap;
import java.util.Map.Entry;

import com.google.gson.Gson;

public class Map {
	static Gson gson = new Gson();
	static HashMap<Integer, Account>hash = new HashMap<Integer, Account>();
	static int key = 1;
	public static void addAccount(String firstName, String lastName, String accountNumber) {
		Account account = new Account(firstName, lastName, accountNumber);
		hash.put(key, account);
		key ++;
	}
	public static void retrieveAccount() {
		for (Account account: hash.values()) {
//			System.out.println(account); Prints ram location
			String json = gson.toJson(account);
			System.out.println(json);
			
		}		
	}
	public static void retrieveEntries() {
		for(Entry<Integer, Account> entry : hash.entrySet()) {
			int keyValue = entry.getKey();
			Account account = entry.getValue();
			String json = gson.toJson(account);
			System.out.println(keyValue +" : " + json);
		}
		
	}

}
