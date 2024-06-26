package com.example.ProjectManager.Service;

import com.example.ProjectManager.model.Client;
import com.example.ProjectManager.model.Project;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class clientService implements clientInterface {

    private final List<Client> clients = new ArrayList<>();

    @Override
    public Client createClient(Client client) {
        Client newClient = new Client();
        newClient.setClientID(UUID.randomUUID().toString());
        newClient.setClientEmail(client.getClientEmail());
        newClient.setClientName(client.getClientName());
        newClient.setClientPass(client.getClientPass());
        newClient.setClientNumber(client.getClientNumber());
        this.clients.add(newClient);
        return newClient;
    }

    @Override
    public Client getClient(String clientID) {
        for (Client client : clients) {
            if (client.getClientID().equals(clientID)) {
                return client;
            }
        }
        return null;
    }

    @Override
    public List<Client> getListOfClients() {
        return clients;
    }

    @Override
    public List<Client> deleteClient(String clientID){
        for (Client client : clients) {
            if (client.getClientID().equals(clientID)) {
                clients.remove(client);
            }
            return clients;
        }
        return null;
    }

    @Override
    public Client modifyClient(String clientID, Client clientInput){
        for (Client client : clients){
            if (client.getClientID().equals(clientID)) {
                client.setClientEmail(clientInput.getClientEmail());
                client.setClientName(clientInput.getClientName());
                client.setClientPass(clientInput.getClientPass());
                client.setClientNumber(clientInput.getClientNumber());
            }
            return client;
        }
        return null;
    }
}


//With more time will come back

//    @Override
//    public Project getProject(String name){
//        return null;
//    }
//}

    /*  Add 
        Collects project name, uses to create a new project and fills
        name field in Project onject with String projectName.
        Adds it to list of projects for this client.

        We need to figure out how to get List acceess in this function.
    */
//    public void addProject(Client c,Project p){
//        c.projectList.put(projectName, projectObject);
//    }

//    public Project getProject(String retrievalName){
//        return projectList.get(retrievalName);
//     }
/* Creates a project Object. At instantion, sets all fields.
 * Return Object, to be used in addProject Method.
 */
//    @Override
//    public Project createProject(Project project){
//        Project newProject = new Project();
//        newProject.setName(project.getName());
//        newProject.setDate(project.getDate());
//        newProject.setCriteria(project.getCriteria());
//        newProject.setDescription(project.getDescription());
//        return newProject;
//    }
