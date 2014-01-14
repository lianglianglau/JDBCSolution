/**
 * 
 */
package com.aaron.factory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.aaron.model.GroupType;
import com.aaron.model.Pojo;
import com.aaron.strategy.DBContext;
import com.aaron.strategy.MySQLStrategy;

/**
 * @author aaron
 *
 */
public class Datahandle implements IDataHandle {
	
	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	

	/**
	 * @author aaron
	 * @see
	 * [查询所有数据]
	 * @param：无
	 * @return：Pojo对象的List
	 */
	@Override
	public List<Pojo> findAll() throws SQLException {
		// TODO Auto-generated method stub
		DBContext context = new DBContext(new MySQLStrategy());
		con = context.getConnection();
		String sql = "select * from pojo";
		List<Pojo> list = new ArrayList<Pojo>();
		try{
			//设置手动提交
			con.setAutoCommit(false);
			ps = con.prepareStatement(sql);
			rs =ps.executeQuery();
			con.commit();
			while(rs.next()){
				Pojo object = new Pojo();
				object.setAddress(rs.getString(0));
				object.setAge(rs.getInt(0));
				object.setEmail(rs.getString(0));
				object.setGender(rs.getString(0));
				object.setIncome(rs.getFloat(0));
				object.setPhone(rs.getString(0));
				object.setQq(rs.getString(0));
				object.setUsername(rs.getString(0));
				list.add(object);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			rs.close();
			ps.close();
			con.close();
		}
		return list;
	}

	/**
	 * @author aaron
	 * @see
	 * [查询所有数据]
	 * @param：id
	 * @return：Pojo对象的List
	 */
	@Override
	public List<Pojo> findById(Long id) throws SQLException {
		// TODO Auto-generated method stub
		DBContext context = new DBContext(new MySQLStrategy());
		con = context.getConnection();
		String sql = "select * from pojo where id=?";
		List<Pojo> list = new ArrayList<Pojo>();
		try{
			//设置手动提交
			con.setAutoCommit(false);
			ps = con.prepareStatement(sql);
			ps.setLong(0, id);
			rs = ps.executeQuery();
			con.commit();
			while(rs.next()){
				Pojo object = new Pojo();
				object.setAddress(rs.getString(0));
				object.setAge(rs.getInt(0));
				object.setEmail(rs.getString(0));
				object.setGender(rs.getString(0));
				object.setIncome(rs.getFloat(0));
				object.setPhone(rs.getString(0));
				object.setQq(rs.getString(0));
				object.setUsername(rs.getString(0));
				list.add(object);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * @author aaron
	 * @see
	 * [查询所有数据]
	 * @param：GroupType
	 * @return：Pojo对象的List
	 */
	@Override
	public List<Pojo> findByType(GroupType type) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @author aaron
	 * @see
	 * [查询所有数据]
	 * @param：Pojo对象
	 * @return：int型的响应代码
	 */
	@Override
	public int insert(Pojo pojo) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @author aaron
	 * @see
	 * [查询所有数据]
	 * @param：Pojo对象
	 * @return：int型的响应代码
	 */
	@Override
	public int update(Pojo pojo) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @author aaron
	 * @see
	 * [查询所有数据]
	 * @param：Pojo对象
	 * @return：int型的响应代码
	 */
	@Override
	public int delete(Pojo pojo) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}


}
