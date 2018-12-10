package com.hwua.codeservice.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface CodeDao {

    public Map<String,Object> queryCode(String prefix, String riqi);

    public int updateCode(String prefix, String riqi);

    public int addCode(String prefix,String riqi);

}
