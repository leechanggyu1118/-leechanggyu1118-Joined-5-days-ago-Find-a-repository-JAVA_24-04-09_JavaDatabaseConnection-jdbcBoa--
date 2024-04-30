package board;


public class Board {
	/* Board class 생성
	 * 번호, 제목, 내용, 작성자, 작성일
	 * - 번호 : 객체 생성 시 자동으로 증가
	 * - 작성일 : 오늘날짜로 자동생성
	 * - 번호가 일치하면 같은 게시물로 인지 equals 추가
	 * 
	 * -menu
	 * 1.게시글추가 | 2.게시글검색 | 3.게시글수정 
	 * 4.게시글삭제 | 5.게시글출력 | 6.종료
	 * 
	 */
	private int num;
	private String title;
	private String text;
	private String writer;
	private String date;

	
	public Board() {};
	
	public Board(int num, String title, String text, String writer, String date) {
		this.num = num;
		this.title = title;
		this.text = text;
		this.writer = writer;
		this.date = date;
		
		
	}



	@Override
	public String toString() {
		return "게시판 [번호 = " + num + ", 제목 = " + title + ", 내용 = " + text + ", 작성자 = " + writer + ", 날짜 = " + date
				+ "]";
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	



	
}
