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

    /* Creates a project Object. At instantion, sets all fields. 
     * Return Object, to be used in addProject Method.
    */
    @Override
    public Project createProject(Project project){
        Project newProject = new Project();
        newProject.setName(project.getName());
        newProject.setDate(project.getDate());
        newProject.setCriteria(project.getCriteria());
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
