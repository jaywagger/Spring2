package main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("/index.do")
	public String index() {
		return "index";//tiles설정 파일에 등록된 view의 이름
	}
	@RequestMapping("/emp/login.do")
	public String login() {
		return "login";//tiles설정 파일에 등록된 view의 이름
	}
}
