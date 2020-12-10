package com.lzx.lcn.pay.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface PayTableMapper {

    @Update("update pay_table set is_pay=#{isPay} where id=#{id}")
    Integer update(@Param("id") Integer id, @Param("isPay") Byte isPay);
}
