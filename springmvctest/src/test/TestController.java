package test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class TestController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1)
			throws Exception {
		System.out.println("��Ʈ�ѷ���û");
		
		//������ ��� �Ѱ��� ���������� ������ ���� �信 ���� ������ ��� �ִ� ��������ü
		ModelAndView mav = new ModelAndView();
		
		//���������� ����
		String data="";
		for (int i = 1; i < 10; i++) {
			data=data+(i+" x "+"9"+"="+(i*9)+"<br/>");
		}
		
		mav.addObject("gugu",data);
		
		//forward�� ���� ������ ���� - �⺻�� forward��
		mav.setViewName("test/result");
		return mav;
		
	}

}
