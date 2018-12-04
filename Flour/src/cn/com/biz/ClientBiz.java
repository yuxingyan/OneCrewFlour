package cn.com.biz;

import java.util.List;

import cn.com.pojo.Client;



public interface ClientBiz {
	public Client addclient(Client client);
	public List<Client> findAll();
	public Client findById(int clientid);
	public String deleteclient(int clientid);
	public void update(int clientid,String clientname,String address,String idcard,String phone,String homephone);
	public Client findByName(String clientname);
}
