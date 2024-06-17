package com.example.ProjectManager.Service;

import com.example.ProjectManager.model.Client;
import com.example.ProjectManager.model.Project;

public interface clientInterface {

    Client createClient(Client client);
    Client getClient(String clientID);
    Project createProject(Project project);
    Project getProject(String name);

}
