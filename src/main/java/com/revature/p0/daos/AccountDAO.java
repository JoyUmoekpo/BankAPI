package com.revature.p0.daos;



import java.util.Set;

import com.revature.p0.entities.Account;

public interface AccountDAO {
    // CREATE
    Account createAccount(Account account);

    // READ
    Set<Account> getAllAccounts();
    Account getAccountById(int id);

    // UPDATE
    Account updateAccount(Account account);

    // DELETE
    boolean deleteAccountById(int id);
}
