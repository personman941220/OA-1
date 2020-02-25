package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {
	
	/**
	 * ͨ�õ�ҳ����ת�����������ظ����б�д��ת����
	 * /page_index
	 * /page_clock
	 * @param page
	 * @return
	 */
	@RequestMapping(value="/page_{page}")//���{page}Ҳ������{XXX}�����棬ֻ��һ��ͨ���
	public String toPage(@PathVariable("page")String page){
//		return "/WEB-INF/jsp/"+page+".jsp";//��������ͼ��������ʽ����
		return page;//������ͼ��������ʽ���з��أ�Ĭ����װ��ǰ׺+page+��׺����ʽ���з���
	}
	
//	//��ת����ҳ
//	@RequestMapping(value="/toIndex")
//	public String tiaoIndex(){
//		System.out.println("����toIndex��ת��");
//		return "/WEB-INF/jsp/index.jsp";//�������ڲ�ת������
//	}
//	//��ת������ҳ
//	@RequestMapping(value="/toClock")
//	public String tiaoClock(){
//		System.out.println("����toIndex��ת��");
//		return "/WEB-INF/jsp/clock.jsp";//�������ڲ�ת������
//	}
}
