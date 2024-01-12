package com.ruchi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Book")
public class Book {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name ="ID")
	 private int bid;
	@Column (name ="NAME")
	 private String bname;
	@Column (name ="TYPE")
	 private String btype;
	@Column (name = "AUTHOR")
	 private String author;
	@Column (name ="PRICE")
	 private int bprice;
	
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBtype() {
		return btype;
	}
	public void setBtype(String btype) {
		this.btype = btype;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getBprice() {
		return bprice;
	}
	public void setBprice(int bprice) {
		this.bprice = bprice;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	
	public Book(String bname, String btype, String author, int bprice) {
		super();
		this.bname = bname;
		this.btype = btype;
		this.author = author;
		this.bprice = bprice;
	}
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
