package com.example.ProjectManager.Controller;

import com.example.ProjectManager.Service.clientInterface;
import com.example.ProjectManager.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/freelance")
public class freelanceController {

    @Autowired
    private clientInterface clientService;

    @Autowired
    public freelanceController(clientInterface clientService) {
        this.clientService = clientService;
    }

    //Example of Post call for API to create a client
    @PostMapping("/createClient")
    public Client createClient(@RequestBody Client client) {
        return this.clientService.createClient(client);
    }

}
