package mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import pojo.Loginlog;

@Mapper
public interface LoginlogMapper {
   //��¼��ǰ��¼��IP�͵ص�
	public int addIpAndCity(Loginlog loginLog);
	public List<Loginlog> getLoginList(String no);
}