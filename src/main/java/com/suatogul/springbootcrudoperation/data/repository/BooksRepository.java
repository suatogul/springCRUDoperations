package com.suatogul.springbootcrudoperation.data.repository;

import com.suatogul.springbootcrudoperation.data.model.Books;
import org.springframework.data.repository.CrudRepository;

public interface BooksRepository extends CrudRepository<Books,Integer> {
}
