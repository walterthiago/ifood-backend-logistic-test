package br.com.ifood.ibtlvrptest.ibtlvrptest.controllers;


import br.com.ifood.ibtlvrptest.ibtlvrptest.controllers.request.ClientRequest;
import br.com.ifood.ibtlvrptest.ibtlvrptest.controllers.response.ClientResponse;
import br.com.ifood.ibtlvrptest.ibtlvrptest.mappers.ClientMapper;
import br.com.ifood.ibtlvrptest.ibtlvrptest.services.ClientService;
import br.com.ifood.ibtlvrptest.ibtlvrptest.services.models.Client;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping
    public ResponseEntity<ClientResponse> create(@RequestBody ClientRequest request) {
        val created = clientService.create(toClient(request));
        return ResponseEntity.ok(toResponse(created));
    }

    @GetMapping
    public ResponseEntity<Collection<ClientResponse>> getAll() {
        val clients = clientService
                .retrieveAll()
                .stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
        return ResponseEntity.ok(clients);
    }

    @GetMapping(path = "/{clientId}")
    public ResponseEntity<ClientResponse> getById(@PathVariable("clientId") Long id) {
        val found = clientService.retrieveById(id);
        return ResponseEntity.ok(toResponse(found));
    }

    @PutMapping(path = "/{clientId}")
    public ResponseEntity<ClientResponse> update(@PathVariable("clientId") Long id, @RequestBody ClientRequest request) {
        val updated = clientService.update(id, toClient(request));
        return ResponseEntity.ok(toResponse(updated));
    }

    private Client toClient(ClientRequest client) {
        return ClientMapper.instance.requestToClient(client);
    }

    private ClientResponse toResponse(Client client) {
        return ClientMapper.instance.clientToResponse(client);
    }

}
