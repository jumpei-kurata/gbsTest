package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.BookDao;
import com.example.demo.entity.Book;

@Service
public class BookService {

    @Autowired
    BookDao bookDao;

    //1åèåüçı
    public Book findById(Integer id, String bookName, String authorName) {
        Book book = new Book();
        book.setId(id);
        book.setBookName(bookName);
        book.setAuthorName(authorName);
        return this.bookDao.findById(book);
    }

    //ëSåèéÊìæ
    public List<Book> getBookList(){
        return this.bookDao.findAll();
    }
}