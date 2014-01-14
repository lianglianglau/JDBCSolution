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
 * [���ݿ���ɾ�Ĳ�ӿ�]
 */
public interface IDataHandle {
	
	/**
	 * @author aaron
	 * @see
	 * [��ѯ��������]
	 * @param����
	 * @return��Pojo�����List
	 */
	public List<Pojo> findAll() throws SQLException;
	
	/**
	 * @author aaron
	 * @see
	 * [��ѯ��������]
	 * @param��id
	 * @return��Pojo�����List
	 */
	public List<Pojo> findById(Long id) throws SQLException;
	
	/**
	 * @author aaron
	 * @see
	 * [��ѯ��������]
	 * @param��GroupType
	 * @return��Pojo�����List
	 */
	public List<Pojo> findByType(GroupType type) throws SQLException;
	
	/**
	 * @author aaron
	 * @see
	 * [��ѯ��������]
	 * @param��Pojo����
	 * @return��int�͵���Ӧ����
	 */
	public int insert(Pojo pojo) throws SQLException;
	
	/**
	 * @author aaron
	 * @see
	 * [��ѯ��������]
	 * @param��Pojo����
	 * @return��int�͵���Ӧ����
	 */
	public int update(Pojo pojo) throws SQLException;
	
	/**
	 * @author aaron
	 * @see
	 * [��ѯ��������]
	 * @param��Pojo����
	 * @return��int�͵���Ӧ����
	 */
	public int delete(Pojo pojo) throws SQLException;

}
