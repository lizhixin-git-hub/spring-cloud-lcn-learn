package com.lzx.lcn.order.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface OrderTableMapper {

    @Update("update order_table set status=#{status} where id=#{id}")
    Integer update(@Param("id") Integer id, @Param("status") Byte status);
}
