package org.eking.tourism.repository.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.eking.tourism.repository.entity.AccessLog;

@Mapper
public interface AccessLogMapper {
    /**
     *
     * @mbg.generated 2018-03-22
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated 2018-03-22
     */
    int insert(AccessLog record);

    /**
     *
     * @mbg.generated 2018-03-22
     */
    int insertSelective(AccessLog record);

    /**
     *
     * @mbg.generated 2018-03-22
     */
    AccessLog selectByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated 2018-03-22
     */
    int updateByPrimaryKeySelective(AccessLog record);

    /**
     *
     * @mbg.generated 2018-03-22
     */
    int updateByOrderId(AccessLog record);
}