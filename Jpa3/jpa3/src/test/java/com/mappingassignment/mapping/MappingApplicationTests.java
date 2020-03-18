package com.mappingassignment.mapping;

import com.mappingassignment.mapping.entities.Address;
import com.mappingassignment.mapping.entities.Author;
import com.mappingassignment.mapping.entities.Book;
import com.mappingassignment.mapping.repo.Repository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
class MappingApplicationTests {

	@Autowired
	Repository repository;
	@Test
	void contextLoads() {
	}
//4 Persist 3 subjects for each author
	@Test
	public void addDetails()
	{
		List<Author> authors=new ArrayList<>();
		Author author1=new Author();
		List<Book> books=new ArrayList<>();

		Book book=new Book();

		book.setName("Ensyclopedia");
		book.setAuthor(authors);

		Book book2=new Book();

		book2.setAuthor(authors);
		book2.setName("Programmin with C");

		books.add(book);
		books.add(book2);

		Address address=new Address();

		address.setStreetNumber(1);
		address.setLocation("Modinagar");
		address.setState("Uttar Pradesh");


		List<String> subjects=new ArrayList<>();

		subjects.add("Maths");
		subjects.add("Physics");
		subjects.add("Chemistry");

		author1.setName("Kshitija");
		author1.setSubjects(subjects);
		author1.setAddress(address);
		author1.setBook(books);

		book.setAuthor(authors);

		repository.save(author1);
	}


}
