package multi.erp.emp;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	@Qualifier("empDao")
	EmpDAO dao;
	
	@Override
	public MemberVO login(MemberVO loginUser) {
		System.out.println("EmpServiceImpl 로그인 메소드");
		MemberVO user = dao.login(loginUser);
		return user;
	}
	@Override
	public ArrayList<MemberVO> getTreeEmpList(String deptno) {
		return null;
	}

	@Override
	public int insert(MemberVO user, MultipartFile file, String realpath, String filename) {
		return 0;
	}

	@Override
	public boolean idCheck(String id) {
		return false;
	}

	@Override
	public ArrayList<MemberVO> getMemberList() {
		return null;
	}

	@Override
	public int delete(String id) {
		return 0;
	}

	@Override
	public MemberVO read(String id) {
		return null;
	}

	@Override
	public ArrayList<MemberVO> search(String column, String search, String pass) {
		return null;
	}

	@Override
	public int update(MemberVO user) {
		return 0;
	}


}
