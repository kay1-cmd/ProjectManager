package com.example.ProjectManager.Service;

import com.example.ProjectManager.model.Client;
import com.example.ProjectManager.model.Project;
import org.springframework.stereotype.Service;

@Service
public class clientService implements clientInterface {

    @Override
    public Client createClient(Client client){
        Client newClient = new Client();
        return newClient;
    }

    @Override
    public Project createProject(){
        return null;
    }

    @Override
    public Client getClient(){
        return null;
    }

    @Override
    public Project getProject(){
        return null;
    }
}
