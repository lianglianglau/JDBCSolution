/**
 * 
 */
package com.aaron.strategy;

import java.sql.Connection;


/**
 * @author aaron
 * [²ßÂÔ³¡¾°]
 */
public class DBContext {

	Strategy strategy;
	
	public DBContext(Strategy strategy){
		this.strategy = strategy;
	}

	/**
	 * @return the strategy
	 */
	public Connection getConnection() {
		return strategy.getDBConnection();
	}
	
}
