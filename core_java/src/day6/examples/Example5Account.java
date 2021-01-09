package day6.examples;
import java.util.*;
import day6.beans.Account;

public class Example5Account {
	public static void main(String[] args) {
		
		Account account1 = new Account(895214, "\t accHolderName1");
		Account account2 = new Account(875424, "\t accHolderName2");
		Account account3 = new Account(469782, "\t accHolderName3");
		Account account4 = new Account(213123, "\t accHolderName4");
		
		
		HashSet<Account> dAccount = new HashSet<Account>();
		dAccount.add(account1);
		dAccount.add(account2);
		dAccount.add(account3);
		dAccount.add(account4);
		
		System.out.println("---------------------------Iterator------------------------");
		Iterator<Account> iter = dAccount.iterator();
		while(iter.hasNext()) {
			Account x = iter.next();
			System.out.println(x);
			}
		
		System.out.println("---------------------------For-Each------------------------");
		for(Account x:dAccount) {
			System.out.println(x);
		}
		
	}

}
