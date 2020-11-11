package com.example.demo.mapper;


import com.example.demo.model.TestModel;
import org.apache.ibatis.annotations.Mapper;

//一定要把接口装配到内容里面
@Mapper
public interface mapper2 {
    public TestModel getmodelById(Integer id);
}
