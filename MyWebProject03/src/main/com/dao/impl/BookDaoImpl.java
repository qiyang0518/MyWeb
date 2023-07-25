package main.com.dao.impl;
import main.com.dao.BookDao;
import main.com.pojo.Book;

import java.util.List;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class BookDaoImpl extends BaseDao implements BookDao
{
    @Override
    public int addBook(Book book)
    {
        String sql = "insert into t_book(name,author,price,sales,stock,img_Path) values(?,?,?,?,?)";
        return update(sql,book.getName(),book.getAuthor(),book.getPrice(),book.getSales(),book.getStock(),book.getImgPath());
    }

    @Override
    public int deleteBookById(Integer id)
    {
        String sql = "delete from t_book where id = ?";
        return update(sql,id);
    }

    @Override
    public int updateBook(Book book)
    {
        String sql = "update t_book set name = ?,author = ?,price = ?,sales = ?,stock = ?,img_Path = ? where id = ?";
        return update(sql,book.getName(),book.getAuthor(),book.getPrice(),book.getSales(),book.getStock(),
                book.getImgPath(),book.getId());
    }

    @Override
    public Book queryBookById(Integer id)
    {
        String sql = "select id,name,author,price,sales,stock,img_path imgpath from t_book where id = ?";
        return queryForOne(Book.class,sql,id);
    }

    @Override
    public List<Book> queryBooks()
    {
        String sql = "select id,name,author,price,sales,stock,img_path imgpath from t_book";
        return queryForList(Book.class,sql);
    }
}
