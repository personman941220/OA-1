package service.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mapper.LoginlogMapper;
import pojo.Loginlog;
import service.LoginLogService;

/**
* @author �������ΰ
* @version ����ʱ�䣺2020��2��23�� ����5:54:11
* ��˵��
*/
@Service
public class LoginLogServiceImpl implements LoginLogService {
	@Autowired
	LoginlogMapper mapper;

	@Override		//��¼�㼣����t_loginlog��
	public int addIpAndCity(Loginlog loginLog) {
		return mapper.addIpAndCity(loginLog);
	}
	
	@Override		//��ѯ��¼�㼣
	public List<Loginlog> getLoginList(String no) {
		// TODO Auto-generated method stub
		return mapper.getLoginList(no);
	}
}
