package p2023_08_01;

// VO(Value Object) 클래스<- (BoardVO클래스)
// DTO(Data Transfer Object) 클래스 <- (BoardVO클래스)

public class BoardVO extends Object{ //Object는 최상위 클래스 
//extends Object를 지우더라도 BoardVO클래스가 묵시적으로 내부적으로 Object 상속을 받는다 
//(사용자정의 클래스나 api제공되는 클래스도  묵시적으로 내부적으로 Object 상속을 받는다) 
	
	//멤버변수(필드값 저장)
	private String register;
	private String subject;
	private String email;
	private String content;
	private String passwd;
	
	//생성자 (필드의 접근제어자가 private인경우 생성자의 매개변수로 전달된값이 필드 값에 초기화(할당))
	public BoardVO(String register, String subject, String email,
			String content, String passwd) {
		super();
		this.register = register;
		this.subject = subject;
		this.email = email;
		this.content = content;
		this.passwd = passwd;
	}

	//get() 메소드를 호출한곳에 값을돌려줌
	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public String getSubject() {
		return subject;
	}

	//set() 값을 수정 (생성자보다는 set()로 많이사용)
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "작성자:"+register+",이메일:"+email+",제목:"+subject+",글내용:"+content;
	}
	
}
