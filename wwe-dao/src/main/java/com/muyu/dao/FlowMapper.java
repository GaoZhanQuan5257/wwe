package com.muyu.dao;

import com.muyu.dao.base.BaseFlowMapper;
import com.muyu.entity.Flow;

public interface FlowMapper extends BaseFlowMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flow
     *
     * @mbg.generated Fri Apr 24 22:00:20 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flow
     *
     * @mbg.generated Fri Apr 24 22:00:20 CST 2020
     */
    int insert(Flow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flow
     *
     * @mbg.generated Fri Apr 24 22:00:20 CST 2020
     */
    int insertSelective(Flow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flow
     *
     * @mbg.generated Fri Apr 24 22:00:20 CST 2020
     */
    Flow selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flow
     *
     * @mbg.generated Fri Apr 24 22:00:20 CST 2020
     */
    int updateByPrimaryKeySelective(Flow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flow
     *
     * @mbg.generated Fri Apr 24 22:00:20 CST 2020
     */
    int updateByPrimaryKey(Flow record);
}