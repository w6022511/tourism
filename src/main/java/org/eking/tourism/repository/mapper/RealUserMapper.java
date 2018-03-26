package org.eking.tourism.repository.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.eking.tourism.repository.entity.RealUser;

@Mapper
public interface RealUserMapper {
    /**
     *
     * @mbg.generated 2018-03-22
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-03-22
     */
    int insert(RealUser record);

    /**
     *
     * @mbg.generated 2018-03-22
     */
    int insertSelective(RealUser record);

    /**
     *
     * @mbg.generated 2018-03-22
     */
    RealUser selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-03-22
     */
    int updateByPrimaryKeySelective(RealUser record);

    /**
     *
     * @mbg.generated 2018-03-22
     */
    int updateByPrimaryKey(RealUser record);
}