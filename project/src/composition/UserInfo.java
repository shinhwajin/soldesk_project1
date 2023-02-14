package composition;

public class UserInfo {

	private String id;
	private String pw;
	private String pw2;
	private String birthday;

	@Override
	public String toString() {
		return  id + " " + pw + " " + birthday; // 유저 정보 외부파일에 저장 후 찾기 위한 설정
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getPw2() {
		return pw2;
	}

	public void setPw2(String pw2) {
		this.pw2 = pw2;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

}
