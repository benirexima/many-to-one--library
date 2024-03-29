package com.book.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table (name="book")
public class Book {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long bookid;
	
	private String bookname;
	private String authorname;
	private double price;
	
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "book")
	private List<Student >student;
	
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public Long getBookid() 
	{
		return bookid;
	}
	public void setBookid(Long bookid)
	{
		this.bookid = bookid;
	}
	public String getBookname() 
	{
		return bookname;
	}
	public void setBookname(String bookname) 
	{
		this.bookname = bookname;
	}
	public String getAuthorname() 
	{
		return authorname;
	}
	public void setAuthorname(String authorname) 
	{
		this.authorname = authorname;
	}
	public double getPrice() 
	{
		return price;
	}
	public void setPrice(double price) 
	{
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", authorname=" + authorname + ", price=" + price
				+ ", student=" + student + "]";
	}
	
	
	
	
	

}
