/**
 * 
 */
package com.aaron.strategy;

import java.sql.Connection;

/**
 * @author aaron
 * [���������ݿ����Ӳ���ģʽ]
 */
public interface Strategy {

	public Connection getDBConnection();
}
