package member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class SearchController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) 
			throws Exception {
		/*req.setCharacterEncoding("euc-kr"); //�ѱ� �� ����
		 * ������ �Ź� �̷� �۾��� ��ȿ����. web.xml���� �ѱ� ��������
*/		String search =req.getParameter("search");
		System.out.println("�˻���: "+search);
		return new ModelAndView("test/Index");
	}

}
