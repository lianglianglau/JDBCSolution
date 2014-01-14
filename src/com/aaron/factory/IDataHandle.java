/**
 * 
 */
package com.aaron.factory;

import java.sql.SQLException;
import java.util.List;

import com.aaron.model.GroupType;
import com.aaron.model.Pojo;

/**
 * @author aaron
 * [数据库增删改查接口]
 */
public interface IDataHandle {
	
	/**
	 * @author aaron
	 * @see
	 * [查询所有数据]
	 * @param：无
	 * @return：Pojo对象的List
	 */
	public List<Pojo> findAll() throws SQLException;
	
	/**
	 * @author aaron
	 * @see
	 * [查询所有数据]
	 * @param：id
	 * @return：Pojo对象的List
	 */
	public List<Pojo> findById(Long id) throws SQLException;
	
	/**
	 * @author aaron
	 * @see
	 * [查询所有数据]
	 * @param：GroupType
	 * @return：Pojo对象的List
	 */
	public List<Pojo> findByType(GroupType type) throws SQLException;
	
	/**
	 * @author aaron
	 * @see
	 * [查询所有数据]
	 * @param：Pojo对象
	 * @return：int型的响应代码
	 */
	public int insert(Pojo pojo) throws SQLException;
	
	/**
	 * @author aaron
	 * @see
	 * [查询所有数据]
	 * @param：Pojo对象
	 * @return：int型的响应代码
	 */
	public int update(Pojo pojo) throws SQLException;
	
	/**
	 * @author aaron
	 * @see
	 * [查询所有数据]
	 * @param：Pojo对象
	 * @return：int型的响应代码
	 */
	public int delete(Pojo pojo) throws SQLException;

}
