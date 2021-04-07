package com.vjsoft.business.dao;

import com.vjsoft.business.pojo.PayInfo;
import java.util.List;

public interface PayInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjsoft_payinfo
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjsoft_payinfo
     *
     * @mbg.generated
     */
    int insert(PayInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjsoft_payinfo
     *
     * @mbg.generated
     */
    PayInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjsoft_payinfo
     *
     * @mbg.generated
     */
    List<PayInfo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjsoft_payinfo
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(PayInfo record);
}