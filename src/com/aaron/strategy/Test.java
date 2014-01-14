/**
 * 
 */
package com.aaron.strategy;

/**
 * @author aaron
 * [对策略模式实现各种数据库连接的测试]
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * MySQLStrategy
		 */
		DBContext context = new DBContext(new MySQLStrategy());
		context.getConnection();
		
		/*
		 * OracleStrategy
		 */
		DBContext context2 = new DBContext(new OracleStrategy());
		context2.getConnection();
		
		/*
		 * SQLStrategy
		 */
		DBContext context3 = new DBContext(new SQLStrategy());
		context3.getConnection();
		
	}

}
