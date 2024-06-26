package com.example.ProjectManager.Controller;

import com.example.ProjectManager.Service.clientInterface;
import com.example.ProjectManager.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//http://localhost:8080/swagger-ui/index.html

@RestController
@RequestMapping("/freelance")
public class freelanceController {

    @Autowired
    private clientInterface clientService;

    @Autowired
    public freelanceController(clientInterface clientService) {
        this.clientService = clientService;
    }

    //POST API Call to create a client
    @PostMapping("/createClient")
    public Client createClient(@RequestBody Client client) {
        return this.clientService.createClient(client);
    }

    //GET API Call to return a client by clientID
    @GetMapping("/getClient/{clientID}")
    public Client getClient(@PathVariable String clientID) {
        return this.clientService.getClient(clientID);
    }

    // PUT API Call to modify a client
    @PutMapping("/modifyClient/{clientID}")
    public Client modifyClient(@RequestBody Client client, @PathVariable String clientID) {
        return this.clientService.modifyClient(clientID, client);
    }

    //GET API Call to return a list of clients
    @GetMapping("/listClients")
    public List<Client> listClients() {
        return this.clientService.getListOfClients();
    }

    //DELETE API Call to delete a client
    @DeleteMapping("/deleteClient/{clientID}")
    public List<Client> deleteClient(@PathVariable String clientID) {
        return this.clientService.deleteClient(clientID);
    }

}
