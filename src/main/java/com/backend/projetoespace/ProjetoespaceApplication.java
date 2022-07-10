package com.backend.projetoespace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.backend.projetoespace.entities.Category;
import com.backend.projetoespace.repository.CategoryRepository;

@SpringBootApplication

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class ProjetoespaceApplication implements CommandLineRunner {
	
	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProjetoespaceApplication.class, args);
		
		System.out.println("Conectado");
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(1L, "Electronics");
		Category cat2 = new Category(2L, "Books");
		
		
		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
		
	}

}
