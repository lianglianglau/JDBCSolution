/**
 * 
 */
package com.aaron.util;

/**
 * @author aaron
 * @see
 * [���ݿ���ز���]
 * [driver]���ݿ��������������
 * [url]���ݿ��������ַ
 * [username]���ݿ�������û���
 * [password]���ݿ����������
 */
public class DBValue {

	//mySQL
	public static final String url = "jdbc:mysql://localhost:3306/test";
	public static final String username = "root";
	public static final String password = "123456";
	public static final String driver = "com.mysql.jdbc.Driver";
	
	//SQL Server
//	public static final String sql_url = "jdbc:microsoft:sqlserver://192.168.9.22:1433;DatabaseName=DBNme";
	public static final String sql_url = "jdbc:sqlserver://192.168.9.22:1433;DatabaseName=DBNme";//2008�汾�������
	public static final String sql_username = "root";
	public static final String sql_password = "123456";
	public static final String sql_driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	
	//Oracle
	public static final String oracle_url = "jdbc:oracle:thin:@192.168.9.45:1521:qbxx";
	public static final String oracle_username = "root";
	public static final String oracle_password = "123456";
	public static final String oracle_driver = "oracle.jdbc.driver.OracleDriver";
}
