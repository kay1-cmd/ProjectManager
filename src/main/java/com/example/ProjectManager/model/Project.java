package com.example.ProjectManager.model;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
@Getter
@Setter

@NoArgsConstructor
public class Project {
    private String name;
    private String date;
    private String description;
    private String criteria;

    public String getSummary(){
        String str = name + " " + date + " "+ description + " " + criteria ;
        return str;
    }
}
