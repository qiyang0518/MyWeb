package main.com.test;
import main.com.dao.BookDao;
import main.com.dao.impl.BookDaoImpl;
import main.com.pojo.Book;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class BookDaoImplTest
{
    private BookDao bookDao = new BookDaoImpl();

    @Test
    public void addBook()
    {
        bookDao.addBook(new Book(null,"钢铁是怎样炼成的","斯基",new BigDecimal(999),100000,0,null));
    }

    @Test
    public void deleteBookById()
    {
    }

    @Test
    public void updateBook()
    {
    }

    @Test
    public void queryBookById()
    {
    }

    @Test
    public void queryBooks()
    {
    }

    @Test
    public void run()
    {
    }
}