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

    Client(){}

    Client(String name, String id, String pwd){
        this.clientName = name;
        this.clientID = id;
        this.clientPass = pwd;
    }

    public void setID(String ID){
        this.clientID = ID;
    }
    public String getID(){

        return clientID;
     }

    public void setPass(String pass){
        this.clientPass = pass;
    }
    public String getPass(){

        return clientPass;
    }

    public void setName(String n){

        this.clientName = n;

    }
    public String getName(){ 

        return clientName;
    }

    public void setEmail(String email){
        this.clientEmail = email;
    }
    public String getEmail(){ 
        return clientEmail;
    }

    public void Number(String num){
        this.clientNumber = num;
    }
    public String Number(){ 
        return clientNumber;
    }

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
