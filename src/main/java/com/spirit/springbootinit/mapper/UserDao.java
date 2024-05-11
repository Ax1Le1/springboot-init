package com.spirit.springbootinit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import com.spirit.springbootinit.model.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 *   
 */
@Mapper
public interface UserDao extends BaseMapper<com.spirit.springbootinit.model.entity.User> {

    /**
    * 根据主键删除
    * @param  id 主键
    * @return int 受影响的行数
    */
    int deleteByPrimaryKey(String id);

    /**
    * 新增
    *
    * @param record  
    * @return int 受影响的行数
    */
    int insert(User record);

    /**
    * 新增非空值
    *
    * @param record 
    * @return int 受影响的行数
    */
    int insertSelective(User record);

    /**
    *  根据主键查询
    * @param  id 主键
    * @return User 
    */
    User selectByPrimaryKey(String id);

    /**
    * 查询列表
    *
    * @param record 
    * @return List&lt;User&gt; 列表
    */
    List<User> listUser(User record);

    /**
    * 根据主键更新非空值
    *
    * @param record 
    * @return int 受影响的行数
    */
    int updateByPrimaryKeySelective(User record);

    /**
    * 根据主键更新
    *
    * @param record 
    * @return int 受影响的行数
    */
    int updateByPrimaryKey(User record);

}




