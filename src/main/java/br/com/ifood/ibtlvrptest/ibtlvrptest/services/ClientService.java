package br.com.ifood.ibtlvrptest.ibtlvrptest.services;

import br.com.ifood.ibtlvrptest.ibtlvrptest.services.models.Client;

import java.util.Collection;

public interface ClientService {

    Client create(Client client);

    Collection<Client> retrieveAll();

    Client retrieveById(Long id);

    Client update(Long id, Client client);

}
