package bookrental.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import bookrental.controller.BookRentalController;
import bookrental.dto.BookRentalDTO;



public class StartView {
	
	static void search() {
	//�����˻�
			System.out.println("-----���� ����------");
			BookRentalController.getBookRentalDTO("�ð�������");
	}
	static void add() {		
			// ���� �߰�
			System.out.println("-----���� �߰�------");
			BookRentalDTO newbook = new BookRentalDTO("��������","EM920820","�̵��� �ڼ���","������","�������ǻ�","111.1212",true);
			BookRentalController.bookInsert(newbook);
	}
	static void delete() {
			// ���� ����
			System.out.println("-----���� ����------");
			BookRentalController.bookDelete("EM920820");
			System.out.println("-----���� ���� Ȯ��------");
			BookRentalController.getBookRentalDTO("�̵��� �ڼ���");
	}		
	static void rent() {
			// ���� ����
			System.out.println("-----���� ����------");
			BookRentalController.getBookRentalDTO("�ð�������");
			BookRentalController.bookUpdate("EM49");
			BookRentalController.getBookRentalDTO("�ð�������");	 
	}
	
	
public static void main(String[] args) {
		System.out.println("1. �����˻�" + "   " + "2. �����߰�" + "   " 
				+ "3. ��������" + "   " + "4. ��������" + "   ");
		
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
				System.out.println("�����Ӹ�");
			}
		} catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				in.close(); // ����ߴ� �ý��� �ڿ��� ��ȯ�ϱ�
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		


}//main method ��
	

	}//class ��
	