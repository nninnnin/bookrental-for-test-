package bookrental.model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import bookrental.dto.BookRentalDTO;


public class BookRentalModel {

   static ArrayList<BookRentalDTO> totalbooks = new ArrayList<BookRentalDTO>();

   static {
      BufferedReader totalbook = null;
      try {
         totalbook = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\ITStudy\\1.java\\data.csv")));
         String data = totalbook.readLine();
         String[] temp = null;

         while ((data = totalbook.readLine()) != null) {
            temp = data.split(",");
            totalbooks.add(new BookRentalDTO(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5],true));
         }
      } 
      catch (Exception e) {
         e.printStackTrace();
      } 
      finally {
         try {
            totalbook.close();
         } catch (IOException e) {
            e.printStackTrace();
         }
      }
   }
   
   
   
   //검색
	public static BookRentalDTO getBookRentalDTO(String bookName) {
		BookRentalDTO project = null;
			for (int i = 0; i < totalbooks.size(); i++) {
					if (totalbooks.get(i).getBookName().equals(bookName)) {
							project = totalbooks.get(i);
						break;
					}
				}
				return project;
			}

	//book 추가
	public static void bookInsert(BookRentalDTO bookinfo) {
		totalbooks.add(bookinfo); //******
	}
	
	//book 삭제
	public static boolean bookDelete(String registNum) {
		
		boolean okay = false;
		int count = totalbooks.size() ;
		for (int i = 0; i < count; i++) {
			if (totalbooks.get(i).getRegistNum().equals(registNum)) {
				totalbooks.remove(i); 
				okay = true;
			} 
		}
		return okay;
	}
	// 대출 
	public static boolean bookUpdate(String registNum){
		boolean okay = false;
		
		for(int i =0; i < totalbooks.size(); i++) {
			if(totalbooks.get(i).getRegistNum().equals(registNum) && totalbooks.get(i).getCheckOut() == true) {
					totalbooks.get(i).setCheckOut();
					okay = true;
			}
		}
		return okay;
}
				

   public static void main(String[] args) {
      System.out.println(totalbooks.get(1));
   }

}