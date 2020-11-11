package com.example.demo.mapper;

import com.example.demo.model.TestModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface modelMapper {

    @Select("select * from test where id = #{id}")
    public TestModel getmodelById(Integer id);
}
