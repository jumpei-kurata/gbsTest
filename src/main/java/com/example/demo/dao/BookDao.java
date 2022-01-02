package com.example.demo.dao;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.example.demo.entity.Book;

@Mapper
public interface BookDao {
    //1������
    Book findById(Book book);

    //�S���擾
    List<Book> findAll();
}