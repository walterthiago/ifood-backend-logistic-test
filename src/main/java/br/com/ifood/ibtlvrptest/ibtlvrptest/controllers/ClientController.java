package br.com.ifood.ibtlvrptest.ibtlvrptest.controllers;


import br.com.ifood.ibtlvrptest.ibtlvrptest.controllers.request.ClientRequest;
import br.com.ifood.ibtlvrptest.ibtlvrptest.controllers.response.ClientResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(path = "/client")
public class ClientController {

    @PostMapping
    public ResponseEntity<ClientResponse> create(ClientRequest request) {
        return null;
    }

    @GetMapping
    public ResponseEntity<Collection<ClientResponse>> getAll() {
        return null;
    }

    @GetMapping(path = "/{clientId}")
    public ClientResponse getById() {
        return null;
    }

    @PutMapping(path = "/{clientId}")
    public ResponseEntity<ClientResponse> update(ClientRequest request) {
        return null;
    }

}
