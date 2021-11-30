package org.o7planning.hellospringmvc.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.o7planning.hellospringmvc.bean.KhachHangbean;

public class KhachHangDAO {
	public KhachHangbean ktdn(String username, String password) {
		Connection cn = null;
		DungChung dc = new DungChung();
		try {
			cn = dc.KetNoi();
			String sql = "select * from KhachHang where tendn='"+username+"'and  pass='"+password+"'" ;
			
			PreparedStatement smt = cn.prepareStatement(sql);
			/*
			 * smt.setString(1, username); smt.setString(2, password);
			 */
			ResultSet rs = smt.executeQuery();
			
				if(rs.next() == true)
				{
					KhachHangbean bean = new KhachHangbean(rs.getInt(1), rs.getString(2), rs.getString(3),
							rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
					return bean;
				}
				else {
					return null;
				}	
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				cn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	
	public ArrayList<KhachHangbean> getKH() {
			DungChung dc = new DungChung();
		   ArrayList<KhachHangbean> ds= new ArrayList<KhachHangbean>();
		   Connection con = null;
		   try {
			con = dc.KetNoi();
			String sql = "SELECT kh.hoten, kh.tendn, kh.diachi, kh.email, kh.sodt FROM KhachHang as kh";
			Statement smt =  con.createStatement();
			ResultSet rs = smt.executeQuery(sql);
			while(rs.next())
			{
				KhachHangbean bean = new KhachHangbean(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				ds.add(bean);
			}
			return ds;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		   return null;
	   }


	


	 
}
