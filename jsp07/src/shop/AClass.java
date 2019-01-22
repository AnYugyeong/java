package shop;

public class AClass {

	public static void main(String[] args) {
		
		String id = "root";
		String pw = "1234";
		String name = "admin";
		String tel = "011";
		
		MemberDTO dto = new MemberDTO();
		dto.setId(id);
		dto.setPw(pw);
		dto.setName(name);
		dto.setTel(tel);

		// 키 포인트 -> 클래스를 매개변수로 간단하게 넘겨줌
		BClass b = new BClass();
		b.print(dto);
	}
}
