/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Account;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author DOUAE
 */
public class AccountCollection {

    private static List<Account> accounts;

    public AccountCollection() {
        this.accounts = new LinkedList<Account>();
    }

    public boolean addAccount(Account account) {
        if (!accounts.contains(account)) {
            accounts.add(account);
            return true;
        }
        return false;
    }

    public boolean removeAccount(Account account) {
        return accounts.remove(account);
    }

    public void modifyElement(Account search, Account newAccount) {
        int index = accounts.indexOf(search);
        if (index >= 0) {
            accounts.set(index, newAccount);
        }
    }

    public void modifyElement(String email, Account newAccount) {
        ListIterator<Account> iter = accounts.listIterator();
        while (iter.hasNext()) {
            Account account = iter.next();
            if (account.getEmail().equals(email)) {
                iter.set(newAccount);
            }
        }
    }

    public ArrayList<Account> findAccountWithEmail(String email) {
        ArrayList<Account> results = new ArrayList<Account>();
        // will using Iterator instaed of IteratorList have an impact on the execution of the project?
        Iterator<Account> iter = accounts.iterator();
        while (iter.hasNext()) {
            Account account = iter.next();
            if (account.getEmail().compareTo(email) == 0) {
                results.add(account);
            }
        }
        return results;
    }

    public void sortAccounts(Comparator comp) {
        Collections.sort(accounts, comp);
    }

    @Override
    public String toString() {
        String str = " ";
        ListIterator<Account> iter = accounts.listIterator();
        while (iter.hasNext()) {
            Account account = iter.next();
            str = account.toString() + "\n";
        }
        return str;
    }
}
