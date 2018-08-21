package com.cmcm.dao;

import com.cmcm.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * @author Spontaneously
 * @time 2018-08-21 上午10:58
 */
@Repository
public interface UserDao {

    String ALL_FIELDS = "id, user_name as userName, age, created, modified";

    String INSERT_FIELDS = "id, user_name, age, created";

    String VALUE_FIELDS = "#{id}, #{userName}, #{age}, #{created}";

    String UPDATE_VALUE = "user_name=#{userName}, age=#{age}, modified =#{modified}";

    String TABLE_NAME = "user";

    @Insert("INSERT INTO " + TABLE_NAME + "(" + INSERT_FIELDS + ") VALUES (" + VALUE_FIELDS + ")")
    Long save(User user);

    @Select("SELECT " + ALL_FIELDS + " FROM " + TABLE_NAME + " WHERE id = #{id}")
    User findUserById(Long id);

    @Delete("DELETE FROM " + TABLE_NAME + " WHERE room_id=#{roomId}")
    int delete(Long roomId);

    @Update("UPDATE " + TABLE_NAME + " SET " + UPDATE_VALUE + " WHERE id = #{id}")
    int update(User entity);
}
