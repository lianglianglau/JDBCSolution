/**
 * 
 */
package com.aaron.strategy;

import java.sql.Connection;


/**
 * @author aaron
 * [Oracle ���ݿ�����]
 */
public class OracleStrategy implements Strategy {

	/* (non-Javadoc)
	 * @see com.aaron.util.Strategy#getDBConnection()
	 */
	@Override
	public Connection getDBConnection() {
		// TODO Auto-generated method stub
		System.out.println("-----------------OracleStrategy-------------------");
		return null;
	}

}
