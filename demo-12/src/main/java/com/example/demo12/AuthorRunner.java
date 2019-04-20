package com.example.demo12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AuthorRunner implements CommandLineRunner {

	@Autowired
	private AuthorRepository authorRepository;

	@Override
	public void run(String... args) throws Exception {

		Author au = new Author();
		au.setAutherName("mohit");
		au.setAge(23);
		Author au1 = new Author();
		au1.setAutherName("rohiy");
		au1.setAge(45);

		authorRepository.save(au);
		authorRepository.save(au1);

		System.out.println(authorRepository.findById(new Long(1)));

		System.out.println(authorRepository.findByAge(23));
		System.out.println("------");
		System.out.println(authorRepository.findByautherNameAndAge("mohit", 23));
		System.out.println("--2----");
		System.out.println(authorRepository.findByautherNameAndAgeNamedQuery("mohit", 23));

	}

}
