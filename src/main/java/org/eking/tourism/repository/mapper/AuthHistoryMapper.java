package org.eking.tourism.repository.mapper;

import org.eking.tourism.repository.entity.AuthHistory;

public interface AuthHistoryMapper {
    /**
     *
     * @mbg.generated 2018-03-22
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated 2018-03-22
     */
    int insert(AuthHistory record);

    /**
     *
     * @mbg.generated 2018-03-22
     */
    int insertSelective(AuthHistory record);

    /**
     *
     * @mbg.generated 2018-03-22
     */
    AuthHistory selectByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated 2018-03-22
     */
    int updateByPrimaryKeySelective(AuthHistory record);

    /**
     *
     * @mbg.generated 2018-03-22
     */
    int updateByPrimaryKey(AuthHistory record);
}