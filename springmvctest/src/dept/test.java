package dept;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		//erp.xml에 정의한 정보를 불러온다. connection &statement
		ApplicationContext factory = 
				new GenericXmlApplicationContext("config/erp.xml");
		
		deptServiceImpl service = 
				factory.getBean("deptService", deptServiceImpl.class);
		
		System.out.println("전체 부서 갯수: " + service.count());
		
		/*
		System.out.println("삽입성공");
		System.out.println("삽입성공: " + service.insert("exam01", "framework"));
		*/
		
		System.out.println("수정성공");
		System.out.println("수정성공" + service.update("exam01", "부서"));
		
		/*System.out.println(service.selectAll());*/
		List<DeptDTO> list = service.selectAll();
		for (int i = 0; i < list.size(); i++) {
			DeptDTO dept = list.get(i);
			System.out.println(dept.getDeptno()+":"+
			dept.getDeptname());
			
		}

	}
}