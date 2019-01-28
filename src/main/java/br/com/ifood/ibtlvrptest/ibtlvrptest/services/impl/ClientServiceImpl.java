package br.com.ifood.ibtlvrptest.ibtlvrptest.services.impl;

import br.com.ifood.ibtlvrptest.ibtlvrptest.entities.ClientEntity;
import br.com.ifood.ibtlvrptest.ibtlvrptest.exceptions.ResourceNotFoundException;
import br.com.ifood.ibtlvrptest.ibtlvrptest.mappers.ClientMapper;
import br.com.ifood.ibtlvrptest.ibtlvrptest.repositories.ClientRepository;
import br.com.ifood.ibtlvrptest.ibtlvrptest.services.ClientService;
import br.com.ifood.ibtlvrptest.ibtlvrptest.services.models.Client;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ClientServiceImpl implements ClientService {


    @Autowired
    private ClientRepository repository;

    @Override
    public Client create(Client client) {
        val entity = toEntity(client);
        val saved = repository.save(entity);
        return toClient(saved);
    }

    @Override
    public Collection<Client> retrieveAll() {
        val clients = repository.findAll();
        return StreamSupport.stream(clients.spliterator(), false)
                .map(this::toClient)
                .collect(Collectors.toList());
    }

    @Override
    public Client retrieveById(Long id) {
        val found = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Client " + id + " not found"));
        return toClient(found);
    }

    @Override
    public Client update(Long id, Client client) {
        val found = this.retrieveById(id);

        found.setLat(client.getLat());
        found.setLon(client.getLon());

        val updated = repository.save(toEntity(found));
        return toClient(updated);
    }

    private ClientEntity toEntity(Client client) {
        return ClientMapper.instance.clientToEntity(client);
    }

    private Client toClient(ClientEntity entity) {
        return ClientMapper.instance.entityToClient(entity);
    }

}
