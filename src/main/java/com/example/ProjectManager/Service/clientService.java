package com.example.ProjectManager.Service;

import com.example.ProjectManager.model.Client;
import com.example.ProjectManager.model.Project;
import org.springframework.stereotype.Service;

@Service
public class clientService implements clientInterface {

    @Override
    public Client createClient(Client client){
        Client newClient = new Client();
        newClient.setClientEmail(client.getClientEmail());
        newClient.setClientName(client.getClientName());
        newClient.setClientPass(client.getClientPass());
        newClient.setClientNumber(client.getClientNumber());
        return newClient;
    }

    @Override
    public Project createProject(Project project){
        Project newProject = new Project();
        newProject.setName(project.getName());
        newProject.setDueDate(project.getDueDate());
        newProject.setClientCriteria(project.getClientCriteria());
        newProject.setDescription(project.getDescription());
        return newProject;
    }

    @Override
    public Client getClient(String clientID){ //Needs implementation
        return null;
    }

    @Override
    public Project getProject(String name){
        return null;
    }
}
