package member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class SearchController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) 
			throws Exception {
		/*req.setCharacterEncoding("euc-kr"); //한글 안 깨짐
		 * 하지만 매번 이런 작업은 비효율적. web.xml에서 한글 설정하자
*/		String search =req.getParameter("search");
		System.out.println("검색어: "+search);
		return new ModelAndView("test/Index");
	}

}
