package cn.com.biz;

import java.util.List;

import cn.com.pojo.Clientstore;

public interface ClientstoreBiz {
	public  void addclientstore( int clientid,String type,Float weight);
	public Clientstore findByIdType(int clientid,String type);
	public void updateclientstore(int clientid,String type,Float weight);
	public List<Clientstore> findAll();
	public List<Clientstore> findById(int clientid);

}
