package com.example.ProjectManager.Controller;

import com.example.ProjectManager.Service.clientInterface;
import com.example.ProjectManager.model.Client;
import com.example.ProjectManager.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
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

    //Post API Call to create a client
    @PostMapping("/createClient")
    public Client createClient(@RequestBody Client client) {
        return this.clientService.createClient(client);
    }

    //Get API Call to return a client by clientID
    @GetMapping("/getClient/{clientID}")
    public Client getClient(@PathVariable String clientID) {
        return this.clientService.getClient(clientID);
    }

    //Get API Call to return a project by its name
    @GetMapping("/listClients")
    public List<Client> getProject() {
        return this.clientService.getListOfClients();
    }

}
