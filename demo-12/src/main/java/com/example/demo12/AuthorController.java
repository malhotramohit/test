package com.example.demo12;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {

	@Autowired
	private AuthorRepository authorRepository;

	@GetMapping("/all")
	public List<Author> getAuthors() {
		return authorRepository.findAll();
	}

	@PostMapping("/save")
	public void save(@RequestBody Author author) {
		authorRepository.save(author);
	}
}
