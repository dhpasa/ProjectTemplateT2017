package com.logictech.dwzq.core.base.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.logictech.dwzq.core.base.dao.Pagination;
import com.logictech.dwzq.core.base.dao.PagingResult;

/**
 * @ClassName: IBaseSqlDao
 * @Description: 数据库基础操作接口
 * @author shensuoyao
 * @date 2014年7月10日 下午3:40:03
 */
public interface IBaseSqlDao {

	/**
	 * @Title: insert
	 * @Description: 新增实体
	 * @author shensuoyao
	 * @date 2014年7月10日 下午4:19:02
	 * @param statementName
	 * @param entity
	 * @return int
	 * @throws 影响记录条数
	 */
	public abstract <T> int insert(String statementName, T entity) throws RuntimeException;

	/**
	 * 修改一个实体对象（UPDATE一条记录）
	 * 
	 * @param entity
	 *            实体对象
	 * @return 修改的对象个数，正常情况=1
	 */
	public abstract <T> int update(String statementName, T entity) throws RuntimeException;

	/**
	 * @Title: updateParam
	 * @Description: 修改符合条件的记录
	 *               <p>
	 *               此方法特别适合于一次性把多条记录的某些字段值设置为新值（定值）的情况，比如修改符合条件的记录的状态字段
	 *               </p>
	 *               <p>
	 *               此方法的另一个用途是把一条记录的个别字段的值修改为新值（定值），此时要把条件设置为该记录的主键
	 *               </p>
	 * @author shensuoyao
	 * @date 2014年7月10日 下午4:26:15
	 * @param statementName
	 * @param param
	 *            用于产生SQL的参数值，包括WHERE条件、目标字段和新值等
	 * @return 修改的记录个数，用于判断修改是否成功
	 * @throws RuntimeException
	 */
	public abstract int updateParam(String statementName, Map<?, ?> param) throws RuntimeException;

	/**
	 * 按主键删除记录
	 * 
	 * @param primaryKey
	 *            主键对象
	 * @return 删除的对象个数，正常情况=1
	 */
	public abstract <PK extends Serializable> int delete(String statementName, PK primaryKey) throws RuntimeException;

	/**
	 * 删除符合条件的记录
	 * <p>
	 * <strong>此方法一定要慎用，如果条件设置不当，可能会删除有用的记录！</strong>
	 * </p>
	 * 
	 * @param param
	 *            用于产生SQL的参数值，包括WHERE条件（其他参数内容不起作用）
	 * @return
	 */
	public abstract int deleteParam(String statementName, Map<?, ?> param) throws RuntimeException;

	/**
	 * 清空表，比delete具有更高的效率，而且是从数据库中物理删除（delete是逻辑删除，被删除的记录依然占有空间）
	 * <p>
	 * <strong>此方法一定要慎用！</strong>
	 * </p>
	 * 
	 * @return
	 */
	public abstract int truncate(String statementName) throws RuntimeException;

	/**
	 * 查询整表总记录数
	 * 
	 * @return 整表总记录数
	 */
	public abstract int count(String statementName) throws RuntimeException;

	/**
	 * 查询符合条件的记录数
	 * 
	 * @param param
	 *            查询条件参数，包括WHERE条件（其他参数内容不起作用）。此参数设置为null，则相当于count()
	 * @return
	 */
	public abstract int count(String statementName, Object param) throws RuntimeException;

	/**
	 * 按主键取记录
	 * 
	 * @param primaryKey
	 *            主键值
	 * @return 记录实体对象，如果没有符合主键条件的记录，则返回null
	 */
	public abstract <T, PK extends Serializable> T get(String statementName, PK primaryKey) throws RuntimeException;
	
	/** 
	* @Title: selectOne
	* @Description: 获取单个记录
	* @author shensuoyao
	* @param statementName
	* @param obj
	* @return
	* @throws RuntimeException T
	* @throws 
	*/ 
	public abstract <T> T selectOne(String statementName, Object obj) throws RuntimeException;

	/**
	 * 取全部记录
	 * 
	 * @return 全部记录实体对象的List
	 */
	public abstract <T> List<T> select(String statementName) throws RuntimeException;
	
	/** 
	* @Title: select
	* @Description: 查询特定记录
	* @author shensuoyao
	* @date 2014年7月10日 下午5:03:03
	* @param statementName
	* @param obj
	* @return
	* @throws RuntimeException List<T>
	* @throws 
	*/ 
	public abstract <T> List<T> select(String statementName, Object obj) throws RuntimeException;

	/**
	 * 按条件查询记录
	 * 
	 * @param param
	 *            查询条件参数，包括WHERE条件、分页条件、排序条件
	 * @return 符合条件记录的实体对象的List
	 */
	public abstract <T> List<T> selectParam(String statementName, Map<?, ?> param) throws RuntimeException;

	/**
	 * 按条件查询记录，并处理成分页结果
	 * 
	 * @param pagination
	 *            查询条件参数，包括WHERE条件、分页条件、排序条件
	 * @return PaginationResult对象，包括（符合条件的）总记录数、页实体对象List等
	 */
	public abstract <T> PagingResult<T> selectPagination(String statementName, String countStatementName,
			Pagination pagination) throws RuntimeException;

	/**
	 * 批量插入
	 * 
	 * @param list
	 */
	public abstract <T> int insertBatch(String statementName, final List<T> list) throws RuntimeException;

	/**
	 * 批量修改
	 * 
	 * @param list
	 */
	public abstract <T> int updateBatch(String statementName, final List<T> list) throws RuntimeException;

	/**
	 * 批量删除
	 * 
	 * @param list
	 */
	public abstract <PK extends Serializable> int deleteBatch(String statementName, final List<PK> list) throws RuntimeException;
}
