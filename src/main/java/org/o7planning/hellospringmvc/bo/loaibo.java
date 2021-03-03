package org.o7planning.hellospringmvc.bo;

import java.util.ArrayList;
import org.o7planning.hellospringmvc.bean.LoaiBean;

public class loaibo {
	public ArrayList<LoaiBean> getLoai(){
		   ArrayList<LoaiBean> ds= new ArrayList<LoaiBean>();
		   ds.add(new LoaiBean("tin", "Tin học"));
		   ds.add(new LoaiBean("toan", "Toán"));
		   ds.add(new LoaiBean("ly", "Lý"));
		   ds.add(new LoaiBean("hoa", "Hóa"));
		   return ds;
		   }

}
