package com.revature.p0.daos;



import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.revature.p0.entities.Client;

public class ClientDaoLocal implements ClientDAO {

    private static Map<Integer, Client> table = new HashMap<>();
    private static int idMaker;

    @Override
    public Client createClient(Client client) {
        // Create a new and unique id for the client.
        client.setId(++idMaker);
        // Emulate store in db.
        table.put(client.getId(), client);
        return client;
    }

    @Override
    public Set<Client> getAllClients() {
        Set<Client> allClients = new HashSet<>(table.values());
        return allClients;
    }

    @Override
    public Client getClientById(int id) {
        return table.get(id);
    }

    @Override
    public Client updateClient(Client client) {
        return table.put(client.getId(), client);
    }

    @Override
    public boolean deleteClientById(int id) {
        // This will remove the object, but will also return it.
        Client client = table.remove(id);
        return client != null;
    }
}
