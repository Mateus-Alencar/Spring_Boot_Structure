//Define o "endereço" do código dentro da estrutura do projeto
package com.server.Project_Sys_Register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// SpringBootApplication: anotação que ativa várias configurações automáticas do Spring
// (é um atalho para três anotações: @Configuration, @EnableAutoConfiguration e @ComponentScan).
@SpringBootApplication

//Class principal do projeto
public class ProjectSysRegisterApplication {

	public static void main(String[] args) {
		// O SpringApplication.run --> inicializa o contexto Spring, sobe o servidor embutido.
		SpringApplication.run(ProjectSysRegisterApplication.class, args);
	}

}
