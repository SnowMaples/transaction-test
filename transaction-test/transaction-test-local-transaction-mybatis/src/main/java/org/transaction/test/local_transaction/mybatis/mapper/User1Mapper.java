package org.transaction.test.local_transaction.mybatis.mapper;

import org.transaction.test.local_transaction.mybatis.bean.User1;

public interface User1Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user1
     *
     * @mbggenerated Tue Jan 30 11:22:16 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user1
     *
     * @mbggenerated Tue Jan 30 11:22:16 CST 2018
     */
    int insert(User1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user1
     *
     * @mbggenerated Tue Jan 30 11:22:16 CST 2018
     */
    int insertSelective(User1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user1
     *
     * @mbggenerated Tue Jan 30 11:22:16 CST 2018
     */
    User1 selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user1
     *
     * @mbggenerated Tue Jan 30 11:22:16 CST 2018
     */
    int updateByPrimaryKeySelective(User1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user1
     *
     * @mbggenerated Tue Jan 30 11:22:16 CST 2018
     */
    int updateByPrimaryKey(User1 record);
    
    int truncated();

    int delete();
}