package org.o7planning.hellospringmvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DungChung {
	public Connection cn;
    public Connection KetNoi() throws Exception{
   	 //B1: Xac dinh hqtcsdl
   	    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        cn= DriverManager.getConnection("jdbc:sqlserver://DESKTOP-6C118CM:1433;databaseName=QlSach;user=sa; password=123Aa");
        System.out.println("Da ket noi");
		return cn;
    }
}
