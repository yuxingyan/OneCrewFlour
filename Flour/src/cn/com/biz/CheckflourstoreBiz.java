package cn.com.biz;

import java.util.List;

import cn.com.pojo.Checkstore;

public interface CheckflourstoreBiz {
	public void addcheckflouestore(Checkstore checkstore);
	public Checkstore findByName(String type);
	public void updatecheckflouestore(Checkstore checkstore);
	public List<Checkstore> findAll();

}
