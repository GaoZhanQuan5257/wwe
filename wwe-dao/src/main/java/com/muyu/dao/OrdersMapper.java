package com.muyu.dao;

import com.muyu.dao.base.BaseOrdersMapper;
import com.muyu.entity.Orders;

public interface OrdersMapper extends BaseOrdersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sat Jun 15 16:47:21 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sat Jun 15 16:47:21 CST 2019
     */
    int insert(Orders record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sat Jun 15 16:47:21 CST 2019
     */
    int insertSelective(Orders record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sat Jun 15 16:47:21 CST 2019
     */
    Orders selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sat Jun 15 16:47:21 CST 2019
     */
    int updateByPrimaryKeySelective(Orders record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sat Jun 15 16:47:21 CST 2019
     */
    int updateByPrimaryKey(Orders record);
}