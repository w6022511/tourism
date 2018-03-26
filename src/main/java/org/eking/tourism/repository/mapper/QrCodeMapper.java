package org.eking.tourism.repository.mapper;

import org.eking.tourism.repository.entity.QrCode;

public interface QrCodeMapper {
    /**
     *
     * @mbg.generated 2018-03-22
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-03-22
     */
    int insert(QrCode record);

    /**
     *
     * @mbg.generated 2018-03-22
     */
    int insertSelective(QrCode record);

    /**
     *
     * @mbg.generated 2018-03-22
     */
    QrCode selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-03-22
     */
    int updateByPrimaryKeySelective(QrCode record);

    /**
     *
     * @mbg.generated 2018-03-22
     */
    int updateByPrimaryKey(QrCode record);
}