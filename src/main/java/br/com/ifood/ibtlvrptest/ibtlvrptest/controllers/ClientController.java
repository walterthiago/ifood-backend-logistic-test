package br.com.ifood.ibtlvrptest.ibtlvrptest.controllers;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/client")
public class ClientController {

    @PostMapping
    public String create() {
        return "";
    }

    @GetMapping
    public String getAll() {
        return "";
    }

    @GetMapping(path = "/{clientId}")
    public String getById() {
        return "";
    }

    @PutMapping(path = "/{clientId}")
    public String update() {
        return "";
    }

}
