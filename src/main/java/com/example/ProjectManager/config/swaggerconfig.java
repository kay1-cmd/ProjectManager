package com.example.ProjectManager.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class swaggerconfig {

        @Bean
        public OpenAPI defineOpenApi() {
            Server server = new Server();
            server.setUrl("http://localhost:8080");
            server.setDescription("Project Manager Project");

            Contact myContact = new Contact();
            myContact.setName("Anna Hickey");
            myContact.setEmail("annahickey11@gmail.com");

            Info information = new Info()
                    .title("Project Management System API")
                    .version("1.0")
                    .description("This API exposes endpoints to manage clients and projects.")
                    .contact(myContact);
            return new OpenAPI().info(information).servers(List.of(server));
        }
    }
