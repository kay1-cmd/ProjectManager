package com.example.ProjectManager.Service;

import com.example.ProjectManager.model.Client;
import com.example.ProjectManager.model.Project;

import java.util.List;

public interface clientInterface {

    Client createClient(Client client);
    Client getClient(String clientID);
    List<Client> getListOfClients();
    //Project createProject(Project project);
    //Project getProject(String name);

}
