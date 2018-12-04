package cn.com.biz;

import java.util.List;

import cn.com.pojo.Flourstore;

public interface FlourstoreBiz {
	public Flourstore findByType(String type);
	public void addflourstore(String type,Float weight);
	public void updateflourstore(String type,Float weight);
	public List<Flourstore> findAll();

}
