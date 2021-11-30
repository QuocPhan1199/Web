package org.o7planning.hellospringmvc.bo;

import java.util.ArrayList;

import org.o7planning.hellospringmvc.bean.KhachHangbean;
import org.o7planning.hellospringmvc.dao.KhachHangDAO;

public class KhachHangBo {
	KhachHangDAO dao = new KhachHangDAO();
	public KhachHangbean KTdn(String tk, String mk) {
		return dao.ktdn(tk, mk);
	}
	public ArrayList<KhachHangbean> getKH(){
		  return dao.getKH();
	  }
	public ArrayList<KhachHangbean> TimChung(String key){
		   ArrayList<KhachHangbean> ds = dao.getKH();
		   ArrayList<KhachHangbean> tam = new ArrayList<KhachHangbean>();
		   System.out.println(ds.size());
		   for(KhachHangbean s: ds)
		   {
			   if(s.getTenkh().toLowerCase().trim().contains(key.toLowerCase().trim())  ) {
				   tam.add(s);
			   }
		   }
		   System.out.println(tam.size());
		return tam;
	   }
}
