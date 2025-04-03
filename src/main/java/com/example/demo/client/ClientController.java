package com.example.demo.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/client")
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController ( ClientService clientServiceOne) {
        this.clientService = clientServiceOne;
	}

    @GetMapping()
    public List<Client> getClient() {
        return clientService.getClient();
    }

    @GetMapping("/{id}")
    public Optional<Client> getClientById(@PathVariable Long id) {
        return clientService.getClientById(id);
    }

    @PostMapping()
    public Client addClient(@RequestBody Client client) {
        return clientService.saveClient(client);
    }
}
