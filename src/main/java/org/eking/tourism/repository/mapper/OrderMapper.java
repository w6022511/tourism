package org.eking.tourism.repository.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.eking.tourism.repository.entity.Order;
import org.eking.tourism.repository.entity.OrderShowVo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Mapper
public interface OrderMapper {
    /**
     *
     * @mbg.generated 2018-03-22
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-03-22
     */
    int insert(Order record);

    /**
     *
     * @mbg.generated 2018-03-22
     */
    int insertSelective(Order record);

    /**
     *
     * @mbg.generated 2018-03-22
     */
    Order selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-03-22
     */
    int updateByPrimaryKeySelective(Order record);

    /**
     *
     * @mbg.generated 2018-03-22
     */
    int updateByPrimaryKey(Order record);

    List<OrderShowVo> page(Order order);

    List<OrderShowVo> page();
}