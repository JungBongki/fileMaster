package com.my.file;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
 
@Repository
public class HomeDao {
    @Autowired
    private SqlSessionTemplate sqlSession;
      
    public List<HomeDto> jobsearch() {
        return sqlSession.selectList("sql.test");
    }
}


