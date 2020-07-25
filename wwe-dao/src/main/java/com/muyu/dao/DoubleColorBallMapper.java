package com.muyu.dao;

import com.muyu.dao.base.BaseDoubleColorBallMapper;
import com.muyu.entity.DoubleColorBall;

public interface DoubleColorBallMapper extends BaseDoubleColorBallMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table double_color_ball
     *
     * @mbg.generated Sun Jul 05 14:47:59 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table double_color_ball
     *
     * @mbg.generated Sun Jul 05 14:47:59 CST 2020
     */
    int insert(DoubleColorBall record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table double_color_ball
     *
     * @mbg.generated Sun Jul 05 14:47:59 CST 2020
     */
    int insertSelective(DoubleColorBall record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table double_color_ball
     *
     * @mbg.generated Sun Jul 05 14:47:59 CST 2020
     */
    DoubleColorBall selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table double_color_ball
     *
     * @mbg.generated Sun Jul 05 14:47:59 CST 2020
     */
    int updateByPrimaryKeySelective(DoubleColorBall record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table double_color_ball
     *
     * @mbg.generated Sun Jul 05 14:47:59 CST 2020
     */
    int updateByPrimaryKey(DoubleColorBall record);
}