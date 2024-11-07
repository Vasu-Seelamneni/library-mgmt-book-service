package com.msp.library.mgmt.repository;

import com.msp.library.mgmt.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    Iterable<Book> findByTitleContaining(String title);
}
