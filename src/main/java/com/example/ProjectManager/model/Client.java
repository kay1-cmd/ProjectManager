package com.example.ProjectManager.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.*;

@Getter
@Setter


public class Client {
    private String clientID;
    private String clientPass;
    private String clientName;
    private String clientEmail;
    private String clientNumber;
    private Map<String, Project> projectList;

    

    /*  Creates a new project object. 
        Collects project name, uses to create a new project and fills
        name field in Project onject with String projectName.
        Adds it to list of projects for this client.
    */
    public void createNewProject(String projectName){
        Project projectObject = new Project(projectName);
        projectList.put(projectName, projectObject);

    }
    public Project getProject(String retrievalName){
        return projectList.get(retrievalName);
     }


}
