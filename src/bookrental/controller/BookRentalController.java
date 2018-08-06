package bookrental.controller;

import bookrental.dto.BookRentalDTO;
import bookrental.model.BookRentalModel;
import bookrental.view.EndView;


public class BookRentalController{


	//���� �˻�
	public static void getBookRentalDTO(String bookName) {
		BookRentalDTO one = BookRentalModel.getBookRentalDTO(bookName);
		if(one !=null) {
			EndView.printOne(one);
			
		}
		else {
			EndView.printMsg("���");
		}
	}
	
	//book �߰�
	public static void bookInsert(BookRentalDTO bookinfo) {
		BookRentalModel.bookInsert(bookinfo); //******
		System.out.println("���� ���� �߰��� �Ϸ�Ǿ����ϴ�.");
	}
	
	//���� ����
	public static void bookDelete(String registNum) {
		boolean result = BookRentalModel.bookDelete(registNum);
		if(result) {
			EndView.printMsg("������ �Ϸ� �Ǿ����ϴ�.");
		}
		else {
			EndView.printMsg("������ �Ϸ� �Ǿ����ϴ�.");
		}
	}
	// ���� ����
	public static void bookUpdate(String registNum){
		boolean result = BookRentalModel.bookUpdate(registNum);
			if(result) {
				EndView.printMsg("������ �Ϸ�Ǿ����ϴ� ^_^");
			}
	}
		
}



	