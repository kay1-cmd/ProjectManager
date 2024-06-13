package com.example.ProjectManager.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Client {
    private String clientID;
    private String clientPass;
    private String clientName;
    private String clientEmail;
    private String clientNumber;
    private Project projectName;
}
