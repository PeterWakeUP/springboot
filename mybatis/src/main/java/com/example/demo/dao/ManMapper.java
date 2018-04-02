package com.example.demo.dao;

import com.example.demo.domain.Man;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by 苏文辉 on 2018/4/2.
 */
@Mapper //这个注解是每个mapper都要用，而@MapperScan("com.example.demo.dao")是把包里面的都注入了
public interface ManMapper {

    @Select("select * from man where id = #{id}")
    //没找到selectById的实现，没找到ManMapper.xml文件, 注解可以
    Man selectById(@Param("id") Integer id);
}
