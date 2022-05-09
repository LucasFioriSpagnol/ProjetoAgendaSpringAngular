package com.projeto.agendaapi;

import com.projeto.agendaapi.model.entity.Contato;
import com.projeto.agendaapi.model.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AgendaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgendaApiApplication.class, args);
	}

}
