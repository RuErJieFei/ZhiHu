package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.ZhihuApiApplication;
import com.scs.soft.zhihu.api.domain.entity.RoundTable;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest(classes = ZhihuApiApplication.class)
class RoundTableMapperTest {

    @Resource
    private RoundTableMapper roundTableMapper;

    @Test
    void selectAll() throws SQLException {
        List<RoundTable> list = roundTableMapper.selectAll();
        list.forEach(System.out::println);
    }

    @Test
    void selectRecent() throws SQLException{
        List<RoundTable> list = roundTableMapper.selectRecent();
        list.forEach(System.out::println);
    }

    @Test
    void selectByPage() throws SQLException{
        List<RoundTable> list = roundTableMapper.selectByPage(2,4);
        list.forEach(System.out::println);
    }
}