package com.lea.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.lea.demo.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

	List<Author> findAllByOrderByLastNameAscFirstNameAsc();

}
