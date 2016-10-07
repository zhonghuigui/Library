package com.hzit.dao.mapper;

import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;
import com.hzit.dao.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BookMapper {

	void insertBook(Book book);

	void deleteBookByBookId(String bookId);

	void updateBook(Book book);

	Page<Book> searchBookByParams(@Param("map")Map<String, String> map , Pageable pageable);

	List<Book> searchBookByParams(@Param("map")Map<String, String> map);

} 
