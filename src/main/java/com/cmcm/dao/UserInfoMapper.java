package com.cmcm.dao;

import com.cmcm.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Spontaneously
 * @time 2018-08-24 下午5:52
 */
@Mapper
public interface UserInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Tue Mar 13 23:47:19 CST 2018
     */
    int insert(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Tue Mar 13 23:47:19 CST 2018
     */
    int insertSelective(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Tue Mar 13 23:47:19 CST 2018
     */
    UserInfo selectByPrimaryKey(Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Tue Mar 13 23:47:19 CST 2018
     */
    int updateByPrimaryKeySelective(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Tue Mar 13 23:47:19 CST 2018
     */
    int updateByPrimaryKey(UserInfo record);
}