package com.org.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.org.service.BookService;

public class GetBooksAction implements Action {
	private String[] books;

	public String[] getBooks() {
		return books;
	}

	public void setBooks(String[] books) {
		this.books = books;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		String user = (String) ActionContext.getContext().getSession()
				.get("user");
		if (user != null && user.equals("admin")) {
			BookService bs = new BookService();
			setBooks(bs.getBooks());
			return SUCCESS;
		} else {
			return LOGIN;
		}
	}

}
