package exam;

import java.util.ArrayList;
import java.util.List;

public class UserTable {
	List<User> userList;
	int no;

	UserTable() {
		userList = new ArrayList<>();
		no = 1;
	}

	// 번호, 아이디, 비밀번호, 이름 입력받아 User객체에 담아 리턴
	public User getUser(int no, String id, String pwd, String name) {
		User u = new User();
		u.setNo(no);
		u.setId(id);
		u.setPwd(pwd);
		u.setName(name);
		return u;
	}

	// 아이디, 비밀번호, 이름 입력받아 현재 list에서 아이디가 존재하는지 여부 체크

	public boolean insert(String id, String pwd, String name) {
		if(findUser(id) == null) {
			userList.add(getUser(no++, id, pwd, name));
			return true;
		} else {
			return false;
		}
	}
	

	public User findUser(String id) {
		for(int i=0; i<userList.size(); i++) {
			if(id == userList.get(i).getId()) {
				return userList.get(i);
			}
		}
	}

	public boolean update(String id, String name, String pwd) {
		for(int i=0; i<userList.size(); i++ ) {
			if(id == userList.get(i).getId()) {
				userList.get(i).setId(id);
				userList.get(i).setName(name);
				userList.get(i).setPwd(pwd);
				return true;
			}
		} return false; 
	}
}
