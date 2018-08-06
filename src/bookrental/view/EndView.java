package bookrental.view;

import bookrental.dto.BookRentalDTO;

public class EndView {
	public static void printOne(BookRentalDTO one) {
		System.out.println(one.toString());
	}
	
	
	public static void printMsg(String msg) {
		System.out.println(msg);
	}
}
