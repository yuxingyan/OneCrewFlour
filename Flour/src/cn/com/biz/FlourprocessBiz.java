package cn.com.biz;

import cn.com.pojo.Process;

public interface FlourprocessBiz {
	public void addflourprocess(Process process,int userid,String type);
	public int findcount();

}
