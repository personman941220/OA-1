package service;

import java.util.List;

import pojo.Loginlog;

/**
* @author �������ΰ
* @version ����ʱ�䣺2020��2��23�� ����5:53:42
* ��˵��
*/
public interface LoginLogService {
	public int  addIpAndCity(Loginlog loginLog);
	public List<Loginlog> getLoginList(String no);
}
