package com.example.ProjectManager.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class Client {
    private String clientID;
    private String clientName;
    private String clientEmail;
    private String clientPass;
    private String clientNumber;
}
