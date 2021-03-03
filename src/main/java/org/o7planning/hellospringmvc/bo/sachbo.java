package org.o7planning.hellospringmvc.bo;

import java.util.ArrayList;
import org.o7planning.hellospringmvc.bean.sachbean;

public class sachbo {
	public ArrayList<sachbean> getsach(){
		 ArrayList<sachbean> ds= new ArrayList<sachbean>();
		 ds.add(new sachbean("s1", "csdl1", (long)1000, (long)123, "img/b1.jpg", "tin"));
		 ds.add(new sachbean("s2", "csdl2", (long)1000, (long)123, "img/b2.jpg", "tin"));
		 ds.add(new sachbean("s3", "csdl3", (long)1000, (long)123, "img/b3.jpg", "tin"));
		 ds.add(new sachbean("s4", "csdl4", (long)1000, (long)123, "img/b4.jpg", "toan"));
		 ds.add(new sachbean("s5", "csdl5", (long)1000, (long)123, "img/b5.jpg", "toan"));
		 ds.add(new sachbean("s6", "csdl6", (long)1000, (long)123, "img/b6.jpg", "ly"));
		 ds.add(new sachbean("s7", "csdl7", (long)1000, (long)123, "img/b7.jpg", "ly"));
		 ds.add(new sachbean("s8", "csdl8", (long)1000, (long)123, "img/b8.jpg", "tin"));
		 return ds;
		}
	public ArrayList<sachbean> TimSach(String key){
		ArrayList<sachbean> tam=new ArrayList<sachbean>();
		sachbo sb = new sachbo();
		for(sachbean s: sb.getsach()) 
			if(s.getTensach().toLowerCase().contains(key.toLowerCase()))
				tam.add(s);
			return tam;
	}
	public ArrayList<sachbean> TimSachTheoMa(String maloai){
		ArrayList<sachbean> tam=new ArrayList<sachbean>();
		sachbo sb = new sachbo();
		for(sachbean s: sb.getsach()) 
			if(s.getMaloai().trim().equalsIgnoreCase(maloai.trim()))
				tam.add(s);
			return tam;
	}
}
