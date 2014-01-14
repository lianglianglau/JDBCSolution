/**
 * 
 */
package com.aaron.strategy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.aaron.util.DBValue;

/**
 * @author aaron [MySQL ���ݿ�����]
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
			System.out.println("�����Ҳ������ݿ�����");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("�������ݿ�����ʧ�ܣ�");
		}finally{
			if(con!=null){
			System.out.println("-----------MySQL���ݿ����ӳɹ�---------------");
			}else{
				System.out.println("-----------MySQL���ݿ�����ʧ��---------------");
			}
			return con;
		}
			
		}

	}

