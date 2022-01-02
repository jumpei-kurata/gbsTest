package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.entity.Book;
import com.example.demo.form.BookForm;
import com.example.demo.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping("/search")
    public String index(BookForm bookForm, String showList, Model model) {

        //�^�C�g��
        model.addAttribute("title", "�q�c���X");

        //bookform�iform�N���X�j��null����Ȃ�������1������
        if(bookForm.getId() != null || bookForm.getBookName() != null || bookForm.getAuthorName() != null) {
            Book book = bookService.findById(bookForm.getId(), bookForm.getBookName(), bookForm.getAuthorName());
            model.addAttribute("book", book);
        }

        //�ꗗ�\���{�^�����������Ɩ{�ꗗ��model�ɓo�^�B
        if(showList != null) {
            List<Book> bookList = bookService.getBookList();
            model.addAttribute("bookList", bookList);
        }

        return "index";

    }

}
