package com.example.ProjectManager.Controller;

import com.example.ProjectManager.Service.clientInterface;
import com.example.ProjectManager.model.Client;
import com.example.ProjectManager.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    //Post API Call to create a project
    @PostMapping("/createProject")
    public Project createProject(@RequestBody Project project) {
        return this.clientService.createProject(project);
    }

    //Get API Call to return a client by clientID
    @GetMapping("/getClient/{clientID}")
    public Client getClient(@RequestBody String clientID) {
        return this.clientService.getClient(clientID);
    }

    //Get API Call to return a project by its name
    @GetMapping("/getProject/{name}")
    public Project getProject(@RequestBody String name) {
        return this.clientService.getProject(name);
    }

}
