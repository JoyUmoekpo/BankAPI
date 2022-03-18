package com.revature.p0.services;



import java.util.Set;

import com.revature.p0.entities.Client;

// Business Logic
public interface ClientService {
    // CREATE
    Client registerClient(Client client);

    // READ
    Set<Client> getAllClients();
    Set<Client> getClientsByName(String name);
    Client getClientById(int id);

    // UPDATE
    Client updateClient(Client client);

    // DELETE
    boolean deleteClientById(int id);
}
