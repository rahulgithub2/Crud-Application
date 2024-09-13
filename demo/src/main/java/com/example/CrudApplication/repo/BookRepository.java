package com.example.CrudApplication.repo;

	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

import com.example.CrudApplication.model.Book;
	@Repository
	public interface BookRepository extends JpaRepository<Book, Long> {



	}

