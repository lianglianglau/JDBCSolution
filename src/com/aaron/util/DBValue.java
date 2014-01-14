/**
 * 
 */
package com.aaron.util;

/**
 * @author aaron
 * @see
 * [数据库相关参数]
 * [driver]数据库服务器连接驱动
 * [url]数据库服务器地址
 * [username]数据库服务器用户名
 * [password]数据库服务器密码
 */
public class DBValue {

	//mySQL
	public static final String url = "jdbc:mysql://localhost:3306/test";
	public static final String username = "root";
	public static final String password = "123456";
	public static final String driver = "com.mysql.jdbc.Driver";
	
	//SQL Server
//	public static final String sql_url = "jdbc:microsoft:sqlserver://192.168.9.22:1433;DatabaseName=DBNme";
	public static final String sql_url = "jdbc:sqlserver://192.168.9.22:1433;DatabaseName=DBNme";//2008版本的用这个
	public static final String sql_username = "root";
	public static final String sql_password = "123456";
	public static final String sql_driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	
	//Oracle
	public static final String oracle_url = "jdbc:oracle:thin:@192.168.9.45:1521:qbxx";
	public static final String oracle_username = "root";
	public static final String oracle_password = "123456";
	public static final String oracle_driver = "oracle.jdbc.driver.OracleDriver";
}
