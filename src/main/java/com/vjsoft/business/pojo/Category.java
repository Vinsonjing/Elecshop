package com.vjsoft.business.pojo;

import java.util.Date;

public class Category {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vjsoft_category.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vjsoft_category.parent_id
     *
     * @mbg.generated
     */
    private Integer parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vjsoft_category.main_image
     *
     * @mbg.generated
     */
    private String mainImage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vjsoft_category.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vjsoft_category.status
     *
     * @mbg.generated
     */
    private Boolean status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vjsoft_category.sort_order
     *
     * @mbg.generated
     */
    private Integer sortOrder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vjsoft_category.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vjsoft_category.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vjsoft_category.id
     *
     * @return the value of vjsoft_category.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vjsoft_category.id
     *
     * @param id the value for vjsoft_category.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vjsoft_category.parent_id
     *
     * @return the value of vjsoft_category.parent_id
     *
     * @mbg.generated
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vjsoft_category.parent_id
     *
     * @param parentId the value for vjsoft_category.parent_id
     *
     * @mbg.generated
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vjsoft_category.main_image
     *
     * @return the value of vjsoft_category.main_image
     *
     * @mbg.generated
     */
    public String getMainImage() {
        return mainImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vjsoft_category.main_image
     *
     * @param mainImage the value for vjsoft_category.main_image
     *
     * @mbg.generated
     */
    public void setMainImage(String mainImage) {
        this.mainImage = mainImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vjsoft_category.name
     *
     * @return the value of vjsoft_category.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vjsoft_category.name
     *
     * @param name the value for vjsoft_category.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vjsoft_category.status
     *
     * @return the value of vjsoft_category.status
     *
     * @mbg.generated
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vjsoft_category.status
     *
     * @param status the value for vjsoft_category.status
     *
     * @mbg.generated
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vjsoft_category.sort_order
     *
     * @return the value of vjsoft_category.sort_order
     *
     * @mbg.generated
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vjsoft_category.sort_order
     *
     * @param sortOrder the value for vjsoft_category.sort_order
     *
     * @mbg.generated
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vjsoft_category.create_time
     *
     * @return the value of vjsoft_category.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vjsoft_category.create_time
     *
     * @param createTime the value for vjsoft_category.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vjsoft_category.update_time
     *
     * @return the value of vjsoft_category.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vjsoft_category.update_time
     *
     * @param updateTime the value for vjsoft_category.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}