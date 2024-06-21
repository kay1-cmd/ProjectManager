package com.example.ProjectManager.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.*;

@Getter
@Setter
@NoArgsConstructor
public class Client {
    private String clientID;
    private String clientPass;
    private String clientName;
    private String clientEmail;
    private String clientNumber;
    private Map<String, Project> projectList;
}
