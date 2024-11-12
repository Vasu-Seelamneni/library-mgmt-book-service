package com.msp.library.mgmt.controller;

import com.msp.library.mgmt.model.Book;
import com.msp.library.mgmt.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/all")
    private Iterable<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping("/save")
    private Book saveBook(Book book) {
        return bookService.saveBook(book);
    }

    @GetMapping("/find/{title}")
    private Iterable<Book> findByTitleContaining(@PathVariable String title) {
        // Customize this logic to select all matching titles
        return bookService.findByTitleContaining(title);
    }

    @DeleteMapping("/delete/{id}")
    private void deleteBook(@PathVariable long id) {
        bookService.deleteBook(id);
    }

    @GetMapping("/available/{bookId}")
    public ResponseEntity<Book> isBookAvailable(@PathVariable("bookId") Long bookId) {
        return ResponseEntity.ok(bookService.isBookAvailable(bookId));
    }

    @PutMapping("/{bookId}")
    public ResponseEntity<Void> updateBookAvailability(
            @PathVariable("bookId") Long bookId,
            @RequestParam("available") Boolean available) {
        bookService.updateBookAvailability(bookId, available); // Call to service logic
        return ResponseEntity.ok().build();
    }
}
