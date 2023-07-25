package main.com.dao;
import main.com.pojo.Book;

import java.util.List;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public interface BookDao
{
    public int addBook(Book book);

    public int deleteBookById(Integer id);

    public int updateBook(Book book);

    public Book queryBookById(Integer id);

    public List<Book> queryBooks();
}
