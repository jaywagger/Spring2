package test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class TestController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1)
			throws Exception {
		System.out.println("컨트롤러요청");
		
		//응답할 뷰로 넘겨줄 공유데이터 정보와 응답 뷰에 대한 정보를 담고 있는 스프링객체
		ModelAndView mav = new ModelAndView();
		
		//공유데이터 저장
		String data="";
		for (int i = 1; i < 10; i++) {
			data=data+(i+" x "+"9"+"="+(i*9)+"<br/>");
		}
		
		mav.addObject("gugu",data);
		
		//forward할 뷰의 정보를 정의 - 기본이 forward다
		mav.setViewName("test/result");
		return mav;
		
	}

}
