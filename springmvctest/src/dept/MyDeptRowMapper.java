package dept;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/*
 * while(rs.next){
 * DTO dto = new DTO(rs.getString(1)....} 이 부분만 mapRow에 구현
 * list.add(dto)						달라지는 부분
*/
public class MyDeptRowMapper implements RowMapper<DeptDTO>{
	
	@Override
	public DeptDTO mapRow(ResultSet rs, int rowNum) 
			throws SQLException {
		//래코드 한 개를 dto와 mapping해서 리턴
		System.out.println("mapROw=>"+rowNum);
		DeptDTO dept =
				new DeptDTO(rs.getString(1),rs.getString(2));
		
		return dept;
	}
	

}
