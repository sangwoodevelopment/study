package com.multi.erp.board;


import java.sql.Date;
import java.util.List;


public class BoardDTO {
	String board_no;
	String id;
	Date write_date;
	String title;
	String content;
	String category;
	public BoardDTO() {
	}
	public BoardDTO(String board_no, String id, Date write_date, String title, String content, String category) {
		super();
		this.board_no = board_no;
		this.id = id;
		this.write_date = write_date;
		this.title = title;
		this.content = content;
		this.category = category;
	}
	
	@Override
	public String toString() {
		return "BoardDTO [board_no=" + board_no + ", id=" + id + ", write_date=" + write_date + ", title=" + title
				+ ", content=" + content + ", category=" + category ;
	}
	
	
	public String getBoard_no() {
		return board_no;
	}
	public void setBoard_no(String board_no) {
		this.board_no = board_no;
	}
	public String getId() {
//		System.out.println("getId()");
		return id;
	}
	public void setId(String id) {
//		System.out.println("setId()");
		this.id = id;
	}
	public Date getWrite_date() {
		return write_date;
	}
	public void setWrite_date(Date write_date) {
		this.write_date = write_date;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}
