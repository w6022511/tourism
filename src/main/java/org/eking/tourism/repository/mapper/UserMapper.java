package org.eking.tourism.repository.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.eking.tourism.repository.entity.User;

@Mapper
public interface UserMapper {
    /**
     *
     * @mbg.generated 2018-03-22
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-03-22
     */
    int insert(User record);

    /**
     *
     * @mbg.generated 2018-03-22
     */
    int insertSelective(User record);

    /**
     *
     * @mbg.generated 2018-03-22
     */
    User selectByOpenId(String openId);

    /**
     *
     * @mbg.generated 2018-03-22
     */
    int updateByPrimaryKeySelective(User record);

    /**
     *
     * @mbg.generated 2018-03-22
     */
    int updateByPrimaryKey(User record);
}