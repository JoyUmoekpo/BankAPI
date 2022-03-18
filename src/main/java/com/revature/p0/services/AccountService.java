package com.revature.p0.services;



import java.util.Set;

import com.revature.p0.entities.Account;

public interface AccountService {
    // CREATE
    Account createAccount(Account account);

    // READ
    Set<Account> getAllAccounts(int clientId);
    Account getAccountById(int clientId, int id);

    // UPDATE
    Account updateAccount(Account account);

    // DELETE
    boolean deleteAccountById(int clientId, int id);
}
