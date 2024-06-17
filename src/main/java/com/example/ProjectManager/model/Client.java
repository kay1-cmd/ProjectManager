package com.example.ProjectManager.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class Client {
    private String clientID;
    private String clientPass;
    private String clientName;
    private String clientEmail;
    private String clientNumber;
    private Project project;

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
        this.clientNumber;
    }
    public String Number(){ 
        return clientNumber;
    }

    /*  Creates a new project object. 
        Collects project name, uses to create a new project and fills
        name field in Project onject with String n
    */
    public void createNewProject(String n){
        this.project = new Project(n);
    }
    public Project getProject(){
        return this.project;
     }


}
