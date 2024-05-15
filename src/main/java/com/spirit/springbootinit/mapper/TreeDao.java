package com.spirit.springbootinit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.spirit.springbootinit.model.entity.Tree;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *
 */
@Mapper
public interface TreeDao extends BaseMapper<Tree> {

    /**
     * 根据主键删除
     *
     * @return int 受影响的行数
     */
    int deleteByPrimaryKey();

    /**
     * 新增
     *
     * @param record
     * @return int 受影响的行数
     */
    int insert(Tree record);

    /**
     * 新增非空值
     *
     * @param record
     * @return int 受影响的行数
     */
    int insertSelective(Tree record);

    /**
     * 根据主键查询
     *
     * @return Tree
     */
    Tree selectByPrimaryKey();

    /**
     * 查询列表
     *
     * @param record
     * @return List&lt;Tree&gt; 列表
     */
    List<Tree> listTree(Tree record);

    /**
     * 根据主键更新非空值
     *
     * @param record
     * @return int 受影响的行数
     */
    int updateByPrimaryKeySelective(Tree record);

    /**
     * 根据主键更新
     *
     * @param record
     * @return int 受影响的行数
     */
    int updateByPrimaryKey(Tree record);

}




