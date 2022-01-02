package com.example.demo.dao;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.example.demo.entity.Book;

@Mapper
public interface BookDao {
    //1ŒŒŸõ
    Book findById(Book book);

    //‘SŒæ“¾
    List<Book> findAll();
}