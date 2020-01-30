package dept;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//내가 만드는 사용자 정의 DAO 클래스
//bean으로 인식이 되어야 한다. 그럴 때 @Repository

@Repository
public class DeptDAOImpl {
	@Autowired
	JdbcTemplate mytemplate;
	
	public int count() {
		return mytemplate.queryForObject
				("select count(*) from dept", Integer.class);
	}
	//insert 만들기
	public int insert(String deptono, String deptname) {
		String sql = "insert into dept(deptno, deptname) values(?,?)";
		int result = mytemplate.update(sql, deptono, deptname);
		return result;
	}
	//update 만들기
	public int update(String deptono, String deptname) {
		String sql = "update dept set deptname=? where deptno=?";
		int result = mytemplate.update(sql, deptname, deptono);
		return result;
	}
	//select 만들기
	public List<DeptDTO> selectAll(){
		return 	mytemplate.query("select deptno, deptname from dept", 
						new MyDeptRowMapper()); 
	}
	
	
}
