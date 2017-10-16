package ru.javarush.bookmanager.dao;


import ru.javarush.bookmanager.model.Book;

import java.util.List;

public interface BookDao {

    public void addBook(Book book);

    public void updateBook(Book book);

    public void removeBook(int id);

    public Book getBookById(int id);

    public List<Book> listBooks();

    public List<Book> findBooksByName(String name);

}
