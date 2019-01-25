package br.com.ifood.ibtlvrptest.ibtlvrptest.services.impl;

import br.com.ifood.ibtlvrptest.ibtlvrptest.services.ClientService;
import br.com.ifood.ibtlvrptest.ibtlvrptest.services.models.Client;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ClientServiceImpl implements ClientService {
    @Override
    public Client create(Client client) {
        return null;
    }

    @Override
    public Collection<Client> retrieveAll() {
        return null;
    }

    @Override
    public Client retrieveById(Long id) {
        return null;
    }

    @Override
    public Client update(Long id, Client client) {
        return null;
    }
}
