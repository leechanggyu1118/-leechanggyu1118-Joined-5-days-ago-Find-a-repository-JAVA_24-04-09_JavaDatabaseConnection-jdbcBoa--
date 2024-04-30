package new01;

public class New01 {

	public static void main(String[] args) {
		/* 홍길동 주민등록번호 881122-1234567이다
		 * 출력형태 => 생년월일 : 881122, 성별 : 남(1,3)
		 * 콘솔에 출력
		 */
		
		String pin = "881122-1234567";
		String birth = pin.substring(0, pin.indexOf('-'));
		System.out.println("생년월일 : "+birth);
		
		String ch = pin.substring(pin.indexOf("-")+1,8);
		System.out.println(ch);
		
		if(ch.equals("1") || ch.equals("3")) {
			System.out.println("남");
		}else {
			System.out.println("여");
		}
				
		
	}

}
