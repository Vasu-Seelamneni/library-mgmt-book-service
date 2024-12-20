package com.msp.library.mgmt.service;

import com.msp.library.mgmt.model.Book;

public interface BookService {

    Book saveBook(Book book);

    Iterable<Book> findByTitleContaining(String title);

    void deleteBook(long id);

    Iterable<Book> getAllBooks();

    Boolean isBookAvailable(Long bookId);

    void updateBookAvailability(Long bookId, Boolean available);
}
