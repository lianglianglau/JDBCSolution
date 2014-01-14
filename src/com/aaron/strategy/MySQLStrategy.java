/**
 * 
 */
package com.aaron.strategy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.aaron.util.DBValue;

/**
 * @author aaron [MySQL 数据库连接]
 */
public class MySQLStrategy implements Strategy {

	private Connection con = null;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aaron.util.Strategy#getDBConnection()
	 */
	@Override
	public Connection getDBConnection() {
		// TODO Auto-generated method stub
		System.out.println("-----------------MySQLStrategy-------------------");
		try {
			Class.forName(DBValue.driver);
			con = DriverManager.getConnection(DBValue.url,DBValue.username,DBValue.password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("出错！找不到数据库驱动");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("出错！数据库连接失败！");
		}finally{
			if(con!=null){
			System.out.println("-----------MySQL数据库连接成功---------------");
			}else{
				System.out.println("-----------MySQL数据库连接失败---------------");
			}
			return con;
		}
			
		}

	}

