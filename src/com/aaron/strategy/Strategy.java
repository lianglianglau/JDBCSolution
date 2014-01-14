/**
 * 
 */
package com.aaron.strategy;

import java.sql.Connection;

/**
 * @author aaron
 * [各类型数据库连接策略模式]
 */
public interface Strategy {

	public Connection getDBConnection();
}
