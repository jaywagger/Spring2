package multi.erp.emp;
//emp 테이블에서 작성하는 모든 내용에 대한 컨트롤러
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpController {
	@RequestMapping("login.do")
	public String login() {
		return "login";
	}
}
