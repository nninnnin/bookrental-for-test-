package bookrental.controller;

import bookrental.dto.BookRentalDTO;
import bookrental.model.BookRentalModel;
import bookrental.view.EndView;


public class BookRentalController{


	//도서 검색
	public static void getBookRentalDTO(String bookName) {
		BookRentalDTO one = BookRentalModel.getBookRentalDTO(bookName);
		if(one !=null) {
			EndView.printOne(one);
			
		}
		else {
			EndView.printMsg("없어여");
		}
	}
	
	//book 추가
	public static void bookInsert(BookRentalDTO bookinfo) {
		BookRentalModel.bookInsert(bookinfo); //******
		System.out.println("도서 정보 추가가 완료되었습니다.");
	}
	
	//도서 삭제
	public static void bookDelete(String registNum) {
		boolean result = BookRentalModel.bookDelete(registNum);
		if(result) {
			EndView.printMsg("삭제가 완료 되었습니다.");
		}
		else {
			EndView.printMsg("삭제가 완료 되었습니다.");
		}
	}
	// 대출 가능
	public static void bookUpdate(String registNum){
		boolean result = BookRentalModel.bookUpdate(registNum);
			if(result) {
				EndView.printMsg("대출이 완료되었습니다 ^_^");
			}
	}
		
}



	