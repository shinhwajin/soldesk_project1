package composition;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import frame.FrameBase;
import frame.FrameUserLogin;
import frame.FrameUserSignup;

public class UserSave extends UserInfo {
	public static int num = -1; // 로그인 회원가입 오류 문구 상황 번호
	public static ArrayList<UserSave> userlist = new ArrayList<UserSave>(); // 유저 정보 저장 창고
	public static int nowdate; // 현재 날짜 변수
	public static String id;
	static String[] arr;

	public UserSave() {
	}

	public UserSave(String id, String pw, String pw2, String birthday) { // 유어 정보 저장
		setId(id);
		setPw(pw);
		setPw2(pw2);
		setBirthday(birthday);
	}

	public static void SaveUser() throws ParseException, IOException {

		String signupId = FrameUserSignup.textsignupId.getText();
		String signupPw = FrameUserSignup.textsignupPw.getText();
		String signupPw2 = FrameUserSignup.textsignupPw2.getText();
		String signupBrithday = FrameUserSignup.textsignupBirthday.getText();

		// 입력 받은 생년월일을 현재 날짜와 비교해서 만20세가 넘었는지 체크
		SimpleDateFormat dtFormat = new SimpleDateFormat("yyyyMMdd");
		// 현재날짜
		Date now = new Date(System.currentTimeMillis());
		nowdate = Integer.parseInt(dtFormat.format(now));
		// 받은날짜
		int textdate = 0;
		textdate = Integer.parseInt(signupBrithday);
		textdate = textdate + 200000;// 생년월일에 20년을 더해서 만20살이 넘었는지 확인

		// 회원가입 아이디, 비밀번호 생일 조건

		int j = 1;
		String[] string = new String[signupId.length()];// 아이디에 숫자 영어만 사용가능
		for (int i = 0; i < signupId.length(); i++) {// 입력받은 텍스트를 글자단위로 쪼개서 저장

			string[i] = signupId.substring(i, j);
			j++;
		}
		for (int i = 0; i < string.length; i++) {// 쪼갠 문자를 알파벳 숫자만 가입할 수있게 체크
			int a = (int) (string[i].charAt(0));
			if ((a >= 48 && a <= 81) || (a >= 65 && a <= 90) || (a >= 97 && a <= 122)) {
				num = 100;

			} else {
				num = 99;
				new SignupInfo();
				break;
			}
		}
		if (num == 100) {
			if (signupId.length() < 3 || signupId.length() > 16) {// 아이디 3글자 이상
				num = 1;
				new SignupInfo();

			} else if (signupPw.length() < 4) {// 비밀번호 4글자 이상
				num = 2;
				new SignupInfo();

			} else if (!signupPw.equals(signupPw2)) {// 비밀번호, 비빌번호 확인 불일치
				num = 3;
				new SignupInfo();

			} else if (textdate - nowdate > 0) {// 만20세미만 가입불가
				num = 4;
				new SignupInfo();
			} else if (textdate < 19000101 || textdate > nowdate) {// 생일 오류 가입불가
				num = 7;
				new SignupInfo();
			} else {
				// 아이디 중복 체크
				try {
					// 바이트 단위로 파일읽기
					String filePath = "./src/save.txt"; // 대상 파일
					FileInputStream fileStream = null; // 파일 스트림

					fileStream = new FileInputStream(filePath);// 파일 스트림 생성
					// 버퍼 선언
					byte[] readBuffer = new byte[fileStream.available()];
					while (fileStream.read(readBuffer) != -1) {
					}
					arr = new String(readBuffer).split(" ");
					for (int i = 0; i < arr.length; i += 3) {
						if (arr[i].equals("[" + FrameUserSignup.textsignupId.getText())) {
							num = 8;
							break;
						}
					} // 회원가입 성공하면 정보 저장
					if (num != 8) {
						num = 0;
						userlist.add(new UserSave(signupId, signupPw, signupPw2, signupBrithday));
						try {
							FileOutputStream f = new FileOutputStream("./src/save.txt", true);
							String str = userlist.toString() + "\r\n";
							byte[] byteArr = str.getBytes();// [아이디 비밀번호 생년월일] 형태로 저장
							f.write(' ');
							f.write(byteArr);
							f.close();
							userlist = new ArrayList<UserSave>();
						} catch (Exception e) {
							System.out.println(e);
						}

						fileStream.close(); // 스트림 닫기
					}
					new SignupInfo();
				} catch (Exception e) {
					e.getStackTrace();
				}
			}
		}
		// 회원가입이 성공하던 실패하던 텍스트박스 초기화
		FrameUserSignup.textsignupId.setText("");
		FrameUserSignup.textsignupId.setOpaque(false);
		FrameUserSignup.textsignupPw.setText("");
		FrameUserSignup.textsignupPw.setOpaque(false);
		FrameUserSignup.textsignupPw2.setText("");
		FrameUserSignup.textsignupPw2.setOpaque(false);
		FrameUserSignup.textsignupBirthday.setText("");
		FrameUserSignup.textsignupBirthday.setOpaque(false);
	}

	public void Login() throws IOException {
		String filePath = "./src/save.txt"; // 대상 파일
		FileInputStream fileStream = null; // 파일 스트림
		fileStream = new FileInputStream(filePath);// 파일 스트림 생성
		// 버퍼 선언
		byte[] readBuffer = new byte[fileStream.available()];
		while (fileStream.read(readBuffer) != -1) {
		}
		arr = new String(readBuffer).split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (("[" + FrameUserLogin.textId.getText()).equals(arr[i])) { // 아이디 일치여부
				if (FrameUserLogin.textPw.getText().equals(arr[i + 1])) { // 비밀번호 일치여부
					num = 5; // 로그인 성공
					FrameBase.success = 1; // 로그인 후 모든 메뉴 사용가능
					FrameBase.login = true;
					id = FrameUserLogin.textId.getText();
					break;
				} else {
					num = 6; // 로그인 실패
				}
			} else {
				num = 6;
			}
		}
		new SignupInfo();
	}

	public void PwChange() throws IOException {

		String filePath = "./src/save.txt"; // 대상 파일
		FileInputStream fileStream = null; // 파일 스트림
		fileStream = new FileInputStream(filePath);// 파일 스트림 생성
		// 버퍼 선언
		byte[] readBuffer = new byte[fileStream.available()];
		while (fileStream.read(readBuffer) != -1) {
		}
		arr = new String(readBuffer).split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (("[" + id).equals(arr[i])) { // 아이디 일치여부

				if (PwChange.oldPw.getText().equals(arr[i + 1])) { // 비밀번호 일치여부
					if (!PwChange.newPw.getText().equals(PwChange.newPw2.getText())) {
						num = 21;
					} else {
						num = 22;
						try {
							FileOutputStream f = new FileOutputStream("./src/save.txt", true);
							String str = " " + arr[i] + " " + PwChange.newPw2.getText() + " " + arr[i + 2] + "\r\n";
							byte[] byteArr = str.getBytes();// [아이디 비밀번호 생년월일] 형태로 저장
							f.write(byteArr);
							f.close();
						} catch (Exception e) {
							System.out.println(e);
						}

						fileStream.close(); // 스트림 닫기
					}
					break;
				} else {
					num = 20; // 로그인 실패
				}
			}
		}
		new SignupInfo();
	}

	public void LogOut() {
		FrameBase.login = false;
		num = -1;
		new SignupInfo();
	}

}
