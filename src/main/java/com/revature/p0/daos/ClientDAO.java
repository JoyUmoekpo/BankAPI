package com.revature.p0.daos;



import java.util.Set;

import com.revature.p0.entities.Client;

public interface ClientDAO {
    // CREATE
    Client createClient(Client client);

    // READ
    Set<Client> getAllClients();
    Client getClientById(int id);

    // UPDATE
    Client updateClient(Client client);

    // DELETE
    boolean deleteClientById(int id);
}
