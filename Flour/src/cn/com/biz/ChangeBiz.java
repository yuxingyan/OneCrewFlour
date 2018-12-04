package cn.com.biz;

import java.util.List;

import cn.com.pojo.Change;

public interface ChangeBiz {
	public void addchange(Change change);
	public List<Change> findAll();

}
