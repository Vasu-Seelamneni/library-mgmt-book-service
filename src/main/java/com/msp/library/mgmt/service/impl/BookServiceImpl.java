package com.msp.library.mgmt.service.impl;

import com.msp.library.mgmt.exception.BookNotFoundException;
import com.msp.library.mgmt.model.Book;
import com.msp.library.mgmt.repository.BookRepository;
import com.msp.library.mgmt.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    public BookServiceImpl() {
    }

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Iterable<Book> findByTitleContaining(String title) {
        return bookRepository.findByTitleContaining(title);
    }

    @Override
    public void deleteBook(long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public Iterable<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book isBookAvailable(Long bookId) {
        return bookRepository.findById(bookId)
                .orElseThrow(() -> new BookNotFoundException("Book with id " + bookId + " not found"));
    }

    @Override
    public void updateBookAvailability(Long bookId, Boolean available) {
        bookRepository.findById(bookId)
                .ifPresent(book -> {
                    book.setAvailable(available);
                    bookRepository.save(book);
                });
    }

}
