package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

import message.ResultMessage;
import pojo.Depart;
import service.DepartService;

/**
* @author �������ΰ
* @version ����ʱ�䣺2020��2��24�� ����3:32:14
* ��˵��
*/
@Controller
public class DepartController {
	@Autowired
	DepartService service;
	
	@RequestMapping(value="/addDepart")
	@ResponseBody
	public ResultMessage addDepart(Depart depart){
		ResultMessage message=null;
		int num=service.addDepart(depart);
		if (num>0) {
			message=new ResultMessage();
			message.setResCode(200);
			message.setResInfo("�����ɹ�!");
		} else {
			message=new ResultMessage();
			message.setResCode(500);
			message.setResInfo("����ʧ�ܣ�����ϵ����Ա!");
		}
		return message;
	}

}
