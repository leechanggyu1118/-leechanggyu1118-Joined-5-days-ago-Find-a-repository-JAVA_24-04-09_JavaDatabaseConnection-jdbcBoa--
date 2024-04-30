package word;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class WordManager {
	
private	HashMap<String, String> voka = new HashMap<String, String>();
		
	


	public void insertWord(Scanner scan) {
		// 단어등록
		System.out.println("단어등록을 시작합니다.");
		System.out.println("영단어를 입력해주세요.");
		String a = scan.next();		
		System.out.println("해석를 입력해주세요.");
		String b = scan.next();
		voka.put(a, b);		
	}

	public void searchWord(Scanner scan) {
		// 단어검색
		System.out.println("단어검색을 시작합니다.");
		System.out.println("검색할 단어를 입력해주세요.");
		String search = scan.next();
		if(voka.get(search) == null) {
			System.out.println("검색할 단어가 없습니다");
		}else{
			System.out.println(search+" : "+voka.get(search));
		}
		
	}

	public void modifyWord(Scanner scan) {
		// 단어수정
		System.out.println("단어수정을 시작합니다.");
		String modify = scan.next();
		if(voka.get(modify) == null) {
			System.out.println("단어가 존재하지 않습니다.");
		}else {
			voka.remove(modify);
			System.out.println("단어수정을 시작합니다.");
			System.out.println("영단어를 입력해주세요.");
			String a = scan.next();
			System.out.println("해석을 입력해주세요.");
			String b = scan.next();
			voka.put(a, b);
			System.out.println("단어 수정 중 입니다.......");
			System.out.println("수정이 완료되었습니다.");
		}
		
	}

	public void printWord(Scanner scan) {
		// 단어출력
		System.out.println("단어출력을 시작합니다");
		int cnt = 1;
		for(String a : voka.keySet()) {
			System.out.println(cnt+". "+a+" "+voka.get(a));
			cnt++;
		}
	}

	public void fileWord(Scanner scan) throws IOException {
		// 단어파일로 보내기
		FileWriter fw = new FileWriter("writer.txt",true);

		for(String a : voka.keySet()) {
			String data = a+" "+voka.get(a)+"\r\n";
			fw.write(data);
					
		}
		System.out.println("파일로 내보냈습니다.");
		fw.close();
				
	}
	
	
	

}
