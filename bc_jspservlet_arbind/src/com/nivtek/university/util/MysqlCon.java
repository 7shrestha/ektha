package com.nivtek.university.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlCon {
		static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		static final String DB_URL = "jdbc:mysql://localhost/bootcamp";

		static final String USER = "root";
		static final String PASS = "root";

		public  static Connection connectDb() throws Exception{
			Connection conn = null;
				Class.forName(JDBC_DRIVER);

				conn = DriverManager.getConnection(DB_URL, USER, PASS);

			return conn;
		}
		
//		public  static PreparedStatement connectDb(String sql) throws Exception{
//			Connection conn = null;
//			PreparedStatement stmt = null;
//			Class.forName(JDBC_DRIVER);
//			
//			conn = DriverManager.getConnection(DB_URL, USER, PASS);
//			
//			stmt = conn.prepareStatement(sql);
//			
//			return stmt;
//		}
}
