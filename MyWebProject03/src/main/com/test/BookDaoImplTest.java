package main.com.test;
import main.com.dao.BookDao;
import main.com.dao.impl.BookDaoImpl;
import main.com.pojo.Book;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
class BookDaoImplTest
{
    private BookDao bookDao = new BookDaoImpl();

    @Test
    void addBook()
    {
        bookDao.addBook(new Book(null,"钢铁是怎样炼成的","斯基",new BigDecimal(999),100000,
                0,null));
    }

    @Test
    void deleteBookById()
    {
        System.out.println("Hello World!");
    }

    @Test
    void updateBook()
    {
    }

    @Test
    void queryBookById()
    {
    }

    @Test
    void queryBooks()
    {
    }
}