package com.example.demo12;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AuthorRepository extends JpaRepository<Author, Long> {
	//findByAuthorName
	//findByAge
	
	public Author findByAge(int age);

	public Author findByautherNameAndAge(String name, int age);
	
	@Query("select au from Author au where au.autherName = ?1 and au.age= ?2")
	public Author findByautherNameAndAgeNamedQuery(String name, int age);
	
}
