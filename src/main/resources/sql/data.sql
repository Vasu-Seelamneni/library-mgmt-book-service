CREATE TABLE books (
                       id SERIAL PRIMARY KEY,
                       title VARCHAR(255),
                       author VARCHAR(255),
                       isbn VARCHAR(13),
                       available BOOLEAN
);

/*Insert sample data*/
INSERT INTO books (title, author, isbn, available) VALUES
                                                       ('To Kill a Mockingbird', 'Harper Lee', '9780061120084', TRUE),
                                                       ('1984', 'George Orwell', '9780451524935', TRUE),
                                                       ('Pride and Prejudice', 'Jane Austen', '9780141439518', FALSE),
                                                       ('The Great Gatsby', 'F. Scott Fitzgerald', '9780743273565', TRUE),
                                                       ('Moby Dick', 'Herman Melville', '9781503280786', FALSE),
                                                       ('The Catcher in the Rye', 'J.D. Salinger', '9780316769488', TRUE),
                                                       ('War and Peace', 'Leo Tolstoy', '9781420954300', TRUE),
                                                       ('The Odyssey', 'Homer', '9780140268867', FALSE),
                                                       ('Crime and Punishment', 'Fyodor Dostoevsky', '9780486415871', TRUE),
                                                       ('The Hobbit', 'J.R.R. Tolkien', '9780618260300', FALSE);

