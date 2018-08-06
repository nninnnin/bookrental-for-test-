package bookrental.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import bookrental.controller.BookRentalController;
import bookrental.dto.BookRentalDTO;



public class StartView {
	
	static void search() {
	//도서검색
			System.out.println("-----도서 정보------");
			BookRentalController.getBookRentalDTO("시간관리학");
	}
	static void add() {		
			// 도서 추가
			System.out.println("-----도서 추가------");
			BookRentalDTO newbook = new BookRentalDTO("보존서고","EM920820","이동규 자서전","여운중","여운출판사","111.1212",true);
			BookRentalController.bookInsert(newbook);
	}
	static void delete() {
			// 도서 삭제
			System.out.println("-----도서 삭제------");
			BookRentalController.bookDelete("EM920820");
			System.out.println("-----도서 삭제 확인------");
			BookRentalController.getBookRentalDTO("이동규 자서전");
	}		
	static void rent() {
			// 도서 대출
			System.out.println("-----도서 대출------");
			BookRentalController.getBookRentalDTO("시간관리학");
			BookRentalController.bookUpdate("EM49");
			BookRentalController.getBookRentalDTO("시간관리학");	 
	}
	
	
public static void main(String[] args) {
		System.out.println("1. 도서검색" + "   " + "2. 도서추가" + "   " 
				+ "3. 도서삭제" + "   " + "4. 도서대출" + "   ");
		
		BufferedReader in 
		= new BufferedReader(new InputStreamReader(System.in));

		try {
			String data = in.readLine();
			if (data.equals("1")) {
				search();
			}
			else if(data.equals("2")) {
				add();
			}
			else if(data.equals("3")) {
				delete();
			}
			else if(data.equals("4")) {
				rent();
			}
			else {
				System.out.println("끄져임마");
			}
		} catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				in.close(); // 사용했던 시스템 자원을 반환하기
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		


}//main method 끝
	

	}//class 끝
	