package multi.erp.emp;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
//emp 테이블에서 작성하는 모든 내용에 대한 컨트롤러
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpController {
	@Autowired
	EmpService service;
	//로그인 페이지를 보기위한 요청
	@RequestMapping(value="/emp/login.do", method=RequestMethod.GET)
	public String loginPage() {
		return "login";
	}
	//로그인 처리를 위한 요청
	//매개변수가 VO객체이면 스프링MVC 내부의클래스인  DispatcherServlet에서 자동으로 입력된
	//파라미터들을 추출해서 VO객체를 만들고 setter메소드의 값으로 전달한다.
	@RequestMapping(value="/emp/login.do",method=RequestMethod.POST)
	public ModelAndView login(MemberVO loginUserInfo,
								HttpServletRequest request) {
										//이건 매개변수
		System.out.println("========Controller 로그인 메서드: "
				+ "로그인하기 위해 사용자가 입력한 값============"+loginUserInfo);
		ModelAndView mav = new ModelAndView();
		//user => db연동 후 로그인된 사용자의 정보
		//loingUserInfo => 로그인 하기 위해서 사용자가 입력한 데이터를 VO로  만든 객체
		MemberVO user = service.login(loginUserInfo);
		System.out.println("=======로그인 성공 후 조회된 레코드로 만들어진 값======="+user);
		//로그인한 사용자의 정보를 세션에 저장
		//세션을 사용하기 위해서 매개변수에 HttpServletRequest를 정의
	/*	1. 세션을 생성
			=>getSession()를 이용해서 세션을 생성
			=>무족건 생성해서 리턴 (처음 세션을 만들 떄 사용
	*/	String viewName ="";
		if(user!=null) {
			//로그인 성공시
			HttpSession ses = request.getSession();
		//2. 세션에 데이터 공유
			ses.setAttribute("user", user);
			viewName = "index";
		}else {
			//로그인 실패시
			viewName = "login";
		}
		HttpSession ses =  request.getSession();
		
	/*	mav.addObject("user",user);
		mav.setViewName("index");*/
		mav.setViewName(viewName);
		return mav;
	}
	@RequestMapping("/emp/logout.do")
	public String logout(HttpSession session) {
		//로그아웃 처리를 위해 매개변수로 session을 받도록 처리
		//사용하던 세션객체가 있으면 사용하던 세션객체가 전달된다.
		if(session!=null) {
			//null이 아니라 세션이 존재하면 세션객체가 전달된다.
			session.invalidate();
		}
		return "redirect:/index.do";
		
	}
}
