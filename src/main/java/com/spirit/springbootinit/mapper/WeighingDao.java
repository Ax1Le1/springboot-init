package com.spirit.springbootinit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.spirit.springbootinit.model.entity.Weighing;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *
 */
@Mapper
public interface WeighingDao extends BaseMapper<Weighing> {

    /**
     * 根据主键删除
     *
     * @param bsm 主键
     * @return int 受影响的行数
     */
    int deleteByPrimaryKey(String bsm);

    /**
     * 新增
     *
     * @param record
     * @return int 受影响的行数
     */
    int insert(Weighing record);

    /**
     * 新增非空值
     *
     * @param record
     * @return int 受影响的行数
     */
    int insertSelective(Weighing record);

    /**
     * 根据主键查询
     *
     * @param bsm 主键
     * @return Weighing
     */
    Weighing selectByPrimaryKey(String bsm);

    /**
     * 查询列表
     *
     * @param record
     * @return List&lt;Weighing&gt; 列表
     */
    List<Weighing> listWeighing(Weighing record);

    /**
     * 根据主键更新非空值
     *
     * @param record
     * @return int 受影响的行数
     */
    int updateByPrimaryKeySelective(Weighing record);

    /**
     * 根据主键更新
     *
     * @param record
     * @return int 受影响的行数
     */
    int updateByPrimaryKey(Weighing record);

}




