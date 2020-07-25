package com.muyu.entity;

import java.io.Serializable;
import java.util.Date;

public class Flow implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column flow.id
     *
     * @mbg.generated Sat Jul 25 13:08:35 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column flow.flow_num
     *
     * @mbg.generated Sat Jul 25 13:08:35 CST 2020
     */
    private String flowNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column flow.order_num
     *
     * @mbg.generated Sat Jul 25 13:08:35 CST 2020
     */
    private Long orderNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column flow.product_id
     *
     * @mbg.generated Sat Jul 25 13:08:35 CST 2020
     */
    private Long productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column flow.paid_amount
     *
     * @mbg.generated Sat Jul 25 13:08:35 CST 2020
     */
    private String paidAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column flow.paid_method
     *
     * @mbg.generated Sat Jul 25 13:08:35 CST 2020
     */
    private Integer paidMethod;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column flow.buy_counts
     *
     * @mbg.generated Sat Jul 25 13:08:35 CST 2020
     */
    private Integer buyCounts;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column flow.create_time
     *
     * @mbg.generated Sat Jul 25 13:08:35 CST 2020
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table flow
     *
     * @mbg.generated Sat Jul 25 13:08:35 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flow
     *
     * @mbg.generated Sat Jul 25 13:08:35 CST 2020
     */
    public Flow(Long id, String flowNum, Long orderNum, Long productId, String paidAmount, Integer paidMethod, Integer buyCounts, Date createTime) {
        this.id = id;
        this.flowNum = flowNum;
        this.orderNum = orderNum;
        this.productId = productId;
        this.paidAmount = paidAmount;
        this.paidMethod = paidMethod;
        this.buyCounts = buyCounts;
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flow
     *
     * @mbg.generated Sat Jul 25 13:08:35 CST 2020
     */
    public Flow() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column flow.id
     *
     * @return the value of flow.id
     *
     * @mbg.generated Sat Jul 25 13:08:35 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column flow.id
     *
     * @param id the value for flow.id
     *
     * @mbg.generated Sat Jul 25 13:08:35 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column flow.flow_num
     *
     * @return the value of flow.flow_num
     *
     * @mbg.generated Sat Jul 25 13:08:35 CST 2020
     */
    public String getFlowNum() {
        return flowNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column flow.flow_num
     *
     * @param flowNum the value for flow.flow_num
     *
     * @mbg.generated Sat Jul 25 13:08:35 CST 2020
     */
    public void setFlowNum(String flowNum) {
        this.flowNum = flowNum == null ? null : flowNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column flow.order_num
     *
     * @return the value of flow.order_num
     *
     * @mbg.generated Sat Jul 25 13:08:35 CST 2020
     */
    public Long getOrderNum() {
        return orderNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column flow.order_num
     *
     * @param orderNum the value for flow.order_num
     *
     * @mbg.generated Sat Jul 25 13:08:35 CST 2020
     */
    public void setOrderNum(Long orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column flow.product_id
     *
     * @return the value of flow.product_id
     *
     * @mbg.generated Sat Jul 25 13:08:35 CST 2020
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column flow.product_id
     *
     * @param productId the value for flow.product_id
     *
     * @mbg.generated Sat Jul 25 13:08:35 CST 2020
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column flow.paid_amount
     *
     * @return the value of flow.paid_amount
     *
     * @mbg.generated Sat Jul 25 13:08:35 CST 2020
     */
    public String getPaidAmount() {
        return paidAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column flow.paid_amount
     *
     * @param paidAmount the value for flow.paid_amount
     *
     * @mbg.generated Sat Jul 25 13:08:35 CST 2020
     */
    public void setPaidAmount(String paidAmount) {
        this.paidAmount = paidAmount == null ? null : paidAmount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column flow.paid_method
     *
     * @return the value of flow.paid_method
     *
     * @mbg.generated Sat Jul 25 13:08:35 CST 2020
     */
    public Integer getPaidMethod() {
        return paidMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column flow.paid_method
     *
     * @param paidMethod the value for flow.paid_method
     *
     * @mbg.generated Sat Jul 25 13:08:35 CST 2020
     */
    public void setPaidMethod(Integer paidMethod) {
        this.paidMethod = paidMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column flow.buy_counts
     *
     * @return the value of flow.buy_counts
     *
     * @mbg.generated Sat Jul 25 13:08:35 CST 2020
     */
    public Integer getBuyCounts() {
        return buyCounts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column flow.buy_counts
     *
     * @param buyCounts the value for flow.buy_counts
     *
     * @mbg.generated Sat Jul 25 13:08:35 CST 2020
     */
    public void setBuyCounts(Integer buyCounts) {
        this.buyCounts = buyCounts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column flow.create_time
     *
     * @return the value of flow.create_time
     *
     * @mbg.generated Sat Jul 25 13:08:35 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column flow.create_time
     *
     * @param createTime the value for flow.create_time
     *
     * @mbg.generated Sat Jul 25 13:08:35 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flow
     *
     * @mbg.generated Sat Jul 25 13:08:35 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", flowNum=").append(flowNum);
        sb.append(", orderNum=").append(orderNum);
        sb.append(", productId=").append(productId);
        sb.append(", paidAmount=").append(paidAmount);
        sb.append(", paidMethod=").append(paidMethod);
        sb.append(", buyCounts=").append(buyCounts);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}