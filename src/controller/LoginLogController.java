package controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Emp;
import pojo.Loginlog;
import service.LoginLogService;

/**
* @author �������ΰ
* @version ����ʱ�䣺2020��2��23�� ����6:00:13
* ��˵��
*/
@Controller
public class LoginLogController {
	@Autowired
	LoginLogService logService;
	//��ѯ��¼�㼣
	@RequestMapping(value="/getLoginList")
	@ResponseBody
	public List<Loginlog> getLoginList(HttpSession session) {
		//ȡ�õ�¼Ա����,ͨ��sessionȡ��Ա���ţ�loginEmp�ڵ�¼��ʱ��ŵ���session����
		String LogNo=((Emp)session.getAttribute("loginEmp")).getNo();
		return logService.getLoginList(LogNo);
	}
}
