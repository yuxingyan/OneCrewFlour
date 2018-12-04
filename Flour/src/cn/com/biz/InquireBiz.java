package cn.com.biz;


import java.sql.Date;
import java.util.List;

public interface InquireBiz {
	public List instore(String d1,String d2);
	public List useflour(String d1,String d2);
	public List process(String d1,String d2);
	public List managestore(String d1,String d2);
	public List buy(String d1,String d2);
	public List sale(String d1,String d2);

}
