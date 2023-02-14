package SoolVO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserInfo {
	
	//사용자 정보
	public static Map<String, MyInfo> UserInfoMap = new HashMap<>();

	public static MyInfo getUserInfoMap(String userId) {
		// cartMap.get(userId);
		return UserInfoMap.get(userId);
	}

	public UserInfo(String userId, MyInfo m) {
		if (UserInfoMap.get(userId) == null) {
			init(userId,m);
		}
	}

	private void init(String userId, MyInfo m) {
		UserInfoMap.put(userId, m);
	}
	
	

}
