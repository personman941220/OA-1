package service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.DepartMapper;
import pojo.Depart;
import service.DepartService;

/**
* @author �������ΰ
* @version ����ʱ�䣺2020��2��24�� ����3:30:00
* ��˵��
*/
@Service
public class DepartServiceImpl implements DepartService {
	
	@Autowired
	DepartMapper mapper;
	@Override
	public int addDepart(Depart depart) {
		// TODO Auto-generated method stub
		return mapper.addDepart(depart);
	}

}
