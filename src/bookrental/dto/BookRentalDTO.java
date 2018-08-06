package bookrental.dto;



public class BookRentalDTO {
      
      //멤버변수 선언
      public String referRoom;
      public String registNum;
      public String bookName;
      public String writer;
      public String publisher;
      public String callNum;
      public boolean checkout;
      
      //기본생성자
      public BookRentalDTO() {}
      
      //2번째 생성자
      public BookRentalDTO(String referRoom, String registNum, String bookName, String writer, String publisher,String callNum, boolean checkout) {
         super();
         this.referRoom = referRoom;
         this.registNum = registNum;
         this.bookName = bookName;
         this.writer = writer;
         this.publisher = publisher;
         this.callNum = callNum;
         this.checkout = true;
      }
      
      
      public String getReferRoom() {
         return referRoom;
      }

      public void setReferRoom(String referRoom) {
         this.referRoom = referRoom;
      }

      public String getRegistNum() {
         return registNum;
      }

      public void setRegistNum(String registNum) {
         this.registNum = registNum;
      }

      public String getBookName() {
         return bookName;
      }

      public void setBookName(String bookName) {
         this.bookName = bookName;
      }

      public String getWriter() {
         return writer;
      }

      public void setWriter(String writer) {
         this.writer = writer;
      }

      public String getPublisher() {
         return publisher;
      }

      public void setPublisher(String publisher) {
         this.publisher = publisher;
      }

      public String getCallNum() {
         return callNum;
      }

      public void setCallNum(String callNum) {
         this.callNum = callNum;
      }
      
      public boolean getCheckOut() {
    	  return checkout;
      }
      
      public boolean setCheckOut() {
    	  if(this.checkout == true) {
    		  this.checkout = false;
    	  }
/*    	  else {
    		  this.checkout = true;
    	  }*/
    	  return checkout;
      }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BookRentalDTO [referRoom=");
		builder.append(referRoom);
		builder.append(", registNum=");
		builder.append(registNum);
		builder.append(", bookName=");
		builder.append(bookName);
		builder.append(", writer=");
		builder.append(writer);
		builder.append(", publisher=");
		builder.append(publisher);
		builder.append(", callNum=");
		builder.append(callNum);
		builder.append(", checkout=");
		builder.append(checkout);
		builder.append("]");
		return builder.toString();
	}
      

    
      
      
}////

      

